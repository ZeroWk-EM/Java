package inheritance.veichle;

public class Truck extends Veichle{
    private int axes;
    private boolean alarm;

    Truck(int passengers, int fuel, int mpg, int axes, boolean alarm){
        super(passengers, fuel, mpg);
        setAxes(axes);
        setAlarm(alarm);
    }

    public int getAxes() {
        return axes;
    }
    
public boolean getAlarm() {
    return this.alarm;
}

    public void setAxes(int axes) {
        this.axes = axes;
    }

    public void setAlarm(boolean alarm) {
        this.alarm = alarm;
    }
}
