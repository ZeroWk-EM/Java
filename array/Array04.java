package array;

public class Array04 {
    public static void main(String[] args) {
        boolean[] array1 = { false, true, false, true, true };
        boolean[] array2 = { false, true, false };
        boolean[] array3 = { false, true, false, true };
        boolean[] array4 = {};

        // CONTROLLO ARRAY 1
        int isTrue = 0;
        int isFalse = 0;
        for (int i = 0; i < array1.length; i++) {
            if (array1[i]) {
                isTrue++;
            } else {
                isFalse++;
            }
        }
        if (isTrue > isFalse) {
            System.out.println("Nell'array 1 sono presenti [" + isTrue + "] true e [" + isFalse
                    + "] quindi il risultato e' [true]");
        } else if (isTrue == isFalse) {
            System.out.println("Nell'array 1 sono presenti [" + isTrue + "] true e [" + isFalse
                    + "] quindi il risultato e' [null]");
        } else {
            System.out.println("Nell'array 1 sono presenti [" + isTrue + "] true e [" + isFalse
                    + "] quindi il risultato e' [false]");
        }

        // CONTROLLO ARRAY 2
        isTrue = 0;
        isFalse = 0;
        for (int i = 0; i < array2.length; i++) {
            if (array2[i]) {
                isTrue++;
            } else {
                isFalse++;
            }
        }
        if (isTrue > isFalse) {
            System.out.println("Nell'array 2 sono presenti [" + isTrue + "] true e [" + isFalse
                    + "] quindi il risultato e' [true]");
        } else if (isTrue == isFalse) {
            System.out.println("Nell'array 2 sono presenti [" + isTrue + "] true e [" + isFalse
                    + "] quindi il risultato e' [null]");
        } else {
            System.out.println("Nell'array 2 sono presenti [" + isTrue + "] true e [" + isFalse
                    + "] quindi il risultato e' [false]");
        }
        // CONTROLLO ARRAY 3
        isTrue = 0;
        isFalse = 0;
        for (int i = 0; i < array3.length; i++) {
            if (array3[i]) {
                isTrue++;
            } else {
                isFalse++;
            }
        }
        if (isTrue > isFalse) {
            System.out.println("Nell'array 3 sono presenti [" + isTrue + "] true e [" + isFalse
                    + "] quindi il risultato e' [true]");
        } else if (isTrue == isFalse) {
            System.out.println("Nell'array 3 sono presenti [" + isTrue + "] true e [" + isFalse
                    + "] quindi il risultato e' [null]");
        } else {
            System.out.println("Nell'array 3 sono presenti [" + isTrue + "] true e [" + isFalse
                    + "] quindi il risultato e' [false]");
        }

        // CONTROLLO ARRAY 4
        isTrue = 0;
        isFalse = 0;
        for (int i = 0; i < array4.length; i++) {
            if (array4[i]) {
                isTrue++;
            } else {
                isFalse++;
            }
        }
        if (isTrue > isFalse) {
            System.out.println("Nell'array 4 sono presenti [" + isTrue + "] true e [" + isFalse
                    + "] quindi il risultato e' [true]");
        } else if (isTrue == isFalse) {
            System.out.println("Nell'array 4 sono presenti [" + isTrue + "] true e [" + isFalse
                    + "] quindi il risultato e' [null]");
        } else {
            System.out.println("Nell'array 4 sono presenti [" + isTrue + "] true e [" + isFalse
                    + "] quindi il risultato e' [false]");
        }

    }
}
