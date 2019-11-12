package memento;

public class Originator {
	private double x;
	private double y;
	public final String INITIAL = "INITIAL";
	private String lastUndoSavepoint;
	private CareTaker careTaker;

	public Originator(double x, double y, CareTaker careTaker) {
		this.x = x;
		this.y = y;

		this.careTaker = careTaker;

		this.createSavepoint(INITIAL);
	}

	public double getX() {
		return x;
	}

	public double getY() {
		return y;
	}

	public void setX(double x) {
		this.x = x;
	}

	public void setY(double y) {
		this.y = y;
	}

	public void createSavepoint(String savepointName) {
		careTaker.saveMemento(new Memento(this.x, this.y), savepointName);
		lastUndoSavepoint = savepointName;
	}

	public void undo() {
		this.setOriginatorState(lastUndoSavepoint);
	}

	public void undo(String savepointName) {
		this.setOriginatorState(savepointName);
	}

	public void undoAll() {
		this.setOriginatorState(INITIAL);
		careTaker.clearSavepoints();
	}

	private void setOriginatorState(String savepointName) {
		Memento mem = careTaker.getMemento(savepointName);
		this.x = mem.getX();
		this.y = mem.getY();
	}

	@Override
	public String toString() {
		return "X: " + x + ", Y: " + y;
	}
}
