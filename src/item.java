import java.sql.*;
import javax.swing.*;

public class item extends javax.swing.JFrame {
Connection con;
ResultSet rs;
Statement stmt;
boolean addFlag;
int id;
    /** Creates new form item */
    public item() {
        initComponents();
        enableDisable(false);
        load_data();
    }

    private void load_data(){
      try{
        Connection con = db.getConnection();
       rs = con.prepareStatement("select * from item").executeQuery();
       rs.next();
       display_data();
      } 
       catch(Exception e){
          JOptionPane.showMessageDialog(null, e);
      }
    }
        private void display_data(){
        try{
            id = rs.getInt("item_id");
            name.setText(rs.getString("item_name"));
            rate.setText(rs.getString("item_rate"));
          
        }
        catch(Exception e){
            JOptionPane.showMessageDialog(null, e);
        }
        
    }
        
        private void enableDisable(boolean flag){
            name.setEnabled(flag);
            rate.setEnabled(flag);
        }
     private void empty(){
         name.setText("");
         rate.setText("");
     }
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        name = new javax.swing.JTextField();
        rate = new javax.swing.JTextField();
        previous = new javax.swing.JButton();
        first = new javax.swing.JButton();
        next = new javax.swing.JButton();
        last = new javax.swing.JButton();
        add = new javax.swing.JButton();
        save = new javax.swing.JButton();
        cancel = new javax.swing.JButton();
        edit = new javax.swing.JButton();
        find = new javax.swing.JButton();
        delete = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 15));
        jLabel1.setText("Item Name:");

        jLabel2.setFont(new java.awt.Font("Tahoma", 1, 15));
        jLabel2.setText("Rate:");

        previous.setText("<");
        previous.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                previousActionPerformed(evt);
            }
        });

        first.setText("<<");
        first.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                firstActionPerformed(evt);
            }
        });

        next.setText(">");
        next.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                nextActionPerformed(evt);
            }
        });

        last.setText(">>");
        last.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                lastActionPerformed(evt);
            }
        });

        add.setText("ADD");
        add.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                addActionPerformed(evt);
            }
        });

        save.setText("SAVE");
        save.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                saveActionPerformed(evt);
            }
        });

        cancel.setText("CANCEL");
        cancel.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cancelActionPerformed(evt);
            }
        });

        edit.setText("EDIT");
        edit.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                editActionPerformed(evt);
            }
        });

        find.setText("FIND");
        find.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                findActionPerformed(evt);
            }
        });

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
                        .addGap(101, 101, 101)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jLabel2)
                            .addComponent(jLabel1))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(add)
                        .addGap(42, 42, 42)))
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(save)
                    .addComponent(first))
                .addGap(54, 54, 54)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(cancel)
                    .addComponent(previous, javax.swing.GroupLayout.PREFERRED_SIZE, 51, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(27, 27, 27)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                    .addComponent(name, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.PREFERRED_SIZE, 363, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(rate, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.PREFERRED_SIZE, 363, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(17, 17, 17)
                                .addComponent(next, javax.swing.GroupLayout.PREFERRED_SIZE, 69, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createSequentialGroup()
                                .addGap(25, 25, 25)
                                .addComponent(edit)))
                        .addGap(43, 43, 43)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(find)
                                .addGap(47, 47, 47)
                                .addComponent(delete))
                            .addComponent(last, javax.swing.GroupLayout.PREFERRED_SIZE, 71, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addContainerGap(125, Short.MAX_VALUE))
        );

        layout.linkSize(javax.swing.SwingConstants.HORIZONTAL, new java.awt.Component[] {add, cancel, delete, edit, find, save});

        layout.linkSize(javax.swing.SwingConstants.HORIZONTAL, new java.awt.Component[] {first, last, next, previous});

        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(54, 54, 54)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(name, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(76, 76, 76)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(rate, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(128, 128, 128)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(next)
                    .addComponent(last)
                    .addComponent(previous)
                    .addComponent(first))
                .addGap(58, 58, 58)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(cancel)
                    .addComponent(save)
                    .addComponent(edit)
                    .addComponent(find)
                    .addComponent(delete)
                    .addComponent(add))
                .addContainerGap(110, Short.MAX_VALUE))
        );

        layout.linkSize(javax.swing.SwingConstants.VERTICAL, new java.awt.Component[] {first, last, next, previous});

        java.awt.Dimension screenSize = java.awt.Toolkit.getDefaultToolkit().getScreenSize();
        setBounds((screenSize.width-934)/2, (screenSize.height-567)/2, 934, 567);
    }// </editor-fold>//GEN-END:initComponents

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

