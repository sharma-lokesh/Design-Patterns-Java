package unitOfWork;

public interface UnitOfWork<T> {
	// Performs application-defined tasks associated with freeing, releasing, or
	// resetting
	// unmanaged resources.
	// void dispose();

	// Commit complete business transaction in scope
	// All operations batched together will be executed
	boolean commit();

	// Register and Insert
	boolean insert(T entity);

	// Register and update, affects those records also which are there for
	// insert for the first time
	boolean update(T entity, boolean lockBeforeUpdate);

	// Register and delete the records, if same record is added again, then new
	// insert is issued.
	boolean delete(T entity);

	// Register the object for observation, to only be implemented when select
	// are kept in scope after read.
	// boolean register(T entity);

	// De-register the objects and remove them from scope, no changes will be
	// reflected in the final commit.
	boolean deregister(T entity);
}
