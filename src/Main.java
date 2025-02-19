import es.uah.matcomp.mp.e2.ejerciciosclases.e3.Customer;
import es.uah.matcomp.mp.e2.ejerciciosclases.e3.Account;

public class Main {
    public static void main(String[] args) {
        /**Establezco los clientes con su id, nombre y el genero*/
        Customer c1 = new Customer(99, "Juana", 'f');
        Customer c2 = new Customer(100, "Laura", 'f');
        /**Imprimo los datos de los usuarios*/
        System.out.println(c1);
        System.out.println(c2);
        /**No hay set con lo que no puedo probar a establecer un nuevo id o un nuevo nombre para un customer ya definido
         * si se pudiese lo implementaría de la forma: c1. setId(valor del id nuevo)
         */

        /**En este caso si hay getters por lo que pruebo que funcionen bien estos lo qu ehacen es devolverme los valores
         * que ya he establecido en cada usuario
         */
        /**Imrprime el id, nombre y genero del cliente 1*/
        System.out.println("El id es:" + c1.getId());
        System.out.println("El nombre es:" + c1.getName());
        System.out.println("El genero es:" + c1.getGender());

        /**Imrprime el id, nombre y genero del cliente 2*/
        System.out.println("El id es:" + c2.getId());
        System.out.println("El nombre es:" + c2.getName());
        System.out.println("El genero es:" + c2.getGender());

        /**Establezco dos cuentas de dos personas con el id y los datos de los clientes */
        Account a1 = new Account(99, c1);
        Account a2 = new Account(100, c2);
        /**Imprimo los datos de ambas cuentas*/
        System.out.println(a1);
        System.out.println(a2);

        /**Pruebo la parte del codigo del account y establezco dos cuentas*/
        /**Establezco a partir de los setter, los balances para las 2 cuentas*/
        a1.setBalance(100);
        System.out.println(a1);
        a2.setBalance(200);
        System.out.println(a2);

        /** Imprimo el balance que he establecido arriba para cada cuenta*/
        System.out.println("El balance es::" + a1.getBalance());
        System.out.println("El balance es::" + a2.getBalance());

        /** Establezco un deposito e imprimo los datos de la cuenta con dicho elemento*/
        a1.deposit(100);
        a2.deposit(200);
        System.out.println(a1);
        System.out.println(a2);

        /** withdraw*/
        /**Cuenta 1: tiene 200, pago 100 e imprimo el balance */
        a1.withdraw(100);
        System.out.println("El balance es::" + a1.getBalance());
        /**Cuenta 2: tiene 400, paga 100 e imprimo el balance*/
        a2.withdraw(300);
        System.out.println("El balance es::" + a2.getBalance());
        /**Cuenta 3: tiene 100 y paga 50 e imprimo el balance*/
        a1.withdraw(50);
        System.out.println("El balance es:" + a1.getBalance());
        /** Aquí estoy buscando el error */
        a2.withdraw(70);
        System.out.println("El balance es::" + a2.getBalance());
    }
}



