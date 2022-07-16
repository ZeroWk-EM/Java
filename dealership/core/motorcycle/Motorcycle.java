package core.motorcycle;

import core.founder.*;

import java.util.Objects;

public class Motorcycle extends Vehicle {
	private motorcycleType type;

	public Motorcycle(String brand, String model, String color, int power, int displacement, int availablePlaces, String licenzePlate, motorcycleType type, double price) {
		super(brand, model, color, power, displacement, availablePlaces, licenzePlate, price);
		setType(type);
	}

	public void setType(motorcycleType type) {
		this.type = type;
	}

	@Override
	public String toString() {
		String printer=super.toString()+
				"\nTipo di moto ["+type+"]";
		return printer;
	}

	@Override
	public boolean equals(Object o) {
		if (this == o) return true;
		if (o == null || getClass() != o.getClass()) return false;
		if (!super.equals(o)) return false;
		Motorcycle that = (Motorcycle) o;
		return type == that.type;
	}
}
