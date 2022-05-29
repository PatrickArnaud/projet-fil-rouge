package FilRouge.View;

import FilRouge.Controlleur.DBContact;
import FilRouge.Controlleur.DBProvider;
import FilRouge.Model.MContact;
import FilRouge.Model.MProvider;
import Tools.Validator;
import java.awt.Choice;
import static java.lang.Integer.parseInt;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JFrame;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;

public class VDetailsProvider extends javax.swing.JFrame {

    JTable jtable;
    Choice choice_contact;

    public VDetailsProvider(MProvider pro, JTable jtable, Choice choice_contact) throws SQLException {
        this.jtable = jtable;
        this.choice_contact = choice_contact;
        initComponents();
        MContact cont = new MContact();

        this.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
        int id = pro.getProvider_id();
        String tostr = String.valueOf(id);
        provider_id_text.setText(tostr);
        provider_name.setText(pro.getProvider_name());
        provider_adress.setText(pro.getProvider_adress());
        cont = DBContact.getContactByIdFromDB(pro.getProvider_id_contact());

        if (cont != null) {
            String contact = cont.toString();
            provider_contact_choice.add(contact);
            int id_cont = cont.getId();
            String tostr_con = String.valueOf(id_cont);
            id_contact_text.setText(tostr_con);
            contact_name.setText(cont.getLastname());
            provider_contact_firstname.setText(cont.getFirstname());
            provider_contact_phone.setText(cont.getTelephone());
        } else {
            provider_contact_choice.add("pas de contact renseigné");
            id_contact_text.setText("");
            contact_name.setText("");
            provider_contact_firstname.setText("");
            provider_contact_phone.setText("");
            modify_provider_contact.setVisible(false);
            delete_provider_contact.setVisible(false);
        }

        load_contact_provider();

    }

    public void load_contact_provider() throws SQLException {

        ArrayList contact_array = new ArrayList<>();
        contact_array = DBContact.getContactsFromDB();
        for (int i = 0; i < contact_array.size(); i++) {
            String to_add = contact_array.get(i).toString();
            provider_contact_choice.add(to_add);
            choice_contact.add(to_add);
        }
    }

    public void reload_contact_provider() throws SQLException {
        provider_contact_choice.removeAll();
        choice_contact.removeAll();
        ArrayList contact_array = new ArrayList<>();
        contact_array = DBContact.getContactsFromDB();
        for (int i = 0; i < contact_array.size(); i++) {
            String to_add = contact_array.get(i).toString();
            provider_contact_choice.add(to_add);
            choice_contact.add(to_add);
        }
    }

