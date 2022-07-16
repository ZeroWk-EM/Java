package core.founder;

import java.util.Objects;

public abstract class Vehicle implements VehicleCore {
	//Marca
	private String brand;
	//Modello
	private String model;
	private String color;
	private int power;
	//Cilindrata
	private int displacement;
	//Numeri di posti
	private int availablePlaces;
	//Targa
	private String licenzePlate;
	private double price;

	public Vehicle(String brand, String model, String color, int power, int displacement, int availablePlaces, String licenzePlate, double price) {
		setBrand(brand);
		setModel(model);
		setColor(color);
		setPower(power);
		setDisplacement(displacement);
		setAvailablePlaces(availablePlaces);
		setLicenzePlate(licenzePlate);
		setPrice(price);
	}

	/* ========== SETTER ========== */
	public void setBrand(String brand) {
		this.brand = brand;
	}

	public void setModel(String model) {
		this.model = model;
	}

	public void setColor(String color) {
		this.color = color;
	}

	public void setPower(int power) {
		this.power = power;
	}

	public void setDisplacement(int displacement) {
		this.displacement = displacement;
	}

	public void setAvailablePlaces(int availablePlaces) {
		this.availablePlaces = availablePlaces;
	}

	public void setLicenzePlate(String licenzePlate) {
		this.licenzePlate = licenzePlate;
	}

	public void setPrice(double price) {
		this.price = price;
	}

	/* ========== GETTER IMPLEMETANTI DALL'INTERFACCIA VEICHLE CORE ========== */

	@Override
	public String getBrand() {
		return brand;
	}

	@Override
	public String getModel() {
		return model;
	}

	@Override
	public String getColor() {
		return color;
	}

	@Override
	public int getPower() {
		return power;
	}

	@Override
	public int getDisplacement() {
		return displacement;
	}

	@Override
	public int getAvailablePlaces() {
		return availablePlaces;
	}

	@Override
	public String getLicenzePlate() {
		return licenzePlate;
	}

	@Override
	public double getPrice() {
		return price;
	}

	//Questo toString verrò sempre overraidato dalle classi più specifiche
	@Override
	public String toString() {
		String printer="Brand ["+getBrand()+"] " +
				"\nModello ["+getModel()+"]" +
				"\nColore carrozzeria ["+getColor()+"] " +
				"\nPotenza ["+getPower()+"] cavalli"+
				"\nCilindrata ["+getDisplacement()+"]"+
				"\nPosti ["+getAvailablePlaces()+"]"+
				"\nTarga ["+getLicenzePlate()+"]"+
				"\nPrezzo ["+getPrice()+"] euro";
		return printer;
	}

	@Override
	public boolean equals(Object o) {
		if (this == o) return true;
		if (o == null || getClass() != o.getClass()) return false;
		Vehicle veichle = (Vehicle) o;
		return power == veichle.power && displacement == veichle.displacement && Objects.equals(brand, veichle.brand) && Objects.equals(model, veichle.model);
	}
}
