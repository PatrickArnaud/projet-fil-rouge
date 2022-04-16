package Main;

import FilRouge.Model.MArticles;
import FilRouge.Model.MProvider;

public class Main {

    public static void main(String[] args) {
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                MArticles.getArticleByNameDetailsFullDetails("thé");
            }
        });
    }
}
