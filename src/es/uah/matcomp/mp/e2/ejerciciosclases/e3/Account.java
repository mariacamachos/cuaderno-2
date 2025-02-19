package es.uah.matcomp.mp.e2.ejerciciosclases.e3;
/**Representa la cuenta definida por el id, el cliente y el balance*/
public class Account {/**Guardado en la clase (Account.java)*/
    /**ATRIBUTOS*/
    /** Establecidos de manera privada*/
    private int id;
    private Customer customer;
    private double balance;

    /**METODOS*/
    /**Construimos el metodo de la cuenta a partir del id, cliente y balance*/
    public Account(int id, Customer customer, double balance) {
        this.id = id;
        this.customer = customer;
        this.balance = balance;
    }
    /**Construimos el metodo de la cuenta a partir del id y cliente*/
    public Account(int id, Customer customer) {
        this.id = id;
        this.customer = customer;
        this.balance = 0;
    }
    /**Devuelve el id*/
    public int getId() {
        return id;
    }
    /**Devuelve los datos del cliente*/
    public Customer getCustomer() {
        return customer;
    }
    /**Devuelve el balance*/
    public double getBalance() {
        return balance;
    }
    /** Establece valores para el balance*/
    public void setBalance(double balance) {
        this.balance = balance;
    }
    /**Devuelve la cuenta de la forma: nombre(id)   balance = $xxx.xx]*/
    @Override
    public String toString() {
        return customer.toString() + " balance=$" + balance;
    }
    /**Devuelve el nombre del cliente*/
    public String getCustomerName() {
        return customer.getName();
    }

    /**Devuelve el balance modificado*/
    public Account deposit(double amount) {
        balance = balance + amount;
        return this;
    }
    /**Si el balance es mayor que la cantidad entonces se resta la cantidad
     * al balance,y si no, saldra un error de que la cantidad a retirar es mayor
     * que el balance y por tanto, no se puede y se devuelve el balance
     */
    public Account withdraw(double amount) {
        if (balance >= amount)
            balance = balance - amount;
        else {
            System.out.println("Amount withdrawn exceeds the current balance!");
        }
        return this;
    }
}

