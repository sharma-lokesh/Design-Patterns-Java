package unitOfWork;

public class App {
	public static void main(String[] args) {
		Employee asethi27 = new Employee("Aayush", "Street 9, Oslo");
		Employee akumar35 = new Employee("Amit", "Street 9, Tokyo");
		Employee ssaxena59 = new Employee("Shubham", "Street 9, Bejing");

		UnitOfWork<AbstractDomainObject> uow = new UnitOfWorkImpl<>(new DummyDatabase());
		uow.insert(asethi27);
		uow.insert(akumar35);
		uow.insert(ssaxena59);

		asethi27.setName("Aayu");
		akumar35.setName("Amit_Kum");
		uow.update(akumar35, true);
		uow.update(asethi27, false);
		uow.delete(ssaxena59);
		uow.deregister(akumar35);

		uow.commit();
	}
}
