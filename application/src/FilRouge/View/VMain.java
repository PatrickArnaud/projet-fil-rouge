package FilRouge.View;

import FilRouge.Controlleur.DBArticle;
import static FilRouge.Controlleur.DBArticle.getArticles;
import FilRouge.Controlleur.DBLogin;
import FilRouge.Controlleur.DBProvider;
import FilRouge.Model.MArticles;
import FilRouge.Model.MLogin;
import FilRouge.Model.MProvider;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.util.ArrayList;
import javax.swing.table.DefaultTableModel;

public class VMain extends javax.swing.JFrame {

    public VMain() {
        initComponents();
        tabbed_pane.removeTabAt(4);
        tabbed_pane.removeTabAt(3);
        tabbed_pane.removeTabAt(2);
        tabbed_pane.removeTabAt(1);
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        tabbed_pane = new javax.swing.JTabbedPane();
        jPanel2 = new javax.swing.JPanel();
        login = new javax.swing.JPanel();
        jPanel5 = new javax.swing.JPanel();
        jPanel6 = new javax.swing.JPanel();
        username_field = new javax.swing.JTextField();
        password_field = new javax.swing.JPasswordField();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        button_connect = new java.awt.Button();
        error_message = new javax.swing.JLabel();
        jPanel4 = new javax.swing.JPanel();
        jLabel3 = new javax.swing.JLabel();
        profile = new javax.swing.JPanel();
        welcome = new javax.swing.JLabel();
        statut = new javax.swing.JLabel();
        manual_article = new javax.swing.JLabel();
        manual = new javax.swing.JLabel();
        manual_user = new javax.swing.JLabel();
        manual_supplier = new javax.swing.JLabel();
        manual_command = new javax.swing.JLabel();
        article = new javax.swing.JPanel();
        label1 = new java.awt.Label();
        jScrollPane1 = new javax.swing.JScrollPane();
        article_list = new javax.swing.JTable();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        add_product_name = new java.awt.TextField();
        add_article_provider = new java.awt.Choice();
        add_article_type = new java.awt.Choice();
        command = new javax.swing.JPanel();
        jLabel4 = new javax.swing.JLabel();
        administration = new javax.swing.JPanel();
        jLabel5 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel5.setBackground(new java.awt.Color(0, 0, 153));

        javax.swing.GroupLayout jPanel5Layout = new javax.swing.GroupLayout(jPanel5);
        jPanel5.setLayout(jPanel5Layout);
        jPanel5Layout.setHorizontalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 0, Short.MAX_VALUE)
        );
        jPanel5Layout.setVerticalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 50, Short.MAX_VALUE)
        );

        jPanel6.setBackground(new java.awt.Color(0, 0, 153));

        javax.swing.GroupLayout jPanel6Layout = new javax.swing.GroupLayout(jPanel6);
        jPanel6.setLayout(jPanel6Layout);
        jPanel6Layout.setHorizontalGroup(
            jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 0, Short.MAX_VALUE)
        );
        jPanel6Layout.setVerticalGroup(
            jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 50, Short.MAX_VALUE)
        );

        username_field.setBackground(new java.awt.Color(255, 255, 255));
        username_field.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                username_fieldActionPerformed(evt);
            }
        });

        password_field.setBackground(new java.awt.Color(255, 255, 255));
        password_field.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                password_fieldActionPerformed(evt);
            }
        });

        jLabel1.setFont(new java.awt.Font("Dubai", 1, 24)); // NOI18N
        jLabel1.setText("Mot de passe");

        jLabel2.setFont(new java.awt.Font("Dubai", 1, 24)); // NOI18N
        jLabel2.setText("Utilisateur");

        button_connect.setFont(new java.awt.Font("Dubai", 0, 14)); // NOI18N
        button_connect.setLabel("Connexion");
        button_connect.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                button_connectActionPerformed(evt);
            }
        });

        error_message.setForeground(new java.awt.Color(255, 51, 51));

        javax.swing.GroupLayout loginLayout = new javax.swing.GroupLayout(login);
        login.setLayout(loginLayout);
        loginLayout.setHorizontalGroup(
            loginLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(loginLayout.createSequentialGroup()
                .addGap(312, 312, 312)
                .addGroup(loginLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jPanel5, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jPanel6, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(loginLayout.createSequentialGroup()
                        .addGap(119, 119, 119)
                        .addGroup(loginLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jLabel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, 231, Short.MAX_VALUE))
                        .addGap(18, 18, 18)
                        .addGroup(loginLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(error_message, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(button_connect, javax.swing.GroupLayout.DEFAULT_SIZE, 515, Short.MAX_VALUE)
                            .addComponent(password_field)
                            .addComponent(username_field))
                        .addGap(163, 163, 163)))
                .addContainerGap())
        );
        loginLayout.setVerticalGroup(
            loginLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(loginLayout.createSequentialGroup()
                .addGap(50, 50, 50)
                .addComponent(jPanel5, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(34, 34, 34)
                .addComponent(jPanel6, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(78, 78, 78)
                .addGroup(loginLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(username_field, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(73, 73, 73)
                .addGroup(loginLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(password_field, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(67, 67, 67)
                .addComponent(button_connect, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(45, 45, 45)
                .addComponent(error_message, javax.swing.GroupLayout.PREFERRED_SIZE, 55, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(44, Short.MAX_VALUE))
        );

        jPanel4.setBackground(new java.awt.Color(0, 0, 204));

        jLabel3.setIcon(new javax.swing.ImageIcon("C:\\Users\\Patri\\Desktop\\filrouge\\projet-fil-rouge\\application\\src\\FilRouge\\Assets\\NESTI.png")); // NOI18N

        javax.swing.GroupLayout jPanel4Layout = new javax.swing.GroupLayout(jPanel4);
        jPanel4.setLayout(jPanel4Layout);
        jPanel4Layout.setHorizontalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addGap(79, 79, 79)
                .addComponent(jLabel3)
                .addContainerGap(88, Short.MAX_VALUE))
        );
        jPanel4Layout.setVerticalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addGap(211, 211, 211)
                .addComponent(jLabel3)
                .addContainerGap(262, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addComponent(jPanel4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(947, Short.MAX_VALUE))
            .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addComponent(login, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(19, 19, 19)
                .addComponent(jPanel4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(jPanel2Layout.createSequentialGroup()
                    .addGap(21, 21, 21)
                    .addComponent(login, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGap(21, 21, 21)))
        );

        tabbed_pane.addTab("Login", jPanel2);

        profile.setName(""); // NOI18N

        welcome.setFont(new java.awt.Font("Dubai", 1, 48)); // NOI18N
        welcome.setForeground(new java.awt.Color(0, 0, 204));

        statut.setFont(new java.awt.Font("Dialog", 1, 24)); // NOI18N

        manual_article.setFont(new java.awt.Font("Dialog", 1, 24)); // NOI18N

        manual.setFont(new java.awt.Font("Dialog", 1, 24)); // NOI18N

        manual_user.setFont(new java.awt.Font("Dialog", 1, 24)); // NOI18N

        manual_supplier.setFont(new java.awt.Font("Dialog", 1, 24)); // NOI18N

        manual_command.setFont(new java.awt.Font("Dialog", 1, 24)); // NOI18N

        javax.swing.GroupLayout profileLayout = new javax.swing.GroupLayout(profile);
        profile.setLayout(profileLayout);
        profileLayout.setHorizontalGroup(
            profileLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(profileLayout.createSequentialGroup()
                .addGap(54, 54, 54)
                .addGroup(profileLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(manual_supplier, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(manual_user, javax.swing.GroupLayout.DEFAULT_SIZE, 1256, Short.MAX_VALUE)
                    .addComponent(manual_command, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(manual_article, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(statut, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(welcome, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(manual, javax.swing.GroupLayout.DEFAULT_SIZE, 1256, Short.MAX_VALUE))
                .addGap(54, 54, 54))
        );
        profileLayout.setVerticalGroup(
            profileLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(profileLayout.createSequentialGroup()
                .addGap(19, 19, 19)
                .addComponent(welcome, javax.swing.GroupLayout.PREFERRED_SIZE, 58, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(30, 30, 30)
                .addComponent(statut, javax.swing.GroupLayout.PREFERRED_SIZE, 94, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(50, 50, 50)
                .addComponent(manual, javax.swing.GroupLayout.DEFAULT_SIZE, 42, Short.MAX_VALUE)
                .addGap(50, 50, 50)
                .addComponent(manual_article, javax.swing.GroupLayout.DEFAULT_SIZE, 41, Short.MAX_VALUE)
                .addGap(50, 50, 50)
                .addComponent(manual_user, javax.swing.GroupLayout.DEFAULT_SIZE, 41, Short.MAX_VALUE)
                .addGap(50, 50, 50)
                .addComponent(manual_command, javax.swing.GroupLayout.DEFAULT_SIZE, 39, Short.MAX_VALUE)
                .addGap(51, 51, 51)
                .addComponent(manual_supplier, javax.swing.GroupLayout.DEFAULT_SIZE, 41, Short.MAX_VALUE)
                .addGap(86, 86, 86))
        );

        tabbed_pane.addTab("Profil", profile);

        label1.setFont(new java.awt.Font("Dubai", 1, 24)); // NOI18N
        label1.setText("Ajouter un article:");

        article_list.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Produit", "Marque", "Fournisseur", "Conditionnement", "Disponibilité"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jScrollPane1.setViewportView(article_list);

        jLabel6.setText("Produit");

        jLabel8.setText("Fournisseur ");

        jLabel9.setText("Type");

        add_product_name.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                add_product_nameActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout articleLayout = new javax.swing.GroupLayout(article);
        article.setLayout(articleLayout);
        articleLayout.setHorizontalGroup(
            articleLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(articleLayout.createSequentialGroup()
                .addGap(50, 50, 50)
                .addComponent(label1, javax.swing.GroupLayout.PREFERRED_SIZE, 530, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, articleLayout.createSequentialGroup()
                .addGap(41, 41, 41)
                .addGroup(articleLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jLabel6)
                    .addComponent(jLabel8)
                    .addComponent(jLabel7)
                    .addComponent(jLabel9))
                .addGap(38, 38, 38)
                .addGroup(articleLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(add_product_name, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(add_article_provider, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(add_article_type, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 217, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 220, Short.MAX_VALUE)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 724, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(53, 53, 53))
        );
        articleLayout.setVerticalGroup(
            articleLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, articleLayout.createSequentialGroup()
                .addContainerGap(38, Short.MAX_VALUE)
                .addComponent(label1, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(33, 33, 33)
                .addGroup(articleLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(articleLayout.createSequentialGroup()
                        .addGroup(articleLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(articleLayout.createSequentialGroup()
                                .addGroup(articleLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel6)
                                    .addComponent(add_product_name, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(22, 22, 22)
                                .addGroup(articleLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel8)
                                    .addComponent(add_article_provider, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(25, 25, 25)
                                .addComponent(jLabel9))
                            .addComponent(add_article_type, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(16, 16, 16)
                        .addComponent(jLabel7))
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 574, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(58, 58, 58))
        );

        tabbed_pane.addTab("Article", article);

        jLabel4.setFont(new java.awt.Font("Dialog", 1, 24)); // NOI18N
        jLabel4.setText("Passer une commande :");

        javax.swing.GroupLayout commandLayout = new javax.swing.GroupLayout(command);
        command.setLayout(commandLayout);
        commandLayout.setHorizontalGroup(
            commandLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(commandLayout.createSequentialGroup()
                .addGap(35, 35, 35)
                .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 302, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(1027, Short.MAX_VALUE))
        );
        commandLayout.setVerticalGroup(
            commandLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(commandLayout.createSequentialGroup()
                .addGap(39, 39, 39)
                .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 49, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(654, Short.MAX_VALUE))
        );

        tabbed_pane.addTab("Commande", command);

        jLabel5.setFont(new java.awt.Font("Dialog", 1, 24)); // NOI18N
        jLabel5.setText("Ajouter employée :");

        javax.swing.GroupLayout administrationLayout = new javax.swing.GroupLayout(administration);
        administration.setLayout(administrationLayout);
        administrationLayout.setHorizontalGroup(
            administrationLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(administrationLayout.createSequentialGroup()
                .addGap(30, 30, 30)
                .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 492, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(842, Short.MAX_VALUE))
        );
        administrationLayout.setVerticalGroup(
            administrationLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(administrationLayout.createSequentialGroup()
                .addGap(38, 38, 38)
                .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 65, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(639, Short.MAX_VALUE))
        );

        tabbed_pane.addTab("Admnistration", administration);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(tabbed_pane, javax.swing.GroupLayout.PREFERRED_SIZE, 1366, javax.swing.GroupLayout.PREFERRED_SIZE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(tabbed_pane, javax.swing.GroupLayout.PREFERRED_SIZE, 768, javax.swing.GroupLayout.PREFERRED_SIZE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void username_fieldActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_username_fieldActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_username_fieldActionPerformed

    private void button_connectActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_button_connectActionPerformed
        try {
            MLogin log = DBLogin.getLog(username_field.getText(), password_field.getText());
            if (log.isLogin() && log.getId_role() == 1) {
                System.out.println("Bienvenue " + log.getUsername());
                welcome(log);
                tabbed_pane.add(profile, "Profil");
                tabbed_pane.add(article, "Article");
                load_article();
                tabbed_pane.add(command, "Commande");
                tabbed_pane.add(administration, "Administration");

                tabbed_pane.removeTabAt(0);

            } else if (log.isLogin() && log.getId_role() == 2) {
                System.out.println("Bienvenue " + log.getUsername());
                welcome(log);
                tabbed_pane.add(profile, "Profil");
                tabbed_pane.add(article, "Article");
                load_article();
                tabbed_pane.add(command, "Commande");
                tabbed_pane.removeTabAt(0);

            } else if (log.isLogin() && log.getId_role() == 3) {
                System.out.println("Bienvenue " + log.getUsername());
                welcome(log);
                tabbed_pane.add(profile, "Profil");
                tabbed_pane.add(article, "Article");
                load_article();
                tabbed_pane.add(command, "Commande");
                tabbed_pane.removeTabAt(0);
            } else {
                error_message.setText("Mot de passe erroné ou nom d'utilisateur erroné");
            }
        } catch (Exception ex) {
            error_message.setText("Mot de passe erroné ou nom d'utilisateur erroné");
            ex.printStackTrace();
        }
    }//GEN-LAST:event_button_connectActionPerformed

    private void password_fieldActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_password_fieldActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_password_fieldActionPerformed

    private void add_product_nameActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_add_product_nameActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_add_product_nameActionPerformed

    public void load_article() {
        ArrayList<MArticles> arr = new ArrayList<>();
        article_list.removeAll();
        article_list.addMouseListener(new MouseAdapter() {
            public void mouseClicked(MouseEvent e) {
                if (e.getClickCount() == 2) {
                    int row = article_list.getSelectedRow();
                    int col = article_list.getSelectedColumn();
                    MArticles art = new MArticles();
                    if (col == 0) {
                        //by name
                        art = DBArticle.getArticleByName((String) article_list.getValueAt(row, col));
                    } else if (col == 1) {
                        //by brand
                        art = DBArticle.getArticleByName((String) article_list.getValueAt(row, 0));
                    } else if (col == 2) {
                        //by provider
                        art = DBArticle.getArticleByName((String) article_list.getValueAt(row, 0));
                    } else if (col == 3) {
                        //by size
                        art = DBArticle.getArticleByName((String) article_list.getValueAt(row, 0));
                    }
                    VDetails details = new VDetails(art);
                    details.setVisible(true);
                }

            }

        });
        arr = getArticles();
        System.out.println("ici" + arr.size());
        DefaultTableModel table = (DefaultTableModel) article_list.getModel();
        for (int i = 0; i < arr.size(); i++) {
            MArticles add = new MArticles();
            add = arr.get(i);
            String show[] = {add.getName(), add.getBrand(), add.getProvider(), add.getBrand()};
            table.addRow(show);
        }

    }

    
    
    public void add_article() {
        
        MArticles arr = new MArticles();
        

    }
    
    
    
    
    
    public static void load_add_article_provider() {
                ArrayList provider_array = new ArrayList<>();
                provider_array = DBProvider.getProvidersArrayList();
                System.out.println(provider_array);
      

    }
    
    
    
    
    
    public static void main(String args[]) {
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new VMain().setVisible(true);
            }
        });
    }
    
    

    public void welcome(MLogin log) {
        welcome.setText("Bienvenue " + log.getUsername() + " !");
        if (log.getId_role() == 1) {
            statut.setText("Vous êtes connecté en tant qu'administrateur.");
            manual.setText(" Vous pouvez accéder à tout les onglets. ");
            manual_user.setText(" Utilisateur : vous permet de consulter, ajouter, modifier et supprimer un employé.");
            manual_article.setText(" Article : vous permet de consulter, ajouter, modifier et supprimer un article du catalogue.");
            manual_command.setText(" Commande : Vous permet consulter, ajouter, modifier et supprimer une commande.");
            manual_supplier.setText(" Fournisseur : Vous permet consulter, ajouter, modifier et supprimer un fournisseur.");
        } else if (log.getId_role() == 2) {
            statut.setText("Vous êtes connecté en tant que manager.");
            manual_user.setText(" Utilisateur : vous permet de consulter la liste des employés.");
            manual_article.setText(" Article : vous permet de consulter, ajouter, modifier et supprimer un article du catalogue.");
            manual_command.setText(" Commande : Vous permet consulter, ajouter, modifier et supprimer une commande.");
            manual_supplier.setText(" Fournisseur : Vous permet consulter, ajouter, modifier et supprimer un fournisseur.");
        } else {
            statut.setText("Vous êtes connecté en tant qu'employée.");
            manual_user.setText(" Utilisateur : vous n'y avez pas accès, merci de vous rapprocher de votre manager");
            manual_article.setText(" Article : vous permet de consulter les articles du catalogue.");
            manual_command.setText(" Commande : Vous permet consulter les commande.");
            manual_supplier.setText(" Fournisseur : Vous permet consulter les fournisseur.");
        }
        error_message.setText("");
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private java.awt.Choice add_article_provider;
    private java.awt.Choice add_article_type;
    private java.awt.TextField add_product_name;
    private javax.swing.JPanel administration;
    private javax.swing.JPanel article;
    private javax.swing.JTable article_list;
    private java.awt.Button button_connect;
    private javax.swing.JPanel command;
    private javax.swing.JLabel error_message;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JPanel jPanel5;
    private javax.swing.JPanel jPanel6;
    private javax.swing.JScrollPane jScrollPane1;
    private java.awt.Label label1;
    private javax.swing.JPanel login;
    private javax.swing.JLabel manual;
    private javax.swing.JLabel manual_article;
    private javax.swing.JLabel manual_command;
    private javax.swing.JLabel manual_supplier;
    private javax.swing.JLabel manual_user;
    private javax.swing.JPasswordField password_field;
    private javax.swing.JPanel profile;
    private javax.swing.JLabel statut;
    private javax.swing.JTabbedPane tabbed_pane;
    private javax.swing.JTextField username_field;
    private javax.swing.JLabel welcome;
    // End of variables declaration//GEN-END:variables
}
