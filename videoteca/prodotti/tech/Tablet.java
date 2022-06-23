package videoteca.prodotti.tech;

public class Tablet extends Device {
    boolean isFoldable;

    public Tablet(int id, String brand, String model, String serialCode, int releseYear, String osVersion,
            double price) {
        super(id, brand, model, serialCode, releseYear, osVersion, price);
        setFoldable(isFoldable);
    }

    public void setFoldable(boolean isFoldable) {
        this.isFoldable = isFoldable;
    }

    @Override
    public String toString() {
        return "ID " + getId()
                + "\nBrand " + getBrand()
                + "\nModello " + getModel()
                + "\nCodice seriale " + getSerialCode()
                + "\nAnno di rilascio " + getReleseYear()
                + "\nVersione os " + getOsVersion()
                + "\nPiegevole " + isFoldable;
    }
}
