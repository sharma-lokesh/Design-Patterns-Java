package factory;

import java.util.function.Supplier;

public interface WeaponBuilder {
	void add(WeaponType name, Supplier<Weapon> supplier);
}
