/**Se importan las clases MyPoint.java y MyTriangle.java*/
import es.uah.matcomp.mp.e2.ejerciciosclases.e4.MyPoint;
import es.uah.matcomp.mp.e2.ejerciciosclases.e7.MyTriangle;

public class Main {
    public static void main(String[] args) {
        /**Designamos los tres puntos en coordenadas(2,7), (8,5),(3,1)*/
        MyPoint p1 = new MyPoint(2, 7);
        MyPoint p2 = new MyPoint(8, 5);
        MyPoint p3 = new MyPoint(3, 1);
        /**Imprimos los puntos*/
        System.out.println("Mi primer punto es: " + p1);
        System.out.println("Mi segundo punto es: " + p2);
        System.out.println("Mi tercer punto es: " + p3);
        /**Designamos el triangulo 1 con las coordenadas (0,0),(4,0),(2,3)*/
        MyTriangle t1 = new MyTriangle(0, 0, 4, 0, 2, 3);
        /**Designamos el triangulo 2 con las coordenadas p1,p2 y p3*/
        MyTriangle t2 = new MyTriangle(p1, p2, p3);
        /**Designamos el tringulo 3 con los 3 puntos en el origen de coordenadas para probar que se imprime el
         * triangulo es equilatero y ver que funciona*/
        MyTriangle t3 = new MyTriangle(0,0,0,0,0,0);


        /**Imprimimos el tipo que es cada triangulo*/
        System.out.println("El triangulo formado por los puntos (0,0), (4,0), (2,3) es : " + t1.getType()) ;
        System.out.println("El triangulo formado por los puntos p1, p2, p3 es : " + t2.getType());
        System.out.println("El triangulo formado por los puntos (0,0), (0,0), (0,0) es : " + t3.getType()) ;

        /**Imprimimos el perimetro del triangulo 1, 2 y 3*/
        System.out.println("El perimetro del triangulo t1 es:" + t1.getPerimeter());
        System.out.println("El perimetro del triangulo t2 es:" + t2.getPerimeter());
        System.out.println("El perimetro del triangulo t3 es:" + t3.getPerimeter());
    }
}
