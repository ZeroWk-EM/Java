package core.car;

import core.founder.*;

public class Car extends Vehicle {
	private transmissionType type;
	private int carDoor;


	public Car(String brand, String model, String color, int power, int displacement, int availablePlaces, String licenzePlate, transmissionType type, int carDoor, double price) {
		super(brand, model, color, power, displacement, availablePlaces, licenzePlate, price);
		this.type = type;
		this.carDoor = carDoor;
	}

	@Override
	public String toString(){
		String printer= super.toString()+
				"\nTipo di cambio ["+type+"]"+
				"\nPortiere ["+carDoor+"]";
		return printer;
	}

	@Override
	public boolean equals(Object o) {
		if (this == o) return true;
		if (o == null || getClass() != o.getClass()) return false;
		if (!super.equals(o)) return false;
		Car car = (Car) o;
		return carDoor == car.carDoor && type == car.type;
	}

}
