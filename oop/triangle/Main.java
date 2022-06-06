package oop.triangle;

public class Main {
    public static void main(String[] args) {
        Trinagle primo = new Trinagle();
        Trinagle secondo = new Trinagle();
        primo.setDim(20, 12, 22);
        secondo.setDim(19, 31, 52);

        System.out.println("Perimetro primo triangolo " + primo.getPerimeto());
        System.out.println("Area primo triangolo " + primo.getArea());

        System.out.println("Perimetro secondo triangolo " + secondo.getPerimeto());
        System.out.println("Area secondo triangolo " + secondo.getArea());

        System.out.println("Differenza fra " + primo.getPerimeto() + " e " + secondo.getPerimeto() + " e "
                + primo.differenza(secondo));

    }
}
