package observer.simple;

public class PrintNameAnimalAddedListener implements AnimalAddedListener {

	@Override
	public void onAnimalAdded(Animal animal) {
		// Print the name of the newly added animal
		System.out.println("PrintNameAnimalAddedListener : Added a new animal with name '" + animal.getName() + "'");
	}

}
