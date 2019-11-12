package observer.simple;

public class AnimalAddedListenerReceipt {
	private final AnimalAddedListener listener;

	public AnimalAddedListenerReceipt(AnimalAddedListener listener) {
		this.listener = listener;
	}

	public final AnimalAddedListener getListener() {
		return this.listener;
	}
}
