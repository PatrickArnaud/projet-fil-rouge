package FilRouge.Controlleur;

import FilRouge.Model.MArticles;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.sql.Date;

public class DBArticle {

    static Connection cnx = DBConnect.connect();

    static public ArrayList getArticles() throws SQLException {
        ArrayList<MArticles> arr = new ArrayList<>();
        MArticles art = null;
        try {

            String query = "SELECT  id_article, name_article , brand , id_user, status_article FROM nesti_article";
            Statement smt = cnx.createStatement();
            ResultSet resultSet = smt.executeQuery(query);
            while (resultSet.next()) {
                art = new MArticles();
                art.setId(resultSet.getInt(1));
                art.setName(resultSet.getString(2));
                art.setBrand(resultSet.getString(3));
                art.setProvider(resultSet.getString(4));
                art.setStatus_article(resultSet.getString(5));
                arr.add(art);
            }
        } catch (Exception ex) {
            ex.printStackTrace();
        } finally {
            return arr;
        }

    }
    
    static public ArrayList searchArticles(String search ) throws SQLException {
        ArrayList<MArticles> arr = new ArrayList<>();
        MArticles art = null;
        try {

            String query = "SELECT  id_article, name_article , brand , id_user, status_article FROM nesti_article WHERE name_article LIKE '"+search+"%'";
            Statement smt = cnx.createStatement();
            ResultSet resultSet = smt.executeQuery(query);
            while (resultSet.next()) {
                art = new MArticles();
                art.setId(resultSet.getInt(1));
                art.setName(resultSet.getString(2));
                art.setBrand(resultSet.getString(3));
                art.setProvider(resultSet.getString(4));
                art.setStatus_article(resultSet.getString(5));
                arr.add(art);
            }
        } catch (Exception ex) {
            ex.printStackTrace();
        } finally {
            return arr;
        }

    }

    static public MArticles getArticleByName(String article) {
        MArticles art = new MArticles();

        try {
            String query = "SELECT  id_article, name_article , brand FROM nesti_article WHERE name_article ='" + article + "'";
            Statement smt = cnx.createStatement();
            ResultSet resultSet = smt.executeQuery(query);
            while (resultSet.next()) {
                art.setId(resultSet.getInt(1));
                art.setName(resultSet.getString(2));
                art.setBrand(resultSet.getString(3));
            }
        } catch (Exception ex) {
            ex.printStackTrace();
        } finally {
            return art;
        }

    }

    static public MArticles getArticleByNameDetails(String article) {
        MArticles art = new MArticles();
        try {
            String query = "SELECT  id_article, name_article , brand, creation_date, status_article, id_user FROM nesti_article WHERE name_article ='" + article + "'";
            Statement smt = cnx.createStatement();
            ResultSet resultSet = smt.executeQuery(query);
            while (resultSet.next()) {
                art.setId(resultSet.getInt(1));
                art.setName(resultSet.getString(2));
                art.setBrand(resultSet.getString(3));
                art.setCreation_date(resultSet.getDate(4));
                art.setStatus_article(resultSet.getString(5));
                art.setId_user(resultSet.getInt(6));
            }
        } catch (Exception ex) {
            ex.printStackTrace();
        } finally {
            return art;
        }

    }
    
    
   

    static public MArticles getArticleById(int id) throws SQLException {
        MArticles art = new MArticles();
        try {
            String query = "SELECT  id_article, name_article , brand FROM nesti_article WHERE id_article = '" + id + "'";
            Statement smt = cnx.createStatement();
            ResultSet resultSet = smt.executeQuery(query);
            while (resultSet.next()) {
                art.setId(resultSet.getInt(1));
                art.setName(resultSet.getString(2));
                art.setBrand(resultSet.getString(3));
            }
        } catch (Exception ex) {
            ex.printStackTrace();
        } finally {
            return art;
        }

    }
    
     static public boolean deleteArticleByName(String article) {
        boolean success = false;
        try {
            String query = "DELETE FROM nesti_article WHERE name_article ='" + article + "'";
            Statement smt = cnx.createStatement();
            smt.executeUpdate(query);            
            
        } catch (Exception ex) {
            ex.printStackTrace();
        } finally {
            return success;
        }

    }

    static public boolean addArticle(MArticles art, int id_user) throws SQLException {
        boolean success = false;
        try {
            String query = "INSERT INTO nesti_article (name_article,status_article,id_user,brand) VALUES(?,?,?,?)";
            PreparedStatement smt = cnx.prepareStatement(query);
            smt.setString(1, art.getName());
            smt.setString(2, art.getStatus_article());
            smt.setInt(3, id_user);
            smt.setString(4, "Nesti");
            boolean executed = smt.executeUpdate() == 1;
            if (art.getType() == "Ustensile") {
                MArticles art_tool = getArticleByName(art.getName());
                String query_tool = "INSERT INTO nesti_tool (id_article) VALUES(?)";
                PreparedStatement smt_tool = cnx.prepareStatement(query_tool);
                smt_tool.setInt(1, art_tool.getId());
                smt_tool.executeUpdate();
            } else {
                MArticles art_ingredient = getArticleByName(art.getName());
                System.out.println(art_ingredient.getId());
                String query_ingredient = "INSERT INTO nesti_ingredient (id_article) VALUES(?)";
                PreparedStatement smt_ingredient = cnx.prepareStatement(query_ingredient);
                smt_ingredient.setInt(1, art_ingredient.getId());
                smt_ingredient.executeUpdate();
            }
            String query_sold_by = "INSERT INTO sold_by (id_article,id_supplier,origin) VALUES(?,?,?)";
            PreparedStatement smt_sold_by = cnx.prepareStatement(query_sold_by);
            MArticles sold_by_id_article = getArticleByName(art.getName());
            smt_sold_by.setInt(1, sold_by_id_article.getId());
            smt_sold_by.setInt(2, DBProvider.getProvidersByName(art.getProvider()));
            smt_sold_by.setString(3, art.getOrigin());
            smt_sold_by.executeUpdate();
            success = (executed);
        } catch (Exception ex) {
            ex.printStackTrace();
        }

        return success;
    }

    static public int chekIfToolOrIngredient(int id) {
        int success = 0;
        try {
            String query = "SELECT COUNT(*) FROM nesti_ingredient WHERE id_article ='" + id + "'";
            Statement smt = cnx.createStatement();
            ResultSet resultSet = smt.executeQuery(query);
            while (resultSet.next()) {
                success = (resultSet.getInt(1));
            }
        } catch (Exception ex) {
            ex.printStackTrace();
        } finally {
            return success;
        }
    }
}
