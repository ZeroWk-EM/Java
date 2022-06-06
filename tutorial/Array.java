package tutorial;

public class Array {
    public static void main(String[] args) {
        // Primo metodo per dichiarare un array di lunghezza fissa
        int[] array = new int[5];
        array[0] = 1;
        array[1] = 3;
        array[2] = 6;
        array[3] = 10;
        array[4] = 45;
        System.out.println("Lunghezza Array [" + array.length + "]");
        for (int i = 0; i < array.length; i++) {
            System.out.println("Nell'indice [" + i + "] ci sta il valore[" + array[i] + "]");
        }
        System.out.println("===================================");
        // Secondo metodo per dichiarare e inizializare un array
        int[] array2 = { 5, 8, 1, 9, 3, 5, 6, 1, 3, 5, 6 };
        System.out.println("Lunghezza Array [" + array2.length + "]");
        for (int i = 0; i < array2.length; i++) {
            System.out.println("Nell'indice [" + i + "] ci sta il valore[" + array2[i] + "]");
        }
    }
}