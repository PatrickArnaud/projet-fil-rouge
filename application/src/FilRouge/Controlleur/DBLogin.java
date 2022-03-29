package FilRouge.Controlleur;

import FilRouge.Model.MLogin;
import java.awt.image.BufferedImage;
import java.io.ByteArrayInputStream;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.Statement;
import javafx.embed.swing.SwingFXUtils;
import javafx.scene.image.WritableImage;
import javax.imageio.ImageIO;

public class DBLogin {

    static public MLogin getLog(String username, String password) {
        MLogin log = null;

        try {

            String query = "SELECT  id_user, username , login , pwd, id_role FROM test_login WHERE  username='" + username + "'and pwd='" + password+"'";
            Connection cnx = DBConnect.connect();
            Statement smt = cnx.createStatement();
            ResultSet resultSet = smt.executeQuery(query);
            while (resultSet.next()) {
                log = new MLogin();
                log.setId(resultSet.getInt(1));
                log.setUsername(resultSet.getString(2));
                log.setLogin(resultSet.getBoolean(3));
                log.setPassword(resultSet.getString(4));
                log.setId_role(resultSet.getInt(5));
            }
        } catch (Exception ex) {
            ex.printStackTrace();
        } finally {
            log.toString();
            return log;
        }

    }
}
