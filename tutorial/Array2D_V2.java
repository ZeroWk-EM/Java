package tutorial;

public class Array2D_V2 {
    public static void main(String[] args) {
        String[][] classi = {
                { "Lucia", "Giulia", "Sara" },
                { "Saro", "Domenico", "Donato" },
                { "Samuele", "Roberto", "Emanuele" }
        };
        // Cosi prende tutta la riga classe Lucia,Giulia,Sara
        for (String[] classe : classi) {
            // Qui prende prima Lucia da classe, poi Giulia da classe e infine Sara da
            // classe
            for (String stedente : classe) {
                System.out.print("[" + stedente + "] ");
            }
            System.out.println("\n==========================");
        }
    }
}