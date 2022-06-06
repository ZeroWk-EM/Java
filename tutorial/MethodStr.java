package tutorial;

public class MethodStr {
    public static void main(String[] args) {
        String nome = "Emanuele";
        System.out.println("==========isEquals()=========="); // Controllo se il valore contetuno dentro nome e uguale,
        // ad un qualcosa che scrivero io
        boolean isEqual = nome.equals("Emanuele"); // Mettendo boolean se e vero sara true se e falso sara false
        System.out.println("IsEqual=[" + isEqual + "]");
        // Se isEqual e vero
        if (isEqual) {
            System.out.println("I nomi coincidono");
            // Altrimenti
        } else {
            System.out.println("I nomi sono diversi");
        }
        System.out.println("==========lenght()=========="); // Mi da la lunghezza della stringa
        int lunghezza = nome.length();
        System.out.println("La stringa e' lunga [" + lunghezza + "]");
        System.out.println("==========charAt()=========="); // Mi restituisce un carattere a mia scelta della stringa
        // scelta
        char carattere = nome.charAt(4);
        System.out.println("La lettera in posizione 4 di [" + nome + "] e' [" + carattere + "]");
        System.out.println("==========indexOf()=========="); // Ci restituisce indice di un carattere PS. si parte a
        // contare da zero
        int charFound = nome.indexOf("n");
        System.out.println("La lettera n di [" + nome + "] ha come indice [" + charFound + "]");
        System.out.println("==========isEmpty()=========="); // Ci dice se la stringa e' vuota
        String cognome = "";
        boolean isEmpty = cognome.isEmpty();
        // Se e vuota
        System.out.println("IsEmpty=[" + isEmpty + "]");
        if (isEmpty) {
            System.out.println("Nella stringa [" + cognome + "] non c'e scritto nulla");
        } else {
            System.out.println("La stringa [" + cognome + "] e' piena");
        }
        System.out.println("==========toLowerCase()=========="); // Mette tutta la stringa in minuscolo
        String minuscolo = nome.toLowerCase();
        System.out.println("La stringa [" + nome + "] tutta in minuscolo e' uguale ad [" + minuscolo + "]");
        System.out.println("==========trim()=========="); // Elimina gli spazi
        String citta = "  Roma";
        String nospace = citta.trim();
        System.out.println("La citta' [" + citta + "] senza spazi e' uguale ad [" + nospace + "]");
        System.out.println("==========replace()=========="); // Sostituisce tutte le occurrenze di una carattare
        String isReplace = nome.replace('e', 't');
        System.out.println("Il nome con lettere sostituite e' [" + isReplace + "]");
    }

}
