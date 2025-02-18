package es.uah.matcomp.mp.e2.ejerciciosclases.e4;

public class MyPoint {/**Guardado en MyPoint.java*/
    private int x;
    private int y;

    public MyPoint() {
       this.x = 0;
       this.y = 0;
    }
    public MyPoint(int x, int y) {
        this.x = x;
        this.y = y;
    }
    public int getX() {
        return x;
    }
    public void setX(int x) {
        this.x = x;
    }
    public int getY() {
        return y;
    }
    public void setY(int y) {
        this.y = y;
    }
    public int[] getXY() {
        return new int []{this.x, this.y};
    }
    public void setXY(int x, int y) {
        this.x = x;
        this.y = y;
    }
    @Override
    public String toString() {
        return "{" + x + ", " + y + '}';
    }
    public double distance (int x, int y) {
        return Math.sqrt(Math.pow(x - this.x, 2) + Math.pow(y - this.y, 2));
    }
    public double distance ( MyPoint another) {
        return distance(another.getX(), another.getY());
    }
    public double distance () {
        return Math.sqrt(Math.pow(this.x, 2) + Math.pow(this.y, 2));
    }
}

