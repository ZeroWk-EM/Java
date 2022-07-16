package core.founder;

import core.camper.*;
import core.car.*;
import core.motorcycle.*;
import core.van.*;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

public class Catalog<T extends VehicleCore> {
	private List<T> vehicleCatalog;

	//Creiamo una nuova lista
	public Catalog(){
		this.vehicleCatalog = new ArrayList<>();
	}

	//Creiamo una lista usandone una gia esistente
	public Catalog(List<T> vehicleCatalog){
		this.vehicleCatalog= vehicleCatalog;
	}

	//Aggiunge un veicolo
	public boolean addVehicle(T vehicle){
		//Controlla se nel catalogo esiste gia quel determinato oggetto
		if(!vehicleCatalog.contains(vehicle)){
			//Se non esiste lo aggiunge
		return vehicleCatalog.add(vehicle);
		}
		else{
			//Se esiste ritorna false e non aggiunge il contatto alla lista
			return false;
		}
	}

	//Rimuove un veicolo
	public boolean removeVehicle(T vehicle){
		return vehicleCatalog.remove(vehicle);
	}

	//Quanti mezzi sono presenti nel catalogo
	public  int vehicleInsideBox(){
		return vehicleCatalog.size();
	}

	//Quanti mezzi per un singolo tipo (ha scelta) sono presenti nel catalogo;
	public int countVehicleType(typeVehicle type){
		int count=0;
	switch (type){
		case CAR:
			for(T vehicle: vehicleCatalog){
				if(vehicle instanceof Car){
					count++;
					}
				}
				break;
		case MOTORCYCLE:
			for(T vehicle: vehicleCatalog){
				if(vehicle instanceof Motorcycle){
					count++;
				}
			}
			break;
		case CAMPER:
			for(T vehicle: vehicleCatalog){
			if(vehicle instanceof Camper){
				count++;
			}
		}
			break;
		case VAN:
			for(T vehicle: vehicleCatalog){
				if(vehicle instanceof Van){
					count++;
				}
			}
			break;
		default:
			System.out.println("==== ERRORE ====");
			break;
	}
		return count;
	}

	//Tutti i mezzi al di sotto di un certo prezzo;
	public List<T> vehicleUnderPrice(double price){
		List<T> listVehicleUnderPrice = new ArrayList<T>(vehicleInsideBox());
		for (T vehicle : vehicleCatalog) {
			if (vehicle.getPrice() < price) {
				listVehicleUnderPrice.add(vehicle);
			}
		}
		return listVehicleUnderPrice;
	}

	//Tutti i mezzi per un singolo tipo (ha scelta) al di sopra di un certo prezzo;
	public List<T> sortedVehicle(typeVehicle type, double price) {
		List<T> listSortedVehicle = new ArrayList<T>(vehicleInsideBox());
		switch (type) {
			case CAR:
				for (T vehicle : vehicleCatalog) {
					if (vehicle instanceof Car) {
						if (vehicle.getPrice() >= price) {
							listSortedVehicle.add(vehicle);
						}
					}
				}
				break;
			case MOTORCYCLE:
				for (T vehicle : vehicleCatalog){
					if(vehicle instanceof Motorcycle){
						if(vehicle.getPrice()>price){
							listSortedVehicle.add(vehicle);
						}
					}
				}
				break;
			case CAMPER:
				for (T vehicle : vehicleCatalog){
					if(vehicle instanceof Camper){
						if(vehicle.getPrice()>price){
							listSortedVehicle.add(vehicle);
						}
					}
				}
				break;
			case VAN:
				for (T vehicle : vehicleCatalog){
					if(vehicle instanceof Van){
						if(vehicle.getPrice()>price){
							listSortedVehicle.add(vehicle);
						}
					}
				}
				break;
			default:
				System.out.println("==== ERRORE ====");
				break;
		}
		return  listSortedVehicle;
	}

	//Tutte le auto di una certa cilindrata
	public List<T> carUpperDisplacement(int displacement){
		List<T> listDisplacement = new ArrayList<T>(vehicleInsideBox());
		for(T vehicle: vehicleCatalog){
			if(vehicle instanceof Car){
				if (vehicle.getDisplacement() >displacement){
					listDisplacement.add(vehicle);
				}
			}
		}
			return  listDisplacement;
	}

	@Override
	public String toString() {
		return "Catalog{" +
				"vehicleCatalog=" + vehicleCatalog +
				'}';
	}

	@Override
	public boolean equals(Object o) {
		if (this == o) return true;
		if (o == null || getClass() != o.getClass()) return false;
		Catalog<?> catalog = (Catalog<?>) o;
		return Objects.equals(vehicleCatalog, catalog.vehicleCatalog);
	}
}
