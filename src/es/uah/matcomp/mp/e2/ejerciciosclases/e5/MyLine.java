package es.uah.matcomp.mp.e2.ejerciciosclases.e5;
/**Importamos la clase de myPoint para oder seguir usándola*/
import es.uah.matcomp.mp.e2.ejerciciosclases.e4.MyPoint;
/**Establece una linea  atraves de un punto que será el inicial de la linea
 * y un punto que será el final de la linea*/
public class MyLine {/**Guardado en MyLine.java*/
    /**ATRIBUTOS*/
    /**
     * Establecidos de manera privada
     */
    private MyPoint begin;
    private MyPoint end;

    /**METODOS*/
    /** Construimos el metodo de mi linea a partir de las coordenadas de x y de y para establecer el
     * principio y el final de la linea
     */
    public MyLine(int x1, int y1, int x2, int y2) {
        begin = new MyPoint(x1, y1);
        end = new MyPoint(x2, y2);
    }
    /**Establece la linea con los dos puntos del MyPoint */
    public MyLine (MyPoint begin, MyPoint end) {
        this.begin = begin;
        this.end = end;
    }
    /**Devuelve el punto inicial de la linea */
    public MyPoint getBegin() {
        return begin;
    }
    /**Establece un punto inicial para la linea*/
    public void setBegin(MyPoint begin) {
        this.begin = begin;
    }
    /**Devuelve el punto final de la linea */
    public MyPoint getEnd() {
        return end;
    }
    /**Establece un punto final para la línea*/
    public void setEnd (MyPoint end){
        this.end = end;
    }
    /**Devuelve la coordenada de X del punto inicial*/
    public int getBeginX() {
        return begin.getX();
    }
    /**Establece la coordenada nueva de X del punto inicial */
    public void setBeginX(int beginX) {
        this.begin.setX(beginX);
    }
    /**Devuelve la coordenada de Y del punto inicial*/
    public int getBeginY() {
        return begin.getY();
    }
    /**Establece la coordenada nueva de Y del punto inicial */
    public void setBeginY(int beginY) {
        this.begin.setY(beginY);
    }
    /**Devuelve la coordenada de X del punto final*/
    public int getEndX() {
        return end.getX();
    }
    /**Establece la coordenada nueva de X del punto final */
    public void setEndX(int endX) {
        this.end.setX(endX);
    }
    /**Devuelve la coordenada de Y del punto final*/
    public int getEndY() {
        return end.getY();
    }
    /**Establece la coordenada nueva de Y del punto final */
    public void setEndY(int y) {
        this.end.setY(y);
    }
    /**Devuelve las coordenadas [x,y] del punto inicial*/
    public int[] getBeginXY(){
        return begin.getXY();
    }
    /**Establece las nuevas coordenadas para el punto inicial*/
    public void setBeginXY(int x, int y){
        this.begin.setXY(x, y);
    }
    /**Devuelve las coordenadas [x,y] del punto final*/
    public int[] getEndXY(){
        return end.getXY();
    }
    /**Establece las nuevas coordenadas para el punto final*/
    public void setEndXY(int x, int y){
        this.end.setXY(x, y);
    }
    /**Calcula la longitud de la línea usando la distancia entre los puntos del inicio
     * y del final */
    public double getLength(){
        return begin.distance(end);
    }
    /**Calcula el ángulo de inclinación de la linea en radianes*/
    public double getGradient(){
        return Math.atan2(end.getY()-begin.getY(), end.getX()-begin.getX());
    }
    /** Devuelve una cadena de la instancia de la forma: MyLine(begin=(x1, y1), end=(x2, y2)) */
    public String toString() {
        return "MyLine{begin=" + "(" + getBeginX() + ", " + getBeginY() + ")" + ", end=" + "(" + getEndX() + ", " + getEndY() + ")" + "]";
    }

}
