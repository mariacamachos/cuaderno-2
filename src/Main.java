import es.uah.matcomp.mp.e2.ejerciciosclases.e4.MyPoint;
import es.uah.matcomp.mp.e2.ejerciciosclases.e5.MyLine;

public class Main {
    public static void main(String[] args) {
        /**Construimos un programa para calcular con los atributos y metodos*/
        /**Establezco los tres puntos de coordenadas (x,y) a partir de importar las clase de
         * MyPoint.java y MyLine.java */
        MyPoint p1 = new MyPoint(16, 5);
        MyPoint p2 = new MyPoint(1, 7);
        MyPoint p3 = new MyPoint(2, 9);
        /**Designamos la línea 1 designada por el punto inicial (2,3) y el punto
         * final designado por el (1,5)*/
        MyLine L1 = new MyLine(2,3,1,5);
        /**La línea 2 está formada por el punto p1 y p2 designados arriba con el MyPoint*/
        MyLine L2 = new MyLine(p2, p1);

        /**Se imprimen los puntos y las líneas */
        System.out.println("El punto 1 es:" + p1);
        System.out.println("El punto 2 es:" + p2);
        System.out.println("La línea 1 es:" + L1);
        System.out.println("La línea 2 es:" + L2);

        /**Se muestra la información de las líneas*/
        System.out.println("El punto inicial de la línea 2 es:" + L2.getBegin());
        System.out.println("El punto final de la línea 2 es:" + L2.getEnd());
        System.out.println("La coordenada x del punto inicial de la línea 1 es:" + L1.getBeginX());
        System.out.println("La coordenada y del punto inicial de la línea 1 es:" +L1.getBeginY());
        System.out.println("La coordenada x del punto final de la línea 1 es:" + L1.getEndX());
        System.out.println("La coordenada y del punto final de la línea 1 es:" + L1.getEndY());

        /** A través de los setter se modifican datos en concreto y se imprime a nueva información sobre la L1*/
        L1.setBeginX(p1.getX());
        System.out.println("La nueva línea 1 es (ha cambiado la coordenada x del punto inicial):" + L1);
        L1.setBeginY(p1.getY());
        System.out.println("La nueva línea 1 es (ha cambiado la coordenada y del punto inicial):" + L1);
        L1.setBegin(p2);
        System.out.println("La nueva línea 1 es (se le ha asignado el p2 al punto de inicio): " + L1);
        L1.setEnd(p3);
        System.out.println("La nueva línea 1 es (se le ha asignado el p3 al punto del final):" + L1);

        /**Modifica las coordenadas de las líneas*/
        L1.setEndXY(p3.getX(), p2.getY());
        /**En la coordenada final se el asigna la x del p3 y la y del p2 y se imprime*/
        System.out.println("La nueva línea 1 es:" + L1);

        /**En la coordenada final se el asigna la x del p1 y la y del p2 y se imprime*/
        L2.setEndXY(p1.getX(), p2.getY());
        System.out.println(L2);


        /**Imprime la longitud de ambas líneas*/
        System.out.println("La longitud de la línea 2 es:" + L2.getLength());
        System.out.println("La longitud de la línea 1 es:" + L1.getLength());

    }
}




