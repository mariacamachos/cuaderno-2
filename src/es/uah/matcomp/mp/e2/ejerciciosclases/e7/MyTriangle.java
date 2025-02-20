package es.uah.matcomp.mp.e2.ejerciciosclases.e7;
import es.uah.matcomp.mp.e2.ejerciciosclases.e4.MyPoint;

public class MyTriangle {/**Guardado en MyTriangle.java*/
    /**ATRIBUTOS*/
    /** Establecidos de manera privada */
    public MyPoint v1;
    public MyPoint v2;
    public MyPoint v3;

    /**METODOS*/
    /**A través del metodo se estableces las coordenas de los vertices*/
    public MyTriangle(int x1, int y1, int x2, int y2, int x3, int y3) {
        v1 = new MyPoint(x1, y1);
        v2 = new MyPoint(x2, y2);
        v3 = new MyPoint(x3, y3);
    }
    /**Se designan los 3 puntos a partir del MyPoint*/
    public MyTriangle (MyPoint v1, MyPoint v2, MyPoint v3){
        this.v1 = v1;
        this.v2 = v2;
        this.v3 = v3;
    }
    /**Devuelve las coordenas del vertice del triangulo de manera: MyTriangle{v1=(x1,y1),v2=(x2,y2),v3=(x3,y3)}*/
    public String toString() {
        return "MyTriangle{" + "v1=" + v1 + ", v2=" + v2 + ", v3=" + v3 + '}';
    }
    /**Devuelve el perimetro del triangulo calculando y sumando la distancia entre los puntos*/
    public double getPerimeter(){
        return v1.distance(v2.getX(), v2.getY()) + v2.distance(v3.getX(), v3.getY()) + v3.distance(v1.getX(), v1.getY());
    }

    /**Devuelve el tipo de triangulo que es:
     * escaleno si todos los lados son diferentes,
     * isosceles si dos lados son iguales y
     * equilatero si todos los lados son iguales*/
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
