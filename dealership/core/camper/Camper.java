package core.camper;

import core.founder.*;

public class Camper extends Vehicle {
	private camperType type;

	public Camper(String brand, String model, String color, int power, int displacement, int availablePlaces, String licenzePlate, camperType type, double price) {
		super(brand, model, color, power, displacement, availablePlaces, licenzePlate, price);
		setType(type);
	}

	public void setType(camperType type) {
		this.type = type;
	}

	@Override
	public String toString() {
		String printer=super.toString()+
				"\nTipo di camper ["+type+"]";
		return printer;
	}

	@Override
	public boolean equals(Object o) {
		if (this == o) return true;
		if (o == null || getClass() != o.getClass()) return false;
		if (!super.equals(o)) return false;
		Camper camper = (Camper) o;
		return type == camper.type;
	}
}
