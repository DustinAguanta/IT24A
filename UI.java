
package finance;
import java.util.LinkedList;
import java.text.SimpleDateFormat;
import java.util.Date;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

public class UI extends javax.swing.JFrame {
     private double totalBalance = 10000.0;
     
  private DefaultTableModel historyTableModel;
  private DefaultTableModel originalTableModel;

    public UI() {
        initComponents();
          initializeTableModel();
           updateTotalBalanceLabel();
    }
     private void updateTotalBalanceLabel() {
        TotalBalance.setText("₱ : " + totalBalance);
    }
    private void deductAmount(double amount) {
        if (amount <= totalBalance) {
            totalBalance -= amount;
            updateTotalBalanceLabel();
        } else {
            javax.swing.JOptionPane.showMessageDialog(this, "Insufficient balance for this transaction.");
        }
    }

    private void updateHistoryTable(String transactionType, String receiver, String amount, String dateTime) {
        historyTableModel.addRow(new Object[]{transactionType, receiver, amount, dateTime});
    }
  private String getCurrentDateTime() {
        return java.time.LocalDateTime.now().toString();
    }
  private void showAllButtonActionPerformed(java.awt.event.ActionEvent evt) {
    // Restore the table to display the original data
    historytable.setModel(originalTableModel);
}

