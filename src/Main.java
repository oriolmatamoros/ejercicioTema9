public class Main {
    public static void main(String[] args) {

        Cliente cliente1 = new Cliente();
        cliente1.edad = 37;
        cliente1.nombre = "Cliente";
        cliente1.telefono = "611 611 611";
        cliente1.credito = 10000;

        Trabajador trabajador1 = new Trabajador();
        trabajador1.edad = 67;
        trabajador1.nombre = "Trabajador";
        trabajador1.telefono = "611 611 611";
        trabajador1.salario = 1000;

        System.out.println("Datos del cliente: ");
        System.out.println(cliente1.edad);
        System.out.println(cliente1.nombre);
        System.out.println(cliente1.telefono);
        System.out.println(cliente1.credito);
        System.out.println("");
        System.out.println("Datos del trabajador: ");
        System.out.println(trabajador1.edad);
        System.out.println(trabajador1.nombre);
        System.out.println(trabajador1.telefono);
        System.out.println(trabajador1.salario);

        }

    }

class Persona {
    int edad;
    String nombre;
    String telefono;

    public Persona(){
        edad = 0;
        nombre = "Por defecto";
        telefono = "Pendiente";
    }
}
class Cliente extends Persona {
    int credito;
}
class Trabajador extends Persona {
    int salario;
}