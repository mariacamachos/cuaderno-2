import es.uah.matcomp.mp.e2.ejerciciosclases.e4.MyPoint;
import es.uah.matcomp.mp.e2.ejerciciosclases.e5.MyLine;


public class Main {
    public static void main(String[] args) {
        MyPoint p1 = new MyPoint(16, 5);
        MyPoint p2 = new MyPoint(1, 7);
        MyPoint p3 = new MyPoint(2, 9);
        MyLine L1 = new MyLine(2,3,1,5);
        MyLine L2 = new MyLine(p2, p1);

        System.out.println(p1);
        System.out.println(L1);

        System.out.println(L2.getBegin());
        System.out.println(L2.getEnd());
        System.out.println(L1.getBeginX());
        System.out.println(L1.getBeginY());
        System.out.println(L1.getEndX());
        System.out.println(L1.getEndY());

        L1.setBeginX(p1.getX());
        System.out.println(L1);
        L1.setBeginY(p1.getY());
        System.out.println(L1);
        L1.setBegin(p2);
        System.out.println(L1);
        L1.setEnd(p3);
        System.out.println(L1);

        L1.setEndXY(p3.getX(), p2.getY());
        System.out.println(L1);
        L1.getBeginXY();
        L2.setEndXY(p1.getX(), p2.getY());
        System.out.println(L2);
        L2.getBeginXY();
        System.out.println(L2.getLength());
        System.out.println(L1.getLength());

    }
}
