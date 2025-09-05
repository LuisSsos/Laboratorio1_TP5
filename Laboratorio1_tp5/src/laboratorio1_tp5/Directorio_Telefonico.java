package laboratorio1_tp5;

import java.util.TreeMap;

public class Directorio_Telefonico {

    private TreeMap<Long, Contacto> n;

    public Directorio_Telefonico() {
        this.n = new TreeMap<>();
    }
    Contacto c1 = new Contacto(12345678, "West", "Kayne", "San Luis", "Av. Siempre Viva 123");
    Contacto c2 = new Contacto(87654321, "Messi", "Leonel", "Rosario", "Los alpes");
    Contacto c3 = new Contacto(777888, "Kent", "Clark", "San Luis", "General Paz");
    Contacto c4 = new Contacto(981254, "Wayne", "bruce", "Gotham", "Baticueva");

    public void agregarContacto(Long telefono, Contacto contacto) {
        if (n.containsKey(telefono)) {
            System.out.println("Ya existe ese telefono");
            return;
        }
        n.put(telefono, contacto);

    }

    public void buscarContacto() {

    }

    public void buscarTelefono() {

    }

    public void buscarContactos() {

    }

    public void borrarContacto() {

    }
}
