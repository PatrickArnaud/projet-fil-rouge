package Main;

import FilRouge.Controlleur.DBProvider;
import FilRouge.Model.MContact;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;

public class Main {

    public static void main(String[] args) {
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
               DBProvider.getProviderByNameFromDB("Manone");
            }
        });
    }
}
