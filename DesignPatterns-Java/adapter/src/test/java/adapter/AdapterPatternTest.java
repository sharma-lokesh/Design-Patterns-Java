package adapter;

import static org.mockito.Mockito.spy;
import static org.mockito.Mockito.verify;

import java.util.HashMap;
import java.util.Map;

import org.junit.Before;
import org.junit.Test;

public class AdapterPatternTest {
	private Map<String, Object> beans;

	private static final String FISHING_BEAN = "fisher";

	private static final String ROWING_BEAN = "captain";

	@Before
	public void init() {
		beans = new HashMap<>();

		FishingBoatAdapter fishingBoatAdapter = spy(new FishingBoatAdapter());
		beans.put(FISHING_BEAN, fishingBoatAdapter);

		Captain captain = new Captain();
		captain.setRowingBoat((FishingBoatAdapter) beans.get(FISHING_BEAN));
		beans.put(ROWING_BEAN, captain);
	}

	/**
	 * This test asserts that when we use the row() method on a captain
	 * bean(client), it is internally calling sail method on the fishing boat
	 * object. The Adapter ({@link FishingBoatAdapter} ) converts the interface
	 * of the target class ( {@link FishingBoat}) into a suitable one expected
	 * by the client ({@link Captain} ).
	 */
	@Test
	public void testAdapter() {
		Captain captain = (Captain) beans.get(ROWING_BEAN);

		// when captain moves
		captain.row();

		// the captain internally calls the battleship object to move
		RowingBoat adapter = (RowingBoat) beans.get(FISHING_BEAN);
		verify(adapter).row();
	}
}
