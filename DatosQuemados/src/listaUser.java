
import java.util.ArrayList;
import java.util.List;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
/**
 *
 * @author ESTUDIANTE
 */
public class listaUser {

    List<persona> datospersona = new ArrayList<>();

    public listaUser() {
        this.datosQuemados();
    }

    public void datosQuemados() {
        List<persona> datospersona = new ArrayList<>();
        persona per = new persona(1, "juan perez", "2082", "Medellin");
        datospersona.add(per);

        persona per2 = new persona(2, "andres perez", "2082", "Cartagena");
        datospersona.add(per2);

        persona per3 = new persona(3, "juan", "2082", "Bogota");
        datospersona.add(per3);

        persona per4 = new persona(4, "juan", "20", "Cali");
        datospersona.add(per4);

        for (persona personas : datospersona) {
            System.out.println(personas.id);
            System.out.println(personas.nombre);
            System.out.println(personas.telefono);
            System.out.println(personas.ciudad);
            System.out.println("*******************************");
        }
    }

    public void modificarPersona(persona per) {
        per.modificarPersona(per);
    }
}
