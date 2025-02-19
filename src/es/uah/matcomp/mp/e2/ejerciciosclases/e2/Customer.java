package es.uah.matcomp.mp.e2.ejerciciosclases.e2;

/**Se establecen las características de un cliente con el ID, el nombre y su porcetaje de descuento*/

public class Customer {/**Guardado en la clase (Customer.java)*/
    /**ATRIBUTOS*/
    /** Establecidos de manera privada*/
    private int id;
    private String name;
    private int discount;

    /**METODOS*/
    /**Construimos el metodo de cliente a partir del id, nombre y el descuento*/
    public Customer(int id, String name, int discount) {
        this.id = id;
        this.name = name;
        this.discount = discount;
    }
    /**Devuelve el id*/
    public int getId() {
        return id;
    }
    /**Devuelve el nombre*/
    public String getName() {
        return name;
    }
    /**Devuelve el descuento del cliente*/
    public int getDiscount() {
        return discount;
    }
    /**Establece un valor concreto de descuento*/
    public void setDiscount(int discount) {
        this.discount = discount;
    }

    /**Devuelve una cadena de la instancia de la forma: name(id)(discount)*/
    @Override
    public String toString() {
        return name + "(" + id + ")(" + discount + "%)";
    }
}
