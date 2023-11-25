package Assignment_test;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.nio.charset.StandardCharsets;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;

public class adminApplication extends javax.swing.JFrame {

    private String line;
    private String ID;
    
    public adminApplication() {
        initComponents();
        try {
            input = new FileReader("application.txt");
        } catch (FileNotFoundException ex) {
            Logger.getLogger(adminApplication.class.getName()).log(Level.SEVERE, null, ex);
        }
        BufferedReader reader = new BufferedReader(input);

        StringBuilder data = new StringBuilder();
        try {
            while ((line = reader.readLine()) != null) {
                String[] fields = line.split("!");
                data.append("Student ID: ").append(fields[0]).append("\n");
                data.append("Room Type ID: ").append(fields[1]).append("\n");
                data.append("Move-in Date: ").append(fields[2]).append("\n");
                data.append("Application Date: ").append(fields[3]).append("\n\n");
            }
        } catch (IOException ex) {
            Logger.getLogger(adminApplication.class.getName()).log(Level.SEVERE, null, ex);
        }

        try {
            reader.close();
        } catch (IOException ex) {
            Logger.getLogger(adminApplication.class.getName()).log(Level.SEVERE, null, ex);
        }

        tfView.setText(data.toString());
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        tfView = new javax.swing.JTextArea();
        btnBack = new javax.swing.JButton();
        btnDelete = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jLabel1.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        jLabel1.setText("Application by student");

        tfView.setColumns(20);
        tfView.setRows(5);
        jScrollPane1.setViewportView(tfView);

        btnBack.setText("Back");
        btnBack.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnBackActionPerformed(evt);
            }
        });

        btnDelete.setText("Delete Application");
        btnDelete.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnDeleteActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jScrollPane1))
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                        .addGap(100, 100, 100)
                        .addComponent(jLabel1)
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                        .addGap(175, 175, 175)
                        .addComponent(btnDelete)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 76, Short.MAX_VALUE)
                        .addComponent(btnBack)))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 353, Short.MAX_VALUE)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(btnBack)
                    .addComponent(btnDelete))
                .addContainerGap())
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void btnBackActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnBackActionPerformed
        adminMenu adminMenu = new adminMenu();
        adminMenu.setVisible(true);
        setVisible(false);
    }//GEN-LAST:event_btnBackActionPerformed

    FileReader input;

    private void btnDeleteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnDeleteActionPerformed
        ID = JOptionPane.showInputDialog("Please enter the student ID");
        try {
            if (checkID(ID)) {
                deleteApplication(ID);
                JOptionPane.showMessageDialog(null, "Application for " + ID + " deleted successfully");
                tfView.setText("");
            } else {
                JOptionPane.showMessageDialog(null, "Invalid student ID, please try again.");
            }
        } catch (IOException ex) {
            Logger.getLogger(adminApplication.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_btnDeleteActionPerformed

    private void deleteApplication(String ID) throws IOException {
        // read the contents of the file into an ArrayList
        List<String> lines = Files.readAllLines(Paths.get("Application.txt"), StandardCharsets.UTF_8);

        // modify the data in the ArrayList
        for (int i = 0; i < lines.size(); i++) {
            String[] data = lines.get(i).split("!");
            if (data[0].equals(ID)) {
                lines.remove(i);
                break;
            }
        }

        // write the modified data back to the file, overwriting its contents
        Files.write(Paths.get("Application.txt"), lines, StandardCharsets.UTF_8);
    }

    private boolean checkID(String ID) throws FileNotFoundException, IOException {
        FileReader input = new FileReader("Application.txt");
        BufferedReader buffer = new BufferedReader(input);

        String line;
        while ((line = buffer.readLine()) != null) {
            String[] fields = line.split("!");
            if (fields.length >= 1 && fields[0].equals(ID)) {
                buffer.close();
                input.close();
                return true;
            }
        }

        buffer.close();
        input.close();
        return false;
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnBack;
    private javax.swing.JButton btnDelete;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTextArea tfView;
    // End of variables declaration//GEN-END:variables
}
