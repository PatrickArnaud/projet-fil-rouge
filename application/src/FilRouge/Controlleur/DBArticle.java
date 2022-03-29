package FilRouge.Controlleur;

import FilRouge.Model.MArticles;
import FilRouge.Model.MLogin;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.ArrayList;

public class DBArticle {

    static public ArrayList getArticles() {
        ArrayList<MArticles> arr = new ArrayList<>();
        MArticles art = null;
        try {

            String query = "SELECT  id_article, name_article , brand , provider FROM test_article";
            Connection cnx = DBConnect.connect();
            Statement smt = cnx.createStatement();
            ResultSet resultSet = smt.executeQuery(query);
            while (resultSet.next()) {
                art = new MArticles();
                art.setId(resultSet.getInt(1));
                art.setName(resultSet.getString(2));
                art.setBrand(resultSet.getString(3));
                art.setProvider(resultSet.getString(4));
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
            String query = "SELECT  id_article, name_article , brand , provider FROM test_article WHERE name_article ='" + article + "'";
            Connection cnx = DBConnect.connect();
            PreparedStatement smt = cnx.prepareStatement("SELECT  id_article, name_article , brand , provider FROM test_article WHERE name_article = ?");
            smt.setString(1, article);
            ResultSet resultSet = smt.executeQuery(query);
            while (resultSet.next()) {
                art.setId(resultSet.getInt(1));
                art.setName(resultSet.getString(2));
                art.setBrand(resultSet.getString(3));
                art.setProvider(resultSet.getString(4));
            }
        } catch (Exception ex) {
            ex.printStackTrace();
        } finally {
            System.out.println(article);
            return art;
        }

    }
    
     static public MArticles getArticleById(int id) {
        MArticles art = new MArticles();
        try {
            String query = "SELECT  id_article, name_article , brand , provider FROM test_article WHERE id_article ='" + id + "'";
            Connection cnx = DBConnect.connect();
            PreparedStatement smt = cnx.prepareStatement("SELECT  id_article, name_article , brand , provider FROM test_article WHERE id_article = ?");
            smt.setInt(1, id);
            ResultSet resultSet = smt.executeQuery(query);
            while (resultSet.next()) {
                art.setId(resultSet.getInt(1));
                art.setName(resultSet.getString(2));
                art.setBrand(resultSet.getString(3));
                art.setProvider(resultSet.getString(4));
            }
        } catch (Exception ex) {
            ex.printStackTrace();
        } finally {
            System.out.println(id);
            return art;
        }

    }
}
