package abstractfactory;

public abstract class AbstractFactory {

	abstract Weapon getWeapon();

	abstract Aircraft getAircraft();
	
	abstract ManufactoringUnit manufactoredBy();

}
