package Assignment_test;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.logging.Level;
import java.util.logging.Logger;

public class studentViewRoom extends javax.swing.JFrame {

    private String line;
    private boolean success;

    public studentViewRoom() {
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
                if (available > 0) {
                    success = true;
                    data.append("Room Type ID: ").append(fields[0]).append("\n");
                    data.append("Facilities: ").append(fields[1]).append("\n");
                    data.append("Room Available: ").append(fields[4]).append("\n");
                    data.append("Fee(RM): ").append(fields[5]).append("\n");
                    data.append("People Per Room: ").append(fields[6]).append("\n\n");
                }
            }

        } catch (IOException ex) {
            Logger.getLogger(adminViewAllRoom.class.getName()).log(Level.SEVERE, null, ex);
        }

        try {
            // close the reader
            reader.close();
        } catch (IOException ex) {
            Logger.getLogger(adminViewAllRoom.class.getName()).log(Level.SEVERE, null, ex);
        }

        if (success == true) {
            // set the data string to the text area
            tfRoomDetails.setText(data.toString());
        } else {
            tfRoomDetails.setText("Currently there are no any available room.");
        }
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jScrollPane1 = new javax.swing.JScrollPane();
        tfRoomDetails = new javax.swing.JTextArea();
        jLabel1 = new javax.swing.JLabel();
        btnBack = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("View Available Room Details");

        tfRoomDetails.setEditable(false);
        tfRoomDetails.setColumns(20);
        tfRoomDetails.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N
        tfRoomDetails.setRows(5);
        jScrollPane1.setViewportView(tfRoomDetails);

        jLabel1.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        jLabel1.setText("View Available Room Details");

        btnBack.setText("Back");
        btnBack.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnBackActionPerformed(evt);
            }
        });

        jLabel2.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jLabel2.setText("Here is all the available room details of the hostel.");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane1)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel2)
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addComponent(btnBack)))
                .addContainerGap())
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(70, Short.MAX_VALUE)
                .addComponent(jLabel1)
                .addGap(65, 65, 65))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(18, 18, 18)
                .addComponent(jLabel1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jLabel2)
                .addGap(18, 18, 18)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 308, Short.MAX_VALUE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(btnBack)
                .addContainerGap())
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void btnBackActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnBackActionPerformed
        studentMenu studentMenu = new studentMenu();
        studentMenu.setVisible(true);
        setVisible(false);
    }//GEN-LAST:event_btnBackActionPerformed

    FileReader input;

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnBack;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTextArea tfRoomDetails;
    // End of variables declaration//GEN-END:variables
}
