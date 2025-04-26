import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        AgendaTelefonica agenda = new AgendaTelefonica();

        int opcion;
        do {
            System.out.println("\n--- AGENDA TELEFÓNICA ---");
            System.out.println("1. Agregar contacto");
            System.out.println("2. Buscar contacto");
            System.out.println("3. Mostrar contactos");
            System.out.println("4. Salir");
            System.out.print("Seleccione una opción: ");
            opcion = sc.nextInt();
            sc.nextLine(); // Limpiar buffer

            switch (opcion) {
                case 1:
                    System.out.print("Ingrese el nombre: ");
                    String nombre = sc.nextLine();
                    System.out.print("Ingrese el teléfono: ");
                    String telefono = sc.nextLine();
                    agenda.agregarContacto(nombre, telefono);
                    System.out.println("Contacto agregado.");
                    break;
                case 2:
                    System.out.print("Ingrese el nombre a buscar: ");
                    String nombreBusqueda = sc.nextLine();
                    Contacto c = agenda.buscarContacto(nombreBusqueda);
                    if (c != null) {
                        System.out.println("Contacto encontrado: " 
                            + c.getNombre() + " - " + c.getTelefono());
                    } else {
                        System.out.println("Contacto no encontrado.");
                    }
                    break;
                case 3:
                    System.out.println("Lista de contactos:");
                    agenda.mostrarContactos();
                    break;
                case 4:
                    System.out.println("Saliendo del programa...");
                    break;
                default:
                    System.out.println("Opción inválida.");
                    break;
            }
        } while (opcion != 4);

        sc.close();
    }
}