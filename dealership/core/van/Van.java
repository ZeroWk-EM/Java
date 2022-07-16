package core.van;
import core.founder.*;

import java.util.Objects;

public class Van extends Vehicle {
	private double cargoCapacity;

	public Van(String brand, String model, String color, int power, int displacement, int availablePlaces, String licenzePlate, double cargoCapacity, double price) {
		super(brand, model, color, power, displacement, availablePlaces, licenzePlate, price);
		setCargoCapacity(cargoCapacity);
	}

	public void setCargoCapacity(double cargoCapacity) {
		this.cargoCapacity = cargoCapacity;
	}

	@Override
	public String toString() {
			String printer=super.toString()+
					"\nTipo di carico ["+cargoCapacity+"]";
			return printer;
	}

	@Override
	public boolean equals(Object o) {
		if (this == o) return true;
		if (o == null || getClass() != o.getClass()) return false;
		if (!super.equals(o)) return false;
		Van van = (Van) o;
		return Double.compare(van.cargoCapacity, cargoCapacity) == 0;
	}

}
