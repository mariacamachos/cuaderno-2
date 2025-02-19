import es.uah.matcomp.mp.e2.ejerciciosclases.segundaprueba.Bookmejorada;
import es.uah.matcomp.mp.e2.ejerciciosclases.primeroprueba.Authorprueba;

public class Main {
    public static void main(String[] args) {
        /**Establezco los datos del autores, el primero llevara consigo el [0] y el
         * segundo llevara consigo el [1]
         */
        Authorprueba[] authors = new Authorprueba[2];
        authors[0] = new Authorprueba("Tan Ah Teck", "AhTeck@somewhere.com", 'm');
        authors[1] = new Authorprueba("Paul Tan", "Paul@nowhere.com", 'm');

        /**Se imprime los datos del libro junto con los datos de los autores*/
        Bookmejorada javaDummy = new Bookmejorada("Java for Dummy", authors, 19.99, 99);
        System.out.println(javaDummy);
    }
}