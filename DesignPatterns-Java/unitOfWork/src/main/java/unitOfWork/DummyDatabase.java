package unitOfWork;

import java.util.Set;

public class DummyDatabase {

	public void insert(Set<Object> possibleInsertedObjects) {
		// Implementation for inserting new objects into DB
	};

	public void updateWithoutLock(Set<Object> updatedObjects) {
		// Implementation for updating objects without taking a pessimistic
		// lock.
		// Optimistic lock or no lock depends upon table implementation.
	};

	public void updateWithLock(Set<Object> objectsWithUpgradedLock) {
		// Implementation for updating objects with pessimistic lock on the row.
	};

	public void delete(Set<Object> deletedObjects) {
		// Implementation for deleting a row from the table.
	};

	public boolean dispose() {
		// Implementation for disposing the database connection.
		return true;
	};

	public boolean commit() {
		// Implementation for committing the transaction.
		return true;
	}

	public boolean rollback() {
		// Implementation for roll-back the database transaction.
		return true;
	}
}
