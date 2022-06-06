package es_if;

import java.util.Scanner;

public class TempConvert {
    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);
        try {

            System.out.println("====Converitore di temperatura====");
            System.out.print("Inserisci la temperatura in celsius ");
            int temp = reader.nextInt();

            double tempFahrenheit = (1.8 * temp) + 32;
            double tempKelvin = temp + 273.15;
            double absolutezero = -273.15;
            if (tempKelvin < absolutezero) {
                System.out.println("Errore, non puoi inserire una temperatura più bassa dello zero assoluto");
            } else {
                System.out.println("[" + temp + "] gradi celsius");
                System.out.println("Equivalgono ad [" + tempFahrenheit + "] Fahrenheit");
                System.out.println("Equivalgono ad [" + tempKelvin + "] Kelvin");
            }
        } finally {
            reader.close();
        }
    }
}