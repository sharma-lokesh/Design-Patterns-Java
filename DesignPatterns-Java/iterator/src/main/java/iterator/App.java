package iterator;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class App {
	private static final Logger LOGGER = LoggerFactory.getLogger(App.class);

	public static void main(String[] args) {
		TreasureChest chest = new TreasureChest();

		ItemIterator ringIterator = chest.iterator(ItemType.RING);
		while (ringIterator.hasNext()) {
			LOGGER.info(ringIterator.next().toString());
		}

		LOGGER.info("----------");

		ItemIterator potionIterator = chest.iterator(ItemType.POTION);
		while (potionIterator.hasNext()) {
			LOGGER.info(potionIterator.next().toString());
		}

		LOGGER.info("----------");

		ItemIterator weaponIterator = chest.iterator(ItemType.WEAPON);
		while (weaponIterator.hasNext()) {
			LOGGER.info(weaponIterator.next().toString());
		}

		LOGGER.info("----------");

		ItemIterator it = chest.iterator(ItemType.ANY);
		while (it.hasNext()) {
			LOGGER.info(it.next().toString());
		}
	}
}
