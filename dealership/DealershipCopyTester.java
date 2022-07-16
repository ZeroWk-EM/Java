import core.camper.*;
import  core.founder.*;
import core.car.*;
import core.motorcycle.*;
import core.van.*;

import java.util.*;

public class DealershipCopyTester {
	public static void main(String[] args) {
		//Creazione della lista
		ArrayList<Vehicle> vehicleList = new ArrayList<>();

		//Creazione degli oggetti
		Vehicle lamborghiniAnventador = new Car("Lamborghini","Anventador","Arancione",770,6500,2,"DND 666 SDK",transmissionType.MANUALE,3,350_000);
		Vehicle fiatDucato = new Van("Fiat","Ducato","Grigio",150,1950,3,"OOL 555 HVJ",900,27_500);
		Vehicle ducatiPanigale = new Motorcycle("Ducati","Panigale","Rosso",220,1000,2,"LSD 123", motorcycleType.SUPERBIKE,25_000);
		Vehicle fusionD = new Camper("Fusion","Dson","Bianco",110,900,5,"L7Q 432 LOK", camperType.FURGONATO,55_000);

		//Aggiunta oggetti alla lista
		vehicleList.add(0,lamborghiniAnventador);
		vehicleList.add(1,fiatDucato);
		vehicleList.add(2,ducatiPanigale);
		vehicleList.add(3,fusionD);

		//Passiamo l'ArrayList per creare un catalogo con una lista già iniziata

		Catalog<Vehicle> copyVehicleList = new Catalog<Vehicle>(vehicleList);

		//Test del funzionamento dei i metodi
		System.out.println("Veicoli pre-esistenti nella lista ["+copyVehicleList.vehicleInsideBox()+"]");
		System.out.println("========== Veicoli specifici per tipo ==========");
		System.out.println("Numero di auto ["+copyVehicleList.countVehicleType(typeVehicle.CAR)+"] presenti nel box");
		System.out.println("Numero di moto ["+copyVehicleList.countVehicleType(typeVehicle.MOTORCYCLE)+"] presenti nel box");
		System.out.println("Numero di camper ["+copyVehicleList.countVehicleType(typeVehicle.CAMPER)+"] presenti nel box");
		System.out.println("Numero di furgoni ["+copyVehicleList.countVehicleType(typeVehicle.VAN)+"] presenti nel box");

	}
}
