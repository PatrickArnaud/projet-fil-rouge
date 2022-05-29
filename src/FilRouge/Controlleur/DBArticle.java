package FilRouge.Controlleur;

import FilRouge.Model.MArticles;
import static FilRouge.Model.MArticles.addArticle;
import static FilRouge.Model.MArticles.chekIfToolOrIngredient;
import static FilRouge.Model.MArticles.deleteArticleByName;
import static FilRouge.Model.MArticles.deleteArticleFromIngredient;
import static FilRouge.Model.MArticles.deleteArticleFromTool;
import static FilRouge.Model.MArticles.getArticleById;
import static FilRouge.Model.MArticles.getArticleByName;
import static FilRouge.Model.MArticles.getArticleByNameDetails;
import static FilRouge.Model.MArticles.updateArticle;
import java.sql.SQLException;
import java.util.ArrayList;

public class DBArticle {


    static public ArrayList getArticlesFromDB() throws SQLException {
        MArticles art = new MArticles();
        ArrayList<MArticles> arr = new ArrayList<>();;
        arr = art.getArticles();
        return arr;
    }
    
    static public ArrayList getArticlesForCommandFromDB() throws SQLException {
        MArticles art = new MArticles();
        ArrayList<MArticles> arr = new ArrayList<>();;
        arr = art.getArticlesForCommand();
        return arr;
    }


    static public ArrayList searchArticlesFromDB(String search) throws SQLException {
        MArticles art = new MArticles();
        ArrayList<MArticles> arr = new ArrayList<>();;
        arr = art.searchArticles(search);
        return arr;

    }
    
     static public ArrayList searchArticlesForCcmmandFromDB(String search) throws SQLException {
        MArticles art = new MArticles();
        ArrayList<MArticles> arr = new ArrayList<>();;
        arr = art.searchArticlesForCommand(search);
        return arr;

    }

    static public MArticles getArticleByNameFromDB(String article) {
        MArticles art = new MArticles();
        art = getArticleByName(article);
        return art;
    }

    static public MArticles getArticleByNameDetailsFromDB(String article) {
        MArticles art = new MArticles();
        art = getArticleByNameDetails(article);
        return art;

    }

    static public MArticles getArticleByIdFromDB(int id) throws SQLException {
        MArticles art = new MArticles();
        art = getArticleById(id);
        return art;

    }

    static public boolean deleteArticleByNameFromDB(String article) {
        boolean success = false;
        deleteArticleByName(article);
        return success;

    }

    static public boolean addArticleToDB(MArticles art, int id_user) throws SQLException {
        boolean success = false;
        addArticle(art, id_user);
        return success;
    }

    static public boolean deleteArticleFromToolToDB(int id_article) throws SQLException {
        boolean success = false;
        deleteArticleFromTool(id_article);
        return success;
    }

    static public boolean deleteArticleFromIngredientToDB(int id_article) throws SQLException {
        boolean success = false;
        deleteArticleFromIngredient(id_article);
        return success;
    }

    static public boolean updateArticleToDB(MArticles art) throws SQLException {
        boolean success = false;
        updateArticle(art);
        return success;
    }

    static public int chekIfToolOrIngredientFromDB(int id) {
        int success = chekIfToolOrIngredient(id);        
        return success;
    }
    
    static public MArticles getArticleByNameFullDetailsFromDB(String article) {
        MArticles art = new MArticles();
        art = MArticles.getArticleByNameFullDetails(article);
        return art;
        }

     static public String getOriginByIdArticleFromDB(int id) {
        String origin = null;
        origin = MArticles.getOriginByIdArticle(id);
            return origin;        
    }
 }
