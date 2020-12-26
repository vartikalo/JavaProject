
import java.sql.*;
import javax.swing.*;
import java.text.SimpleDateFormat;
import java.util.Date;
import javax.swing.table.DefaultTableModel;
public class sales extends javax.swing.JFrame {
Connection con;
ResultSet rs;
DefaultTableModel model;
    /** Creates new form sales */
    public sales() {
        initComponents();
        model = new DefaultTableModel();
        model = (DefaultTableModel)table.getModel();
        Date dt = new Date();
        date.setDate(dt);
        load_data();
        load_customer();
    }
private void purchase_id(){
    try{   
        con = db.getConnection();
         rs = con.prepareStatement("select max(salesmain_id) from sales_main").executeQuery();
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
    sales_id();
    load_item();
    model = (DefaultTableModel)table.getModel();
    java.util.Date dt= new java.util.Date();
    date.setDate(dt);
    
}
private void sales_id(){
    try{   
        con = db.getConnection();
         rs = con.prepareStatement("select max(salesmain_id) from sales_main").executeQuery();
        rs.next();
        int sid = rs.getInt(1);
        sid = sid+1;
        id.setText(""+sid);
        System.out.print(rs);
    }
    catch(Exception e){
        
    }
    }
private void load_customer(){
    try{
        con = db.getConnection();
        ResultSet rsAcc = con.prepareStatement("select acc_name from account_master where acc_type = 'customer' order by acc_name").executeQuery();
        cmbname.removeAll();
        while(rsAcc.next()){
            cmbname.addItem(rsAcc.getString("acc_name").toString());
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

private void settable(){
    int total=0;
int cnt = table.getRowCount();
    for(int i = 0; i<=cnt-1; i++ ){
     model.setValueAt(i+1, i, 0);
    total = total + Integer.parseInt(model.getValueAt(i, 4).toString());
     
    }
   amount.setText(""+total);
    
}
   
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        id = new javax.swing.JTextField();
        date = new com.toedter.calendar.JDateChooser();
        cmbname = new javax.swing.JComboBox();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        cmbitem = new javax.swing.JComboBox();
        qty = new javax.swing.JTextField();
        rate = new javax.swing.JTextField();
        btnadd = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        table = new javax.swing.JTable();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        cmbmode = new javax.swing.JComboBox();
        amount = new javax.swing.JTextField();
        ok = new javax.swing.JButton();
        cancel = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jLabel1.setText("Sales id:");

        jLabel2.setText("Sales Date:");

        jLabel3.setText("Customer Name:");

        cmbname.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cmbnameActionPerformed(evt);
            }
        });

        jLabel4.setText("Item name:");

        jLabel5.setText("Quantity:");

        jLabel6.setText("Rate:");

        btnadd.setText("+");
        btnadd.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnaddActionPerformed(evt);
            }
        });

        table.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "S.No.", "Item Name", "Quantity", "Rate", "Amount"
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

        jLabel7.setText("Transaction Mode:");

        jLabel8.setText("Total Amount:");

        cmbmode.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Cash", "Credit" }));

        ok.setFont(new java.awt.Font("Tahoma", 1, 14));
        ok.setText("OK");
        ok.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                okActionPerformed(evt);
            }
        });

        cancel.setFont(new java.awt.Font("Tahoma", 1, 14));
        cancel.setText("CANCEL");
        cancel.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cancelActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                            .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                                .addGap(143, 143, 143)
                                .addComponent(cmbitem, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                            .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                                .addGap(165, 165, 165)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(jLabel2)
                                    .addComponent(jLabel1)
                                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addComponent(jLabel4)
                                        .addComponent(jLabel3)))))
                        .addGap(92, 92, 92)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                .addComponent(cmbname, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(date, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(id, javax.swing.GroupLayout.DEFAULT_SIZE, 333, Short.MAX_VALUE))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabel5)
                                .addGap(141, 141, 141)
                                .addComponent(jLabel6))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(qty, javax.swing.GroupLayout.PREFERRED_SIZE, 104, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(71, 71, 71)
                                .addComponent(rate, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(50, 50, 50)
                                .addComponent(btnadd))))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(40, 40, 40)
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 834, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(82, Short.MAX_VALUE))
            .addGroup(layout.createSequentialGroup()
                .addGap(131, 131, 131)
                .addComponent(jLabel7)
                .addGap(46, 46, 46)
                .addComponent(cmbmode, javax.swing.GroupLayout.PREFERRED_SIZE, 141, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 260, Short.MAX_VALUE)
                .addComponent(jLabel8)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(amount, javax.swing.GroupLayout.PREFERRED_SIZE, 84, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(93, 93, 93))
            .addGroup(layout.createSequentialGroup()
                .addGap(272, 272, 272)
                .addComponent(ok)
                .addGap(140, 140, 140)
                .addComponent(cancel)
                .addContainerGap(362, Short.MAX_VALUE))
        );

        layout.linkSize(javax.swing.SwingConstants.HORIZONTAL, new java.awt.Component[] {cancel, ok});

        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(58, 58, 58)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(id, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(59, 59, 59)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel2)
                        .addGap(65, 65, 65)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel3)
                            .addComponent(cmbname, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addComponent(date, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(68, 68, 68)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel4)
                    .addComponent(jLabel5)
                    .addComponent(jLabel6))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(cmbitem, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(qty, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(rate, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnadd))
                .addGap(18, 18, 18)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 119, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(35, 35, 35)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel7)
                    .addComponent(jLabel8)
                    .addComponent(cmbmode, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(amount, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(120, 120, 120)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(ok)
                    .addComponent(cancel))
                .addContainerGap(52, Short.MAX_VALUE))
        );

        java.awt.Dimension screenSize = java.awt.Toolkit.getDefaultToolkit().getScreenSize();
        setBounds((screenSize.width-974)/2, (screenSize.height-807)/2, 974, 807);
    }// </editor-fold>//GEN-END:initComponents

