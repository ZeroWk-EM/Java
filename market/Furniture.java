package market;

public class Furniture implements Article {

    private String name;
    private Double price;
    // furniture properties
    private double height;
    private double width;
    private double deep;

    public Furniture(String name, Double price, double height, double width, double deep) {
        setName(name);
        setPrice(price);
        setHeight(height);
        setWidth(width);
        setDeep(deep);
    }

    @Override
    public String getName() {
        return name;
    }

    @Override
    public Double getPrice() {
        return price;
    }

    public double getHeight() {
        return height;
    }

    public double getWidth() {
        return width;
    }

    public double getDeep() {
        return deep;
    }

    private void setName(String name) {
        this.name = name;
    }

    private void setPrice(Double price) {
        this.price = price;
    }

    private void setHeight(double height) {
        this.height = height;
    }

    private void setWidth(double width) {
        this.width = width;
    }

    private void setDeep(double deep) {
        this.deep = deep;
    }

    @Override
    public String toString() {
        return "Nome " + name + " Prezzo " + price +
                " Altezza [" + height + "] || Lunghezza [" + width + "] || Profondita [" + deep + "]";
    }
}
