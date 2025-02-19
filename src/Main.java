import es.uah.matcomp.mp.e2.ejerciciosclases.primeroprueba.Authorprueba;
import es.uah.matcomp.mp.e2.ejerciciosclases.primeroprueba.Bookprueba;

public class Main {
    public static void main(String[] args) {
        /**Establezco los datos del autor*/
        Authorprueba ahTeck = new Authorprueba("Tan Ah Teck", "ahteck@nowhere.com", 'm');
        /**Imprimo los datos del autor por pantalla*/
        System.out.println(ahTeck);

        /**Establezco los dats del libro*/
        Bookprueba dummyBook = new Bookprueba("Java for dummy", ahTeck , 19.95, 99);
        /**Imprimo los datos del libro por pantalla*/
        System.out.println(dummyBook);

        /**A traves de un setter, establezco un nuevo precio*/
        dummyBook.setPrice(29.95);
        /**A traves de un setter, establezco una nueva cantidad*/
        dummyBook.setQty(28);

        /**Imprime el nombre del libro */
        System.out.println("El nombre es: " +  dummyBook.getName());
        /**Imprime el precio establecido a traves del setter*/
        System.out.println("El precio es: " + dummyBook.getPrice());
        /**Imprime la cantidad establecida a traves del setter*/
        System.out.println("La cantidad es: " + dummyBook.getQty());
        /**Imprime el nombre del autor e imprime todos los datos(hace llamada al Authorprueba*/
        System.out.println("La nombre del autor con sus datos es: " + dummyBook.getAuthorprueba());
        /**Imprime el nombre unicamente del autor sin mas datos*/
        System.out.println("El nombre del autor es: " +  dummyBook.getAuthorprueba().getName());
        /**Imprime unicamente el email del autor haciendo llamada a Authorprueba */
        System.out.println("El email del autor es: " + dummyBook.getAuthorprueba().getEmail());


        /**Usamos una instancia anonima de Authorprueba para construir una instancia de Bookprueba*/
        Bookprueba anotherBook = new Bookprueba("more Java", new Authorprueba("Paul Tan", "paul@somewhere.com", 'm'), 29.95);
        /**Imprime los datos introducidos anteriormente*/
        System.out.println(anotherBook);

        /**Imprime el nombre y email del autor de un libro*/
        System.out.println("El email y el nombre del autor es: " + dummyBook.getAuthorprueba().getName() + " , " + dummyBook.getAuthorprueba().getEmail());



    }
}