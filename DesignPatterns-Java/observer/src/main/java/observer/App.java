package observer;

import java.util.Date;

import observer.annotation.Broker;
import observer.annotation.Component;
import observer.simple.Animal;
import observer.simple.CountingAnimalAddedListener;
import observer.simple.PrintNameAnimalAddedListener;
import observer.simple.Zoo;

public class App {
	public static void main(String[] args) {
		// Create the zoo to store animals
		Zoo zoo = new Zoo();
		// Register a listener to be notified when an animal is added
		zoo.registerAnimalAddedListener(new PrintNameAnimalAddedListener());
		zoo.registerAnimalAddedListener(new CountingAnimalAddedListener());
		zoo.registerAnimalAddedListener(
				(animal) -> System.out.println("Lambda : Added a new animal with name '" + animal.getName() + "'"));

		// Add an animal notify the registered listeners
		zoo.addAnimal(new Animal("Tiger"));
		zoo.addAnimal(new Animal("Lion"));
		zoo.addAnimal(new Animal("Bear"));

		Broker broker = new Broker();
		broker.add(new Component());

		broker.publish("Hello");
		broker.publish(new Date());
		broker.publish(3.1415);
	}
}
