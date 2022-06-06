package oop.geomtry;

public class Square {
    private int len;

    Square(int x) {
        setLen(x);
    }

    public void setLen(int x) {
        if (x > 0) {
            this.len = x;
        } else {
            this.len = 1;
        }
    }

    public int getLen() {
        return this.len;
    }

    public int getPerimeto() {
        return this.len * 4;
    }

    public int getArea() {
        return this.len * this.len;

    }
}
