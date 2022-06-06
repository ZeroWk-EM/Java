package tutorial;

public class WrappedClass {
    public static void main(String[] args) {
        // Le wrapped class trasformano i dati primitivi in reference

        Boolean istrue = true;
        boolean istrue1 = true;
        // Boolean reference e uguale a boolean primitivo
        if (istrue == istrue1) {
            System.out.println("VERO");
        }

        Character ch = 'a';
        char ch1 = 'a';
        // Character reference e uguale a char primitivo
        if (ch == ch1) {
            System.out.println("VERO");
        }

        Integer num = 5;
        int num1 = 5;
        // Integer reference e uguale a int primitivo
        if (num == num1) {
            System.out.println("VERO");
        }

        // Double reference e uguale a double primitivo
        Double comma = 5.234;
        double comma1 = 5.234;
        if (comma == comma1) {
            System.out.println("VERO");
        }

        // String e' reference
        String name = "Melo";
        String name1 = "Melo";
        if (name == name1) {
            System.out.println("VERO");
        }
    }
}
