package videoteca.prodotti.tech;

public class Phone extends Device {
    boolean isWaterproof;
    boolean isRugged;

    public Phone(int id, String brand, String model, String serialCode, int releseYear, String osVersion,
            double price) {
        super(id, brand, model, serialCode, releseYear, osVersion, price);
        setWaterproof(isWaterproof);
        setRugged(isRugged);
    }

    public void setWaterproof(boolean isWaterproof) {
        this.isWaterproof = isWaterproof;
    }

    public void setRugged(boolean isRugged) {
        this.isRugged = isRugged;
    }

    @Override
    public String toString() {
        return "ID" + getId()
                + " Brand " + getBrand()
                + "\nModello " + getModel()
                + "\nCodice seriale " + getSerialCode()
                + "\nAnno di rilascio " + getReleseYear()
                + "\nVersione os " + getOsVersion()
                + "\nResistenza all'acqua " + isWaterproof
                + "\nResistenza agli urti " + isRugged;
    }
}
