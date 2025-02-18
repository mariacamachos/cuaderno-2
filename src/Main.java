import es.uah.matcomp.mp.e2.ejerciciosclases.e4.MyPoint;
import es.uah.matcomp.mp.e2.ejerciciosclases.e6.MyCircle;

import java.util.Arrays;


public class Main {
    public static void main(String[] args) {
        MyPoint p1 = new MyPoint(1,9);
        MyCircle c1 = new MyCircle(1,3, 5);
        MyCircle c2 = new MyCircle(new MyPoint(9,3),3);
        MyCircle c3 = new MyCircle();
        System.out.println("Circulo 1: " + c1);
        System.out.println("Circulo 2: " + c2);

        System.out.println("Centro de c1: " + c1.getCenter());
        System.out.println("Radio de c2: " + c2.getRadius());

        c1.setRadius(5);
        System.out.println("Nuevo radio de c1: " + c1.getRadius());
        c1.setCenter(new MyPoint(6,4));
        System.out.println("Nuevo centro de c1: " + c1.getCenter());

        c1.setCenterX(2);
        System.out.println("Nuevo centro de c1: " + c1.getCenter());
        c2.setCenterY(5);
        System.out.println("Nuevo centro de c2: " + c2.getCenter());

        c1.setCenterXY(4, 9);
        System.out.println("Nuevo centro de c1: " + Arrays.toString(c1.getCenterXY()));
        c2.setCenterXY(0, 6);
        System.out.println("Nuevo centro de c2: " + Arrays.toString(c2.getCenterXY()));

        System.out.println("Area de c1: " + c1.getArea());
        System.out.println("Circunferencia de c1: " + c1.getCircumference());

        System.out.println("Distancia entre c1 y c2: " + c1.distance(c2));
    }
}