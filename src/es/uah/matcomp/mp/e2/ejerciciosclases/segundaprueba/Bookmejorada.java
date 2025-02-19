package es.uah.matcomp.mp.e2.ejerciciosclases.segundaprueba;
import es.uah.matcomp.mp.e2.ejerciciosclases.primeroprueba.Authorprueba;
public class Bookmejorada {
    /**ATRIBUTOS establecidos de manera privada*/
    private String name;
    private Authorprueba[] authors;
    private double price;
    private int qty;

    /**MÉTODOS*/
    /** Establecemos el metodo Bookmejorada (del libro) a partir del nombre del
     * libro, el precio y el nombre del autor designado en otra clase
     */
    public Bookmejorada(String name, Authorprueba[] authors, double price) {
        this.name = name;
        this.authors = authors;
        this.price = price;
    }

    /** Establecemos el metodo Bookmejorada (del libro) a partir del nombre del libro, el precio,
     * la cantidad de libros que hay y el nombre del autor designado en otra clase
     */
    public Bookmejorada(String name, Authorprueba[] authors, double price, int qty) {
        this.name = name;
        this.authors = authors;
        this.price = price;
        this.qty = qty;
    }
    /**Devuelve el nombre del libro*/
    public String getName() {
        return name;
    }
    /**Devuelve los autores del libro*/
    public Authorprueba[] getAuthors() {
        return authors;
    }
    /**Devuelve el precio del libro*/
    public void setPrice(double price) {
        this.price = price;
    }
    /**Devuelve la cantidad de libros*/
    public int getQty() {
        return qty;
    }
    /**Establece un valor concreto de ejemplares de libros*/
    public void setQty(int qty) {
        this.qty = qty;
    }
    /**Devuelve los datos del libro con el autor, los precios y la cantidad*/
    public String toString() {
        return "Book= [name=" + name + ", authors= ["  + getAuthors() + "], price=" + price + ", qty=" + qty + "]";
    }
    /**Devuelve los nombres de los autores del libro*/
    public String getAuthorNames() {
        return authors[0].getName();
    }
}
