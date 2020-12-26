import java.sql.*;
import javax.swing.*;

public class account_master extends javax.swing.JFrame {
Connection con;
ResultSet rs;
Statement stmt;
boolean addFlag;
int id;
    
    public account_master() {
        initComponents();
        enableDisable(false);
        load_data();
        
    }
    private void load_data(){
      try{
        Connection con = db.getConnection();
       rs = con.prepareStatement("select * from account_master").executeQuery();
       rs.next();
       display_data();
      } 
      catch(Exception e){
          JOptionPane.showMessageDialog(null, e);
      }
    }
    
    private void display_data(){
        try{
            id = rs.getInt("acc_id");
            name.setText(rs.getString("acc_name"));
             address.setText(rs.getString("acc_address"));
              mobile.setText(rs.getString("acc_mobile"));
               open.setText(rs.getString("opening_amnt"));
               cmb1.setSelectedItem(rs.getString("acc_type"));
               cmb2.setSelectedItem(rs.getString("opening_type"));
               
        }
        catch(Exception e){
            JOptionPane.showMessageDialog(null, e);
        }
        
    }

    private void enableDisable(boolean flag){
        name.setEnabled(flag);
         address.setEnabled(flag);
          mobile.setEnabled(flag);
           open.setEnabled(flag);
           cmb1.setEnabled(flag);
           cmb2.setEnabled(flag);
            save.setEnabled(flag);
                 cancel.setEnabled(flag);
           
           first.setEnabled(!flag);
            previous.setEnabled(!flag);
             next.setEnabled(!flag);
              last.setEnabled(!flag);
              add.setEnabled(!flag);
              edit.setEnabled(!flag);
                   find.setEnabled(!flag);
                    delete.setEnabled(!flag);
    }
    
