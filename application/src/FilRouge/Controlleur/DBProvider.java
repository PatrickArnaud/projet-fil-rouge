package FilRouge.Controlleur;

import FilRouge.Model.MProvider;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.ArrayList;

public class DBProvider {

    static Connection cnx = DBConnect.connect();

    static public ArrayList getProviders() {
        ArrayList<MProvider> arr = new ArrayList<>();
        MProvider pro = null;
        try {

            String query = "SELECT  provider_id, provider_name FROM test_provider";
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
            String query = "SELECT  name_supplier FROM nesti_supplier";
            Statement smt = cnx.createStatement();
            ResultSet resultSet = smt.executeQuery(query);
            while (resultSet.next()) {
                provider_table.add(resultSet.getString(1));
            }
        } catch (Exception ex) {
            ex.printStackTrace();
        } finally {
            return provider_table;
        }

    }

    static public String getProvidersById(int id) {
        String provider = null;
        try {
            String query = "SELECT name_supplier  FROM nesti_supplier WHERE id_supplier = '" + id + "'";
            Statement smt = cnx.createStatement();
            ResultSet resultSet = smt.executeQuery(query);
            while (resultSet.next()) {
                provider = resultSet.getString(1);
            }
        } catch (Exception ex) {
            ex.printStackTrace();
        } finally {
            return provider;
        }
    }

    static public int getProvidersIdByName(String name) {
        int provider = 0;
        try {
            String query = "SELECT  id_supplier  FROM nesti_supplier WHERE name_supplier= '" + name + "'";
            Statement smt = cnx.createStatement();
            ResultSet resultSet = smt.executeQuery(query);
            while (resultSet.next()) {
                provider = resultSet.getInt(1);
            }
        } catch (Exception ex) {
            ex.printStackTrace();
        } finally {
            return provider;
        }
    }

    static public int getProvidersIdByIdArticle(int id) {
        int provider = 0;
        try {
            String query = "SELECT id_supplier FROM sold_by WHERE id_article = '" + id + "'";
            Statement smt = cnx.createStatement();
            ResultSet resultSet = smt.executeQuery(query);
            while (resultSet.next()) {
                provider = resultSet.getInt(1);
            }
        } catch (Exception ex) {
            ex.printStackTrace();
        } finally {
            return provider;
        }
    }
    
    

    static public String getOriginByIdArticle(int id) {
        String origin = null;
        try {
            String query = "SELECT origin FROM sold_by WHERE id_article = '" + id + "'";
            Statement smt = cnx.createStatement();
            ResultSet resultSet = smt.executeQuery(query);
            while (resultSet.next()) {
                origin = resultSet.getString(1);
            }
        } catch (Exception ex) {
            ex.printStackTrace();
        } finally {
            return origin;
        }
    }

}
