package es.uah.matcomp.mp.e2.ejerciciosclases.e4;
/**Establece un punto en un eje de coordenadas, x e y*/
public class MyPoint {/**Guardado en MyPoint.java*/
    /**ATRIBUTOS*/
    /**
     * Establecidos de manera privada
     */
    private int x;
    private int y;

    /**METODOS*/
    /**
     * Construimos el metodo de mi punto a partir de x e y en el eje de coordenadas (0,0)
     */
    public MyPoint() {
        this.x = 0;
        this.y = 0;
    }

    /**
     * Construimos el metodo de mi punto a partir de x e y en el eje de coordenadas
     * con los valores que introduzca el usuario
     */
    public MyPoint(int x, int y) {
        this.x = x;
        this.y = y;
    }

    /**
     * Devuelve la x
     */
    public int getX() {
        return x;
    }

    /**
     * Establece un valor concreto para la x
     */
    public void setX(int x) {
        this.x = x;
    }

    /**
     * Devuelve la y
     */
    public int getY() {
        return y;
    }

    /**
     * Establece un valor concreto para la y
     */
    public void setY(int y) {
        this.y = y;
    }

    /**
     * Devuelve los valores en coordenadas de los valores introducidos de x e y
     */
    public int[] getXY() {
        return new int[]{this.x, this.y};
    }

    /**
     * Establece un valor concreto de coordenadas (x,y)
     */
    public void setXY(int x, int y) {
        this.x = x;
        this.y = y;
    }

    /**
     * Devuelve una cadena de la instancia de la forma: (x,y)
     */
    @Override
    public String toString() {
        return "{" + x + ", " + y + '}';
    }

    /**
     * Calcula la distancia entre puntos
     */
    public double distance(int x, int y) {
        return Math.sqrt(Math.pow(x - this.x, 2) + Math.pow(y - this.y, 2));
    }

    /**
     * Calcula la distancia entre puntos x e y de mi punto
     */
    public double distance(MyPoint another) {
        return distance(another.getX(), another.getY());
    }

    /**
     * Calcula la distancia entre el punto (x,y) al origen de coordenadas (0,0)
     */
    public double distance() {
        return Math.sqrt(Math.pow(this.x, 2) + Math.pow(this.y, 2));
    }

}