    private void empty(){
        name.setText("");
        address.setText("");
        mobile.setText("");
        open.setText("");
        cmb1.setSelectedIndex(0);
        cmb2.setSelectedIndex(0);
        
    }
    
   
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        name = new javax.swing.JTextField();
        mobile = new javax.swing.JTextField();
        address = new javax.swing.JTextField();
        open = new javax.swing.JTextField();
        cmb1 = new javax.swing.JComboBox();
        cmb2 = new javax.swing.JComboBox();
        first = new javax.swing.JButton();
        previous = new javax.swing.JButton();
        last = new javax.swing.JButton();
        next = new javax.swing.JButton();
        add = new javax.swing.JButton();
        save = new javax.swing.JButton();
        cancel = new javax.swing.JButton();
        edit = new javax.swing.JButton();
        find = new javax.swing.JButton();
        delete = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 14));
        jLabel1.setText("Name:");

        jLabel2.setFont(new java.awt.Font("Tahoma", 1, 14));
        jLabel2.setText("Address:");

        jLabel3.setFont(new java.awt.Font("Tahoma", 1, 14));
        jLabel3.setText("Mobile No.:");

        jLabel4.setFont(new java.awt.Font("Tahoma", 1, 14));
        jLabel4.setText("Account Type:");

        jLabel5.setFont(new java.awt.Font("Tahoma", 1, 14));
        jLabel5.setText("Opening Amount:");

        jLabel6.setFont(new java.awt.Font("Tahoma", 1, 14));
        jLabel6.setText("Opening Type:");

        mobile.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                mobileActionPerformed(evt);
            }
        });

        cmb1.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Customer", "Supplier" }));

        cmb2.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Lendari", "Dendari" }));

        first.setFont(new java.awt.Font("Tahoma", 1, 14));
        first.setText("<<");
        first.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                firstActionPerformed(evt);
            }
        });

        previous.setFont(new java.awt.Font("Tahoma", 1, 14));
        previous.setText("<");
        previous.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                previousActionPerformed(evt);
            }
        });

        last.setFont(new java.awt.Font("Tahoma", 1, 14));
        last.setText(">>");
        last.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                lastActionPerformed(evt);
            }
        });

        next.setFont(new java.awt.Font("Tahoma", 1, 14));
        next.setText(">");
        next.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                nextActionPerformed(evt);
            }
        });

        add.setFont(new java.awt.Font("Tahoma", 1, 16));
        add.setText("ADD");
        add.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                addActionPerformed(evt);
            }
        });

        save.setFont(new java.awt.Font("Tahoma", 1, 16));
        save.setText("SAVE");
        save.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                saveActionPerformed(evt);
            }
        });

        cancel.setFont(new java.awt.Font("Tahoma", 1, 16));
        cancel.setText("CANCEL");
        cancel.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cancelActionPerformed(evt);
            }
        });

        edit.setFont(new java.awt.Font("Tahoma", 1, 16));
        edit.setText("EDIT");
        edit.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                editActionPerformed(evt);
            }
        });

        find.setFont(new java.awt.Font("Tahoma", 1, 16));
        find.setText("FIND");
        find.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                findActionPerformed(evt);
            }
        });

        delete.setFont(new java.awt.Font("Tahoma", 1, 16));
        delete.setText("DELETE");
        delete.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                deleteActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(99, 99, 99)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jLabel5)
                            .addComponent(jLabel4)
                            .addComponent(jLabel3)
                            .addComponent(jLabel2)
                            .addComponent(jLabel1)
                            .addComponent(jLabel6))
                        .addGap(104, 104, 104)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                .addComponent(name, javax.swing.GroupLayout.PREFERRED_SIZE, 475, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(address, javax.swing.GroupLayout.PREFERRED_SIZE, 475, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(mobile, javax.swing.GroupLayout.PREFERRED_SIZE, 475, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(open, javax.swing.GroupLayout.PREFERRED_SIZE, 475, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(cmb1, javax.swing.GroupLayout.PREFERRED_SIZE, 254, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(cmb2, javax.swing.GroupLayout.PREFERRED_SIZE, 258, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(175, 175, 175)
                        .addComponent(first)
                        .addGap(70, 70, 70)
                        .addComponent(previous)
                        .addGap(67, 67, 67)
                        .addComponent(next)
                        .addGap(85, 85, 85)
                        .addComponent(last))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(77, 77, 77)
                        .addComponent(add)
                        .addGap(68, 68, 68)
                        .addComponent(save)
                        .addGap(71, 71, 71)
                        .addComponent(cancel)
                        .addGap(55, 55, 55)
                        .addComponent(edit)
                        .addGap(50, 50, 50)
                        .addComponent(find)
                        .addGap(41, 41, 41)
                        .addComponent(delete)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        layout.linkSize(javax.swing.SwingConstants.HORIZONTAL, new java.awt.Component[] {first, last, next, previous});

        layout.linkSize(javax.swing.SwingConstants.HORIZONTAL, new java.awt.Component[] {add, cancel, delete, edit, find, save});

        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(36, 36, 36)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(name, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(62, 62, 62)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(address, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(60, 60, 60)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(mobile, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(60, 60, 60)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel4)
                    .addComponent(cmb1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(59, 59, 59)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel5)
                    .addComponent(open, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(60, 60, 60)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel6)
                    .addComponent(cmb2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(49, 49, 49)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(first)
                    .addComponent(previous)
                    .addComponent(last)
                    .addComponent(next))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 68, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(add)
                    .addComponent(save)
                    .addComponent(cancel)
                    .addComponent(edit)
                    .addComponent(find)
                    .addComponent(delete))
                .addGap(57, 57, 57))
        );

        java.awt.Dimension screenSize = java.awt.Toolkit.getDefaultToolkit().getScreenSize();
        setBounds((screenSize.width-974)/2, (screenSize.height-744)/2, 974, 744);
    }// </editor-fold>//GEN-END:initComponents

private void mobileActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_mobileActionPerformed
// TODO add your handling code here:
}//GEN-LAST:event_mobileActionPerformed

private void addActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_addActionPerformed
// TODO add your handling code here:
    enableDisable(true);
    empty();
    addFlag = true;
}//GEN-LAST:event_addActionPerformed

private void cancelActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cancelActionPerformed
// TODO add your handling code here:
    System.exit(0);
}//GEN-LAST:event_cancelActionPerformed

private void editActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_editActionPerformed
// TODO add your handling code here:
    enableDisable(true);
    addFlag=false;
}//GEN-LAST:event_editActionPerformed

