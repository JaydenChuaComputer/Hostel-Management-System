package Assignment_test;

public class adminMenu extends javax.swing.JFrame {

    public adminMenu() {
        initComponents();
    }
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        btnRoomDetails = new javax.swing.JButton();
        btnStudentDetails = new javax.swing.JButton();
        btnIncome = new javax.swing.JButton();
        btnLogout = new javax.swing.JButton();
        btnApplication = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Menu for admin");
        setFont(getFont());
        setPreferredSize(new java.awt.Dimension(655, 480));
        setSize(getPreferredSize());

        jLabel1.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N

        jLabel2.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        jLabel2.setText("Admin Menu");

        btnRoomDetails.setFont(new java.awt.Font("Tahoma", 0, 20)); // NOI18N
        btnRoomDetails.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Icons/DF.png"))); // NOI18N
        btnRoomDetails.setText("Details of room ");
        btnRoomDetails.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnRoomDetailsActionPerformed(evt);
            }
        });

        btnStudentDetails.setFont(new java.awt.Font("Tahoma", 0, 20)); // NOI18N
        btnStudentDetails.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Icons/DoS.png"))); // NOI18N
        btnStudentDetails.setText("Details of student ");
        btnStudentDetails.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnStudentDetailsActionPerformed(evt);
            }
        });

        btnIncome.setFont(new java.awt.Font("Tahoma", 0, 20)); // NOI18N
        btnIncome.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Icons/MI.png"))); // NOI18N
        btnIncome.setText("Monthly income ");
        btnIncome.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnIncomeActionPerformed(evt);
            }
        });

        btnLogout.setFont(new java.awt.Font("Tahoma", 0, 20)); // NOI18N
        btnLogout.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Icons/LOGOUT.png"))); // NOI18N
        btnLogout.setText("Logout ");
        btnLogout.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnLogoutActionPerformed(evt);
            }
        });

        btnApplication.setFont(new java.awt.Font("Tahoma", 0, 20)); // NOI18N
        btnApplication.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Icons/AoS.png"))); // NOI18N
        btnApplication.setText("Application of Student");
        btnApplication.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnApplicationActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(66, 66, 66)
                                .addComponent(jLabel1))
                            .addGroup(layout.createSequentialGroup()
                                .addGap(174, 174, 174)
                                .addComponent(btnLogout, javax.swing.GroupLayout.PREFERRED_SIZE, 262, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createSequentialGroup()
                                .addGap(226, 226, 226)
                                .addComponent(jLabel2)))
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(btnRoomDetails, javax.swing.GroupLayout.PREFERRED_SIZE, 276, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(btnIncome, javax.swing.GroupLayout.PREFERRED_SIZE, 276, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(31, 31, 31)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(btnApplication, javax.swing.GroupLayout.DEFAULT_SIZE, 314, Short.MAX_VALUE)
                            .addComponent(btnStudentDetails, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(18, 18, 18)
                .addComponent(jLabel2)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jLabel1)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnRoomDetails, javax.swing.GroupLayout.PREFERRED_SIZE, 78, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnStudentDetails))
                .addGap(26, 26, 26)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnIncome)
                    .addComponent(btnApplication))
                .addGap(18, 18, 18)
                .addComponent(btnLogout)
                .addContainerGap(78, Short.MAX_VALUE))
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void btnLogoutActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnLogoutActionPerformed
        menu menu = new menu();
        menu.setVisible(true);
        setVisible(false);
    }//GEN-LAST:event_btnLogoutActionPerformed

    private void btnRoomDetailsActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnRoomDetailsActionPerformed
        adminRoomDetails adminRoomDetails = new adminRoomDetails();
        adminRoomDetails.setVisible(true);
        setVisible(false);
    }//GEN-LAST:event_btnRoomDetailsActionPerformed

    private void btnStudentDetailsActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnStudentDetailsActionPerformed
        adminStudentDetails adminStudentDetails = new adminStudentDetails();
        adminStudentDetails.setVisible(true);
        setVisible(false);
    }//GEN-LAST:event_btnStudentDetailsActionPerformed

    private void btnIncomeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnIncomeActionPerformed
        adminMonthlyIncome adminMonthlyIncome = new adminMonthlyIncome();
        adminMonthlyIncome.setVisible(true);
        setVisible(false);
    }//GEN-LAST:event_btnIncomeActionPerformed

    private void btnApplicationActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnApplicationActionPerformed
        adminApplication adminApplication = new adminApplication();
        adminApplication.setVisible(true);
        setVisible(false);
    }//GEN-LAST:event_btnApplicationActionPerformed

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnApplication;
    private javax.swing.JButton btnIncome;
    private javax.swing.JButton btnLogout;
    private javax.swing.JButton btnRoomDetails;
    private javax.swing.JButton btnStudentDetails;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    // End of variables declaration//GEN-END:variables
}
