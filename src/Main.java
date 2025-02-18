import es.uah.matcomp.mp.e2.ejerciciosclases.e4.MyPoint;
import es.uah.matcomp.mp.e2.ejerciciosclases.e7.MyTriangle;

public class Main {
    public static void main(String[] args) {
        MyPoint p1 = new MyPoint(2, 7);
        MyPoint p2 = new MyPoint(8, 5);
        MyPoint p3 = new MyPoint(3, 1);

        System.out.println("Mi primer punto es: " + p1);
        System.out.println("Mi segundo punto es: " + p2);
        System.out.println("Mi tercer punto es: " + p3);

        MyTriangle t1 = new MyTriangle(0, 0, 4, 0, 2, 3);
        MyTriangle t2 = new MyTriangle(p1, p2, p3);


        System.out.println("El triangulo formado por los puntos (0,0), (4,0), (2,3) es : " + t1.getType()) ;
        System.out.println("El triangulo formado por los puntos p1, p2, p3 es : " + t2.getType());

        System.out.println("El perimetro del triangulo t1 es:" + t1.getPerimeter());
        System.out.println("El perimetro del triangulo t2 es:" + t2.getPerimeter());
    }
}
