
import java.sql.*;
import javax.swing.*;
import java.text.SimpleDateFormat;
import java.util.Date;
import javax.swing.table.DefaultTableModel;

public class purchase extends javax.swing.JFrame {
Connection con;
DefaultTableModel model;
ResultSet rs;

    public purchase() {
        initComponents();
        model = new DefaultTableModel();
        model = (DefaultTableModel)table.getModel();
        Date dt = new Date();
        date.setDate(dt);
        load_data();
        load_supplier();
      
    }
   
     private void purchase_id(){
    try{   
        con = db.getConnection();
         rs = con.prepareStatement("select max(purmain_id) from purchase_main").executeQuery();
        rs.next();
        int pid = rs.getInt(1);
        pid = pid+1;
        id.setText(""+pid);
        System.out.print(rs);
    }
    catch(Exception e){
        
    }
    }
private void load_data(){
    purchase_id();
    load_item();
    model = (DefaultTableModel)table.getModel();
    java.util.Date dt= new java.util.Date();
    date.setDate(dt);
    
    
}

private void load_supplier(){
    try{
        con = db.getConnection();
        ResultSet rsAcc = con.prepareStatement("select acc_name from account_master where acc_type = 'supplier' order by acc_name").executeQuery();
        cmbsup.removeAll();
        while(rsAcc.next()){
            cmbsup.addItem(rsAcc.getString("acc_name").toString());
        }
    }
    catch(Exception e){
        JOptionPane.showMessageDialog(null, e);
    }
    
}

private void load_item(){
    try{
        con = db.getConnection();
        ResultSet rsItem = con.prepareStatement("select item_name from item order by item_name ").executeQuery();
        cmbitem.removeAll();
        while(rsItem.next()){
            cmbitem.addItem(rsItem.getString("item_name").toString());
        }
        
    }
    catch(Exception e){
        JOptionPane.showMessageDialog(null, e);
        
    }
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
        id = new javax.swing.JTextField();
        qty = new javax.swing.JTextField();
        rate = new javax.swing.JTextField();
        cmbitem = new javax.swing.JComboBox();
        cmbsup = new javax.swing.JComboBox();
        jScrollPane1 = new javax.swing.JScrollPane();
        table = new javax.swing.JTable();
        date = new com.toedter.calendar.JDateChooser();
        btnadd = new javax.swing.JButton();
        btnok = new javax.swing.JButton();
        btncancel = new javax.swing.JButton();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        cmbmode = new javax.swing.JComboBox();
        amount = new javax.swing.JTextField();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jLabel1.setText("Purchase id:");

        jLabel2.setText("Purchase Date:");

        jLabel3.setText("Supplier Name:");

        jLabel4.setText("Item Name:");

        jLabel5.setText("Quantity:");

        jLabel6.setText("Rate:");

        table.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "S.No.", "Item name", "Quantity", "Rate", "Amount"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jScrollPane1.setViewportView(table);

        btnadd.setText("+");
        btnadd.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnaddActionPerformed(evt);
            }
        });

        btnok.setText("OK");
        btnok.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnokActionPerformed(evt);
            }
        });

        btncancel.setText("CANCEL");
        btncancel.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btncancelActionPerformed(evt);
            }
        });

        jLabel7.setText("Transaction Mode:");

        jLabel8.setText("Total AMount:");

        cmbmode.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Cash", "Credit" }));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(90, 90, 90)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel1)
                            .addComponent(jLabel2)
                            .addComponent(jLabel3))
                        .addGap(138, 138, 138)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(id, javax.swing.GroupLayout.PREFERRED_SIZE, 400, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                .addComponent(cmbsup, javax.swing.GroupLayout.PREFERRED_SIZE, 278, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(122, 122, 122))))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(cmbitem, javax.swing.GroupLayout.PREFERRED_SIZE, 113, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(70, 70, 70)
                        .addComponent(qty, javax.swing.GroupLayout.PREFERRED_SIZE, 121, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(13, 13, 13)
                        .addComponent(jLabel4)
                        .addGap(138, 138, 138)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(date, javax.swing.GroupLayout.DEFAULT_SIZE, 408, Short.MAX_VALUE)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabel5)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 130, Short.MAX_VALUE)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel6)
                                    .addComponent(rate, javax.swing.GroupLayout.PREFERRED_SIZE, 121, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(105, 105, 105)))))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(btnadd)
                .addGap(287, 287, 287))
            .addGroup(layout.createSequentialGroup()
                .addGap(82, 82, 82)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 770, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(200, Short.MAX_VALUE))
            .addGroup(layout.createSequentialGroup()
                .addGap(244, 244, 244)
                .addComponent(btnok)
                .addGap(112, 112, 112)
                .addComponent(btncancel)
                .addContainerGap(570, Short.MAX_VALUE))
            .addGroup(layout.createSequentialGroup()
                .addGap(110, 110, 110)
                .addComponent(jLabel7)
                .addGap(35, 35, 35)
                .addComponent(cmbmode, javax.swing.GroupLayout.PREFERRED_SIZE, 108, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 291, Short.MAX_VALUE)
                .addComponent(jLabel8)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(amount, javax.swing.GroupLayout.PREFERRED_SIZE, 84, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(231, 231, 231))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel1)
                        .addGap(51, 51, 51)
                        .addComponent(jLabel2))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(id, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(57, 57, 57)
                        .addComponent(date, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(54, 54, 54)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel3, javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(cmbsup, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(46, 46, 46)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel4)
                            .addComponent(jLabel5))
                        .addGap(30, 30, 30)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(cmbitem, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(qty, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel6)
                        .addGap(30, 30, 30)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(rate, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(btnadd))))
                .addGap(36, 36, 36)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 164, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(32, 32, 32)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel7)
                    .addComponent(jLabel8)
                    .addComponent(cmbmode, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(amount, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(58, 58, 58)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnok)
                    .addComponent(btncancel))
                .addGap(72, 72, 72))
        );

        java.awt.Dimension screenSize = java.awt.Toolkit.getDefaultToolkit().getScreenSize();
        setBounds((screenSize.width-1070)/2, (screenSize.height-763)/2, 1070, 763);
    }// </editor-fold>//GEN-END:initComponents

