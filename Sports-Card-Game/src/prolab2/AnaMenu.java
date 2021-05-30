package prolab2;

public class AnaMenu extends javax.swing.JFrame {

    private Bilgisayar bilgisayar;
    private Kullanıcı player;

    public AnaMenu() {
        initComponents();

    }

    public AnaMenu(Bilgisayar bilgisayar, Kullanıcı player) {
        initComponents();
        text2.setVisible(false);
        text3.setVisible(false);
        text4.setVisible(false);
        jButton2.setVisible(false);
        this.bilgisayar = bilgisayar;
        this.player = player;
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jButton1 = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();
        text4 = new javax.swing.JTextField();
        text3 = new javax.swing.JTextField();
        text2 = new javax.swing.JTextField();
        text1 = new javax.swing.JTextField();
        jLabel1 = new javax.swing.JLabel();
        jPanel1 = new javax.swing.JPanel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setMinimumSize(new java.awt.Dimension(1920, 1080));
        getContentPane().setLayout(null);

        jButton1.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jButton1.setText("START");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton1);
        jButton1.setBounds(960, 630, 90, 50);

        jButton2.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jButton2.setText("PLAY");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton2);
        jButton2.setBounds(920, 510, 160, 60);

        text4.setEditable(false);
        text4.setFont(new java.awt.Font("Tahoma", 3, 18)); // NOI18N
        text4.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        text4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                text4ActionPerformed(evt);
            }
        });
        getContentPane().add(text4);
        text4.setBounds(820, 320, 370, 40);

        text3.setFont(new java.awt.Font("Tahoma", 2, 18)); // NOI18N
        text3.setText("Bu kisima isminizi girdikten sonra ENTER 'a basiniz.");
        text3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                text3ActionPerformed(evt);
            }
        });
        getContentPane().add(text3);
        text3.setBounds(1000, 410, 420, 30);

        text2.setEditable(false);
        text2.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        text2.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        text2.setText("Kullanıcı ID :");
        text2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                text2ActionPerformed(evt);
            }
        });
        getContentPane().add(text2);
        text2.setBounds(850, 410, 140, 30);

        text1.setEditable(false);
        text1.setFont(new java.awt.Font("Tahoma", 1, 36)); // NOI18N
        text1.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        text1.setText("SPORCU KART OYUNU");
        getContentPane().add(text1);
        text1.setBounds(710, 190, 570, 60);

        jLabel1.setIcon(new javax.swing.ImageIcon("C:\\Users\\G731GV\\OneDrive\\Documents\\NetBeansProjects\\ProLab2\\src\\MenuEkranResim\\S-SP24.jpg")); // NOI18N
        jLabel1.setText("jLabel1");
        getContentPane().add(jLabel1);
        jLabel1.setBounds(0, 0, 1920, 1080);

        jPanel1.setMinimumSize(new java.awt.Dimension(1920, 1080));

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 1920, Short.MAX_VALUE)
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 1080, Short.MAX_VALUE)
        );

        getContentPane().add(jPanel1);
        jPanel1.setBounds(0, 0, 1280, 720);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        jButton1.setVisible(false);
        text1.setVisible(false);
        text2.setVisible(true);
        text3.setVisible(true);


    }//GEN-LAST:event_jButton1ActionPerformed

    private void text2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_text2ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_text2ActionPerformed

    private void text3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_text3ActionPerformed
        String kullaniciAd = text3.getText();
        player.setOyuncuAdi(kullaniciAd);
        player.setOyuncuID(kullaniciAd + "#1234");
        System.out.println(kullaniciAd);
        text2.setVisible(false);
        text3.setVisible(false);
        text4.setVisible(true);
        text4.setText("Hoşgeldin " + kullaniciAd + "#1234");
        jButton2.setVisible(true);
    }//GEN-LAST:event_text3ActionPerformed

    private void text4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_text4ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_text4ActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        OyunAlani oyunAlani = new OyunAlani(bilgisayar, player);
        oyunAlani.setVisible(true);
    }//GEN-LAST:event_jButton2ActionPerformed

  

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JTextField text1;
    private javax.swing.JTextField text2;
    private javax.swing.JTextField text3;
    private javax.swing.JTextField text4;
    // End of variables declaration//GEN-END:variables
}
