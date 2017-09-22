
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Calendar;
import java.util.Date;
import java.util.GregorianCalendar;
import javax.swing.JOptionPane;






public class Exist extends javax.swing.JFrame {
    
    public Exist() {
         initComponents();
       setLocationRelativeTo(null);
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jTextField1 = new javax.swing.JTextField();
        jTextField3 = new javax.swing.JTextField();
        Create = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();
        jPasswordField1 = new javax.swing.JPasswordField();
        jLabel4 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setResizable(false);

        jPanel1.setLayout(null);

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 13)); // NOI18N
        jLabel1.setText(" Password :");
        jPanel1.add(jLabel1);
        jLabel1.setBounds(610, 50, 110, 30);

        jLabel2.setFont(new java.awt.Font("Tahoma", 1, 13)); // NOI18N
        jLabel2.setText("Email :");
        jPanel1.add(jLabel2);
        jLabel2.setBounds(620, 90, 110, 30);

        jLabel3.setFont(new java.awt.Font("Tahoma", 1, 13)); // NOI18N
        jLabel3.setText("Account Name :");
        jPanel1.add(jLabel3);
        jLabel3.setBounds(600, 10, 110, 30);

        jLabel5.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(255, 255, 255));
        jLabel5.setText("CREATE ACCOUNT");
        jPanel1.add(jLabel5);
        jLabel5.setBounds(10, 10, 180, 30);

        jLabel6.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(255, 255, 255));
        jLabel6.setText("You need an account to be able to play. You use this to then log in the Game .");
        jPanel1.add(jLabel6);
        jLabel6.setBounds(10, 0, 530, 100);

        jLabel7.setFont(new java.awt.Font("Tahoma", 1, 13)); // NOI18N
        jLabel7.setForeground(new java.awt.Color(255, 255, 255));
        jLabel7.setText(" If you already have an account, log in. »");
        jPanel1.add(jLabel7);
        jLabel7.setBounds(10, 80, 280, 16);

        jTextField1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextField1ActionPerformed(evt);
            }
        });
        jPanel1.add(jTextField1);
        jTextField1.setBounds(710, 10, 128, 30);

        jTextField3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextField3ActionPerformed(evt);
            }
        });
        jPanel1.add(jTextField3);
        jTextField3.setBounds(710, 90, 128, 30);

        Create.setBackground(new java.awt.Color(0, 0, 0));
        Create.setFont(new java.awt.Font("Tahoma", 1, 13)); // NOI18N
        Create.setForeground(new java.awt.Color(255, 255, 255));
        Create.setIcon(new javax.swing.ImageIcon(getClass().getResource("/pic/Untitled.png"))); // NOI18N
        Create.setText("Create");
        Create.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                CreateActionPerformed(evt);
            }
        });
        jPanel1.add(Create);
        Create.setBounds(580, 130, 320, 30);

        jButton2.setBackground(new java.awt.Color(0, 0, 0));
        jButton2.setFont(new java.awt.Font("Tahoma", 1, 13)); // NOI18N
        jButton2.setForeground(new java.awt.Color(255, 255, 255));
        jButton2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/pic/back.jpg"))); // NOI18N
        jButton2.setText("Back");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });
        jPanel1.add(jButton2);
        jButton2.setBounds(580, 160, 320, 30);

        jPasswordField1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jPasswordField1ActionPerformed(evt);
            }
        });
        jPanel1.add(jPasswordField1);
        jPasswordField1.setBounds(710, 50, 128, 30);

        jLabel4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/pic/7e77643e430c5abbfcade3d2dca6d6.jpg"))); // NOI18N
        jLabel4.setText("jLabel4");
        jPanel1.add(jLabel4);
        jLabel4.setBounds(-10, 0, 990, 390);

        jLabel8.setText("jLabel8");
        jPanel1.add(jLabel8);
        jLabel8.setBounds(570, 130, 110, 100);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, 912, javax.swing.GroupLayout.PREFERRED_SIZE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, 189, javax.swing.GroupLayout.PREFERRED_SIZE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    public void currentdate(){
    Calendar cal = new GregorianCalendar();
    int month = cal.get(Calendar.MONTH);
   int year = cal.get(Calendar.YEAR);
 int day = cal.get(Calendar.DAY_OF_MONTH);
 String s=(year+"/"+(month+1)+"/"+day);
                        

        
    }
    private void CreateActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_CreateActionPerformed
    Calendar cal = new GregorianCalendar();
    loginin i = new loginin ();
    int month = cal.get(Calendar.MONTH);
   int year = cal.get(Calendar.YEAR);
 int day = cal.get(Calendar.DAY_OF_MONTH);
 String d=(year+"/"+(month+1)+"/"+day);
 
  int second = cal.get(Calendar.SECOND);
   int hour = cal.get(Calendar.HOUR);
 int minute = cal.get(Calendar.MINUTE);
 String t = (hour+":"+minute+":"+second);
        try{
         Connection con= DriverManager.getConnection("jdbc:mysql://localhost:3306/onlinegame", "root",  "");
         Statement stmt = (Statement) con.createStatement(); 
         if (jTextField1.getText().isEmpty()||String.valueOf(jPasswordField1.getPassword()).isEmpty()|| jTextField3.getText().isEmpty()){
            JOptionPane.showMessageDialog(null, "Please fill all required fields.");
            jPasswordField1.setText("");
           jTextField3.setText("");
           jTextField1.setText("");
        }else{
                 String insertionQuery= "INSERT INTO account VALUES('"+ jTextField1.getText()  +"','" + String.valueOf(jPasswordField1.getPassword()) +"','"+ jTextField3.getText()+"','"+ d +"','"+t+"')";
         stmt.executeUpdate(insertionQuery);
         JOptionPane.showMessageDialog(null, "Account has been created");
         i.setVisible(true );
        setVisible(false);
        
     }}catch  (SQLException e) {
            System.out.println("SQL Exception: "+ e.toString());}
        
    

    

        
    }//GEN-LAST:event_CreateActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        // TODO add your handling code here:
        loginin t = new loginin();
        t.setVisible(true);
        setVisible(false);
    }//GEN-LAST:event_jButton2ActionPerformed

    private void jTextField1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextField1ActionPerformed
      
    }//GEN-LAST:event_jTextField1ActionPerformed

    private void jPasswordField1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jPasswordField1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jPasswordField1ActionPerformed

    private void jTextField3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextField3ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextField3ActionPerformed

    

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton Create;
    private javax.swing.JButton jButton2;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPasswordField jPasswordField1;
    private javax.swing.JTextField jTextField1;
    private javax.swing.JTextField jTextField3;
    // End of variables declaration//GEN-END:variables
}
