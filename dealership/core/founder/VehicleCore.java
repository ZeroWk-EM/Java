package core.founder;

import java.util.Objects;

public interface VehicleCore {
	String getBrand();
	String getModel();
	String getColor();
	int getPower();
	int getDisplacement();
	int getAvailablePlaces();
	String getLicenzePlate();
	double getPrice();

	public String toString();
	public boolean equals(Object o);
}
