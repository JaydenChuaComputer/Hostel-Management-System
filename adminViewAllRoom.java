package Assignment_test;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;

public class adminViewAllRoom extends javax.swing.JFrame {

    private String line;
    private String ID;
            
    public adminViewAllRoom() {
        initComponents();
        try {
            input = new FileReader("roomData.txt");
        } catch (FileNotFoundException ex) {
            Logger.getLogger(adminViewAllRoom.class.getName()).log(Level.SEVERE, null, ex);
        }
        BufferedReader reader = new BufferedReader(input);

        StringBuilder data = new StringBuilder();
        try {
            while ((line = reader.readLine()) != null) {
                String[] fields = line.split("!");
                data.append("Room Type ID: ").append(fields[0]).append("\n");
                data.append("Facilities: ").append(fields[1]).append("\n");
                data.append("Total Num Of Bed: ").append(fields[2]).append("\n");
                data.append("Bed ID: ").append(fields[3]).append("\n");
                data.append("Bed Available: ").append(fields[4]).append("\n");
                data.append("Fee(RM): ").append(fields[5]).append("\n");
                data.append("People Per Room: ").append(fields[6]).append("\n\n");
            }
        } catch (IOException ex) {
            Logger.getLogger(adminViewAllRoom.class.getName()).log(Level.SEVERE, null, ex);
        }

        try {
            reader.close();
        } catch (IOException ex) {
            Logger.getLogger(adminViewAllRoom.class.getName()).log(Level.SEVERE, null, ex);
        }

        // set the data string to the text area
        tfRoomDetails.setText(data.toString());
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jScrollPane1 = new javax.swing.JScrollPane();
        tfRoomDetails = new javax.swing.JTextArea();
        jLabel1 = new javax.swing.JLabel();
        btnBack = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();
        btnDelete = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("View All Room Details");

        tfRoomDetails.setEditable(false);
        tfRoomDetails.setColumns(20);
        tfRoomDetails.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N
        tfRoomDetails.setRows(5);
        jScrollPane1.setViewportView(tfRoomDetails);

        jLabel1.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        jLabel1.setText("View All Room Details");

        btnBack.setText("Back");
        btnBack.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnBackActionPerformed(evt);
            }
        });

        jLabel2.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jLabel2.setText("Here is all the room details of the hostel.");

        btnDelete.setText("Delete Room");
        btnDelete.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnDeleteActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(7, 7, 7)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(btnDelete)
                        .addGap(80, 80, 80)
                        .addComponent(btnBack))
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addComponent(jLabel2)
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 416, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel1)
                .addGap(101, 101, 101))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1)
                .addGap(18, 18, 18)
                .addComponent(jLabel2)
                .addGap(18, 18, 18)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 303, Short.MAX_VALUE)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnDelete)
                    .addComponent(btnBack))
                .addContainerGap())
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void btnBackActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnBackActionPerformed
        adminViewRoom adminViewRoom = new adminViewRoom();
        adminViewRoom.setVisible(true);
        setVisible(false);
    }//GEN-LAST:event_btnBackActionPerformed

    FileReader input;
    roomDataIO roomDataIO = new roomDataIO();

    private void btnDeleteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnDeleteActionPerformed
        ID = JOptionPane.showInputDialog("Please enter the room type ID.");
        try {
            if (roomDataIO.checkID(ID)) {
                roomDataIO.deleteRoom(ID);
                JOptionPane.showMessageDialog(null, "Deletion for " + ID + " is successfully");
                tfRoomDetails.setText("");
            } else {
                JOptionPane.showMessageDialog(null, "Invalid room type ID, please try again.");
            }
        } catch (IOException ex) {
            Logger.getLogger(adminApplication.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_btnDeleteActionPerformed

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnBack;
    private javax.swing.JButton btnDelete;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTextArea tfRoomDetails;
    // End of variables declaration//GEN-END:variables
}
