import java.util.HashMap;
import java.util.Map;

public class AgendaTelefonica {
    private HashMap<String, Contacto> contactos;

    public AgendaTelefonica() {
        contactos = new HashMap<>();
    }

    public void agregarContacto(String nombre, String telefono) {
        Contacto nuevo = new Contacto(nombre, telefono);
        contactos.put(nombre, nuevo);
    }

    public Contacto buscarContacto(String nombre) {
        return contactos.get(nombre);
    }

    public void mostrarContactos() {
        for (Map.Entry<String, Contacto> entry : contactos.entrySet()) {
            Contacto c = entry.getValue();
            System.out.println("Nombre: " + c.getNombre() + ", Teléfono: " + c.getTelefono());
        }
    }
}