private void saveActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_saveActionPerformed
// TODO add your handling code here:
    
        if(addFlag==true){
            Connection con = db.getConnection();
            String a,b,c,d,f;
            a=name.getText();
            b=address.getText();
            c= mobile.getText();
            d=cmb1.getSelectedItem().toString();
            f=cmb2.getSelectedItem().toString();
            int amnt = Integer.parseInt(open.getText());
            String query = "insert into account_master(acc_name, acc_address, acc_mobile, acc_type, opening_type, opening_amnt, opening_date, closing_type, closing_amnt, closing_date) "
                    + "     values('"+a+"','"+b+"', '"+c+"', '"+d+"','"+f+"', '"+amnt+"', now(), '"+f+"', '"+amnt+"', now())";
            
          try{
              con.prepareStatement(query).executeUpdate();
              JOptionPane.showMessageDialog(null, "Data SAved");
          }
          catch(Exception e){
              JOptionPane.showMessageDialog(null, e);
          }
    }
        else{
        try{  
                Connection con = db.getConnection();
               
                PreparedStatement pt = con.prepareStatement("update account_master set acc_name = ? , acc_address = ? , closing_amnt=? where acc_mobile = ?");
        pt.setString(1, name.getText());
        pt.setString(2, address.getText());
        pt.setString(3, open.getText());
        pt.setString(4, mobile.getText());
        pt.execute();
        JOptionPane.showMessageDialog(null,"Data Updated");
           
           }
           catch(Exception e){
               JOptionPane.showMessageDialog(null, e);
           }
        }
}//GEN-LAST:event_saveActionPerformed

private void firstActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_firstActionPerformed
// TODO add your handling code here:
      try{
        rs.first();
        display_data();
    }
    catch(Exception e){
        
    }
}//GEN-LAST:event_firstActionPerformed

private void lastActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_lastActionPerformed
// TODO add your handling code here:
    try{
        rs.last();
        display_data();
    }
    catch(Exception e){
        
    }
}//GEN-LAST:event_lastActionPerformed

private void previousActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_previousActionPerformed
// TODO add your handling code here:
      try{
        if(rs.isFirst()){
            JOptionPane.showMessageDialog(this, "It is the first record");
        }
        else{
            rs.previous();
            display_data();
        }
    }
    catch(Exception e){
        
    }
}//GEN-LAST:event_previousActionPerformed

private void nextActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_nextActionPerformed
// TODO add your handling code here:
      try{
        if(rs.isLast()){
            JOptionPane.showMessageDialog(this, "It is the first record");
        }
        else{
            rs.next();
            display_data();
        }
    }
    catch(Exception e){
        
    }
}//GEN-LAST:event_nextActionPerformed

private void findActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_findActionPerformed
// TODO add your handling code here:
     String str = JOptionPane.showInputDialog(this,"Enter account id");
    try{
        boolean flagFind = false;
        rs.first();
        do{
            if(rs.getInt("acc_id")==Integer.parseInt(str)){
               flagFind = true;
               break;
            }
            
        }
        while(rs.next());
        if(flagFind==true){
            display_data();
        }
        else{
            JOptionPane.showMessageDialog(null, "not found");
        }
    }
    catch(Exception e){
        
    }
}//GEN-LAST:event_findActionPerformed

private void deleteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_deleteActionPerformed
// TODO add your handling code here:
    String str = JOptionPane.showInputDialog(this, "Enter account id");
    try{
         boolean flagFind = false;
        rs.first();
         do{
            if(rs.getInt("acc_id")==Integer.parseInt(str)){
               flagFind = true;
               break;
            }}
         
        while(rs.next());
        if(flagFind==true){
            
        Connection con = db.getConnection();
        stmt = con.createStatement();
           
                String query = "delete from account_master where acc_id = "+str+";";
                
          con.prepareStatement(query).executeUpdate();
            JOptionPane.showMessageDialog(null, "Record Successfully Deleted");
        }
        else{
            JOptionPane.showMessageDialog(null, "Record NOt Found");
        }
        }
    catch(Exception e){
        JOptionPane.showMessageDialog(null, e);
    }
    
}//GEN-LAST:event_deleteActionPerformed

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
            java.util.logging.Logger.getLogger(account_master.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(account_master.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(account_master.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(account_master.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {

            public void run() {
                new account_master().setVisible(true);
            }
        });
    }
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton add;
    private javax.swing.JTextField address;
    private javax.swing.JButton cancel;
    private javax.swing.JComboBox cmb1;
    private javax.swing.JComboBox cmb2;
    private javax.swing.JButton delete;
    private javax.swing.JButton edit;
    private javax.swing.JButton find;
    private javax.swing.JButton first;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JButton last;
    private javax.swing.JTextField mobile;
    private javax.swing.JTextField name;
    private javax.swing.JButton next;
    private javax.swing.JTextField open;
    private javax.swing.JButton previous;
    private javax.swing.JButton save;
    // End of variables declaration//GEN-END:variables
}
