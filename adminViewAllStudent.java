package Assignment_test;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.logging.Level;
import java.util.logging.Logger;

public class adminViewAllStudent extends javax.swing.JFrame {

    private String line;

    public adminViewAllStudent() {
        initComponents();
        try {
            input = new FileReader("studentData.txt");
        } catch (FileNotFoundException ex) {
            Logger.getLogger(adminViewAllStudent.class.getName()).log(Level.SEVERE, null, ex);
        }
        BufferedReader reader = new BufferedReader(input);

        StringBuilder data = new StringBuilder();
        try {
            while ((line = reader.readLine()) != null) {
                String[] fields = line.split("!");
                data.append("Name: ").append(fields[0]).append("\n");
                data.append("Password: ").append(fields[1]).append("\n");
                data.append("Gender: ").append(fields[2]).append("\n");
                data.append("Email: ").append(fields[3]).append("\n");
                data.append("Phone: ").append(fields[4]).append("\n");
                data.append("Student ID: ").append(fields[5]).append("\n");
                data.append("Current Status: ").append(fields[6]).append("\n");
                data.append("Outstanding Fee: ").append(fields[7]).append("\n");
                data.append("Due Date: ").append(fields[8]).append("\n");
                data.append("Move-in Date: ").append(fields[9]).append("\n\n");
            }
        } catch (IOException ex) {
            Logger.getLogger(adminViewAllStudent.class.getName()).log(Level.SEVERE, null, ex);
        }

        try {
            // close the reader
            reader.close();
        } catch (IOException ex) {
            Logger.getLogger(adminViewAllStudent.class.getName()).log(Level.SEVERE, null, ex);
        }

        tfStudentDetails.setText(data.toString());
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jScrollPane1 = new javax.swing.JScrollPane();
        tfStudentDetails = new javax.swing.JTextArea();
        jLabel1 = new javax.swing.JLabel();
        btnBack = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("View All Students Details");

        tfStudentDetails.setEditable(false);
        tfStudentDetails.setColumns(20);
        tfStudentDetails.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N
        tfStudentDetails.setRows(5);
        jScrollPane1.setViewportView(tfStudentDetails);

        jLabel1.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        jLabel1.setText("View All Students Details");

        btnBack.setText("Back");
        btnBack.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnBackActionPerformed(evt);
            }
        });

        jLabel2.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jLabel2.setText("Here is the details of student.");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jLabel2))
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                        .addGroup(layout.createSequentialGroup()
                            .addContainerGap()
                            .addComponent(btnBack))
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(86, 86, 86)
                                .addComponent(jLabel1))
                            .addGroup(layout.createSequentialGroup()
                                .addContainerGap()
                                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 425, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1)
                .addGap(18, 18, 18)
                .addComponent(jLabel2)
                .addGap(18, 18, 18)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 241, Short.MAX_VALUE)
                .addGap(26, 26, 26)
                .addComponent(btnBack)
                .addGap(24, 24, 24))
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void btnBackActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnBackActionPerformed
        adminStudentDetails adminStudentDetails = new adminStudentDetails();
        adminStudentDetails.setVisible(true);
        setVisible(false);
    }//GEN-LAST:event_btnBackActionPerformed

    FileReader input;

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnBack;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTextArea tfStudentDetails;
    // End of variables declaration//GEN-END:variables
}
