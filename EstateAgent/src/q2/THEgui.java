package q2;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import javax.swing.JComboBox;
import javax.swing.JOptionPane;


public class THEgui extends javax.swing.JFrame {
    //create and populate the location and info arrays
    String [] location = {"Cape Town", "Durban", "Pretoria"};
    String [] info = {};
    
    public THEgui() {
        //set the title of the jframe
        setTitle("Estate Agent Report");
        initComponents();
    }

 public void populateLocation() {
     //for loop as the user can add a location an indefinite amount of times
     for(int x=0; x< location.length; x++){
        //saves the selected comboBox item to the location array
         this.cmbLocation.addItem(location[x]);
     }
 }
     private void populateInfo() {
         //for loop as the user can add a location an indefinite amount of times
     for(int x=0; x< info.length; x++){
         //saves the name, price, and percentage to the info array
         this.txtName.setText(info[x]);
         this.txtPrice.setText(info[x]);
         this.txtPercentage.setText(info[x]);
 }
     }
 public void writeToFile() {
     //https://www.geeksforgeeks.org/java-program-to-write-into-a-file/?ref=header_search
     //writes the saved data to a txt file called report.txt
     File file = new File("report.txt");
     try{
         //creates a file on the users device if it doesnt already exist
         if(!file.exists()){
             file.createNewFile();
         }
         FileWriter fw = new FileWriter(file,true);
         BufferedWriter bw = new BufferedWriter(fw);
         
         //output that prints to the txt file
        String text = "";
        text += "ESTATE AGENT REPORT\n";
        text += "****************************************************************\n";
        text += "AGENT LOCATION: " + cmbLocation.getSelectedItem().toString() + "\n";
        text += "AGENT NAME: " + txtName.getText() + "\n";
        text += "PROPERTY PRICE: " + txtPrice.getText() + "\n";
        text += "COMMISSION PERCENTAGE: " + txtPercentage.getText() + "%" + "\n";
        text += "COMMISSION EARNED: " + calculateCommission() + "\n";
        text += "****************************************************************\n";
       
  bw.write(text);
  //closes the buffered writer and file writer
  bw.close();
  fw.close();
        
        readFromFile();
    } catch (IOException ex) {
        //catch any exceptions that may occur and prints it as a single line on a joptionpane
        JOptionPane.showMessageDialog(null, ex);
    }
 }
 
 public void readFromFile(){
     //reads the information written to the txt file
      try (BufferedReader br = new BufferedReader(new FileReader("report.txt"))) {
        StringBuilder report = new StringBuilder();
        String strCurrentLine;
        
        //reads each line from the file and appends it to the report string
        while ((strCurrentLine = br.readLine()) != null) {
            report.append(strCurrentLine).append("\n");
        }
        
        //sets the report output to the textArea
        txtOutput.setText(report.toString());
    } catch (IOException e) {
        //catches the exceptions
        JOptionPane.showMessageDialog(null, e);
    }
 }


    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        cmbLocation = new javax.swing.JComboBox<>();
        txtName = new javax.swing.JTextField();
        txtPrice = new javax.swing.JTextField();
        txtPercentage = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        txtOutput = new javax.swing.JTextArea();
        jMenuBar1 = new javax.swing.JMenuBar();
        mnuFile = new javax.swing.JMenu();
        btnExit = new javax.swing.JMenuItem();
        mnuTools = new javax.swing.JMenu();
        btnProc = new javax.swing.JMenuItem();
        btnClear = new javax.swing.JMenuItem();
        btnSave = new javax.swing.JMenuItem();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jLabel1.setText("AGENT LOCATION:");

        jLabel2.setText("ESTATE AGENT NAME:");

        jLabel3.setText("PROPERTY PRICE:");

        jLabel4.setText("COMMISSION PERCENTAGE:");

        cmbLocation.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Cape Town", "Durban", "Pretoria" }));

