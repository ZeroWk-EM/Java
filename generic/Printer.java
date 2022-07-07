package generic;

public class Printer<T, V> {
    T object1;
    V object2;

    public Printer(T object1) {
        setObject1(object1);
    }

    public Printer(T object1, V object2) {
        setObject1(object1);
        setObject2(object2);
    }

    public T getObject1() {
        return object1;
    }

    public void setObject1(T object1) {
        this.object1 = object1;
    }

    public V getObject2() {
        return object2;
    }

    public void setObject2(V object2) {
        this.object2 = object2;
    }

    public void show() {
        System.out.println("[" + object1 + "][" + object2 + "]");
    }
}
