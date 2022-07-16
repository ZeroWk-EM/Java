
//Importazione dei package dove sono contenute le classi
import core.camper.*;
import core.founder.*;
import core.car.*;
import core.motorcycle.*;
import core.van.*;

import java.util.*;

public class DealershipDemo {
	public static void main(String[] args) {
		// Creazione del catalogo
		Catalog<Vehicle> box = new Catalog<Vehicle>();

		// Creazione automobili
		Vehicle lamborghiniAnventador = new Car("Lamborghini", "Anventador", "Arancione", 770, 6500, 2, "DND 666 SDK",
				transmissionType.MANUALE, 3, 350_000);
		Vehicle ferrariPortofino = new Car("Ferrari", "PortofinoM", "Rosso", 620, 3900, 2, "SKM 462 ODF",
				transmissionType.MANUALE, 3, 220_000);
		Vehicle jaguarFType = new Car("Jaguar", "FType", "Blu", 300, 2000, 4, "DND 999 TDT", transmissionType.MANUALE,
				2, 90_000);

		// Aggiunta delle auto al box
		System.out.println("Numero di auto dentro il box [" + box.vehicleInsideBox() + "]");
		box.addVehicle(lamborghiniAnventador);
		box.addVehicle(ferrariPortofino);
		box.addVehicle(jaguarFType);

		// Creazione furgoni
		Vehicle citroenJumper = new Van("Citroen", "Jumper", "Rosso", 120, 1800, 3, "LML 817 KKK", 850, 25_000);
		Vehicle fiatDucato = new Van("Fiat", "Ducato", "Grigio", 150, 1950, 3, "OOL 555 HVJ", 900, 27_500);

		// Aggiunta furgoni al box
		box.addVehicle(citroenJumper);
		box.addVehicle(fiatDucato);

		// Creazione moto
		Vehicle ducatiPanigale = new Motorcycle("Ducati", "Panigale", "Rosso", 220, 1000, 2, "LSD 123",
				motorcycleType.SUPERBIKE, 25_000);
		Vehicle ducatiMonster = new Motorcycle("Ducati", "Monster", "Rosso", 111, 950, 2, "SMH 177",
				motorcycleType.STRADALE, 11_500);
		Vehicle yamahaTmax = new Motorcycle("Yamaha", "Tmax", "Nero", 80, 530, 2, "LSD 123", motorcycleType.NAKED,
				12_000);
		Vehicle lenSH = new Motorcycle("Len", "SH", "Rossa", 60, 800, 1, "QQQ 777", motorcycleType.ENDURO, 18_950);

		// Aggiunta moto al box
		box.addVehicle(ducatiPanigale);
		box.addVehicle(ducatiMonster);
		box.addVehicle(yamahaTmax);
		box.addVehicle(lenSH);

		// Creazione camper
		Vehicle knausVan = new Camper("KNAUS", "Van I", "Bianco", 140, 2280, 6, "MNJ 938 LLK", camperType.MOTORHOME,
				75_000);
		Vehicle knausVanP = new Camper("KNAUS ", "VanP", "Grigio", 150, 2150, 7, "Q8S Y8O L89", camperType.PROFILATO,
				80_000);
		Vehicle niesmannB = new Camper("Niesmann", "Bischoff", "Grigio", 160, 2000, 4, "A12 9981 LTT",
				camperType.MOTORHOME, 180_000);
		Vehicle dFast = new Camper("DFAST", "Freelife", "Nero", 130, 880, 4, "M23 9U3 P8K", camperType.AUTOCARAVAN,
				50_000);
		Vehicle fusionD = new Camper("Fusion", "Dson", "Bianco", 110, 900, 5, "L7Q 432 LOK", camperType.FURGONATO,
				55_000);

		// Aggiunto camper al box
		box.addVehicle(knausVan);
		box.addVehicle(knausVanP);
		box.addVehicle(niesmannB);
		box.addVehicle(dFast);
		box.addVehicle(fusionD);

		// Totale mezzi presenti nella lista
		System.out.println("Veicoli presenti dentro il box del concessionario [" + box.vehicleInsideBox() + "]");

		// Test aggiunta veicolo gia presente nella lista
		box.addVehicle(ferrariPortofino);
		box.addVehicle(lamborghiniAnventador);
		System.out.println(
				"Veicoli presenti dentro il box del concessionario (dopo il test) [" + box.vehicleInsideBox() + "]");

		// Rimozione di qualche veicolo
		box.removeVehicle(lenSH);
		box.removeVehicle(dFast);

		// Test metodi
		System.out.println("Veicoli presenti dentro il box del concessionario (dopo la rimozione di un veicolo) ["
				+ box.vehicleInsideBox() + "]");
		System.out.println("========== Veicoli per tipo ==========");
		System.out.println("Numero di auto [" + box.countVehicleType(typeVehicle.CAR) + "] presenti nel box");
		System.out.println("Numero di moto [" + box.countVehicleType(typeVehicle.MOTORCYCLE) + "] presenti nel box");
		System.out.println("Numero di camper [" + box.countVehicleType(typeVehicle.CAMPER) + "] presenti nel box");
		System.out.println("Numero di furgoni [" + box.countVehicleType(typeVehicle.VAN) + "] presenti nel box");
		System.out.println("========== Veicoli sotto un certo prezzo ==========");
		System.out.println(box.vehicleUnderPrice(40_000));
		System.out.println("========== Veicoli di un certo tipo sopra un certo prezzo ==========");
		System.out.println(box.sortedVehicle(typeVehicle.CAMPER, 60_000));
		System.out.println("========== Auto sopra una certa cilindrata ==========");
		System.out.println(box.carUpperDisplacement(3_000));
		System.out.println("========== toString dell'catalogo ==========");
		System.out.println(box);
		System.out.println("========== equals di BoxA & BoxB ==========");
		Catalog<Vehicle> boxa = new Catalog<Vehicle>();
		boxa.addVehicle(lamborghiniAnventador);
		Catalog<Vehicle> boxb = new Catalog<Vehicle>();
		boxb.addVehicle(lamborghiniAnventador);
		boolean checkBox = boxa.equals(boxb);
		System.out.println("=== PRIMA ===");
		if (checkBox) {
			System.out.println("Le due liste sono uguali");
		} else {
			System.out.println("Le due liste sono diverse");
		}
		System.out.println("=== DOPO ====");
		boxa.addVehicle(ferrariPortofino);
		boolean recheckBox = boxa.equals(boxb);
		if (recheckBox) {
			System.out.println("Le due liste sono uguali");
		} else {
			System.out.println("Le due liste sono diverse");
		}

	}
}