        txtPrice.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtPriceActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel1)
                    .addComponent(jLabel2)
                    .addComponent(jLabel3)
                    .addComponent(jLabel4))
                .addGap(49, 49, 49)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(txtPrice, javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(txtPercentage)
                    .addComponent(cmbLocation, javax.swing.GroupLayout.Alignment.TRAILING, 0, 237, Short.MAX_VALUE)
                    .addComponent(txtName))
                .addContainerGap())
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(17, 17, 17)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(cmbLocation, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(10, 10, 10)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jLabel2)
                    .addComponent(txtName, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(19, 19, 19)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(txtPrice, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel4)
                    .addComponent(txtPercentage, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(48, Short.MAX_VALUE))
        );

        jLabel5.setText("ESTATE AGENT REPORT:");

        txtOutput.setColumns(20);
        txtOutput.setRows(5);
        jScrollPane1.setViewportView(txtOutput);

        mnuFile.setText("File");

        btnExit.setText("Exit");
        btnExit.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnExitActionPerformed(evt);
            }
        });
        mnuFile.add(btnExit);

        jMenuBar1.add(mnuFile);

        mnuTools.setText("Tools");

        btnProc.setText("Proccess Report");
        btnProc.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnProcActionPerformed(evt);
            }
        });
        mnuTools.add(btnProc);

        btnClear.setText("Clear");
        btnClear.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnClearActionPerformed(evt);
            }
        });
        mnuTools.add(btnClear);

        btnSave.setText("Save Report");
        btnSave.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSaveActionPerformed(evt);
            }
        });
        mnuTools.add(btnSave);

        jMenuBar1.add(mnuTools);

        setJMenuBar(jMenuBar1);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(37, 37, 37)
                        .addComponent(jLabel5))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(15, 15, 15)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 498, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addContainerGap(21, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(30, 30, 30)
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel5)
                .addGap(18, 18, 18)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 197, Short.MAX_VALUE)
                .addGap(27, 27, 27))
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void txtPriceActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtPriceActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtPriceActionPerformed

    private void btnProcActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnProcActionPerformed
        // TODO add your handling code here:
        if(validateInputs()) {
           //if the inputs are valid, the program proccesses the report and prints to text area
     String report = "Agent Location: " + cmbLocation.getSelectedItem() + "\n" +
             "Agent Name: " + txtName.getText() + "\n" +
             "Property Price: " + txtPrice.getText() + "\n" +
             "Commission Percentage: " + txtPercentage.getText() + "%" + "\n" +
             "Commission Earned: " + calculateCommission();
             txtOutput.setText(report);
            } else {
            //error message to be displayed if field/s are empty
                JOptionPane.showMessageDialog(this, "Please fill out all fields");
            }

    }//GEN-LAST:event_btnProcActionPerformed
public double calculateCommission(){
    //method to calculate the commission
    double price = Double.parseDouble(txtPrice.getText());
    double percentage = Double.parseDouble(txtPercentage.getText());
    return price * (percentage / 100);
}
    private void btnClearActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnClearActionPerformed
        //method to clear the text fields
        txtName.setText("");
        txtPrice.setText("");
        txtPercentage.setText("");
        txtOutput.setText("");
    }//GEN-LAST:event_btnClearActionPerformed

    private void btnSaveActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSaveActionPerformed
        //when save is pressed, it calls the writeToFile() method to write the info to the txt file
        writeToFile(); 
    }//GEN-LAST:event_btnSaveActionPerformed

    private void btnExitActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnExitActionPerformed
        //exits the application
        System.exit(0);
    }//GEN-LAST:event_btnExitActionPerformed
 
    public boolean validateInputs(){
         //validates the user input to ensure there are no blank fields. 
          //https://stackoverflow.com/questions/23669004/how-to-check-if-a-text-field-is-not-empty-in-java-contains-integer-value
         String agentLocation = cmbLocation.getSelectedItem().toString();
         String agentName = txtName.getText();
         double Price;
         double Percentage;
     
     try{
         //try to ensure price and percentage arent 0
    Price = Double.parseDouble(txtPrice.getText());
    Percentage = Double.parseDouble(txtPercentage.getText().toString());
     return !agentLocation.isEmpty() && !agentName.isEmpty() &&
                    Price > 0 && Percentage > 0;
        } catch (NumberFormatException e) {
            //catches the expection and returns false if one of the variables are 0
            return false;
        }
}


    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(THEgui.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(THEgui.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(THEgui.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(THEgui.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new THEgui().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JMenuItem btnClear;
    private javax.swing.JMenuItem btnExit;
    private javax.swing.JMenuItem btnProc;
    private javax.swing.JMenuItem btnSave;
    private javax.swing.JComboBox<String> cmbLocation;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JMenu mnuFile;
    private javax.swing.JMenu mnuTools;
    private javax.swing.JTextField txtName;
    private javax.swing.JTextArea txtOutput;
    private javax.swing.JTextField txtPercentage;
    private javax.swing.JTextField txtPrice;
    // End of variables declaration//GEN-END:variables

    //make these variables public to test them in the test class
    //https://stackoverflow.com/questions/9306207/how-to-make-a-private-swing-component-a-public-one-in-java
    public javax.swing.JTextField getTxtPrice() {
    return txtPrice;
}
public javax.swing.JTextField getTxtName() {
    return txtName;
}
public JComboBox<String> getcmbLocation() {
    return cmbLocation;
}
public javax.swing.JTextField getTxtPercentage() {
    return txtPercentage;
}
}
