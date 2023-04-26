/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package DbData;

import DtoEnum.Tipo;
import DtoEnum.cargo;
import DtoModel.User;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author Usuario
 */
public class DataUser {

    public ArrayList<User> dataUser;

    public DataUser() {
        dataUser = new ArrayList<>();
        this.BeginData();
    }

    public List<User> BeginData() {
        List<User> dataUser = new ArrayList<>();
        dataUser.add(new User(0, "Juan", "Perez", "555-55-55", "Bogotá", Tipo.Admin));
        dataUser.add(new User(0, "Roberto", "Perez", "555-55-55", "Cali", Tipo.Admin));
        dataUser.add(new User(0, "Alan", "Perez", "555-55-55", "Boyaca", Tipo.Admin));
        dataUser.add(new User(0, "Rigoberto", "Perez", "555-55-55", "Bogotá", Tipo.Admin));
        dataUser.add(new User(0, "Juana", "Perez", "555-55-55", "Bogotá", Tipo.Admin));
        dataUser.add(new User(0, "Lucas", "Perez", "555-55-55", "Bogotá", Tipo.Admin));
        dataUser.add(new User(0, "Andrea", "Perez", "555-55-55", "Santander", Tipo.Admin));
        dataUser.add(new User(0, "Andres", "Perez", "555-55-55", "Boyaca", Tipo.Admin));
        dataUser.add(new User(0, "Juanito", "Perez", "555-55-55", "Santander", Tipo.Admin));
        dataUser.add(new User(0, "Pericles", "Perez", "555-55-55", "Boyaca", Tipo.Admin));
        dataUser.add(new User(0, "Adan", "Perez", "555-55-55", "Bogotá", Tipo.Admin));
        dataUser.add(new User(0, "Eva", "Perez", "555-55-55", "Bogotá", Tipo.Admin));
        dataUser.add(new User(0, "Elmer", "Perez", "555-55-55", "Bucaramanga", Tipo.Admin));
        dataUser.add(new User(0, "Leo", "Perez", "555-55-55", "Bucaramanga", Tipo.Admin));
        dataUser.add(new User(0, "Daniel", "Perez", "555-55-55", "Santander", Tipo.Admin));

//        for (User personas : datospersona) {
//            System.out.println(personas.getId());
//            System.out.println(personas.getNombre());
//            System.out.println(personas.getCiudad());
//            System.out.println(personas.getTelefono());
//            System.out.println(personas.getLabor().descripcion);
//            System.out.println("*******************************");
//        }
        return dataUser;
    }

    public void actualizarPersona(User per) {
        this.dataUser = (ArrayList<User>) BeginData();
        int index = 0;
        for (int i = 0; i < dataUser.size(); i++) {
            index = i;
        }

        dataUser.set(index, per);
        for (User object : dataUser) {
            System.out.println("**************");
            System.out.println("id " + object.getId());
            System.out.println("id " + object.getNombre());
            System.out.println("id " + object.getTelefono());
            System.out.println("id " + object.getCiudad());
            System.out.println("id " + object.getLabor());
        }
    }

    public boolean addUser(User per) {
        try {
            dataUser.add(per);
            return true;
        } catch (Exception e) {
            System.out.println(e);
            return false;
        }
    }
}
