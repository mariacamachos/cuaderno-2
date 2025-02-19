package es.uah.matcomp.mp.e2.ejerciciosclases.primeroprueba;

public class Authorprueba {
    /**ATRIBUTOS*/
    /** Establecidos de manera privada*/
    private String name;
    private String email;
    private char gender;

    /**METODOS*/
    /**Establecemos el metodo de autor a partir del nombre, email y genero (puede ser 'm' o 'f')*/
    public Authorprueba(String name, String email, char gender) {
        this.name = name;
        this.email = email;
        this.gender = gender;
    }
    /**Devuelve el nombre del autor*/
    public String getName() {
        return name;
    }
    /**Devuelve e email del autor*/
    public String getEmail() {
        return email;
    }
    /**Da valor al email*/
    public void setEmail(String email){
        this.email = email;
    }
    /**Devuelve el genero del autor*/
    public char getGender(){
        return gender;
    }
    /**Devuelve los datos del autor de la forma: Autor= [nombre= , email= , genero= ] */
    public String toString (){
        return "Author [name=" + name + ", email=" + email + ", gender=" + gender + "]";
    }
}
