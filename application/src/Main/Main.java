package Main;

import FilRouge.Model.MArticles;
import FilRouge.Model.MContact;
import FilRouge.Model.MProvider;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;

public class Main {

    public static void main(String[] args) {
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                try {
                    MContact.getContacts();
                } catch (SQLException ex) {
                    Logger.getLogger(Main.class.getName()).log(Level.SEVERE, null, ex);
                }
            }
        });
    }
}
