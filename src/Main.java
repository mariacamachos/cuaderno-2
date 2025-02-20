/**Se importan las clases MyPoint.java y MiCircle.java*/
import es.uah.matcomp.mp.e2.ejerciciosclases.e4.MyPoint;
import es.uah.matcomp.mp.e2.ejerciciosclases.e6.MyCircle;
import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        /**Establecemos un punto cuyas coordenadas son (1,9)*/
        MyPoint p1 = new MyPoint(1, 9);
        /**Creamos tres círculos, el primero con centro en (1,3) y radio 5,
         * el segundo con centro (9,3) y radio 3 y, el último, centro en (0,0) y radio 1*/
        MyCircle c1 = new MyCircle(1, 3, 5);
        MyCircle c2 = new MyCircle(new MyPoint(9, 3), 3);
        MyCircle c3 = new MyCircle();
        /**Se imprimen los datos del círculo 1, 2 y 3*/
        System.out.println("Circulo 1: " + c1);
        System.out.println("Circulo 2: " + c2);
        System.out.println("Circulo 3: " + c3);

        /**Se imprimen los datos del centro del circulo 1 y el radio del circulo 2*/
        System.out.println("Centro de c1: " + c1.getCenter());
        System.out.println("Radio de c2: " + c2.getRadius());

        /**Establecemos para el radio del circulo 1 el valor de: 5 y lo imprimimos*/
        c1.setRadius(5);
        System.out.println("Nuevo radio de c1: " + c1.getRadius());
        /**Establecemos para el centro del circulo 1 el punto: (6,4) y lo imprimimos*/
        c1.setCenter(new MyPoint(6, 4));
        System.out.println("Nuevo centro de c1: " + c1.getCenter());

        /**Establecemos el centro del circulo 1 con la modificacion de la
         * coordenada x en 2 y lo imprimimos*/
        c1.setCenterX(2);
        System.out.println("Nuevo centro de c1: " + c1.getCenter());
        /**Establecemos el centro del circulo 2 con la modificacion de la
         * coordenada y en 5 y lo imprimimos*/
        c2.setCenterY(5);
        System.out.println("Nuevo centro de c2: " + c2.getCenter());

        /**Cambiamos las coordenadas del centro del circulo 1 en: (4,9) y lo imprimimos*/
        c1.setCenterXY(4, 9);
        System.out.println("Nuevo centro de c1: " + Arrays.toString(c1.getCenterXY()));
        /**Cambiamos las coordenadas del centro del circulo 2 en: (0,6) y lo imprimimos*/
        c2.setCenterXY(0, 6);
        System.out.println("Nuevo centro de c2: " + Arrays.toString(c2.getCenterXY()));

        /**Imprime el area del circulo 1 y 2*/
        System.out.println("Area de c1: " + c1.getArea());
        System.out.println("Area de c2: " + c2.getArea());

        /**Imprime la circunferencia del circulo 1 y 2*/
        System.out.println("Circunferencia de c1: " + c1.getCircumference());
        System.out.println("Circunferencia de c2: " + c2.getCircumference());

        /**Imprime la distancia entre los dos circulos */
        System.out.println("Distancia entre los centros del circulo 1 y 2: " + c1.distance(c2));
    }
}


