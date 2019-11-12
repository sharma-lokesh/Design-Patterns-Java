package unitOfWork;

import java.util.HashSet;
import java.util.Set;

import org.apache.log4j.Logger;

public class UnitOfWorkImpl<T> implements UnitOfWork<T> {
	private static final Logger LOGGER = Logger.getLogger(UnitOfWorkImpl.class);
	private DummyDatabase session;
	private Set<Object> possibleInsertedObjects;
	private Set<Object> deletedObjects;
	private Set<Object> updatedObjects;
	private Set<Object> objectsWithUpgradedLock;

	public UnitOfWorkImpl(DummyDatabase session) {
		this.session = session;
		this.deletedObjects = new HashSet<>();
		this.possibleInsertedObjects = new HashSet<>();
		this.updatedObjects = new HashSet<>();
		this.objectsWithUpgradedLock = new HashSet<>();
	}

	@Override
	public boolean commit() {
		session.insert(possibleInsertedObjects);
		session.updateWithLock(objectsWithUpgradedLock);
		session.updateWithoutLock(updatedObjects);
		session.delete(deletedObjects);
		return session.commit() && session.dispose();
	}

	@Override
	public boolean insert(T entity) {
		LOGGER.info("Registering {} for insert in possibleInsertedObjects.");
		return possibleInsertedObjects.add(entity);
	}

	@Override
	public boolean update(T entity, boolean lockBeforeUpdate) {
		LOGGER.info("Registering {} for update in updatedObjects.");
		if (lockBeforeUpdate) {
			return objectsWithUpgradedLock.add(entity);
		}
		return updatedObjects.add(entity);
	}

	@Override
	public boolean delete(T entity) {
		LOGGER.info("Registering {} for delete in deletedObjects.");
		possibleInsertedObjects.removeIf((p) -> entity != null && possibleInsertedObjects.contains(entity));
		deletedObjects.add(entity);
		return true;
	}

	@Override
	public boolean deregister(T entity) {
		possibleInsertedObjects.removeIf((p) -> entity != null && possibleInsertedObjects.contains(entity));
		deletedObjects.removeIf((p) -> entity != null && deletedObjects.contains(entity));
		updatedObjects.removeIf((p) -> entity != null && updatedObjects.contains(entity));
		return true;
	}

}
