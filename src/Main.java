import es.uah.matcomp.mp.e2.ejerciciosclases.e4.MyPoint;
import es.uah.matcomp.mp.e2.ejerciciosclases.e4.Matriz;

public class Main {
    public static void main(String[] args) {
        /**Construimos un programa para calcular con los atributos y metodos*/
        /**Va a imprimir el p1 que está designado por el (0,0) al principio*/
        MyPoint p1 = new MyPoint();
        System.out.println("Mi punto es: " + p1);

        /**A partir de los setter establecemos nuevas coordenas que imprimimos,
         * las estbalecemos por separado los valores de la x y de la y*/
        p1.setX(8);
        p1.setY(6);
        System.out.println("La x es: " + p1.getX());
        System.out.println("La y es: " + p1.getY());

        /**A través de un setter establecemos una nueva coordenada*/
        p1.setXY(3, 0);
        /**Imprimos la coordenada por separado*/
        System.out.println("La x es:" + p1.getXY()[0]);
        System.out.println("La y es:" + p1.getXY()[1]);
        /**Imprimimos la coordenada definida*/
        System.out.println("La coordenada es:" + p1);

        /**Establecemos un nuevo punto a traves del metodo y lo imprimimos*/
        MyPoint p2 = new MyPoint(0, 4);
        System.out.println("El nuevo punto es:" + p2);

        /**Calculamos la distancia que hay del punto p1 al punto p2*/
        System.out.println("La distancia del punto p1 al p2 es:" + p1.distance(p2));
        /**Calculamos la distancia que hay del punto p2 al punto p1*/
        System.out.println("La distancia del punto p2 al p1 es:" + p2.distance(p1));
        /**Calculamos la distancia que hay del punto p1 al (5,6)*/
        System.out.println("La distancia es:" + p1.distance(5, 6));
        System.out.println("La distancia es:"+ p1.distance());

        /**Muestra la matriz con las distancias entre los puntos (1,1),(2,2),...,(10,10)*/
        Matriz matriz = new Matriz();
        System.out.println("Matriz de distancias es: ");
        matriz.imprimirMatriz();
    }


}




