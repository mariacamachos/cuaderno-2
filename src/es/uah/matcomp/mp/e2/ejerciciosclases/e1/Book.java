package es.uah.matcomp.mp.e2.ejerciciosclases.e1;
/**
 * Define un libro a partir de su isbn, nombre, autor, precio y cantidad
 */
public class Book {/**Guardado en la clase (Book.java*/
    private String isbn;
    private String name;
    private Author Author;
    private double price;
    private int qty;
    /**Construimos la clase libro(sin incluir la cantidad)*/
    public Book (String isbn, String name, Author author, double price) {
        this.isbn = isbn;
        this.name = name;
        this.Author = author;
        this.price = price;
    }
    /**Contruimos la clase libro con la cantidad*/
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
    /**Setter del precio*/
    public void setPrice(double price) {
        this.price = price;
    }
    /**Devuelve la cantidad*/
    public int getQty() {
        return qty;
    }
    /**Setter de la cantidad*/
    public void setQty(int qty) {
        this.qty = qty;
    }
    /**Setter del autor*/
    public String getAuthorName(){
        return Author.getName();
    }
    /**Devuelve los datos del libro de la forma: Libro[isbn, Autor:[nombre,email], precio, cantidad]*/
    @Override
    public String toString() {
        return "Book[isbn=" + isbn + ", Author=[name=" + name + ",email=" + getAuthor().getEmail() + "], price=" + price + ", qty=" + qty + "]";
    }
}
