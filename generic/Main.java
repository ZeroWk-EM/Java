package generic;

public class Main {
    public static void main(String[] args) {
        Printer<Integer, Double> printer01 = new Printer<>(10, 55.5);
        printer01.show();
    }

}
