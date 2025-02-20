package es.uah.matcomp.mp.e2.ejerciciosclases.e6;

import es.uah.matcomp.mp.e2.ejerciciosclases.e4.MyPoint;
/**Establece el círculo a partir del centro y el radio*/
public class MyCircle {/**Guardado en MyCircle.java*/
    /**ATRIBUTOS*/
    /** Establecidos de manera privada */
    private MyPoint center;
    private double radius;
    /**METODOS*/
    /** Construimos el metodo de mi circulo a partir del punto designado por MyPoint como el centro y de radio 1*/
    public MyCircle(){
        this.center = new MyPoint();
        this.radius = 1;
    }
    /** Construimos el metodo de mi circulo a partir del punto designado por MyPoint como el centro y un radio a designar */
    public MyCircle(int x, int y, int radius){
        this.center = new MyPoint(x, y);
        this.radius = radius;
    }
    /** Construimos el metodo de mi circulo a partir de un centro y un radio a establecer */
    public MyCircle(MyPoint center, int radius){
        this.center = center;
        this.radius = radius;
    }
    /**Devuelve el radio*/
    public int getRadius(){
        return (int) radius;
    }
    /**Establece un radio determinado*/
    public void setRadius(int radius){
        this.radius = radius;
    }
    /**Devuelve el centro*/
    public MyPoint getCenter(){
        return center;
    }
    /**Establece un centro determinado*/
    public void setCenter(MyPoint center){
        this.center = center;
    }
    /**Devuelve la coordenada x del centro del cículo*/
    public int getCenterX(){
        return center.getX();
    }
    /**Establece una nueva coordenada x del centro del cículo*/
    public void setCenterX(int x){
        this.center.setX(x);
    }
    /**Devuelve la coordenada y del centro del cículo*/
    public int getCenterY(){
        return center.getY();
    }
    /**Establece una nueva coordenada y del centro del cículo*/
    public void setCenterY(int y){
        this.center.setY(y);
    }
    /**Devuelve las coordenadas [x,y] del centro del circulo*/
    public int[] getCenterXY(){
        return new int[]{getCenterX(), getCenterY()};
    }
    /**Establece nuevas las coordenadas del centro del circulo */
    public void setCenterXY(int x, int y){
        this.center.setX(x);
        this.center.setY(y);
    }
    /**Devuelce la cadena de la forma: "MyCircle{radius=R, center=(X,Y)} */
    public String toString(){
        return "MyCircle{radius=" + radius + ", center=" + center + "}';";
    }
    /**Devuelve el area del circulo*/
    public double getArea(){
        return Math.PI * radius * radius;
    }
    /**Devuelve la circunferencia del circulo*/
    public double getCircumference(){
        return 2 * Math.PI * radius;
    }
    /**Devuelve la distancia entre los centros de dos circulos*/
    public double distance(MyCircle another){
        return getCenterX() - another.getCenterX();
    }
}

