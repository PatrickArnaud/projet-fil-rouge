
package FilRouge.Controlleur;

import FilRouge.Model.MProvider;
import java.sql.Array;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.ArrayList;


public class DBProvider {
     static public ArrayList getProviders() {
        ArrayList<MProvider> arr = new ArrayList<>();
        MProvider pro = null;
        try {

            String query = "SELECT  provider_id, provider_name FROM test_provider";
            Connection cnx = DBConnect.connect();
            Statement smt = cnx.createStatement();
            ResultSet resultSet = smt.executeQuery(query);
            while (resultSet.next()) {
                pro = new MProvider();
                pro.setProvider_id(resultSet.getInt(1));
                pro.setProvider_name(resultSet.getString(2));                
            }
        } catch (Exception ex) {
            ex.printStackTrace();
        } finally {
            return arr;
        }

    }
     
     
       static public ArrayList getProvidersArrayList() {
        ArrayList<String> provider_table = new ArrayList<>();
        try {
            String query = "SELECT  provider_name FROM test_provider";
            Connection cnx = DBConnect.connect();
            Statement smt = cnx.createStatement();
            ResultSet resultSet = smt.executeQuery(query);
            while (resultSet.next()) {
                provider_table.add(resultSet.getString(1)) ;       
                System.out.println(resultSet.getString(1));
            }
        } catch (Exception ex) {
            ex.printStackTrace();
        } finally {            
            return provider_table;
        }

    }
}
