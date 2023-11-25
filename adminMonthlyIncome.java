package Assignment_test;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.logging.Level;
import java.util.logging.Logger;

public class adminMonthlyIncome extends javax.swing.JFrame {

    private String line;
    private int totalIncome = 0;
            
    public adminMonthlyIncome() {
        initComponents();
        try {
            input = new FileReader("roomData.txt");
        } catch (FileNotFoundException ex) {
            Logger.getLogger(adminViewAllRoom.class.getName()).log(Level.SEVERE, null, ex);
        }
        BufferedReader reader = new BufferedReader(input);

        StringBuilder data = new StringBuilder();
        try {
            // read each line from the file and append to the data string
            while ((line = reader.readLine()) != null) {
                String[] fields = line.split("!");
                int available = Integer.parseInt(fields[4]);
                int total = Integer.parseInt(fields[2]);
                int occupied = total - available;
                int fee = Integer.parseInt(fields[5]);
                int income = occupied * fee;
                data.append("Room Type ID: ").append(fields[0]).append("\n");
                data.append("Number of bed rented in types: ").append(occupied).append("\n");
                data.append("Rental fee per bed: RM").append(fields[5]).append("\n");
                data.append("Total income in room types: RM").append(income).append("\n\n");
                totalIncome += income;
            }
            data.append("Total income for overall per month: RM").append(totalIncome);
        } catch (IOException ex) {
            Logger.getLogger(adminViewAllRoom.class.getName()).log(Level.SEVERE, null, ex);
        }

        try {
            // close the reader
            reader.close();
        } catch (IOException ex) {
            Logger.getLogger(adminViewAllRoom.class.getName()).log(Level.SEVERE, null, ex);
        }

        // set the data string to the text area
        tfResult.setText(data.toString());
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        tfResult = new javax.swing.JTextArea();
        btnBack = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Monthly income ");

        jLabel1.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        jLabel1.setText("Monthly income ");

        tfResult.setColumns(20);
        tfResult.setRows(5);
        jScrollPane1.setViewportView(tfResult);

        btnBack.setText("Back");
        btnBack.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnBackActionPerformed(evt);
            }
        });

        jLabel2.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jLabel2.setText("Here is some details of monthly income for the hostel.");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(3, 3, 3)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(btnBack)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                .addComponent(jScrollPane1, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.PREFERRED_SIZE, 419, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                                    .addGap(116, 116, 116)
                                    .addComponent(jLabel1))))
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(18, 18, 18)
                .addComponent(jLabel1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jLabel2)
                .addGap(18, 18, 18)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 275, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(21, 21, 21)
                .addComponent(btnBack)
                .addContainerGap(36, Short.MAX_VALUE))
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    FileReader input;

    private void btnBackActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnBackActionPerformed
        adminMenu adminMenu = new adminMenu();
        adminMenu.setVisible(true);
        setVisible(false);
    }//GEN-LAST:event_btnBackActionPerformed

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnBack;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTextArea tfResult;
    // End of variables declaration//GEN-END:variables
}