    private void reload_provider() throws SQLException {

        ArrayList<MProvider> arr = new ArrayList();
        arr = DBProvider.getProvidersFromDB();
        DefaultTableModel model = (DefaultTableModel) jtable.getModel();
        model.setRowCount(0);
        jtable.setAutoCreateRowSorter(true);
        DefaultTableModel table = (DefaultTableModel) jtable.getModel();
        for (int i = 0; i < arr.size(); i++) {
            MProvider add = new MProvider();
            add = arr.get(i);
            String show[] = {add.getProvider_name(), add.getProvider_adress(), DBContact.getContactByIdFromDB(add.getProvider_id_contact()).toString()};
            table.addRow(show);
        }
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        provider_adress = new java.awt.TextField();
        contact_name = new java.awt.TextField();
        provider_contact_choice = new java.awt.Choice();
        delete_provider = new javax.swing.JButton();
        modify_provider_contact = new javax.swing.JButton();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        provider_name = new java.awt.TextField();
        provider_contact_phone = new java.awt.TextField();
        provider_contact_firstname = new java.awt.TextField();
        delete_provider_contact = new javax.swing.JButton();
        modify_provider = new javax.swing.JButton();
        modify_contact_provider_label = new javax.swing.JLabel();
        modify_provider_label = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        provider_id_text = new java.awt.Label();
        jLabel10 = new javax.swing.JLabel();
        id_contact_text = new java.awt.Label();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jLabel1.setFont(new java.awt.Font("Dialog", 1, 24)); // NOI18N
        jLabel1.setText("Détails Contact");

        jLabel2.setText("Nom");

        jLabel3.setText("Contact");

        jLabel4.setText("Adresse");

        provider_adress.setBackground(new java.awt.Color(51, 51, 51));
        provider_adress.setForeground(new java.awt.Color(204, 204, 204));
        provider_adress.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                provider_adressActionPerformed(evt);
            }
        });

        contact_name.setBackground(new java.awt.Color(51, 51, 51));
        contact_name.setForeground(new java.awt.Color(204, 204, 204));
        contact_name.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                contact_nameActionPerformed(evt);
            }
        });

        provider_contact_choice.setBackground(new java.awt.Color(51, 51, 51));
        provider_contact_choice.setForeground(new java.awt.Color(204, 204, 204));

        delete_provider.setBackground(new java.awt.Color(51, 51, 51));
        delete_provider.setForeground(new java.awt.Color(204, 204, 204));
        delete_provider.setText("Supprimer");
        delete_provider.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                delete_providerActionPerformed(evt);
            }
        });

        modify_provider_contact.setBackground(new java.awt.Color(51, 51, 51));
        modify_provider_contact.setForeground(new java.awt.Color(204, 204, 204));
        modify_provider_contact.setText("Modifier");
        modify_provider_contact.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                modify_provider_contactActionPerformed(evt);
            }
        });

        jLabel5.setFont(new java.awt.Font("Dialog", 1, 24)); // NOI18N
        jLabel5.setText("Détails Fournisseur");

        jLabel6.setText("Prénom");

        jLabel7.setText("Nom");

        jLabel8.setText("Téléphone");

        provider_name.setBackground(new java.awt.Color(51, 51, 51));
        provider_name.setForeground(new java.awt.Color(204, 204, 204));
        provider_name.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                provider_nameActionPerformed(evt);
            }
        });

        provider_contact_phone.setBackground(new java.awt.Color(51, 51, 51));
        provider_contact_phone.setForeground(new java.awt.Color(204, 204, 204));
        provider_contact_phone.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                provider_contact_phoneActionPerformed(evt);
            }
        });

        provider_contact_firstname.setBackground(new java.awt.Color(51, 51, 51));
        provider_contact_firstname.setForeground(new java.awt.Color(204, 204, 204));
        provider_contact_firstname.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                provider_contact_firstnameActionPerformed(evt);
            }
        });

        delete_provider_contact.setBackground(new java.awt.Color(51, 51, 51));
        delete_provider_contact.setForeground(new java.awt.Color(204, 204, 204));
        delete_provider_contact.setText("Supprimer");
        delete_provider_contact.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                delete_provider_contactActionPerformed(evt);
            }
        });

        modify_provider.setBackground(new java.awt.Color(51, 51, 51));
        modify_provider.setForeground(new java.awt.Color(204, 204, 204));
        modify_provider.setText("Modifier");
        modify_provider.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                modify_providerActionPerformed(evt);
            }
        });

        jLabel9.setText("n°");

        provider_id_text.setForeground(new java.awt.Color(204, 204, 204));

        jLabel10.setText("n°");

        id_contact_text.setForeground(new java.awt.Color(204, 204, 204));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(26, 26, 26)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 43, Short.MAX_VALUE)
                                .addComponent(provider_name, javax.swing.GroupLayout.PREFERRED_SIZE, 382, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(43, 43, 43)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                    .addComponent(provider_adress, javax.swing.GroupLayout.DEFAULT_SIZE, 382, Short.MAX_VALUE)
                                    .addComponent(provider_contact_choice, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(modify_provider, javax.swing.GroupLayout.PREFERRED_SIZE, 147, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                        .addComponent(delete_provider, javax.swing.GroupLayout.PREFERRED_SIZE, 147, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 81, Short.MAX_VALUE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jLabel9)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(provider_id_text, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(206, 206, 206)))
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel6, javax.swing.GroupLayout.PREFERRED_SIZE, 83, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(provider_contact_firstname, javax.swing.GroupLayout.PREFERRED_SIZE, 382, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel7, javax.swing.GroupLayout.PREFERRED_SIZE, 83, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(contact_name, javax.swing.GroupLayout.PREFERRED_SIZE, 382, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel8, javax.swing.GroupLayout.PREFERRED_SIZE, 83, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(modify_provider_contact, javax.swing.GroupLayout.PREFERRED_SIZE, 147, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(delete_provider_contact, javax.swing.GroupLayout.PREFERRED_SIZE, 147, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(provider_contact_phone, javax.swing.GroupLayout.PREFERRED_SIZE, 382, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(modify_contact_provider_label, javax.swing.GroupLayout.PREFERRED_SIZE, 382, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel1)
                        .addGap(38, 38, 38)
                        .addComponent(jLabel10)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(id_contact_text, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(213, 213, 213))
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(layout.createSequentialGroup()
                    .addGap(36, 36, 36)
                    .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 250, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addContainerGap(1014, Short.MAX_VALUE)))
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(layout.createSequentialGroup()
                    .addGap(159, 159, 159)
                    .addComponent(modify_provider_label, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGap(759, 759, 759)))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(112, 112, 112)
                        .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                .addGap(13, 13, 13)
                                .addComponent(provider_id_text, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(36, 36, 36))
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(layout.createSequentialGroup()
                                        .addGap(35, 35, 35)
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                            .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 66, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addComponent(jLabel9)
                                            .addComponent(jLabel10)))
                                    .addGroup(layout.createSequentialGroup()
                                        .addGap(60, 60, 60)
                                        .addComponent(id_contact_text, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                .addGap(18, 18, 18)))
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel7, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(contact_name, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(provider_name, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(provider_adress, javax.swing.GroupLayout.PREFERRED_SIZE, 121, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(50, 50, 50)
                                .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(provider_contact_choice, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(55, 55, 55)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(delete_provider, javax.swing.GroupLayout.PREFERRED_SIZE, 44, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(modify_provider, javax.swing.GroupLayout.PREFERRED_SIZE, 44, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(provider_contact_firstname, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(provider_contact_phone, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabel6, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jLabel8, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(54, 54, 54)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(modify_provider_contact, javax.swing.GroupLayout.PREFERRED_SIZE, 44, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(delete_provider_contact, javax.swing.GroupLayout.PREFERRED_SIZE, 44, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(50, 50, 50)
                        .addComponent(modify_contact_provider_label, javax.swing.GroupLayout.PREFERRED_SIZE, 81, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 11, Short.MAX_VALUE)))
                .addGap(321, 321, 321))
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(layout.createSequentialGroup()
                    .addGap(38, 38, 38)
                    .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 66, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addContainerGap(696, Short.MAX_VALUE)))
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                    .addContainerGap(539, Short.MAX_VALUE)
                    .addComponent(modify_provider_label, javax.swing.GroupLayout.PREFERRED_SIZE, 81, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGap(180, 180, 180)))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void provider_adressActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_provider_adressActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_provider_adressActionPerformed

    private void contact_nameActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_contact_nameActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_contact_nameActionPerformed

    private void modify_provider_contactActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_modify_provider_contactActionPerformed
        Validator val = new Validator();
        if (val.stringEntry(contact_name.getText()) && val.stringEntry(provider_contact_firstname.getText()) && val.numericEntry(parseInt(id_contact_text.getText()))) {
            MContact contact = new MContact();
            contact.setFirstname(contact_name.getText());
            contact.setLastname(provider_contact_firstname.getText());
            contact.setId(parseInt(id_contact_text.getText()));
            contact.setTelephone(provider_contact_phone.getText());
            try {
                DBContact.updateContactToDB(contact);
            } catch (SQLException ex) {
                Logger.getLogger(VDetailsProvider.class.getName()).log(Level.SEVERE, null, ex);
            }
            try {
                reload_contact_provider();
            } catch (SQLException ex) {
                Logger.getLogger(VDetailsProvider.class.getName()).log(Level.SEVERE, null, ex);
            }
            contact_name.setText(contact.getLastname());
            provider_contact_firstname.setText(contact.getFirstname());
            id_contact_text.setText(String.valueOf(contact.getId()));
            provider_contact_phone.setText(contact.getTelephone());
        } else {
            String message = "Merci de saisir un nom, prénom et une adresse valide";
            VError error = new VError(message);
            error.setVisible(true);
        }

    }//GEN-LAST:event_modify_provider_contactActionPerformed

    private void provider_nameActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_provider_nameActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_provider_nameActionPerformed

    private void provider_contact_phoneActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_provider_contact_phoneActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_provider_contact_phoneActionPerformed

    private void provider_contact_firstnameActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_provider_contact_firstnameActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_provider_contact_firstnameActionPerformed

    private void modify_providerActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_modify_providerActionPerformed

        Validator val = new Validator();
        if (val.stringEntry(provider_name.getText()) && (val.stringEntry(provider_adress.getText()))) {

            MProvider pro = new MProvider();
            pro.setProvider_id(parseInt(provider_id_text.getText()));
            pro.setProvider_name(provider_name.getText());
            pro.setProvider_adress(provider_adress.getText());
            String to_parse = provider_contact_choice.getSelectedItem();
            String[] id_contact = to_parse.split("-");
            int id_contact_to_db = parseInt(id_contact[0]);
            pro.setProvider_id_contact(id_contact_to_db);
            try {
                DBProvider.updateProvider(pro);
            } catch (SQLException ex) {
                Logger.getLogger(VDetailsProvider.class.getName()).log(Level.SEVERE, null, ex);
            }
            try {
                reload_contact_provider();
            } catch (SQLException ex) {
                Logger.getLogger(VDetailsProvider.class.getName()).log(Level.SEVERE, null, ex);
            }
            try {
                reload_provider();
            } catch (SQLException ex) {
                Logger.getLogger(VDetailsProvider.class.getName()).log(Level.SEVERE, null, ex);
            }
            modify_provider_label.setText("Modification effectuée");
        } else {
            String message = "Merci de saisir un nom et une adresse valide";
            VError error = new VError(message);
            error.setVisible(true);
        }

    }//GEN-LAST:event_modify_providerActionPerformed

    private void delete_provider_contactActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_delete_provider_contactActionPerformed
        try {
            reload_provider();
        } catch (SQLException ex) {
            Logger.getLogger(VDetailsProvider.class.getName()).log(Level.SEVERE, null, ex);
        }
        try {
            System.out.println("id_contact_text.getText()" + id_contact_text.getText());
            DBContact.deleteContactByIdToDB(parseInt(id_contact_text.getText()));
        } catch (SQLException ex) {
            Logger.getLogger(VDetailsProvider.class.getName()).log(Level.SEVERE, null, ex);
        }
        id_contact_text.setText("");
        contact_name.setText("");
        provider_contact_firstname.setText("");
        provider_contact_phone.setText("");
        modify_contact_provider_label.setText("Suppression effectuée");

    }//GEN-LAST:event_delete_provider_contactActionPerformed

    private void delete_providerActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_delete_providerActionPerformed
        DBProvider.deleteProviderByIdToDB(parseInt(provider_id_text.getText()));
        try {
            reload_provider();
        } catch (SQLException ex) {
            Logger.getLogger(VDetailsProvider.class.getName()).log(Level.SEVERE, null, ex);
        }
        contact_name.setText("");
        provider_id_text.setText("");
        provider_name.setText("");
        provider_adress.setText("");
        provider_contact_choice.removeAll();
        provider_contact_firstname.setText("");
        provider_contact_phone.setText("");
        modify_provider_label.setText("Suppression effectuée");
    }//GEN-LAST:event_delete_providerActionPerformed

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(VDetailsProvider.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(VDetailsProvider.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(VDetailsProvider.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(VDetailsProvider.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                //     new VDetailsProvider(pro).setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private java.awt.TextField contact_name;
    private javax.swing.JButton delete_provider;
    private javax.swing.JButton delete_provider_contact;
    private java.awt.Label id_contact_text;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JLabel modify_contact_provider_label;
    private javax.swing.JButton modify_provider;
    private javax.swing.JButton modify_provider_contact;
    private javax.swing.JLabel modify_provider_label;
    private java.awt.TextField provider_adress;
    private java.awt.Choice provider_contact_choice;
    private java.awt.TextField provider_contact_firstname;
    private java.awt.TextField provider_contact_phone;
    private java.awt.Label provider_id_text;
    private java.awt.TextField provider_name;
    // End of variables declaration//GEN-END:variables
}
