import es.uah.matcomp.mp.e2.ejerciciosclases.e2.Customer;
import es.uah.matcomp.mp.e2.ejerciciosclases.e2.Invoice;

    public class Main {
        public static void main(String[] args) {
            /**Establece los datos para el cliente con el id, nombre y descuento y, lo imprime*/
            Customer c1 = new Customer(88, "Tan Ah Teck", 10);
            System.out.println(c1); // Customer's toString()
            /**Establece con el setter un porcentaje de descuento nuevo*/
            c1.setDiscount(8);
            /**Imprime los datos para el cliente con el nuevo porcentaje*/
            System.out.println(c1);
            /**Imprime el id del cliente*/
            System.out.println("El id es: " + c1.getId());
            /**Imprime el nombre del cliente*/
            System.out.println("El nombre es: " + c1.getName());
            /**Imprime el descuento del cliente*/
            System.out.println("El descuento es: " + c1.getDiscount());


            /**Establece los datos para la factura con el id y la cantidad para un cliente*/
            Invoice inv1 = new Invoice(101, c1, 888.8);
            /**Imprime los datos de una factura*/
            System.out.println(inv1);
            /**Establece un nuevo importe a traves del setter y lo imprime*/
            inv1.setAmount(999.9);
            System.out.println(inv1);
            /** Imprime el Id de la factura*/
            System.out.println("El id es: " + inv1.getId());
            /** Imprime los datos del cliente de la factura*/
            System.out.println("customer is: " + inv1.getCustomer());
            /** Imprime el importe de la factura*/
            System.out.println("EL importe a pagar es: " + inv1.getAmount());
            /** Imprime el Id del cliente de la factura*/
            System.out.println("El id del cliente es: " + inv1.getCustomerId());
            /** Imprime el nombre del cliente de la factura*/
            System.out.println("customer's name is: " + inv1.getCustomerName());
            /** Imprime el descuento del cliente de la factura*/
            System.out.println("customer's discount is: " + inv1.getCustomerDiscount());
            /** Imprime el importe de la factura despues de aplicarle el descuento*/
            System.out.printf("amount after discount is: %.2f%n", inv1.getAmountAfterDiscount());
        }
    }