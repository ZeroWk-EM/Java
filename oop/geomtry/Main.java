package oop.geomtry;

public class Main {
    public static void main(String[] args) {
        Square quadrato = new Square(10);
        System.out.println("=== Prima ===");
        System.out.println("La lunghezza del lato l e' di  [" + quadrato.getLen() + "]");
        System.out.println("Il perimetro e' [" + quadrato.getPerimeto() + "]");
        System.out.println("L'area e [" + quadrato.getArea() + "]");

        quadrato.setLen(50);

        System.out.println("=== Dopo ===");
        System.out.println("La lunghezza del lato l e' di  [" + quadrato.getLen() + "]");
        System.out.println("Il perimetro e' [" + quadrato.getPerimeto() + "]");
        System.out.println("L'area e [" + quadrato.getArea() + "]");
        // ===================================================
        Rectangle rect = new Rectangle(10, 20);
        System.out.println("=== Prima ===");
        System.out.println("La lunghezza del lato a del rettangolo e di  [" + rect.getA() + "]");
        System.out.println("La lunghezza del lato b del rettangolo e' di  [" + rect.getB() + "]");
        System.out.println("Il perimetro e' [" + rect.getPerimeto() + "]");
        System.out.println("L'area e [" + rect.getArea() + "]");

        rect.setAltezza(19);
        rect.setBase(22);

        System.out.println("=== Dopo ===");
        System.out.println("La lunghezza del lato a del rettangolo e di  [" + rect.getA() + "]");
        System.out.println("La lunghezza del lato b del rettangolo e' di  [" + rect.getB() + "]");
        System.out.println("Il perimetro e' [" + rect.getPerimeto() + "]");
        System.out.println("L'area e [" + rect.getArea() + "]");

    }
}
