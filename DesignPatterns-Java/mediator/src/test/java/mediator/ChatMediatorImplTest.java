package mediator;

import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;
import static org.mockito.Mockito.*;

/**
 * Verify if a member is notified when it's joining the chat. Generate a message
 * and see if the other member gets it. Also check members don't get their own
 * actions.
 */
public class ChatMediatorImplTest {
	ChatMediator mediator;
	User user1 = mock(UserImpl.class);
	User user4 = mock(UserImpl.class);

	@BeforeAll
	public void init() {
		mediator = new ChatMediatorImpl();
		mediator.addUser(user1);
		mediator.addUser(user4);
	}

	@Test
	public void checkIfOtherMembersAreNotified() {
		user4.send("Hello, I am Ankit, joining chat");
		verify(user1, times(1)).receive("Hello, I am Ankit, joining chat");
	}

	@Test
	public void checkForNoNotificationForSendingUser() {
		user4.send("Hello, I am Ankit, joining chat");
		verify(user1, times(0)).receive("Hello, I am Ankit, joining chat");
	}
}
