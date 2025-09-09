package Controladores;

import java.util.*;

/** 
    @author Grupo 6 
    Luis Ezequiel Sosa
    Lucas Saidman
    Gimenez Diego Ruben
    Carlos German Mecias Giacomelli
    Tomas Migliozzi Badani
    Luca Rodrigaño
    Ignacio Rodriguez
**/

public class DirectorioTelefonico {
    
    private final TreeMap<Long, Cliente> agenda = new TreeMap<>();
    
    public Set<Long> getTelefonos(){
        return agenda.keySet();
    }
    
    public Collection<Cliente> getClientes(){
        return agenda.values();
    }
    
    public Set<String> getApellidos(){
        TreeSet<String> apellidos = new TreeSet<>();
        
        for(Cliente c : agenda.values()){
            apellidos.add(c.getApellido());
        }
        
        return apellidos;
    }
    
    public Set<String> getDocumentos() {
        TreeSet<String> documentos = new TreeSet<>();
        for(Cliente c : agenda.values()){
            documentos.add(c.getDni());
        }
        
        return documentos;
    }
    
    public boolean agregarContacto(Long telefono, Cliente c){
        if(telefono == null || c == null){
            return false;
        }
        
        if(agenda.containsKey(telefono)){
            return false;
        }
        
        agenda.put(telefono, c);
        System.out.println("Se agrego el contacto correctamente");
        return true;
    }
    
    public Cliente buscarContacto(Long telefono){
        return agenda.get(telefono);
    }
    
    public Set<Long> buscarTelefono(String apellido){
        Set<Long> telefonos = new TreeSet<>();
        
        for(var e : agenda.entrySet()){
            if(e.getValue().getApellido().equalsIgnoreCase(apellido)){
                telefonos.add(e.getKey());
            }
        }
        
        return telefonos;
    }
    
    public ArrayList<Cliente> buscarContactos(String ciudad){
        ArrayList<Cliente> contactos = new ArrayList<>();
        
        for(Cliente c : agenda.values()){
            if(c.getCiudad().equalsIgnoreCase(ciudad)){
                contactos.add(c);
            }
        }
        
        return contactos;
    }
    
    public boolean borrarContacto(Long telefono){
        return agenda.remove(telefono) != null;
    }
    
}