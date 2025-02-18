package es.uah.matcomp.mp.e2.ejerciciosclases.e7;
import es.uah.matcomp.mp.e2.ejerciciosclases.e4.MyPoint;

public class MyTriangle {
    public MyPoint v1;
    public MyPoint v2;
    public MyPoint v3;

    public MyTriangle(int x1, int y1, int x2, int y2, int x3, int y3) {
        v1 = new MyPoint(x1, y1);
        v2 = new MyPoint(x2, y2);
        v3 = new MyPoint(x3, y3);
    }
    public MyTriangle (MyPoint v1, MyPoint v2, MyPoint v3){
        this.v1 = v1;
        this.v2 = v2;
        this.v3 = v3;
    }
    @Override
    public String toString() {
        return "MyTriangle{" + "v1=" + v1 + ", v2=" + v2 + ", v3=" + v3 + '}';
    }
    public double getPerimeter(){
        return v1.distance(v2.getX(), v2.getY()) + v2.distance(v3.getX(), v3.getY()) + v3.distance(v1.getX(), v1.getY());
    }

    public String getType(){
        double side1 = v1.distance(v2.getX(), v2.getY());
        double side2 = v2.distance(v3.getX(), v3.getY());
        double side3 = v3.distance(v1.getX(), v1.getY());
        if ((side1 == side2) && (side2 == side3)){
            return "El triangulo es equilatero";
        }
        if ((side1 == side2) || (side2 == side3) || (side1 == side3)){
            return "El triangulo es isosceles";
        }
        else {
            return "El triangulo es escaleno";
        }
    }
}
