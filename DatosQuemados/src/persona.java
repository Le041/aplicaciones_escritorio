/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

public class persona {

    int id;
    String nombre;
    String telefono;
    String ciudad;

    public persona(int id, String nombre, String telefono, String ciudad) {
        this.id = id;
        this.nombre = nombre;
        this.telefono = telefono;
        this.ciudad = ciudad;
        imprimir();
    }


    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getTelefono() {
        return telefono;
    }

    public void setTelefono(String telefono) {
        this.telefono = telefono;
    }

    public String getCiudad() {
        return ciudad;
    }

    public void setCiudad(String ciudad) {
        this.ciudad = ciudad;     
    }
        public void imprimir(){
            System.out.println("************************************************");
            System.out.println(id);
            System.out.println(nombre);
            System.out.println(telefono);
            System.out.println(ciudad);
    }
 
}
