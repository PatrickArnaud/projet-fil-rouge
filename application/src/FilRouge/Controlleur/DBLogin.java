package FilRouge.Controlleur;

import FilRouge.Model.MLogin;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.Statement;

public class DBLogin {

    static Connection cnx = DBConnect.connect();

    static public MLogin getLog(String username, String password) {
        MLogin log = null;

        try {
            String query = "SELECT  id_user, username , login , pwd, id_role FROM nesti_user WHERE  username='" + username + "'and pwd='" + password + "'";
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

    static public String getUser(int id) {
        String user_name = null;
        try {
            String query = "SELECT  username FROM nesti_user WHERE  id_user ='" + id + "'";
            Statement smt = cnx.createStatement();
            ResultSet resultSet = smt.executeQuery(query);
            while (resultSet.next()) {
                user_name = resultSet.getString(1);
            }
        } catch (Exception ex) {
            ex.printStackTrace();
        } finally {
            user_name.toString();
            return user_name;
        }

    }

}
