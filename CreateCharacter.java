
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import javax.swing.JOptionPane;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Lenovo
 */
public class CreateCharacter extends javax.swing.JFrame {

    /**
     * Creates new form ViewCharacter
     */
    public CreateCharacter() {
        initComponents();
        setLocationRelativeTo(null);
        cb.removeAllItems();;
         cb2.removeAllItems();
      
        Fillcombo();
        Fillcombo2();
        Fillcombo3();
    }
    void Fillcombo(){
          try{
            
         
         Connection con= DriverManager.getConnection("jdbc:mysql://localhost:3306/onlinegame", "root","");
         
         
   PreparedStatement  ps = con.prepareStatement( "SELECT Classname FROM Class") ;
 
ResultSet result = ps.executeQuery();
while(result.next()){
    cb.addItem((result.getString("classname")));
}
         
         
     }catch  (SQLException e) {
            System.out.println("SQL Exception: "+ e.toString());}
          
          
        
    }
    
     void Fillcombo2(){
          try{
            
         
         Connection con= DriverManager.getConnection("jdbc:mysql://localhost:3306/onlinegame", "root","");
         
         
   PreparedStatement  ps = con.prepareStatement( "SELECT Regname FROM Region") ;
 
ResultSet result = ps.executeQuery();
while(result.next()){
    cb2.addItem((result.getString("Regname")));
}
         
         
     }catch  (SQLException e) {
            System.out.println("SQL Exception: "+ e.toString());}
          
          
        
    }
     void Fillcombo3(){
          try{
            
         
         Connection con= DriverManager.getConnection("jdbc:mysql://localhost:3306/onlinegame", "root","");
         
         
   PreparedStatement  ps = con.prepareStatement( "SELECT Itname FROM Class WHERE Classname ='"+cb.getSelectedItem()+"'") ;
 
ResultSet result = ps.executeQuery();
while(result.next()){
    cb3.addItem((result.getString("Itname")));
}
         
         
     }catch  (SQLException e) {
            System.out.println("SQL Exception: "+ e.toString());}
          
          
        
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jButton2 = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        jTextField4 = new javax.swing.JTextField();
        jButton1 = new javax.swing.JButton();
        jTextField1 = new javax.swing.JTextField();
        jTextField2 = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        cb = new javax.swing.JComboBox();
        cb2 = new javax.swing.JComboBox();
        cb3 = new javax.swing.JComboBox();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setResizable(false);
        setSize(new java.awt.Dimension(1792, 1008));

        jPanel1.setLayout(null);

        jButton2.setBackground(new java.awt.Color(255, 0, 0));
        jButton2.setFont(new java.awt.Font("Tahoma", 1, 13)); // NOI18N
        jButton2.setForeground(new java.awt.Color(255, 255, 255));
        jButton2.setText("Back");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });
        jPanel1.add(jButton2);
        jButton2.setBounds(820, 510, 180, 25);

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 13)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setText("Character Name :");
        jPanel1.add(jLabel1);
        jLabel1.setBounds(610, 270, 150, 30);

        jTextField4.setHorizontalAlignment(javax.swing.JTextField.LEFT);
        jTextField4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextField4ActionPerformed(evt);
            }
        });
        jPanel1.add(jTextField4);
        jTextField4.setBounds(730, 390, 180, 30);

        jButton1.setBackground(new java.awt.Color(255, 0, 0));
        jButton1.setFont(new java.awt.Font("Tahoma", 1, 13)); // NOI18N
        jButton1.setForeground(new java.awt.Color(255, 255, 255));
        jButton1.setText("Create Character");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        jPanel1.add(jButton1);
        jButton1.setBounds(620, 510, 180, 25);

        jTextField1.setHorizontalAlignment(javax.swing.JTextField.LEFT);
        jTextField1.setCursor(new java.awt.Cursor(java.awt.Cursor.TEXT_CURSOR));
        jTextField1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextField1ActionPerformed(evt);
            }
        });
        jPanel1.add(jTextField1);
        jTextField1.setBounds(730, 270, 180, 30);

        jTextField2.setHorizontalAlignment(javax.swing.JTextField.LEFT);
        jTextField2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextField2ActionPerformed(evt);
            }
        });
        jPanel1.add(jTextField2);
        jTextField2.setBounds(730, 310, 180, 30);

        jLabel2.setFont(new java.awt.Font("Tahoma", 1, 13)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setText("Level :");
        jPanel1.add(jLabel2);
        jLabel2.setBounds(630, 310, 90, 30);

        jLabel3.setFont(new java.awt.Font("Tahoma", 1, 13)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(255, 255, 255));
        jLabel3.setText("Class :");
        jPanel1.add(jLabel3);
        jLabel3.setBounds(630, 350, 90, 30);

        jLabel4.setFont(new java.awt.Font("Tahoma", 1, 13)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(255, 255, 255));
        jLabel4.setText("Location :");
        jPanel1.add(jLabel4);
        jLabel4.setBounds(620, 430, 120, 30);

        cb.setFont(new java.awt.Font("Tahoma", 1, 13)); // NOI18N
        cb.setForeground(new java.awt.Color(255, 0, 0));
        cb.addItemListener(new java.awt.event.ItemListener() {
            public void itemStateChanged(java.awt.event.ItemEvent evt) {
                cbItemStateChanged(evt);
            }
        });
        cb.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cbActionPerformed(evt);
            }
        });
        jPanel1.add(cb);
        cb.setBounds(730, 350, 180, 30);

        cb2.setFont(new java.awt.Font("Tahoma", 1, 13)); // NOI18N
        cb2.setForeground(new java.awt.Color(255, 255, 255));
        jPanel1.add(cb2);
        cb2.setBounds(730, 430, 180, 30);

        cb3.setFont(new java.awt.Font("Tahoma", 1, 13)); // NOI18N
        cb3.setForeground(new java.awt.Color(255, 255, 255));
        cb3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cb3ActionPerformed(evt);
            }
        });
        jPanel1.add(cb3);
        cb3.setBounds(730, 470, 180, 30);

        jLabel6.setFont(new java.awt.Font("Tahoma", 1, 13)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(255, 255, 255));
        jLabel6.setText("Exp points : ");
        jPanel1.add(jLabel6);
        jLabel6.setBounds(620, 390, 120, 30);

        jLabel7.setFont(new java.awt.Font("Tahoma", 1, 13)); // NOI18N
        jLabel7.setForeground(new java.awt.Color(255, 255, 255));
        jLabel7.setText("Class weapon :");
        jPanel1.add(jLabel7);
        jLabel7.setBounds(610, 470, 120, 30);

        jLabel5.setIcon(new javax.swing.ImageIcon(getClass().getResource("/pic/Highelf_Lancer_01.jpg"))); // NOI18N
        jLabel5.setText("jLabel5");
        jPanel1.add(jLabel5);
        jLabel5.setBounds(-20, 0, 1710, 980);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, 1688, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, 979, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
       
          ViewCharacter v = new ViewCharacter ();
        try{
            loginin t1 = new loginin();
         Welcome z =new Welcome();
         if(naming.name==null){
              JOptionPane.showMessageDialog(null, "Something went wrong please restart the application.");
              setVisible(false);
         }else{
         Connection con= DriverManager.getConnection("jdbc:mysql://localhost:3306/onlinegame", "root","");
         
         Statement stmt = (Statement) con.createStatement();
         String insertionQuery= "INSERT INTO characters VALUES('"+ jTextField1.getText()  +"','" + jTextField2.getText() +"','"+ cb.getSelectedItem()+"','"+ jTextField4.getText() +"','"+naming.name+"','"+cb2.getSelectedItem()+"','"+cb3.getSelectedItem()+"')";
         stmt.executeUpdate(insertionQuery);
         JOptionPane.showMessageDialog(null, "Character Added");
        v.setVisible(true);    
        setVisible(false); 
         }
     }catch  (SQLException e) {
            System.out.println("SQL Exception: "+ e.toString());}

       
    }//GEN-LAST:event_jButton1ActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        // TODO add your handling code here:
        Welcome b =new Welcome();
        b.setVisible(true);
        setVisible(false);
    }//GEN-LAST:event_jButton2ActionPerformed

    private void jTextField1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextField1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextField1ActionPerformed

    private void jTextField4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextField4ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextField4ActionPerformed

    private void jTextField2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextField2ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextField2ActionPerformed

    private void cbActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cbActionPerformed
       try{
            loginin t1 = new loginin();
         Welcome z =new Welcome();
         
         Connection con= DriverManager.getConnection("jdbc:mysql://localhost:3306/onlinegame", "root","");
         
         Statement stmt = (Statement) con.createStatement(); 
       
         
     }catch  (SQLException e) {
            System.out.println("SQL Exception: "+ e.toString());}
        
      /* string Sql = "select company_name from JO.dbo.Comp";
   SqlConnection conn = new SqlConnection(connString);
   conn.Open();
   SqlCommand cmd = new SqlCommand(Sql, conn);
   SqlDataReader DR = cmd.ExecuteReader();

            while (DR.Read())
            {
                jcombobox1.Items.Add(DR[0]);

            }*/
    }//GEN-LAST:event_cbActionPerformed

    private void cbItemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_cbItemStateChanged
        cb3.removeAllItems();
Fillcombo3();
    }//GEN-LAST:event_cbItemStateChanged

    private void cb3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cb3ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_cb3ActionPerformed

    /**
     * @param args the command line arguments
     */
    

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JComboBox cb;
    private javax.swing.JComboBox cb2;
    private javax.swing.JComboBox cb3;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JTextField jTextField1;
    private javax.swing.JTextField jTextField2;
    private javax.swing.JTextField jTextField4;
    // End of variables declaration//GEN-END:variables
}