private void btnaddActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnaddActionPerformed
// TODO add your handling code here:
try{
    String a;
int b,c,d;
a = cmbitem.getSelectedItem().toString();
b= Integer.parseInt(qty.getText());
c = Integer.parseInt(rate.getText());
d=b*c;
model.addRow(new Object[] {1,a,b,c,d});
settable();
qty.setText("");
rate.setText("");
cmbitem.setSelectedIndex(0);
}
catch(Exception e){
    JOptionPane.showMessageDialog(null, e);
}

}//GEN-LAST:event_btnaddActionPerformed

private void btnokActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnokActionPerformed
// TODO add your handling code here:
    Connection con = db.getConnection();
    java.util.Date dt= new java.util.Date();
    String a,c,d ,f, date2; 
    
    int h,i;
    SimpleDateFormat fm = new SimpleDateFormat("dd-MM-yyyy");
    date2 = fm.format(dt.getDate()).toString();
    a = id.getText();
   c= cmbsup.getSelectedItem().toString();
   d = cmbmode.getSelectedItem().toString();
    f = amount.getText();
   
  try{
       String query = "insert into purchase_main(purmain_id,  pur_date ,supplier_name, pur_mode, pur_total) values('"+a+"' , now(), '"+c+"' , '"+d+"', '"+f+"');  ";
  con.prepareStatement(query).executeUpdate();
  

   int qt ,rt;
 String g = cmbitem.getSelectedItem().toString();
  String itemname;
   int rc = model.getRowCount(); 
  
  for(int j =0; j<=rc-1;j++){
   itemname = model.getValueAt(j,1).toString();
   qt=Integer.parseInt(model.getValueAt(j,2).toString());
   rt= Integer.parseInt(model.getValueAt(j,3).toString());
   String query2= "insert into purchase_detail(item_name, qty, rate, main_id) values('"+itemname+"', '"+qt+"', '"+rt+"' , '"+a+"');";
   con.prepareStatement(query2).executeUpdate();
   
  }
  
  JOptionPane.showMessageDialog(null, "Data Saved");
  
  
  
  } 
  catch(Exception e){
      
      JOptionPane.showMessageDialog(null, e);
  }  
    
    
 
     
}//GEN-LAST:event_btnokActionPerformed

private void btncancelActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btncancelActionPerformed
// TODO add your handling code here:
    System.exit(0);
}//GEN-LAST:event_btncancelActionPerformed
private void settable(){
    int total=0;
int cnt = table.getRowCount();
    for(int i = 0; i<=cnt-1; i++ ){
     model.setValueAt(i+1, i, 0);
    total = total + Integer.parseInt(model.getValueAt(i, 4).toString());
     
    }
   amount.setText(""+total);
    
}
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
            java.util.logging.Logger.getLogger(purchase.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(purchase.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(purchase.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(purchase.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {

            public void run() {
                new purchase().setVisible(true);
            }
        });
    }
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextField amount;
    private javax.swing.JButton btnadd;
    private javax.swing.JButton btncancel;
    private javax.swing.JButton btnok;
    private javax.swing.JComboBox cmbitem;
    private javax.swing.JComboBox cmbmode;
    private javax.swing.JComboBox cmbsup;
    private com.toedter.calendar.JDateChooser date;
    private javax.swing.JTextField id;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTextField qty;
    private javax.swing.JTextField rate;
    private javax.swing.JTable table;
    // End of variables declaration//GEN-END:variables
}
