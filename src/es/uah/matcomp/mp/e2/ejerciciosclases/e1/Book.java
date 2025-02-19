package es.uah.matcomp.mp.e2.ejerciciosclases.e1;
/**
 * Define un libro a partir de su isbn, nombre, autor, precio y cantidad
 */
public class Book {/**Guardado en la clase (Book.java*/
    /**ATRIBUTOS*/
    /** Establecidos de manera privada*/
    private String isbn;
    private String name;
    private Author Author;
    private double price;
    private int qty;

    /**METODOS*/
    /**Construimos la clase libro(sin incluir la cantidad)*/
    public Book (String isbn, String name, Author author, double price) {
        this.isbn = isbn;
        this.name = name;
        this.Author = author;
        this.price = price;
    }
    /**Contruimos el metodo libro con la cantidad, isbn, nombre del libro, autor*/
    public Book (String isbn, String name, Author author, double price, int qty) {
        this.isbn = isbn;
        this.name = name;
        this.Author = author;
        this.price = price;
        this.qty = qty;
    }
    /**Devuelve el isbn*/
    public String getIsbn() {
        return isbn;
    }
    /**Devuelve el nombre*/
    public String getName() {
        return name;
    }
    /**Devuelve el autor*/
    public Author getAuthor() {
        return Author;
    }
    /**Devuelve el precio*/
    public double getPrice() {
        return price;
    }
    /**Establece un valor concreto del precio del libro*/
    public void setPrice(double price) {
        this.price = price;
    }
    /**Devuelve la cantidad*/
    public int getQty() {
        return qty;
    }
    /**Establece un valor concreto de la cantidad de libros*/
    public void setQty(int qty) {
        this.qty = qty;
    }
    /**Devuelve el nombre del autor*/
    public String getAuthorName(){
        return Author.getName();
    }
    /**Devuelve los datos del libro de la forma: Libro[isbn, Autor:[nombre,email], precio, cantidad]*/
    @Override
    public String toString() {
        return "Book[isbn=" + isbn + ", Author=[name=" + name + ",email=" + getAuthor().getEmail() + "], price=" + price + ", qty=" + qty + "]";
    }
}
