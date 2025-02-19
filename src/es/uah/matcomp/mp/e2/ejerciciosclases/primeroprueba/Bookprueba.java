package es.uah.matcomp.mp.e2.ejerciciosclases.primeroprueba;

public class Bookprueba {
    /**ATRIBUTOS establecidos de manera privada*/
    private String name;
    private Authorprueba author;
    private double price;
    private int qty;

    /**MÉTODOS*/
    /** Establecemos el metodo Bookprueba (del libro) a partir del nombre del
     * libro, el precio y el nombre del autor designado en otra clase
     */
    public Bookprueba(String name, Authorprueba author, double price) {
        this.name = name;
        this.author = author;
        this.price = price;
    }
    /** Establecemos el metodo Bookprueba (del libro) a partir del nombre del
     * libro, el precio, la cantidad de libros que hay  y el nombre del autor
     * designado en otra clase
     */
    public Bookprueba(String name, Authorprueba author,double price, int qty) {
        this.name = name;
        this.author = author;
        this.qty = qty;
        this.price = price;
    }

    /**Devuelve el nombre del libro*/
    public String getName() {
        return name;
    }
    /**Devuelve el nombre del autor del libro*/
    public Authorprueba getAuthorprueba(){
        return author;
    }
    /**Devuelve la el precio del libro*/
    public double getPrice() {
        return price;
    }
    /**Establece el valor de la cantidad, es decir,multiplica la cantidad de libros por el precio */
    public void setPrice(double price) {
        this.price = price;
    }
    /**Devuelve la cantidad de libros*/
    public int getQty() {
        return qty;
    }
    /**Establece un valor concreto de ejemplares de libro*/
    public void setQty(int qty) {
        this.qty = qty;
    }
    /**Devuelve los datos del libro con el autor, los precios y la cantidad*/
    public String ToString() {
        return "Book[name=" + name + ", Author= ["  + author.toString() + "], price=" + getPrice() + ", qty=" + qty + "]";
    }

    /**NUEVOS METODOS DE LA SEGUNDA PARTE*/

    /**Devuelve el nombre del autor del libro*/
    public String getAuthorpruebaName(){
        return getAuthorprueba().getName();
    }
    /**Devuelve el email del autor del libro*/
    public String getAuthorpruebaEmail(){
        return getAuthorprueba().getEmail();
    }
    /**Devuelve el genero del autor del libro*/
    public char getAuthorpruebaGender(){
        return getAuthorprueba().getGender();
    }
}
