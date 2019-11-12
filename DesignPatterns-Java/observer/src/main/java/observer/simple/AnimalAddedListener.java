package observer.simple;

@FunctionalInterface
public interface AnimalAddedListener {
	public void onAnimalAdded(Animal animal);
}
