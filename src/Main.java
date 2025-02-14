import es.uah.matcomp.mp.e2.ejerciciosclases.e3.Customer;
import es.uah.matcomp.mp.e2.ejerciciosclases.e3.Account;

public class Main {
    public static void main(String[] args) {
// Test Customer class
        /**Establezco los clientes con su id, nombre y el genero*/
        Customer c1 = new Customer(99, "Juana", 'f');
        Customer c2 = new Customer(100, "Laura", 'f');
        /**Imprimo los datos de los usuarios*/
        System.out.println(c1);
        System.out.println(c2);
        /**No hay set con lo que no puedo probar a establecer un nuevp id o un nuevo nombre para un customer ya definido
         * si se pudiese lo implementaría de la forma: c1. setId(valor del id nuevo)
         */

        /**En este caso si hay getters por lo que pruebo que funcionen bien estos lo qu ehacen es devolverme los valores
         * que ya he establecido en cada usuario
         */
        System.out.println("id is:" + c1.getId());
        System.out.println("name is:" + c1.getName());
        System.out.println("Gender is:" + c1.getGender());


        System.out.println("id is:" + c2.getId());
        System.out.println("name is:" + c2.getName());
        System.out.println("Gender is:" + c2.getGender());

        /**Establezco dos cuentas de dos personas*/
        Account a1 = new Account(99, c1);
        Account a2 = new Account(100, c2);
        System.out.println(a1);
        System.out.println(a2);

        /**Pruebo la parte del codigo del account y establezco dos cuentas*/
        a1.setBalance(100);
        System.out.println(a1);
        a2.setBalance(200);
        System.out.println(a2);

        /** Imprimo el balance que he establecido arriba*/
        System.out.println("balance is:" + a1.getBalance());
        System.out.println("balance is:" + a2.getBalance());

        /** Depósito*/
        a1.deposit(100);
        a2.deposit(200);
        System.out.println(a1);
        System.out.println(a2);

        /** withdraw*/
        /**Cuenta 1: tiene 200 y pago 100*/
        a1.withdraw(100);
        System.out.println("balance is:" + a1.getBalance());
        /**Cuenta 2: tiene 400 y paga 100*/
        a2.withdraw(300);
        System.out.println("balance is:" + a2.getBalance());
        /**Cuenta 3: tiene 100 y paga 50*/
        a1.withdraw(50);
        System.out.println("balance is:" + a1.getBalance());
        /** Aquí estoy buscando el error */
        a2.withdraw(70);
        System.out.println("balance is:" + a2.getBalance());
        }
    }



