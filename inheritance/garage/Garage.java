package inheritance.garage;
import inheritance.veichle.Veichle;

public class Garage {
    private int maxAutocarri;
    private int maxAuto;
    private int maxMoto;

    private int countAutocarri;
    private int countAuto;
    private int countMoto;

    Garage(int maxAutocarri, int maxAuto, int maxMoto){
        setMaxAutocarri(maxAutocarri);
        setMaxAuto(maxAuto);
        setMaxMoto(maxMoto);
    }

    public void setMaxAuto(int maxAuto) {
        this.maxAuto = maxAuto;
    }

    public void setMaxAutocarri(int maxAutocarri) {
        this.maxAutocarri = maxAutocarri;
    }

    public void setMaxMoto(int maxMoto) {
        this.maxMoto = maxMoto;
    }

    public void addVehicle(Veichle vehicle){
        
    }
}
