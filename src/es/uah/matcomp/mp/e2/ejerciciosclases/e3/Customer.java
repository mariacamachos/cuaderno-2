package es.uah.matcomp.mp.e2.ejerciciosclases.e3;
/**Se establecen las características de un cliente con el ID, el nombre y su genero*/
public class Customer {
    /**ATRIBUTOS*/
    /** Establecidos de manera privada*/
    private int id;
    private String name;
    private char gender;

    /**METODOS*/
    /**Construimos el metodo de cliente a partir del id, nombre y el genero*/
    public Customer(int id, String name, char gender) {
        this.id = id;
        this.name = name;
        this.gender = gender;
    }
    /**Devuelve el id*/
    public int getId() {
        return id;
    }
    /**Devuelve el nombre*/
    public String getName() {
        return name;
    }
    /**Devuelve el genero*/
    public char getGender() {
        return gender;
    }
    /**Devuelve una cadena de la instancia de la forma: name(id)*/
    @Override
    public String toString() {
        return name + "(" + id + ")";
    }

}
