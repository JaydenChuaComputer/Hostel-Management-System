
package Assignment_test;

public class adminViewRoom extends javax.swing.JFrame {

    public adminViewRoom() {
        initComponents();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        btnViewAllRoom = new javax.swing.JButton();
        btnViewAvailableRoom = new javax.swing.JButton();
        btnViewOccupiedRoom = new javax.swing.JButton();
        btnBack = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("View room details");

        jLabel1.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        jLabel1.setText("View Room Details");

        btnViewAllRoom.setFont(new java.awt.Font("Tahoma", 0, 19)); // NOI18N
        btnViewAllRoom.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Icons/DR.png"))); // NOI18N
        btnViewAllRoom.setText("View all room or delete room");
        btnViewAllRoom.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnViewAllRoomActionPerformed(evt);
            }
        });

        btnViewAvailableRoom.setFont(new java.awt.Font("Tahoma", 0, 20)); // NOI18N
        btnViewAvailableRoom.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Icons/VRD.png"))); // NOI18N
        btnViewAvailableRoom.setText("View available room ");
        btnViewAvailableRoom.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnViewAvailableRoomActionPerformed(evt);
            }
        });

        btnViewOccupiedRoom.setFont(new java.awt.Font("Tahoma", 0, 20)); // NOI18N
        btnViewOccupiedRoom.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Icons/VOR.png"))); // NOI18N
        btnViewOccupiedRoom.setText("View occupied room ");
        btnViewOccupiedRoom.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnViewOccupiedRoomActionPerformed(evt);
            }
        });

        btnBack.setFont(new java.awt.Font("Tahoma", 0, 20)); // NOI18N
        btnBack.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Icons/Back.png"))); // NOI18N
        btnBack.setText("Back");
        btnBack.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnBackActionPerformed(evt);
            }
        });

        jLabel2.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jLabel2.setText("Please choose what details of the room you want to know.");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(btnBack, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(btnViewOccupiedRoom, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jLabel2, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(btnViewAllRoom, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(btnViewAvailableRoom, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addComponent(jLabel1)
                        .addGap(49, 49, 49)))
                .addGap(20, 20, 20))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1)
                .addGap(18, 18, 18)
                .addComponent(jLabel2)
                .addGap(18, 18, 18)
                .addComponent(btnViewAllRoom, javax.swing.GroupLayout.PREFERRED_SIZE, 91, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(btnViewAvailableRoom, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(btnViewOccupiedRoom)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(btnBack)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void btnBackActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnBackActionPerformed
        adminRoomDetails adminRoomDetails = new adminRoomDetails();
        adminRoomDetails.setVisible(true);
        setVisible(false);
    }//GEN-LAST:event_btnBackActionPerformed

    private void btnViewAllRoomActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnViewAllRoomActionPerformed
        adminViewAllRoom adminViewAllRoom = new adminViewAllRoom();
        adminViewAllRoom.setVisible(true);
        setVisible(false);
    }//GEN-LAST:event_btnViewAllRoomActionPerformed

    private void btnViewAvailableRoomActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnViewAvailableRoomActionPerformed
        adminViewAvailableRoom adminViewAvailableRoom = new adminViewAvailableRoom();
        adminViewAvailableRoom.setVisible(true);
        setVisible(false);
    }//GEN-LAST:event_btnViewAvailableRoomActionPerformed

    private void btnViewOccupiedRoomActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnViewOccupiedRoomActionPerformed
        adminViewOccupiedRoom adminViewOccupiedRoom = new adminViewOccupiedRoom();
        adminViewOccupiedRoom.setVisible(true);
        setVisible(false);
    }//GEN-LAST:event_btnViewOccupiedRoomActionPerformed

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnBack;
    private javax.swing.JButton btnViewAllRoom;
    private javax.swing.JButton btnViewAvailableRoom;
    private javax.swing.JButton btnViewOccupiedRoom;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    // End of variables declaration//GEN-END:variables
}
