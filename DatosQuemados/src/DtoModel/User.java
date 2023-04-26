package DtoModel;

import DtoEnum.Tipo;
import DtoEnum.cargo;

public class User {

    private int id;

    private String nombre;
    private String apellido;
    private String telefono;
    private String ciudad;
    private Tipo labor;

    public User() {

    }

    public User(int id, String nombre, String apellido, String telefono, String ciudad, Tipo labor) {
        this.id = id;
        this.nombre = nombre;
        this.apellido = apellido;
        this.telefono = telefono;
        this.ciudad = ciudad;
        this.labor = labor;
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

    public String getApellido() {
        return apellido;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
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

    public Tipo getLabor() {
        return labor;
    }

    public void setLabor(Tipo labor) {
        this.labor = labor;
    }

    public void modificarPersona(User per) {
        if ("".equals(per.nombre) || per.nombre == null) {
            this.nombre = per.nombre;
        }
        if ("".equals(per.telefono) || per.telefono == null) {
            this.telefono = per.telefono;
        }
        if ("".equals(per.ciudad) || per.ciudad == null) {
            this.ciudad = per.ciudad;
        }
        if ("".equals(per.labor) || per.labor == null) {
            this.labor = per.labor;
        }

    }

    public void imprimirPersona() {
        System.out.println("*******************************");
        System.out.println("Id: " + this.id);
        System.out.println("Nombre: " + this.nombre);
        System.out.println("Telefono: " + this.telefono);
        System.out.println("Ciudad: " + this.ciudad);
        System.out.println("Cargo: " + this.labor);
    }
}
