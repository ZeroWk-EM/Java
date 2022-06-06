
package tutorial;

public class Array2D {
    static public void main(String[] args) {
        // Gli array 2D sono array di array meglio note come tabelle o MATRICI
        // Il primo array [X][] rappresente le righe
        // il secondo array [][X] rappresenta le colonne
        String[][] classi = new String[3][3];

        // CLASSE 1
        classi[0][0] = "Lucia";
        classi[0][1] = "Giulia";
        classi[0][2] = "Sara";

        // CLASSE 2
        classi[1][0] = "Saro";
        classi[1][1] = "Domenico";
        classi[1][2] = "Donato";

        // CLASSE3
        classi[2][0] = "Samuele";
        classi[2][1] = "Roberto";
        classi[2][2] = "Emanuele";

        for (int classe = 0; classe < classi.length; classe++) {
            for (int alunno = 0; alunno < classi[classe].length; alunno++) {
                System.out.print("[" + classi[classe][alunno] + "] ");
            }
            System.out.print("\n================================\n");
        }
    }
}
