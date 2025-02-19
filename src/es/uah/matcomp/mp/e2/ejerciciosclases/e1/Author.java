package es.uah.matcomp.mp.e2.ejerciciosclases.e1;
/**
 * Define a un autor a partir de su nombre y su email
 */
public class Author {/** Guadado en la clase (Author.java) */
    /**ATRIBUTOS*/
    /** Establecidos de manera privada*/
    private String name;
    private String email;

    /**METODOS*/
    /**Construimos el metodo de autor a partir del nombre y del email*/
    public Author(String name, String email) {
        this.name = name;
        this.email = email;
    }
    /**Devuelve el nombre del autor */
    public String getName() {
        return name;
    }
    /**Devuelve el email*/
    public String getEmail() {
        return email;
    }
    /**Setter del email*/
    public void setEmail(String email) {
        this.email = email;
    }
    /**Devuelve los datos del autor de la forma: Autor[nombre, email]*/
    @Override
    public String toString() {
        return "Author [name=" + name + ", email=" + email + "]";

    }
}
