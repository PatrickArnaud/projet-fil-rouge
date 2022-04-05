package FilRouge.View;

import FilRouge.Controlleur.DBArticle;
import FilRouge.Controlleur.DBLogin;
import FilRouge.Controlleur.DBProvider;
import FilRouge.Model.MArticles;
import com.formdev.flatlaf.FlatDarkLaf;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JFrame;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;

public class VDetails extends javax.swing.JFrame {

    JTable jtable;

    public VDetails(MArticles article, JTable jtable) {
        this.jtable = jtable;
        FlatDarkLaf.setup();
        initComponents();
        this.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
        product_name_details.setText(article.getName());
        brand_details.setText(article.getBrand());
        provider_details.setText(article.getProvider());
        product_created_at_details.setText(article.getCreation_date().toString());
        product_disponibility_details.setText(article.getStatus_article());
        provider_details.setText(DBProvider.getProvidersById(DBProvider.getProvidersByIdArticle(article.getId())));
        created_by_details.setText(DBLogin.getUser(article.getId_user()));
        origin_details.setText(DBProvider.getOriginByIdArticle(article.getId()));
        if (DBArticle.chekIfToolOrIngredient(article.getId()) == 1) {
            type_details.setText("Ingrédient");
        } else {
            type_details.setText("Ustensile");
        }

    }

