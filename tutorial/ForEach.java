//Scorri un array usando il forEach
package tutorial;

public class ForEach {
    static public void main(String[] args) {
        // Il foreach serve se dobbiamo scorrere completamente un array
        int[] numeri = { 4, 6, 7, 8, 9, 2, 4, 6, 3, 5, 6 };
        // Per ogni "numero" dell'array numeri stampa numero
        // NUMERI E' UNA LISTA DI NUMERO
        for (int numero : numeri) { // La variabile numero può chimarsi in qualsiasi modo
            // Al primo ciclo NUMERO=4, al secondo sara NUMERO=6 e cosi via...
            System.out.print("[" + numero + "] ");
        }
    }

}
