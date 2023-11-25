package Assignment_test;
import javax.swing.JOptionPane;

public class studentPayment extends javax.swing.JFrame {

    public studentPayment() {
        initComponents();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        btnCash = new javax.swing.JButton();
        btnCard = new javax.swing.JButton();
        btnBack = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setPreferredSize(new java.awt.Dimension(342, 410));

        jLabel1.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        jLabel1.setText("Payment");

        jLabel2.setText("Please select the payment method.");

        btnCash.setFont(new java.awt.Font("Tahoma", 0, 20)); // NOI18N
        btnCash.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Icons/Cash.png"))); // NOI18N
        btnCash.setText("Cash");
        btnCash.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCashActionPerformed(evt);
            }
        });

        btnCard.setFont(new java.awt.Font("Tahoma", 0, 20)); // NOI18N
        btnCard.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Icons/Card.png"))); // NOI18N
        btnCard.setText("Card");
        btnCard.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCardActionPerformed(evt);
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

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(69, 69, 69)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                        .addComponent(jLabel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(btnCash, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(btnCard, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(btnBack, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(49, 49, 49)
                        .addComponent(jLabel1)))
                .addContainerGap(69, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(30, 30, 30)
                .addComponent(jLabel1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jLabel2)
                .addGap(18, 18, 18)
                .addComponent(btnCash)
                .addGap(13, 13, 13)
                .addComponent(btnCard)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(btnBack)
                .addContainerGap(47, Short.MAX_VALUE))
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void btnCashActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCashActionPerformed
        JOptionPane.showMessageDialog(null, "Please pay your outstanding fees "
                + "at the bursary counter before the due date. Thanks.");
    }//GEN-LAST:event_btnCashActionPerformed

    private void btnCardActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCardActionPerformed
        String cardNumber = JOptionPane.showInputDialog(null, "Please enter your card number.");
        if (cardNumber == null || cardNumber.isEmpty()) {
            JOptionPane.showMessageDialog(null, "Card number cannot be empty. Please try again.");
            return; 
        }

        String cardHolderName = JOptionPane.showInputDialog(null, "Please enter the name of the card holder.");
        if (cardHolderName == null || cardHolderName.isEmpty()) {
            JOptionPane.showMessageDialog(null, "Card holder name cannot be empty. Please try again.");
            return;
        }

        String expiryDate = JOptionPane.showInputDialog(null, "Please enter the expiry date of the card. \n(mm/yy)");
        if (expiryDate == null || expiryDate.isEmpty()) {
            JOptionPane.showMessageDialog(null, "Expiry date cannot be empty. Please try again.");
            return;
        }

        String cvv = JOptionPane.showInputDialog(null, "Please enter the cvv/cvv2 of the card.");
        if (cvv == null || cvv.isEmpty()) {
            JOptionPane.showMessageDialog(null, "CVV/CVV2 cannot be empty. Please try again.");
            return;
        }

        String input = JOptionPane.showInputDialog(null, "Please enter the amount you wanted to pay. \n(RM)");
        if (input == null || input.isEmpty()) {
            JOptionPane.showMessageDialog(null, "Payment amount cannot be empty. Please try again.");
            return;
        }

        JOptionPane.showMessageDialog(null, "You have paid RM" + input + ". The admin team will email you a receipt within 3 working days. \nThank You! \uD83D\uDE0A");
        
//        JOptionPane.showInputDialog(null, "Please enter your card number.");
//        JOptionPane.showInputDialog(null,"Please enter the name of the card "
//                + "holder.");
//        JOptionPane.showInputDialog(null,"Please enter the expiry date of the "
//                + "card. \n(mm/yy)");
//        JOptionPane.showInputDialog(null,"Please enter the cvv/cvv2 of the"
//                + " card.");
//        String input = JOptionPane.showInputDialog(null,"Please enter the "
//                + "amount you wanted to pay. \n(RM)");
//        JOptionPane.showMessageDialog(null,"You have paid RM" + input + ". The admin "
//                + "team will email you a receipt within 3 working days. \nThank You! \uD83D\uDE0A");
    }//GEN-LAST:event_btnCardActionPerformed

    private void btnBackActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnBackActionPerformed
        studentMenu studentMenu = new studentMenu();
        studentMenu.setVisible(true);
        setVisible(false);
    }//GEN-LAST:event_btnBackActionPerformed

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnBack;
    private javax.swing.JButton btnCard;
    private javax.swing.JButton btnCash;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    // End of variables declaration//GEN-END:variables
}
