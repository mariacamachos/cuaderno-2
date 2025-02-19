import es.uah.matcomp.mp.e2.ejerciciosclases.e1.Book;
import es.uah.matcomp.mp.e2.ejerciciosclases.e1.Author;

public class Main {
    public static void main(String[] args) {
        /**Establecemos los datos del autor con el nombre y el email y se imprime*/
        Author a1 = new Author("Tan Ah Teck", "ahteck@nowhere.com");
        System.out.println(a1);
        /**Establecemos con el setter una nueva direccion de email y la imprimimos*/
        a1.setEmail("ahteck@somewhere.com");
        System.out.println(a1);
        /**Imprimimos el nombre del autor*/
        System.out.println("El nombre es: " + a1.getName());
        /**Imprimimos el email del autor*/
        System.out.println("El email es: " + a1.getEmail());

        /**Establecemos los datos del libro con el nombre, isbn, el precio y la cantidad con el nombre del autor
         * y se imprimen los datos
         */
        Book b1 = new Book("12345", "Java for dummies", a1, 8.8, 88);
        System.out.println(b1);
        /**A traves del setter establecemos valores nuevos para el precio y la cantidad*/
        b1.setPrice(9.9);
        b1.setQty(99);
        /**Con los nuevos valores se imprimen los datos del libro*/
        System.out.println(b1);
        /**Imprime el isbn del libro*/
        System.out.println("El isbn es: " + b1.getIsbn());
        /**Imprime el nombre del libro*/
        System.out.println("El nombre es: " + b1.getName());
        /**Imprime el precio del libro*/
        System.out.println("El precio es: " + b1.getPrice());
        /**Imprime la cantidad de libros*/
        System.out.println("La cantidad es: " + b1.getQty());
        /**Imprime los datos del autor del libro*/
        System.out.println("El autor es: " + b1.getAuthor());
        /**Imprime el nombre del autor del libro*/
        System.out.println("El nombre del autor es: " + b1.getAuthorName());
        /**Imprime el nombre del autor del libro*/
        System.out.println("El nombre del autor es: " + b1.getAuthor().getName());
        /**Imprime el email del autor del libro*/
        System.out.println("El email del autor es: " + b1.getAuthor().getEmail());
    }
}