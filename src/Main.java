
import es.uah.matcomp.mp.e2.ejerciciosclases.primeroprueba.Authorprueba;

public class Main {
    public static void main(String[] args) {
        /**Establezco los datos del autor*/
        Authorprueba ahTeck = new Authorprueba("Tan Ah Teck", "ahteck@nowhere.com", 'm');
        /**Imprimo los datos del autor por pantalla*/
        System.out.println(ahTeck);

        /**A traves de un setter, establezco un nuevo correo*/
        ahTeck.setEmail("paulTan@nowhere.com");
        /**Imprime el nombre del autor */
        System.out.println("El nombre es: " + ahTeck.getName());
        /**Imprime el email establecido a traves del setter*/
        System.out.println("El email es: " + ahTeck.getEmail());
        /**Imprime el genero, en el caso de ser masculino será un 'm' y en caso de ser femenino
         * se imprimirá un 'f' en el caso de gender
         */
        System.out.println("Su genero es: " + ahTeck.getGender()); // Test
    }
}