  private void initializeTableModel() {
    originalTableModel = new DefaultTableModel(new Object[]{"Transaction", "Receiver", "Amount", "Date/Time"}, 0);
    historytable.setModel(new DefaultTableModel(new Object[]{"Transaction", "Receiver", "Amount", "Date/Time"}, 0));
}

private void addToHistory(String transaction, String receiver, double amount) {
    String dateTime = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss").format(new Date());
    Object[] row = new Object[]{transaction, receiver, "₱" + amount, dateTime};

    originalTableModel.addRow(row);
    ((DefaultTableModel) historytable.getModel()).addRow(row);
}

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        balancecontainer = new javax.swing.JPanel();
        TotalBalance = new javax.swing.JLabel();
        PayBillsButton = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        historytable = new javax.swing.JTable();
        GamblingButton = new javax.swing.JButton();
        LoadButton = new javax.swing.JButton();
        SendMoneyButton = new javax.swing.JButton();
        BankButton = new javax.swing.JButton();
        linklist = new javax.swing.JButton();
        linklistbase = new javax.swing.JComboBox<>();
        jLabel1 = new javax.swing.JLabel();
        sendmoneyreceiver1 = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        banktransactionamount = new javax.swing.JComboBox<>();
        sendmoneyAmount = new javax.swing.JTextField();
        paybillsreceiver1 = new javax.swing.JComboBox<>();
        paybillsamount1 = new javax.swing.JTextField();
        Gamblingreceiver1 = new javax.swing.JComboBox<>();
        banktransaction = new javax.swing.JComboBox<>();
        loadreceiver2 = new javax.swing.JComboBox<>();
        Gamblingamount1 = new javax.swing.JTextField();
        loadamount1 = new javax.swing.JComboBox<>();
        jLabel3 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setBackground(new java.awt.Color(204, 204, 204));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        balancecontainer.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0), 5));

        TotalBalance.setFont(new java.awt.Font("Segoe UI Black", 1, 36)); // NOI18N
        TotalBalance.setText("₱ : 10,000");

        javax.swing.GroupLayout balancecontainerLayout = new javax.swing.GroupLayout(balancecontainer);
        balancecontainer.setLayout(balancecontainerLayout);
        balancecontainerLayout.setHorizontalGroup(
            balancecontainerLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, balancecontainerLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(TotalBalance, javax.swing.GroupLayout.DEFAULT_SIZE, 298, Short.MAX_VALUE)
                .addContainerGap())
        );
        balancecontainerLayout.setVerticalGroup(
            balancecontainerLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, balancecontainerLayout.createSequentialGroup()
                .addComponent(TotalBalance)
                .addGap(0, 0, Short.MAX_VALUE))
        );

        jPanel1.add(balancecontainer, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 60, 320, 60));

        PayBillsButton.setFont(new java.awt.Font("Segoe UI Black", 1, 12)); // NOI18N
        PayBillsButton.setText("Pay Bills");
        PayBillsButton.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        PayBillsButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                PayBillsButtonActionPerformed(evt);
            }
        });
        jPanel1.add(PayBillsButton, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 200, 100, 30));

        historytable.setBorder(new javax.swing.border.MatteBorder(null));
        historytable.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Transaction", "Receiver", "Amount", "Date/Time"
            }
        ));
        jScrollPane1.setViewportView(historytable);

        jPanel1.add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(342, 10, 440, 330));

        GamblingButton.setFont(new java.awt.Font("Segoe UI Black", 1, 12)); // NOI18N
        GamblingButton.setText("Gambling");
        GamblingButton.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        GamblingButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                GamblingButtonActionPerformed(evt);
            }
        });
        jPanel1.add(GamblingButton, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 250, 100, 30));

        LoadButton.setFont(new java.awt.Font("Segoe UI Black", 1, 12)); // NOI18N
        LoadButton.setText("Load");
        LoadButton.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        LoadButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                LoadButtonActionPerformed(evt);
            }
        });
        jPanel1.add(LoadButton, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 300, 100, 30));

        SendMoneyButton.setFont(new java.awt.Font("Segoe UI Black", 1, 12)); // NOI18N
        SendMoneyButton.setText("Send Money");
        SendMoneyButton.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        SendMoneyButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                SendMoneyButtonActionPerformed(evt);
            }
        });
        jPanel1.add(SendMoneyButton, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 150, 100, 30));

        BankButton.setFont(new java.awt.Font("Segoe UI Black", 1, 12)); // NOI18N
        BankButton.setText("Bank");
        BankButton.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        BankButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BankButtonActionPerformed(evt);
            }
        });
        jPanel1.add(BankButton, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 340, 100, 20));

        linklist.setFont(new java.awt.Font("Segoe UI Black", 1, 12)); // NOI18N
        linklist.setText("Display");
        linklist.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        linklist.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                linklistActionPerformed(evt);
            }
        });
        jPanel1.add(linklist, new org.netbeans.lib.awtextra.AbsoluteConstraints(570, 350, 90, 30));

        linklistbase.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Send Money", "Pay Bills", "Gambling", "Load", "all" }));
        linklistbase.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                linklistbaseActionPerformed(evt);
            }
        });
        jPanel1.add(linklistbase, new org.netbeans.lib.awtextra.AbsoluteConstraints(670, 350, 110, 30));

        jLabel1.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jLabel1.setText("Amount");
        jPanel1.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(240, 130, -1, -1));

        sendmoneyreceiver1.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        sendmoneyreceiver1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                sendmoneyreceiver1ActionPerformed(evt);
            }
        });
        jPanel1.add(sendmoneyreceiver1, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 150, 100, 30));

        jLabel2.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jLabel2.setText("Receiver");
        jPanel1.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 130, -1, -1));

        banktransactionamount.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        banktransactionamount.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "100", "500", "1000", "2000", "5000", "10000" }));
        banktransactionamount.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                banktransactionamountActionPerformed(evt);
            }
        });
        jPanel1.add(banktransactionamount, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 370, 100, 20));

        sendmoneyAmount.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        sendmoneyAmount.setText("₱ :");
        sendmoneyAmount.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                sendmoneyAmountActionPerformed(evt);
            }
        });
        jPanel1.add(sendmoneyAmount, new org.netbeans.lib.awtextra.AbsoluteConstraints(230, 150, 100, 30));

        paybillsreceiver1.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        paybillsreceiver1.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Shoppy", "Lazada", "Water district", "Meralco", "Honda", "foodpanda", "JMT" }));
        paybillsreceiver1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                paybillsreceiver1ActionPerformed(evt);
            }
        });
        jPanel1.add(paybillsreceiver1, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 200, 100, 30));

        paybillsamount1.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        paybillsamount1.setText("₱ :");
        paybillsamount1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                paybillsamount1ActionPerformed(evt);
            }
        });
        jPanel1.add(paybillsamount1, new org.netbeans.lib.awtextra.AbsoluteConstraints(230, 200, 100, 30));

        Gamblingreceiver1.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        Gamblingreceiver1.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Super Ace", "Online Sabong", "Color game", "Bingo", "Dragon Tiger", "pira o bayong", " " }));
        jPanel1.add(Gamblingreceiver1, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 250, 100, 30));

        banktransaction.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        banktransaction.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Deposit", "Withdraw" }));
        banktransaction.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                banktransactionActionPerformed(evt);
            }
        });
        jPanel1.add(banktransaction, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 370, 100, 20));

        loadreceiver2.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        loadreceiver2.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "TM", "SMART", "TNT", "GLOBE", "PLDT", "FIBER" }));
        loadreceiver2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                loadreceiver2ActionPerformed(evt);
            }
        });
        jPanel1.add(loadreceiver2, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 300, 100, 30));

        Gamblingamount1.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        Gamblingamount1.setText("₱ :");
        Gamblingamount1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Gamblingamount1ActionPerformed(evt);
            }
        });
        jPanel1.add(Gamblingamount1, new org.netbeans.lib.awtextra.AbsoluteConstraints(230, 250, 100, 30));

        loadamount1.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        loadamount1.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "10", "20", "30", "50", "70", "99" }));
        loadamount1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                loadamount1ActionPerformed(evt);
            }
        });
        jPanel1.add(loadamount1, new org.netbeans.lib.awtextra.AbsoluteConstraints(230, 300, 100, 30));

        jLabel3.setFont(new java.awt.Font("Serif", 1, 24)); // NOI18N
        jLabel3.setText("personal finance system");
        jPanel1.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 10, 260, 40));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, 792, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, 401, javax.swing.GroupLayout.PREFERRED_SIZE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents
 
   
    private void PayBillsButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_PayBillsButtonActionPerformed
        try {
        double amount = Double.parseDouble(paybillsamount1.getText().replace("₱ :", ""));
        String receiver = paybillsreceiver1.getSelectedItem().toString();

        deductAmount(amount);
        addToHistory("Pay Bills", receiver, amount);

        // Clear input fields
        paybillsamount1.setText("");
        paybillsreceiver1.setSelectedIndex(0);
    } catch (NumberFormatException e) {
        javax.swing.JOptionPane.showMessageDialog(this, "Please enter a valid amount.");
    }
    }//GEN-LAST:event_PayBillsButtonActionPerformed

    private void GamblingButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_GamblingButtonActionPerformed
         try {
        double amount = Double.parseDouble(Gamblingamount1.getText().replace("₱ :", ""));
        String receiver = Gamblingreceiver1.getSelectedItem().toString();

        deductAmount(amount);
        addToHistory("Gambling", receiver, amount);

        // Clear input fields
        Gamblingamount1.setText("");
        Gamblingreceiver1.setSelectedIndex(0);
    } catch (NumberFormatException e) {
        javax.swing.JOptionPane.showMessageDialog(this, "Please enter a valid amount.");
    }
    }//GEN-LAST:event_GamblingButtonActionPerformed

    private void LoadButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_LoadButtonActionPerformed
         try {
        double amount = Double.parseDouble(loadamount1.getSelectedItem().toString());
        String receiver = loadreceiver2.getSelectedItem().toString();

        deductAmount(amount);
        addToHistory("Load", receiver, amount);

        // Clear input fields
        loadamount1.setSelectedIndex(0);
        loadreceiver2.setSelectedIndex(0);
    } catch (NumberFormatException e) {
        javax.swing.JOptionPane.showMessageDialog(this, "Please enter a valid amount.");
    }
    }//GEN-LAST:event_LoadButtonActionPerformed

    private void SendMoneyButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_SendMoneyButtonActionPerformed
      try {
        double amount = Double.parseDouble(sendmoneyAmount.getText().replace("₱ :", ""));
        String receiver = sendmoneyreceiver1.getText();

        if (receiver.isEmpty()) {
            javax.swing.JOptionPane.showMessageDialog(this, "Please enter a valid receiver.");
            return;
        }

        deductAmount(amount);
        addToHistory("Send Money", receiver, amount);

        // Clear input fields
        sendmoneyAmount.setText("");
        sendmoneyreceiver1.setText("");
    } catch (NumberFormatException e) {
        javax.swing.JOptionPane.showMessageDialog(this, "Please enter a valid amount.");
    }
    }//GEN-LAST:event_SendMoneyButtonActionPerformed
 
    private void BankButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BankButtonActionPerformed
         try {
        double amount = Double.parseDouble(banktransactionamount.getSelectedItem().toString());
        String action = banktransaction.getSelectedItem().toString();

        if ("Withdraw".equals(action)) {
            deductAmount(amount);
            addToHistory("Bank Withdraw", "Self", amount);
        } else if ("Deposit".equals(action)) {
            totalBalance += amount;
            updateTotalBalanceLabel();
            addToHistory("Bank Deposit", "Self", amount);
        }

        // Clear input fields
        banktransactionamount.setSelectedIndex(0);
        banktransaction.setSelectedIndex(0);
    } catch (NumberFormatException e) {
        javax.swing.JOptionPane.showMessageDialog(this, "Please enter a valid amount.");
    }
    }//GEN-LAST:event_BankButtonActionPerformed
 
    private void linklistActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_linklistActionPerformed
      String selectedCategory = linklistbase.getSelectedItem().toString(); // Get the selected category

    // Check if the selected category is "All"
    if (selectedCategory.equalsIgnoreCase("All")) {
        // Restore the original table model to display all data
        historytable.setModel(originalTableModel);
        return;
    }

    // Create a new temporary table model for filtering
    DefaultTableModel filteredModel = new DefaultTableModel(new Object[]{"Transaction", "Receiver", "Amount", "Date/Time"}, 0);
    LinkedList<TransactionRecord> filteredHistory = new LinkedList<>();
    // Iterate through the rows of the original model
    for (int i = 0; i < originalTableModel.getRowCount(); i++) {
        String transaction = originalTableModel.getValueAt(i, 0).toString(); // Transaction column

        // Check if the transaction matches the selected category
        if (transaction.equalsIgnoreCase(selectedCategory)) {
            Object[] row = new Object[]{
                originalTableModel.getValueAt(i, 0), // Transaction
                originalTableModel.getValueAt(i, 1), // Receiver
                originalTableModel.getValueAt(i, 2), // Amount
                originalTableModel.getValueAt(i, 3)  // Date/Time
            };
            filteredModel.addRow(row); // Add matching row to the filtered model
        }
    }

    // Update the table with the filtered model
    historytable.setModel(filteredModel);

    // Show a message if no matching records are found
    if (filteredModel.getRowCount() == 0) {
        javax.swing.JOptionPane.showMessageDialog(this, "No records found for the selected category: " + selectedCategory);
    }
    }//GEN-LAST:event_linklistActionPerformed

    private void sendmoneyAmountActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_sendmoneyAmountActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_sendmoneyAmountActionPerformed

    private void paybillsamount1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_paybillsamount1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_paybillsamount1ActionPerformed

    private void banktransactionamountActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_banktransactionamountActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_banktransactionamountActionPerformed

    private void banktransactionActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_banktransactionActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_banktransactionActionPerformed
 
    private void loadreceiver2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_loadreceiver2ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_loadreceiver2ActionPerformed

    private void Gamblingamount1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Gamblingamount1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_Gamblingamount1ActionPerformed

    private void loadamount1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_loadamount1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_loadamount1ActionPerformed

    private void linklistbaseActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_linklistbaseActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_linklistbaseActionPerformed

    private void sendmoneyreceiver1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_sendmoneyreceiver1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_sendmoneyreceiver1ActionPerformed

    private void paybillsreceiver1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_paybillsreceiver1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_paybillsreceiver1ActionPerformed

    /**
     * @param args the command line arguments
     */
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
            java.util.logging.Logger.getLogger(UI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(UI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(UI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(UI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new UI().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton BankButton;
    private javax.swing.JButton GamblingButton;
    private javax.swing.JTextField Gamblingamount1;
    private javax.swing.JComboBox<String> Gamblingreceiver1;
    private javax.swing.JButton LoadButton;
    private javax.swing.JButton PayBillsButton;
    private javax.swing.JButton SendMoneyButton;
    private javax.swing.JLabel TotalBalance;
    private javax.swing.JPanel balancecontainer;
    private javax.swing.JComboBox<String> banktransaction;
    private javax.swing.JComboBox<String> banktransactionamount;
    private javax.swing.JTable historytable;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JButton linklist;
    private javax.swing.JComboBox<String> linklistbase;
    private javax.swing.JComboBox<String> loadamount1;
    private javax.swing.JComboBox<String> loadreceiver2;
    private javax.swing.JTextField paybillsamount1;
    private javax.swing.JComboBox<String> paybillsreceiver1;
    private javax.swing.JTextField sendmoneyAmount;
    private javax.swing.JTextField sendmoneyreceiver1;
    // End of variables declaration//GEN-END:variables

    private static class TransactionRecord {

        public TransactionRecord() {
        }
    }

  
   
}
