package FilRouge.View;

import FilRouge.Controlleur.DBArticle;
import static FilRouge.Controlleur.DBArticle.getArticlesFromDB;
import FilRouge.Controlleur.DBContact;
import FilRouge.Controlleur.DBLogin;
import FilRouge.Controlleur.DBProvider;
import FilRouge.Model.MArticles;
import FilRouge.Model.MContact;
import FilRouge.Model.MLogin;
import com.formdev.flatlaf.FlatDarkLaf;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import static java.lang.Integer.parseInt;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.ImageIcon;
import javax.swing.table.DefaultTableModel;

public class VMain extends javax.swing.JFrame {

    public VMain() {
        initComponents();
        ImageIcon icon = new ImageIcon("C:\\Users\\Patri\\Desktop\\filrouge\\projet-fil-rouge\\application\\src\\FilRouge\\Assets\\NESTI.png");
        this.setIconImage(icon.getImage());
        tabbed_pane.removeTabAt(5);
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
        id_user = new javax.swing.JLabel();
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
        add_article_button = new javax.swing.JButton();
        add_article_status = new java.awt.Choice();
        jLabel10 = new javax.swing.JLabel();
        add_article_message = new javax.swing.JLabel();
        add_article_origin = new java.awt.Choice();
        jLabel11 = new javax.swing.JLabel();
        jLabel12 = new javax.swing.JLabel();
        input_search = new javax.swing.JTextField();
        message_search = new javax.swing.JLabel();
        command = new javax.swing.JPanel();
        jLabel4 = new javax.swing.JLabel();
        administration = new javax.swing.JPanel();
        jLabel5 = new javax.swing.JLabel();
        provider = new javax.swing.JPanel();
        jLabel13 = new javax.swing.JLabel();
        jLabel14 = new javax.swing.JLabel();
        jLabel15 = new javax.swing.JLabel();
        jLabel16 = new javax.swing.JLabel();
        firstname_contact = new javax.swing.JTextField();
        lastname_contact = new javax.swing.JTextField();
        telephone_contact = new javax.swing.JTextField();
        add_contact = new java.awt.Button();
        jScrollPane2 = new javax.swing.JScrollPane();
        provider_list = new javax.swing.JTable();
        jLabel17 = new javax.swing.JLabel();
        jLabel18 = new javax.swing.JLabel();
        jLabelname = new javax.swing.JLabel();
        provider_name = new javax.swing.JTextField();
        provider_adress = new javax.swing.JTextField();
        jLabel19 = new javax.swing.JLabel();
        choice_contact = new java.awt.Choice();
        button2 = new java.awt.Button();
        contact_added = new javax.swing.JLabel();
        provider_added = new javax.swing.JLabel();

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

        username_field.setBackground(new java.awt.Color(153, 153, 153));
        username_field.setFont(new java.awt.Font("Dubai", 0, 24)); // NOI18N
        username_field.setForeground(new java.awt.Color(0, 0, 0));
        username_field.setCaretColor(new java.awt.Color(204, 204, 204));
        username_field.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                username_fieldActionPerformed(evt);
            }
        });

        password_field.setBackground(new java.awt.Color(153, 153, 153));
        password_field.setFont(new java.awt.Font("Dubai", 0, 24)); // NOI18N
        password_field.setForeground(new java.awt.Color(0, 0, 0));
        password_field.setCaretColor(new java.awt.Color(153, 153, 153));
        password_field.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                password_fieldActionPerformed(evt);
            }
        });

        jLabel1.setFont(new java.awt.Font("Dubai", 1, 24)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(204, 204, 204));
        jLabel1.setText("Mot de passe");

        jLabel2.setFont(new java.awt.Font("Dubai", 1, 24)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(204, 204, 204));
        jLabel2.setText("Utilisateur");

        button_connect.setBackground(new java.awt.Color(51, 51, 51));
        button_connect.setFont(new java.awt.Font("Dubai", 0, 24)); // NOI18N
        button_connect.setForeground(new java.awt.Color(255, 255, 255));
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
                            .addComponent(button_connect, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
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
                .addContainerGap(48, Short.MAX_VALUE))
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
                    .addComponent(manual, javax.swing.GroupLayout.DEFAULT_SIZE, 1256, Short.MAX_VALUE)
                    .addGroup(profileLayout.createSequentialGroup()
                        .addComponent(welcome, javax.swing.GroupLayout.PREFERRED_SIZE, 1100, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(id_user, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                .addGap(54, 54, 54))
        );
        profileLayout.setVerticalGroup(
            profileLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(profileLayout.createSequentialGroup()
                .addGap(19, 19, 19)
                .addGroup(profileLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(welcome, javax.swing.GroupLayout.DEFAULT_SIZE, 58, Short.MAX_VALUE)
                    .addComponent(id_user, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
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
        label1.setForeground(new java.awt.Color(204, 204, 204));
        label1.setText("Ajouter un article:");

        article_list.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Produit", "Marque", "Fournisseur", "Origine", "Disponibilité"
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

        add_product_name.setBackground(new java.awt.Color(51, 51, 51));
        add_product_name.setCursor(new java.awt.Cursor(java.awt.Cursor.TEXT_CURSOR));
        add_product_name.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                add_product_nameActionPerformed(evt);
            }
        });

        add_article_provider.setBackground(new java.awt.Color(51, 51, 51));
        add_article_provider.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));

        add_article_type.setBackground(new java.awt.Color(51, 51, 51));

        add_article_button.setBackground(new java.awt.Color(51, 51, 51));
        add_article_button.setForeground(new java.awt.Color(255, 255, 255));
        add_article_button.setText("Ajouter article");
        add_article_button.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                add_article_buttonActionPerformed(evt);
            }
        });

        add_article_status.setBackground(new java.awt.Color(51, 51, 51));

        jLabel10.setText("Disponibilité");

        add_article_origin.setBackground(new java.awt.Color(51, 51, 51));

        jLabel11.setText("Provenance");

        jLabel12.setText("Rechercher par nom");

        input_search.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                input_searchActionPerformed(evt);
            }
        });
        input_search.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                input_searchKeyReleased(evt);
            }
        });

        javax.swing.GroupLayout articleLayout = new javax.swing.GroupLayout(article);
        article.setLayout(articleLayout);
        articleLayout.setHorizontalGroup(
            articleLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(articleLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(label1, javax.swing.GroupLayout.PREFERRED_SIZE, 530, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, articleLayout.createSequentialGroup()
                .addGap(41, 41, 41)
                .addGroup(articleLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jLabel6)
                    .addComponent(jLabel8)
                    .addComponent(jLabel7)
                    .addComponent(jLabel9)
                    .addComponent(jLabel10)
                    .addComponent(jLabel11))
                .addGap(38, 38, 38)
                .addGroup(articleLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(add_article_message, javax.swing.GroupLayout.DEFAULT_SIZE, 217, Short.MAX_VALUE)
                    .addComponent(add_article_button, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(add_product_name, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(add_article_provider, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(add_article_type, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 217, Short.MAX_VALUE)
                    .addComponent(add_article_status, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 217, Short.MAX_VALUE)
                    .addComponent(add_article_origin, javax.swing.GroupLayout.DEFAULT_SIZE, 217, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 220, Short.MAX_VALUE)
                .addGroup(articleLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 724, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(articleLayout.createSequentialGroup()
                        .addComponent(jLabel12, javax.swing.GroupLayout.PREFERRED_SIZE, 133, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(input_search, javax.swing.GroupLayout.PREFERRED_SIZE, 281, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(message_search, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                .addGap(53, 53, 53))
        );
        articleLayout.setVerticalGroup(
            articleLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, articleLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(label1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(9, 9, 9)
                .addGroup(articleLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jLabel12, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(articleLayout.createSequentialGroup()
                        .addGap(4, 4, 4)
                        .addGroup(articleLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(message_search, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(input_search))))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
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
                        .addGap(22, 22, 22)
                        .addGroup(articleLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(add_article_status, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel10))
                        .addGap(8, 8, 8)
                        .addComponent(jLabel7)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(articleLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(add_article_origin, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel11))
                        .addGap(29, 29, 29)
                        .addComponent(add_article_button)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(add_article_message, javax.swing.GroupLayout.PREFERRED_SIZE, 52, javax.swing.GroupLayout.PREFERRED_SIZE))
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
                .addContainerGap()
                .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 302, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(1056, Short.MAX_VALUE))
        );
        commandLayout.setVerticalGroup(
            commandLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(commandLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(686, Short.MAX_VALUE))
        );

        tabbed_pane.addTab("Commande", command);

        jLabel5.setFont(new java.awt.Font("Dialog", 1, 24)); // NOI18N
        jLabel5.setText("Ajouter employée :");

        javax.swing.GroupLayout administrationLayout = new javax.swing.GroupLayout(administration);
        administration.setLayout(administrationLayout);
        administrationLayout.setHorizontalGroup(
            administrationLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(administrationLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 492, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(866, Short.MAX_VALUE))
        );
        administrationLayout.setVerticalGroup(
            administrationLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(administrationLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(686, Short.MAX_VALUE))
        );

        tabbed_pane.addTab("Admnistration", administration);

        jLabel13.setFont(new java.awt.Font("Dialog", 1, 24)); // NOI18N
        jLabel13.setText("Ajouter contact fournisseur");

        jLabel14.setText("Nom");

        jLabel15.setText("Prénom");

        jLabel16.setText("Téléphone");

        add_contact.setBackground(new java.awt.Color(51, 51, 51));
        add_contact.setForeground(new java.awt.Color(204, 204, 204));
        add_contact.setLabel("Ajouter contact fournisseur");
        add_contact.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                add_contactActionPerformed(evt);
            }
        });

        provider_list.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null}
            },
            new String [] {
                "Nom", "Adresse", "Contact"
            }
        ));
        jScrollPane2.setViewportView(provider_list);

        jLabel17.setFont(new java.awt.Font("Dialog", 1, 24)); // NOI18N
        jLabel17.setText("Ajouter fournisseur");

        jLabel18.setText("Contact");

        jLabelname.setText("Nom");

        provider_name.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                provider_nameActionPerformed(evt);
            }
        });

        provider_adress.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                provider_adressActionPerformed(evt);
            }
        });

        jLabel19.setText("Adresse");

        choice_contact.setBackground(new java.awt.Color(51, 51, 51));
        choice_contact.setForeground(new java.awt.Color(204, 204, 204));

        button2.setBackground(new java.awt.Color(51, 51, 51));
        button2.setForeground(new java.awt.Color(204, 204, 204));
        button2.setLabel("Ajouter fournisseur");
        button2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                button2ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout providerLayout = new javax.swing.GroupLayout(provider);
        provider.setLayout(providerLayout);
        providerLayout.setHorizontalGroup(
            providerLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(providerLayout.createSequentialGroup()
                .addGap(43, 43, 43)
                .addGroup(providerLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(providerLayout.createSequentialGroup()
                        .addGroup(providerLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jLabel17, javax.swing.GroupLayout.PREFERRED_SIZE, 340, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(providerLayout.createSequentialGroup()
                                .addGroup(providerLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel19, javax.swing.GroupLayout.PREFERRED_SIZE, 77, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jLabel18, javax.swing.GroupLayout.PREFERRED_SIZE, 77, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jLabelname, javax.swing.GroupLayout.PREFERRED_SIZE, 77, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(providerLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(choice_contact, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(provider_adress)
                                    .addComponent(provider_name)
                                    .addComponent(button2, javax.swing.GroupLayout.DEFAULT_SIZE, 401, Short.MAX_VALUE)
                                    .addComponent(provider_added, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
                        .addGap(58, 58, 58)
                        .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 722, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(providerLayout.createSequentialGroup()
                        .addGroup(providerLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel13, javax.swing.GroupLayout.PREFERRED_SIZE, 340, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(providerLayout.createSequentialGroup()
                                .addGroup(providerLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                    .addComponent(jLabel14, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(jLabel15, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.PREFERRED_SIZE, 61, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(18, 18, 18)
                                .addGroup(providerLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(contact_added, javax.swing.GroupLayout.PREFERRED_SIZE, 409, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addGroup(providerLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                        .addComponent(lastname_contact, javax.swing.GroupLayout.DEFAULT_SIZE, 409, Short.MAX_VALUE)
                                        .addComponent(firstname_contact)))))
                        .addGap(28, 28, 28)
                        .addComponent(jLabel16)
                        .addGap(18, 18, 18)
                        .addGroup(providerLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(add_contact, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(telephone_contact, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 609, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addContainerGap(53, Short.MAX_VALUE))
        );
        providerLayout.setVerticalGroup(
            providerLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(providerLayout.createSequentialGroup()
                .addGroup(providerLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(providerLayout.createSequentialGroup()
                        .addGap(65, 65, 65)
                        .addGroup(providerLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jLabel16, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(telephone_contact, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 17, Short.MAX_VALUE)
                        .addComponent(add_contact, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(29, 29, 29)
                        .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 518, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(providerLayout.createSequentialGroup()
                        .addGap(17, 17, 17)
                        .addComponent(jLabel13, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addGroup(providerLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(firstname_contact, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel14, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(providerLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel15, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(lastname_contact, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addComponent(contact_added, javax.swing.GroupLayout.PREFERRED_SIZE, 59, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(31, 31, 31)
                        .addComponent(jLabel17, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(32, 32, 32)
                        .addGroup(providerLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabelname, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(provider_name, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(providerLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(providerLayout.createSequentialGroup()
                                .addComponent(provider_adress, javax.swing.GroupLayout.PREFERRED_SIZE, 157, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(25, 25, 25))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, providerLayout.createSequentialGroup()
                                .addComponent(jLabel19, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(81, 81, 81)))
                        .addGroup(providerLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jLabel18, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(choice_contact, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(22, 22, 22)
                        .addComponent(button2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(29, 29, 29)
                        .addComponent(provider_added, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                .addGap(48, 48, 48))
        );

        tabbed_pane.addTab("Fournisseur", provider);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(tabbed_pane, javax.swing.GroupLayout.PREFERRED_SIZE, 1366, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(tabbed_pane, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 768, javax.swing.GroupLayout.PREFERRED_SIZE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void input_searchKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_input_searchKeyReleased

        try {
            load_article_search(DBArticle.searchArticlesFromDB(input_search.getText()));
        } catch (SQLException ex) {
            Logger.getLogger(VMain.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_input_searchKeyReleased

    private void input_searchActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_input_searchActionPerformed

        //ICI
    }//GEN-LAST:event_input_searchActionPerformed

    private void add_article_buttonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_add_article_buttonActionPerformed
        MArticles art = new MArticles();
        art.setName(add_product_name.getText());
        art.setProvider(add_article_provider.getSelectedItem());
        art.setStatus_article(add_article_status.getSelectedItem());
        art.setType(add_article_type.getSelectedItem());
        art.setOrigin(add_article_origin.getSelectedItem());
        art.setId_user(DBProvider.getProvidersIdByName(add_article_provider.getSelectedItem()));
        try {
            DBArticle.addArticleToDB(art, parseInt(id_user.getText()));
        } catch (SQLException ex) {
            Logger.getLogger(VMain.class.getName()).log(Level.SEVERE, null, ex);
        }
        try {
            load_article_without_listener();
        } catch (SQLException ex) {
            Logger.getLogger(VMain.class.getName()).log(Level.SEVERE, null, ex);
        }
        add_article_message.setText("Ajout de " + art.getName() + " Effectué");
    }//GEN-LAST:event_add_article_buttonActionPerformed

    private void add_product_nameActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_add_product_nameActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_add_product_nameActionPerformed

    private void button_connectActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_button_connectActionPerformed
        try {
            MLogin log = DBLogin.getLog(username_field.getText(), password_field.getText());
            if (log.isLogin() && log.getId_role() == 1) {
                System.out.println("Bienvenue " + log.getUsername());
                welcome(log);
                tabbed_pane.add(profile, "Profil");
                tabbed_pane.add(article, "Article");
                tabbed_pane.add(command, "Commande");
                tabbed_pane.add(provider, "Fournisseur");
                tabbed_pane.add(administration, "Administration");
                tabbed_pane.removeTabAt(0);
                init_v_main();

            } else if (log.isLogin() && log.getId_role() == 2) {
                System.out.println("Bienvenue " + log.getUsername());
                welcome(log);

                tabbed_pane.add(profile, "Profil");
                tabbed_pane.add(article, "Article");
                tabbed_pane.add(command, "Commande");
                tabbed_pane.add(provider, "Fournisseur");
                tabbed_pane.removeTabAt(0);
                init_v_main();

            } else if (log.isLogin() && log.getId_role() == 3) {
                System.out.println("Bienvenue " + log.getUsername());
                welcome(log);
                tabbed_pane.add(profile, "Profil");
                tabbed_pane.add(article, "Article");
                tabbed_pane.add(command, "Commande");
                tabbed_pane.removeTabAt(0);
                init_v_main();

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

    private void username_fieldActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_username_fieldActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_username_fieldActionPerformed

    private void add_contactActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_add_contactActionPerformed
        MContact contact = new MContact();
        contact.setLastname(lastname_contact.getText());
        contact.setFirstname(firstname_contact.getText());
        contact.setTelephone(telephone_contact.getText());
        try {
            DBContact.addContactToDB(contact);
        } catch (SQLException ex) {
            Logger.getLogger(VMain.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_add_contactActionPerformed

    private void provider_nameActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_provider_nameActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_provider_nameActionPerformed

    private void provider_adressActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_provider_adressActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_provider_adressActionPerformed

    private void button2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_button2ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_button2ActionPerformed

    public void load_article() throws SQLException {
        ArrayList<MArticles> arr = new ArrayList<>();
        DefaultTableModel model = (DefaultTableModel) article_list.getModel();
        model.setRowCount(0);
        article_list.setAutoCreateRowSorter(true);

        //event listener for modify
        article_list.addMouseListener(new MouseAdapter() {
            public void mouseClicked(MouseEvent e) {
                if (e.getClickCount() == 2) {
                    int row = article_list.getSelectedRow();
                    int col = article_list.getSelectedColumn();
                    MArticles art = new MArticles();
                    if (col == 0) {
                        //by name
                        art = DBArticle.getArticleByNameDetailsFromDB((String) article_list.getValueAt(row, col));
                    } else if (col == 1) {
                        //by brand
                        art = DBArticle.getArticleByNameDetailsFromDB((String) article_list.getValueAt(row, 0));
                    } else if (col == 2) {
                        //by provider
                        art = DBArticle.getArticleByNameDetailsFromDB((String) article_list.getValueAt(row, 0));
                    } else if (col == 3) {
                        //by origin
                        art = DBArticle.getArticleByNameDetailsFromDB((String) article_list.getValueAt(row, 0));
                    } else if (col == 4) {
                        //by disponibility
                        art = DBArticle.getArticleByNameDetailsFromDB((String) article_list.getValueAt(row, 0));
                    }
                    VDetails details = new VDetails(art, article_list);
                    details.setVisible(true);
                }
            }
        });
        arr = getArticlesFromDB();
        DefaultTableModel table = (DefaultTableModel) article_list.getModel();
        for (int i = 0; i < arr.size(); i++) {
            MArticles add = new MArticles();
            add = arr.get(i);
            String show[] = {add.getName(), add.getBrand(), DBProvider.getProvidersById(DBProvider.getProvidersIdByIdArticle(add.getId())), DBProvider.getOriginByIdArticle(add.getId()), add.getStatus_article()};
            table.addRow(show);
        }

    }

    public void load_article_search(ArrayList<MArticles> arr) throws SQLException {
        if (arr.size() == 0) {
            message_search.setText("Oups, il n'y a rien ici ...");
        } else {
            message_search.setText("");
        }
        DefaultTableModel model = (DefaultTableModel) article_list.getModel();
        model.setRowCount(0);
        article_list.setAutoCreateRowSorter(true);
        //event listener for modify
        DefaultTableModel table = (DefaultTableModel) article_list.getModel();
        for (int i = 0; i < arr.size(); i++) {
            MArticles add = new MArticles();
            add = arr.get(i);
            String show[] = {add.getName(), add.getBrand(), DBProvider.getProvidersById(DBProvider.getProvidersIdByIdArticle(add.getId())), DBProvider.getOriginByIdArticle(add.getId()), add.getStatus_article()};
            table.addRow(show);
        }

    }

    public void load_article_without_listener() throws SQLException {
        ArrayList<MArticles> arr = getArticlesFromDB();
        DefaultTableModel model = (DefaultTableModel) article_list.getModel();
        model.setRowCount(0);
        article_list.setAutoCreateRowSorter(true);
        //event listener for modify
        DefaultTableModel table = (DefaultTableModel) article_list.getModel();
        for (int i = 0; i < arr.size(); i++) {
            MArticles add = new MArticles();
            add = arr.get(i);
            String show[] = {add.getName(), add.getBrand(), DBProvider.getProvidersById(DBProvider.getProvidersIdByIdArticle(add.getId())), DBProvider.getOriginByIdArticle(add.getId()), add.getStatus_article()};
            table.addRow(show);
        }

    }

    public void load_add_article_provider() {
        ArrayList provider_array = new ArrayList<>();
        provider_array = DBProvider.getProvidersArrayList();
        for (int i = 0; i < provider_array.size(); i++) {
            String to_add = (String) provider_array.get(i);
            add_article_provider.add(to_add);
        }

    }

    public void load_contact_provider() throws SQLException {
        ArrayList contact_array = new ArrayList<>();
        contact_array = DBContact.getContactsFromDB();
        for (int i = 0; i < contact_array.size(); i++) {
            String to_add = contact_array.get(i).toString();
            choice_contact.add(to_add);
        }

    }

    public void init_v_main() throws SQLException {
        load_article();
        load_add_article_type();
        load_add_article_origin();
        load_add_article_status();
        load_add_article_provider();
        load_contact_provider();
    }

    public void load_add_article_type() {

        add_article_type.add("Ustensile");
        add_article_type.add("Ingredient");

    }

    public void load_add_article_status() {

        add_article_status.add("Disponible");
        add_article_status.add("Indisponible");

    }

    public void load_add_article_origin() {

        add_article_origin.add("France");
        add_article_origin.add("Allemagne");
        add_article_origin.add("Espagne");
        add_article_origin.add("Italie");
        add_article_origin.add("Belgique");

    }

    public static void main(String args[]) {
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                FlatDarkLaf.setup();
                new VMain().setVisible(true);

            }
        });
    }

    public void welcome(MLogin log) {
        welcome.setText("Bienvenue " + log.getUsername() + " !");
        if (log.getId_role() == 1) {
            statut.setText("Vous êtes connecté en tant qu'administrateur.");
            id_user.setText(String.valueOf(log.getId()));
            manual.setText(" Vous pouvez accéder à tout les onglets. ");
            manual_user.setText(" Utilisateur : vous permet de consulter, ajouter, modifier et supprimer un employé.");
            manual_article.setText(" Article : vous permet de consulter, ajouter, modifier et supprimer un article du catalogue.");
            manual_command.setText(" Commande : Vous permet consulter, ajouter, modifier et supprimer une commande.");
            manual_supplier.setText(" Fournisseur : Vous permet consulter, ajouter, modifier et supprimer un fournisseur.");
        } else if (log.getId_role() == 2) {
            statut.setText("Vous êtes connecté en tant que manager.");
            id_user.setText(String.valueOf(log.getId()));
            manual_user.setText(" Utilisateur : vous permet de consulter la liste des employés.");
            manual_article.setText(" Article : vous permet de consulter, ajouter, modifier et supprimer un article du catalogue.");
            manual_command.setText(" Commande : Vous permet consulter, ajouter, modifier et supprimer une commande.");
            manual_supplier.setText(" Fournisseur : Vous permet consulter, ajouter, modifier et supprimer un fournisseur.");
        } else {
            statut.setText("Vous êtes connecté en tant qu'employée.");
            id_user.setText(String.valueOf(log.getId()));
            manual_user.setText(" Utilisateur : vous n'y avez pas accès, merci de vous rapprocher de votre manager");
            manual_article.setText(" Article : vous permet de consulter les articles du catalogue.");
            manual_command.setText(" Commande : Vous permet consulter les commande.");
            manual_supplier.setText(" Fournisseur : Vous permet consulter les fournisseur.");
        }
        error_message.setText("");
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton add_article_button;
    private javax.swing.JLabel add_article_message;
    private java.awt.Choice add_article_origin;
    private java.awt.Choice add_article_provider;
    private java.awt.Choice add_article_status;
    private java.awt.Choice add_article_type;
    private java.awt.Button add_contact;
    private java.awt.TextField add_product_name;
    private javax.swing.JPanel administration;
    private javax.swing.JPanel article;
    private javax.swing.JTable article_list;
    private java.awt.Button button2;
    private java.awt.Button button_connect;
    private java.awt.Choice choice_contact;
    private javax.swing.JPanel command;
    private javax.swing.JLabel contact_added;
    private javax.swing.JLabel error_message;
    private javax.swing.JTextField firstname_contact;
    private javax.swing.JLabel id_user;
    private javax.swing.JTextField input_search;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel16;
    private javax.swing.JLabel jLabel17;
    private javax.swing.JLabel jLabel18;
    private javax.swing.JLabel jLabel19;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JLabel jLabelname;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JPanel jPanel5;
    private javax.swing.JPanel jPanel6;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private java.awt.Label label1;
    private javax.swing.JTextField lastname_contact;
    private javax.swing.JPanel login;
    private javax.swing.JLabel manual;
    private javax.swing.JLabel manual_article;
    private javax.swing.JLabel manual_command;
    private javax.swing.JLabel manual_supplier;
    private javax.swing.JLabel manual_user;
    private javax.swing.JLabel message_search;
    private javax.swing.JPasswordField password_field;
    private javax.swing.JPanel profile;
    private javax.swing.JPanel provider;
    private javax.swing.JLabel provider_added;
    private javax.swing.JTextField provider_adress;
    private javax.swing.JTable provider_list;
    private javax.swing.JTextField provider_name;
    private javax.swing.JLabel statut;
    private javax.swing.JTabbedPane tabbed_pane;
    private javax.swing.JTextField telephone_contact;
    private javax.swing.JTextField username_field;
    private javax.swing.JLabel welcome;
    // End of variables declaration//GEN-END:variables
}
