package laboratorio1_tp5;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;
import java.util.TreeMap;

public class Directorio_Telefonico {

    private TreeMap<Long, Contacto> listaContactos;

    public Directorio_Telefonico() {
        this.listaContactos = new TreeMap<>();
    }
    Contacto c1 = new Contacto(12345678, "West", "Kayne", "San Luis", "Av. Siempre Viva 123");
    Contacto c2 = new Contacto(87654321, "Messi", "Leonel", "Rosario", "Los alpes");
    Contacto c3 = new Contacto(777888, "Kent", "Clark", "San Luis", "General Paz");
    Contacto c4 = new Contacto(981254, "Wayne", "bruce", "Gotham", "Baticueva");

    public void agregarContacto(Long telefono, Contacto contacto) {
        if (listaContactos.containsKey(telefono)) {
            System.out.println("Ya existe ese telefono");
            return;
        }
        listaContactos.put(telefono, contacto);

    }

    public Contacto buscarContacto(Long telefono) {
        Contacto contacto;
        if (listaContactos.containsKey(telefono)) {
            contacto=listaContactos.get(telefono);
            return contacto;
        }else{
            System.out.println("El numero de telefono no se encuentra asociado a ningun numero");
        }
        return null;  
    }

    public Set<Long> buscarTelefono(String apellido) {
        Set<Long> numeros=new HashSet<>();
        for(Map.Entry<Long,Contacto> entry : listaContactos.entrySet()){
            Contacto contacto= entry.getValue();
            if(contacto.getApellido().equalsIgnoreCase(apellido)){
                numeros.add(entry.getKey());
            }
        }
        return numeros;
    }

    public ArrayList<Contacto> buscarContactos(String ciudad) {
        ArrayList<Contacto> contactos=new ArrayList<>();
        for(Map.Entry<Long,Contacto> entry : listaContactos.entrySet()){
            Contacto contacto= entry.getValue();
            if(contacto.getCiudad().equalsIgnoreCase(ciudad)){
                contactos.add(contacto);
            }
        }
        return contactos;
    }

    public void borrarContacto(Long telefono) {
         if (listaContactos.containsKey(telefono)) {
            listaContactos.remove(telefono);
        }else{
            System.out.println("El numero de telefono no se encuentra asociado a ningun numero");
        }
    }
}
