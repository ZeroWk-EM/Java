//Importazione dei package dove sono contenute le classi
import core.camper.*;
import  core.founder.*;
import core.car.*;
import core.motorcycle.*;
import core.van.*;

public class DealershipTester{
	public static void main(String[] args) {
		boolean checkCar;
		boolean checkMotorcycle;
		boolean checkVan;
		boolean checkCamper;


		Vehicle auto1 = new Car("Lamborghini","Anventador","Arancione",770,6500,2,"DND 666 SDK",transmissionType.MANUALE,3,350_000);
		Vehicle auto2 = new Car("Ferrari","PortofinoM","Rosso",620,3900,2,"SKM 462 ODF",transmissionType.MANUALE,3,220_000);
		checkCar=auto1.equals(auto2);
		System.out.println("========= AUTO =========");
		if (checkCar){
			System.out.println("Le due auto sono uguali");
		}else
		{
			System.out.println("Le due auto non sono uguali");
		}

		Vehicle van1 = new Van("Citroen","Jumper","Rosso",120,1800,3,"LML 817 KKK",850,25_000);
		Vehicle van2 = new Van("Citroen","Jumper","Bianco",120,1800,3,"LTL 999 82G",850,10_000);
		checkVan=van1.equals(van2);
		System.out.println("========= FURGONI =========");
		if (checkVan){
			System.out.println("I due furgoni sono uguali");

		}else{
			System.out.println("I due furgoni non sono uguali");

		}

		Vehicle motorcyle1 = new Motorcycle("Ducati","Panigale","Rosso",220,1000,2,"LSD 123", motorcycleType.SUPERBIKE,25_000);
		Vehicle motorcyle2 = new Motorcycle("Ducati","Monster","Rosso",111,950,2,"SMH 177", motorcycleType.STRADALE,11_500);
		System.out.println("========= MOTO =========");
		checkMotorcycle=motorcyle1.equals(motorcyle2);
		if (checkMotorcycle){
			System.out.println("Le due moto sono uguali");

		}else{
			System.out.println("Le due moto non sono uguali");

		}

		Vehicle camper1 = new Camper("KNAUS","Van I","Bianco",140,2280,6,"MNJ 938 LLK", camperType.MOTORHOME,75_000);
		Vehicle camper2 = new Camper("KNAUS ","VanP","Grigio",150,2150,7,"Q8S Y8O L89", camperType.PROFILATO,80_000);
		System.out.println("========= CAMPER =========");
		checkCamper=camper1.equals(camper2);
		if (checkCamper){
			System.out.println("I due camper sono uguali");

		}else{
			System.out.println("I due camper non sono uguali");

		}
		System.out.println("\n========= TEST toString =========");
		System.out.println(auto1+"\n");
		System.out.println(van1+"\n");
		System.out.println(motorcyle1+"\n");
		System.out.println(camper1+"\n");

	}
}
