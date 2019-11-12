package unitOfWork;

import java.util.UUID;

public abstract class AbstractDomainObject {
	private String objectId;

	public String getObjectId() {
		return objectId;
	}

	public AbstractDomainObject() {
		objectId = UUID.randomUUID().toString();
	}
}
