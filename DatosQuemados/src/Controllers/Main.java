package Controllers;

import DbData.DataUser;
import DtoEnum.Tipo;
import DtoModel.User;

public class Main {

    public static void main(String[] args) {
        //JFrameInicial jFrameInit = new JFrameInicial ();
        DataUser db = new DataUser();
        db.addUser(new User(0, "Juan", "Perez", "555-55-55", "Bogotá", Tipo.Admin));

    }

}
