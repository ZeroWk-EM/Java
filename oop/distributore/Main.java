package oop.distributore;

public class Main {
    public static void main(String[] args) {
        Distributore frigo = new Distributore(0.55,0.70,20);
        frigo.inserisciMonete(0.50);
        frigo.inserisciMonete(0.20);
        frigo.scegliBevanda(1);
        frigo.visualizzaStato();
        frigo.ritiraResto();
        frigo.visualizzaStato();
     }   
}
