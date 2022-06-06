package es_if;

import java.util.Scanner;

public class Progressive {
    static public void main(String[] args) {
        Scanner reader = new Scanner(System.in);
        try {
            int num1, num2, num3;
            System.out.println("===================");
            System.out.println("Inserisci il primo numero");
            num1 = reader.nextInt();
            System.out.println("Inserisci il secondo numero");
            num2 = reader.nextInt();
            System.out.println("Inserisci il terzo numero");
            num3 = reader.nextInt();
            System.out.println("===================");
            int progressive1 = num2 - num1;
            int progressive2 = num3 - num2;
            if (progressive1 == progressive2) {
                System.out.println(
                        "I numeri [" + num1 + "],[" + num2 + "],[" + num3 + "] rappresentano una progressione");
                System.out.println("[" + num2 + "]-[" + num1 + "] = [" + progressive1 + "] && [" + num3 + "]-[" + num2
                        + "] = [" + progressive2 + "]");
                System.out.println("===================");
                System.out.println("[" + progressive1 + "] == [" + progressive2 + "]");
            } else {
                System.out.println(
                        "I numeri [" + num1 + "],[" + num2 + "],[" + num3 + "] NON rappresentano una progressione");
                System.out.println("[" + num2 + "]-[" + num1 + "] = [" + progressive1 + "] && [" + num3 + "]-[" + num2
                        + "] = [" + progressive2 + "]");
                System.out.println("===================");
                System.out.println("[" + progressive1 + "] != [" + progressive2 + "]");

            }
        } finally {
            reader.close();
        }
    }
}
