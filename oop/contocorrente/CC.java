package oop.contocorrente;

public class CC {
    int id;
    String nome;
    String cognome;
    private int saldo;
    private int[] movimenti = new int[5];

    int counter = 0;

    // Construct
    CC(int id, String nome, String cognome, int saldo) {
        this.id = id;
        this.nome = nome;
        this.cognome = cognome;
        if (saldo >= 0) {
            this.saldo = saldo;
        } else {
            this.saldo = 0;
        }
    }

    // For deposit money
    public int deposit(int x) {
        movimenti[counter] = x;
        /*
         * La prima volta che viene richiamata la
         * funzione salvera il valore in movimenti[0]
         */
        this.saldo += x;
        counter++;
        /*
         * se viene richiamata un'altra volta questa funzione
         * oppure preleva(int x) sarà massa nella locazione successica
         * grazie a counter++;
         */
        return this.saldo;
    }

    // For put money
    public int take(int x) {
        if (this.saldo - x < 0) {
            // Verifico che ci sia abbastanza saldo per prelevare
            System.out.println("[Non ci sono abbastanza soldi]");
        } else if (this.saldo - x > 0) {
            movimenti[counter] = -x; // Vado a mettere il valore negativo per aiutarmi poi con la stampa
            this.saldo -= x;
            counter++;
        }
        return this.saldo;
    }

    // Show saldo
    public int getBalance() {
        return this.saldo;
    }

    // Reverse cicles
    public void movimenti() {
        if (counter == 0) {
            System.out.println("Non sono ancora stati eseguiti movimenti");
        } else {
            for (int i = 0; i < 5; i++) {
                /*
                 * Avendo messo su movimento[i] il valore opposto
                 * ogni qualvolta si esegue un prelivo potro fare stampare nella lista dei
                 * movimenti quello che stiamo facendo perchè se e possitivo so per certo che
                 * deve essere un deposito perchè i prelievi saranno sempre -x
                 */
                if (movimenti[i] > 0) {
                    System.out.print("Versamento ");
                } else {
                    System.out.print("Prelievo ");
                }
                System.out.println("[" + movimenti[i] + "]");
            }
        }
    }// For show last five moviment
}