private void cmbnameActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cmbnameActionPerformed
// TODO add your handling code here:
}//GEN-LAST:event_cmbnameActionPerformed

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

private void okActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_okActionPerformed
// TODO add your handling code here:
    Connection con = db.getConnection();
   
    String a,c,d ,f , date2; 
    Date date3;
     java.util.Date dt= new java.util.Date();
    int h,i;
     SimpleDateFormat fm = new SimpleDateFormat("dd-MM-yyyy");
 date2 = fm.format(dt.getDate()).toString();
    a = id.getText();
   c= cmbname.getSelectedItem().toString();
   d = cmbmode.getSelectedItem().toString();
    f = amount.getText();
   
  try{
       String query = "insert into sales_main(salesmain_id,  sales_date ,customer_name, sales_mode, total_amnt) values('"+a+"' , now(), '"+c+"' , '"+d+"', '"+f+"');  ";
  con.prepareStatement(query).executeUpdate();
  

   int qt ,rt;
 String g = cmbitem.getSelectedItem().toString();
  String itemname;
   int rc = model.getRowCount(); 
  
  for(int j =0; j<=rc-1;j++){
   itemname = model.getValueAt(j,1).toString();
   qt=Integer.parseInt(model.getValueAt(j,2).toString());
   rt= Integer.parseInt(model.getValueAt(j,3).toString());
   String query2= "insert into sales_detail(item_name, qty, rate, main_id) values('"+itemname+"', '"+qt+"', '"+rt+"' , '"+a+"');";
   con.prepareStatement(query2).executeUpdate();
   
  }
  
  JOptionPane.showMessageDialog(null, "Data Saved");
  
  
  
  } 
  catch(Exception e){
      
      JOptionPane.showMessageDialog(null, e);
  }  
    
}//GEN-LAST:event_okActionPerformed

private void cancelActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cancelActionPerformed
// TODO add your handling code here:
    System.exit(0);
}//GEN-LAST:event_cancelActionPerformed

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
            java.util.logging.Logger.getLogger(sales.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(sales.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(sales.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(sales.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {

            public void run() {
                new sales().setVisible(true);
            }
        });
    }
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextField amount;
    private javax.swing.JButton btnadd;
    private javax.swing.JButton cancel;
    private javax.swing.JComboBox cmbitem;
    private javax.swing.JComboBox cmbmode;
    private javax.swing.JComboBox cmbname;
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
    private javax.swing.JButton ok;
    private javax.swing.JTextField qty;
    private javax.swing.JTextField rate;
    private javax.swing.JTable table;
    // End of variables declaration//GEN-END:variables
}