    public void load_article_search(ArrayList<MArticles> arr, JTable jtable) {

        DefaultTableModel model = (DefaultTableModel) jtable.getModel();
        model.setRowCount(0);
        jtable.setAutoCreateRowSorter(true);
        //event listener for modify
        DefaultTableModel table = (DefaultTableModel) jtable.getModel();
        for (int i = 0; i < arr.size(); i++) {
            MArticles add = new MArticles();
            add = arr.get(i);
            String show[] = {add.getName(), add.getBrand(), DBProvider.getProvidersById(DBProvider.getProvidersByIdArticle(add.getId())), DBProvider.getOriginByIdArticle(add.getId()), add.getStatus_article()};
            table.addRow(show);
        }

    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        provider_details = new java.awt.TextField();
        product_name_details = new java.awt.TextField();
        brand_details = new java.awt.TextField();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        product_created_at_details = new java.awt.TextField();
        created_by_details = new java.awt.TextField();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        type_details = new java.awt.TextField();
        product_disponibility_details = new java.awt.TextField();
        origin_details = new java.awt.TextField();
        delete = new javax.swing.JButton();
        modify = new javax.swing.JButton();
        message = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jLabel1.setFont(new java.awt.Font("Dubai", 1, 24)); // NOI18N
        jLabel1.setText("Détails de l'article");

        jLabel2.setText("Marque");

        jLabel3.setText("Nom ");

        jLabel4.setText("Fournisseur");

        provider_details.setBackground(new java.awt.Color(51, 51, 51));
        provider_details.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                provider_detailsActionPerformed(evt);
            }
        });

        product_name_details.setBackground(new java.awt.Color(51, 51, 51));
        product_name_details.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                product_name_detailsActionPerformed(evt);
            }
        });

        brand_details.setBackground(new java.awt.Color(51, 51, 51));
        brand_details.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                brand_detailsActionPerformed(evt);
            }
        });

        jLabel5.setText("Par");

        jLabel6.setText("Date de création");

        product_created_at_details.setBackground(new java.awt.Color(51, 51, 51));
        product_created_at_details.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                product_created_at_detailsActionPerformed(evt);
            }
        });

        created_by_details.setBackground(new java.awt.Color(51, 51, 51));
        created_by_details.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                created_by_detailsActionPerformed(evt);
            }
        });

        jLabel7.setText("Origine");

        jLabel8.setText("Disponibilité ");

        jLabel9.setText("Type");

        type_details.setBackground(new java.awt.Color(51, 51, 51));
        type_details.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                type_detailsActionPerformed(evt);
            }
        });

        product_disponibility_details.setBackground(new java.awt.Color(51, 51, 51));
        product_disponibility_details.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                product_disponibility_detailsActionPerformed(evt);
            }
        });

        origin_details.setBackground(new java.awt.Color(51, 51, 51));
        origin_details.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                origin_detailsActionPerformed(evt);
            }
        });

        delete.setBackground(new java.awt.Color(51, 51, 51));
        delete.setForeground(new java.awt.Color(255, 255, 255));
        delete.setText("Supprimer");
        delete.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                deleteActionPerformed(evt);
            }
        });

        modify.setBackground(new java.awt.Color(51, 51, 51));
        modify.setForeground(new java.awt.Color(255, 255, 255));
        modify.setText("Modifier");
        modify.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                modifyActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(47, 47, 47)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel9, javax.swing.GroupLayout.PREFERRED_SIZE, 83, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel7, javax.swing.GroupLayout.PREFERRED_SIZE, 83, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jLabel8, javax.swing.GroupLayout.PREFERRED_SIZE, 83, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(44, 44, 44)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(product_disponibility_details, javax.swing.GroupLayout.DEFAULT_SIZE, 309, Short.MAX_VALUE)
                                    .addComponent(type_details, javax.swing.GroupLayout.DEFAULT_SIZE, 309, Short.MAX_VALUE)
                                    .addComponent(origin_details, javax.swing.GroupLayout.DEFAULT_SIZE, 309, Short.MAX_VALUE)
                                    .addComponent(message, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 461, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addContainerGap(762, Short.MAX_VALUE))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 83, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 83, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 83, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(44, 44, 44)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(product_name_details, javax.swing.GroupLayout.PREFERRED_SIZE, 309, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(provider_details, javax.swing.GroupLayout.PREFERRED_SIZE, 309, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(brand_details, javax.swing.GroupLayout.PREFERRED_SIZE, 309, javax.swing.GroupLayout.PREFERRED_SIZE))))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                            .addComponent(jLabel6, javax.swing.GroupLayout.DEFAULT_SIZE, 105, Short.MAX_VALUE)
                            .addComponent(jLabel5, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addGap(65, 65, 65)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(product_created_at_details, javax.swing.GroupLayout.PREFERRED_SIZE, 309, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(created_by_details, javax.swing.GroupLayout.PREFERRED_SIZE, 309, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(143, 143, 143))))
            .addGroup(layout.createSequentialGroup()
                .addGap(368, 368, 368)
                .addComponent(delete, javax.swing.GroupLayout.PREFERRED_SIZE, 132, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(layout.createSequentialGroup()
                    .addGap(184, 184, 184)
                    .addComponent(modify, javax.swing.GroupLayout.PREFERRED_SIZE, 132, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addContainerGap(954, Short.MAX_VALUE)))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(51, 51, 51)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jLabel6, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(product_created_at_details, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jLabel5, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(created_by_details, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(53, 53, 53))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 67, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(26, 26, 26)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jLabel3, javax.swing.GroupLayout.DEFAULT_SIZE, 35, Short.MAX_VALUE)
                            .addComponent(product_name_details, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jLabel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(brand_details, javax.swing.GroupLayout.DEFAULT_SIZE, 35, Short.MAX_VALUE))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jLabel4, javax.swing.GroupLayout.DEFAULT_SIZE, 35, Short.MAX_VALUE)
                            .addComponent(provider_details, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jLabel8, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(product_disponibility_details, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jLabel7, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(origin_details, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jLabel9, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(type_details, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(26, 26, 26)
                .addComponent(message, javax.swing.GroupLayout.PREFERRED_SIZE, 42, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 136, Short.MAX_VALUE)
                .addComponent(delete, javax.swing.GroupLayout.PREFERRED_SIZE, 69, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(73, 73, 73))
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                    .addContainerGap(645, Short.MAX_VALUE)
                    .addComponent(modify, javax.swing.GroupLayout.PREFERRED_SIZE, 69, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGap(76, 76, 76)))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void product_name_detailsActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_product_name_detailsActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_product_name_detailsActionPerformed

    private void provider_detailsActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_provider_detailsActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_provider_detailsActionPerformed

    private void brand_detailsActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_brand_detailsActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_brand_detailsActionPerformed

    private void product_created_at_detailsActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_product_created_at_detailsActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_product_created_at_detailsActionPerformed

    private void created_by_detailsActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_created_by_detailsActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_created_by_detailsActionPerformed

    private void type_detailsActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_type_detailsActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_type_detailsActionPerformed

    private void product_disponibility_detailsActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_product_disponibility_detailsActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_product_disponibility_detailsActionPerformed

    private void origin_detailsActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_origin_detailsActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_origin_detailsActionPerformed

    private void modifyActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_modifyActionPerformed
//brand_details.
//
//created_by_details
//origin_details
//product_disponibility_details
//product_name_details
//provider_details        
//        type_details
    }//GEN-LAST:event_modifyActionPerformed

    private void deleteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_deleteActionPerformed
        DBArticle.deleteArticleByName(product_name_details.getText());
        message.setText("L'article " + product_name_details.getText() + " a été supprimé.");
        product_name_details.setText("");
        brand_details.setText("");
        provider_details.setText("");
        product_created_at_details.setText("");
        product_disponibility_details.setText("");
        provider_details.setText("");
        created_by_details.setText("");
        origin_details.setText("");
        type_details.setText("");
        ArrayList<MArticles> arr = new ArrayList();
        try {
            arr = DBArticle.getArticles();
        } catch (SQLException ex) {
            Logger.getLogger(VDetails.class.getName()).log(Level.SEVERE, null, ex);
        }
        DefaultTableModel model = (DefaultTableModel) jtable.getModel();
        model.setRowCount(0);
        jtable.setAutoCreateRowSorter(true);
        //event listener for modify
        DefaultTableModel table = (DefaultTableModel) jtable.getModel();
        for (int i = 0; i < arr.size(); i++) {
            MArticles add = new MArticles();
            add = arr.get(i);
            String show[] = {add.getName(), add.getBrand(), DBProvider.getProvidersById(DBProvider.getProvidersByIdArticle(add.getId())), DBProvider.getOriginByIdArticle(add.getId()), add.getStatus_article()};
            table.addRow(show);
        }
    }//GEN-LAST:event_deleteActionPerformed

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(VDetails.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(VDetails.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(VDetails.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(VDetails.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private java.awt.TextField brand_details;
    private java.awt.TextField created_by_details;
    private javax.swing.JButton delete;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JLabel message;
    private javax.swing.JButton modify;
    private java.awt.TextField origin_details;
    private java.awt.TextField product_created_at_details;
    private java.awt.TextField product_disponibility_details;
    private java.awt.TextField product_name_details;
    private java.awt.TextField provider_details;
    private java.awt.TextField type_details;
    // End of variables declaration//GEN-END:variables
}
