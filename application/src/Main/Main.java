package Main;

import FilRouge.Controlleur.DBOrder;
import FilRouge.Model.MOrder;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;

public class Main {

    public static void main(String[] args) {
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                try {
                    System.out.println(MOrder.GetOrdersDetails("14")); 
                } catch (SQLException ex) {
                    Logger.getLogger(Main.class.getName()).log(Level.SEVERE, null, ex);
                }
                
            }
        });
    }
}