private void firstActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_firstActionPerformed
// TODO add your handling code here:
     try{
        rs.first();
        display_data();
    }
    catch(Exception e){
        
    }
}//GEN-LAST:event_firstActionPerformed

private void addActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_addActionPerformed
 enableDisable(true);
    empty();
    addFlag = true;// TODO add your handling code here:
}//GEN-LAST:event_addActionPerformed

private void cancelActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cancelActionPerformed
 System.exit(0);// TODO add your handling code here:
}//GEN-LAST:event_cancelActionPerformed

private void editActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_editActionPerformed
 enableDisable(true);
    addFlag=false;// TODO add your handling code here:
}//GEN-LAST:event_editActionPerformed

private void saveActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_saveActionPerformed
// TODO add your handling code here:
    if(addFlag==true){
      Connection con = db.getConnection();
            String a ; int b;
            a= name.getText();
            b = Integer.parseInt(rate.getText());
         String query = "insert into item(item_name, item_rate) values('"+a+"', '"+b+"')";
        try{
            con.prepareStatement(query).executeUpdate();
            JOptionPane.showMessageDialog(null, "Data successfully Saved");
        } 
            
        
        catch(Exception e){
            JOptionPane.showMessageDialog(null,e);
        }
   }
  
     else{
        try{
            Connection con = db.getConnection();
            PreparedStatement pt = con.prepareStatement("update item set item_rate= ?  where item_name=? ");
            pt.setString(1, rate.getText());
            pt.setString(2, name.getText()); 
            pt.execute();
            JOptionPane.showMessageDialog(null,"Data Updated");
        }
        catch(Exception e){
            JOptionPane.showMessageDialog(null,e);
        }
    }

}//GEN-LAST:event_saveActionPerformed

private void lastActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_lastActionPerformed
// TODO add your handling code here:
     try{
        rs.last();
        display_data();
    }
    catch(Exception e){
        
    }
}//GEN-LAST:event_lastActionPerformed

private void nextActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_nextActionPerformed
// TODO add your handling code here:
      try{
        if(rs.isLast()){
            JOptionPane.showMessageDialog(this, "It is the last record");
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
     String str = JOptionPane.showInputDialog(this,"Enter item id");
    try{
        boolean flagFind = false;
        rs.first();
        do{
            if(rs.getInt("item_id")==Integer.parseInt(str)){
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
     String str = JOptionPane.showInputDialog(this,"Enter item id");
     try{
         boolean flagFind = false;
        rs.first();
         do{
            if(rs.getInt("item_id")==Integer.parseInt(str)){
               flagFind = true;
               break;
            }}
         
        while(rs.next());
        if(flagFind==true){
            
        Connection con = db.getConnection();
        stmt = con.createStatement();
           
                String query = "delete from item where item_id = "+str+";";
                
          con.prepareStatement(query).executeUpdate();
            JOptionPane.showMessageDialog(null, "Record Successfully Deleted");
        }
        else{
            JOptionPane.showMessageDialog(null, "Record not Found");
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
            java.util.logging.Logger.getLogger(item.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(item.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(item.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(item.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {

            public void run() {
                new item().setVisible(true);
            }
        });
    }
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton add;
    private javax.swing.JButton cancel;
    private javax.swing.JButton delete;
    private javax.swing.JButton edit;
    private javax.swing.JButton find;
    private javax.swing.JButton first;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JButton last;
    private javax.swing.JTextField name;
    private javax.swing.JButton next;
    private javax.swing.JButton previous;
    private javax.swing.JTextField rate;
    private javax.swing.JButton save;
    // End of variables declaration//GEN-END:variables
}
