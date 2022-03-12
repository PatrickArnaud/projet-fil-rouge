package FilRouge.View;

public class Main extends javax.swing.JFrame {

    public Main() {
        initComponents();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        dd = new javax.swing.JTabbedPane();
        profil = new javax.swing.JTabbedPane();
        admin = new javax.swing.JTabbedPane();
        order = new javax.swing.JTabbedPane();
        stock = new javax.swing.JTabbedPane();
        jPanel1 = new javax.swing.JPanel();
        connection = new javax.swing.JTabbedPane();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        dd.addTab("Profil", profil);
        dd.addTab("Administration", admin);
        dd.addTab("Commande", order);
        dd.addTab("Stocks", stock);

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 998, Short.MAX_VALUE)
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 774, Short.MAX_VALUE)
        );

        dd.addTab("tab5", jPanel1);
        dd.addTab("Connexion", connection);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(dd)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(dd)
        );

        dd.getAccessibleContext().setAccessibleName("Profil");

        pack();
    }// </editor-fold>//GEN-END:initComponents

    public static void main(String args[]) {
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Main().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTabbedPane admin;
    private javax.swing.JTabbedPane connection;
    private javax.swing.JTabbedPane dd;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JTabbedPane order;
    private javax.swing.JTabbedPane profil;
    private javax.swing.JTabbedPane stock;
    // End of variables declaration//GEN-END:variables
}
