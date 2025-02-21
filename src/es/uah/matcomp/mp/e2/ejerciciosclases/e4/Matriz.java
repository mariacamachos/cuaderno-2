package es.uah.matcomp.mp.e2.ejerciciosclases.e4;
import es.uah.matcomp.mp.e2.ejerciciosclases.e4.MyPoint;
/**Calculamos una matriz con la distancia entre los puntos*/
public class Matriz {
    /**ATRIBUTOS*/
    /** Establecidos de manera privada */
    private MyPoint[] puntos;
    private double[][] matriz;

    /**METODOS*/
    /** Construimos el metodo de matriz donde se establecen los puntos (1,1),(2,2)...(10,10)
     * y luego crea la matriz 10x10 para posteriormente se van almacenando las distancias */
    public Matriz() {
        puntos = new MyPoint[10];
        for (int i = 0; i < 10; i++) {
            puntos[i] = new MyPoint(i+1, i+1);
        }
        matriz = new double[10][10];
        calcularMatriz();
    }
    /**El anterior metodo llama a esta funcion para rellenar con las distancias entre
     * cada uno de los puntos (i+1, i+1)*/
    private void calcularMatriz() {
        for (int i = 0; i < 10; i++) {
            for (int j = 0; j < 10; j++) {
                matriz[i][j] = (puntos[i].distance(puntos[j]));
            }
        }
    }
    /**Se va a imprimir la matriz con las distancias ya calculadas que va recorriendo por filas
     * y por columnas y se imprime*/
    public void imprimirMatriz() {
        for (int i = 0; i < 10; i++) {
            for (int j = 0; j < 10; j++) {
                System.out.print( matriz[i][j] + "\t");
            }
            /**Imprime una fila nueva tras cada final para que quede de forma 10x10*/
            System.out.println();
        }
    }
}
