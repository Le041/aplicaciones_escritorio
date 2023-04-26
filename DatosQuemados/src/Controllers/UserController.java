package Controllers;

import DbData.DataUser;
import DtoEnum.Tipo;
import DtoModel.User;

public class UserController {

    public DataUser dbUser;

    public UserController() {
        dbUser = new DataUser();
    }

    public boolean CreateUser(String id, String nombre, String apellido, String telefono, String ciudad, String labor) {
        boolean validation = false;

        try {
            validation = dbUser.addUser(new User(0, nombre, apellido, telefono, ciudad, Tipo.Admin));
            return validation;
        } catch (Exception ex) {
            System.out.println(ex);
            return validation;
        }

    }

}
