package Main;

import FilRouge.Controlleur.DBLogin;
import Tools.Validator;

public class Main {

    public static void main(String[] args) {
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
           

                System.out.println(DBLogin.getRoleUser(1));
                
            }
        });
    }
}
