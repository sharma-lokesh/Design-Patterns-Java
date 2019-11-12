package mediator;

/**
 * 
 * The Mediator pattern defines an object that encapsulates how a set of objects
 * interact. This pattern is considered to be a behavioral pattern due to the
 * way it can alter the program's running behavior.
 * <p>
 * Usually a program is made up of a large number of classes. So the logic and
 * computation is distributed among these classes. However, as more classes are
 * developed in a program, especially during maintenance and/or refactoring, the
 * problem of communication between these classes may become more complex. This
 * makes the program harder to read and maintain. Furthermore, it can become
 * difficult to change the program, since any change may affect code in several
 * other classes.
 * <p>
 * With the Mediator pattern, communication between objects is encapsulated with
 * a mediator object. Objects no longer communicate directly with each other,
 * but instead communicate through the mediator. This reduces the dependencies
 * between communicating objects, thereby lowering the coupling.
 */
public class App {
	public static void main(String[] args) {
		ChatMediator mediator = new ChatMediatorImpl();
		User user1 = new UserImpl(mediator, "Aayush");
		User user2 = new UserImpl(mediator, "Manuj");
		User user3 = new UserImpl(mediator, "Deepak");
		User user4 = new UserImpl(mediator, "Ankit");
		mediator.addUser(user1);
		mediator.addUser(user2);
		mediator.addUser(user3);
		mediator.addUser(user4);
		user1.send("Hi All");
	}
}
