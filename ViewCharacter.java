
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import javax.swing.DefaultListModel;
import javax.swing.JOptionPane;
import javax.swing.text.Position;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Lenovo
 */
public class ViewCharacter extends javax.swing.JFrame {

    final void filllist(){
        try{
            Connection con= DriverManager.getConnection("jdbc:mysql://localhost:3306/onlinegame", "root",  "");
            Statement stmt = con.createStatement();
            String Query ="Select * FROM Characters WHERE Actname ='"+ naming.name+"'";
            ResultSet rs = stmt.executeQuery(Query);
            DefaultListModel DLM = new DefaultListModel();
            while (rs.next()){
                DLM.addElement(rs.getString(1));
            }
            list1.setModel(DLM);
            
        }catch (SQLException ex){
        JOptionPane.showMessageDialog(null,ex.toString());
    }
    }
   
    public ViewCharacter() {
        initComponents();
        setLocationRelativeTo(null);
        // query read * data base
         filllist();
    }

    /**
     * T
     * his method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        buttonGroup1 = new javax.swing.ButtonGroup();
        jPanel1 = new javax.swing.JPanel();
        jScrollPane2 = new javax.swing.JScrollPane();
        list1 = new javax.swing.JList();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jButton1 = new javax.swing.JButton();
        jLabel4 = new javax.swing.JLabel();
        deletebtn = new javax.swing.JButton();
        jTextField3 = new javax.swing.JTextField();
        updatebtn = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        jButton4 = new javax.swing.JButton();
        jTextField4 = new javax.swing.JTextField();
        jButton5 = new javax.swing.JButton();
        searchtext = new javax.swing.JTextField();
        searchbtn = new javax.swing.JButton();
        jTextField1 = new javax.swing.JTextField();
        jTextField2 = new javax.swing.JTextField();
        jButton3 = new javax.swing.JButton();
        jLabel6 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setResizable(false);
        setSize(new java.awt.Dimension(2560, 1440));
        addWindowListener(new java.awt.event.WindowAdapter() {
            public void windowOpened(java.awt.event.WindowEvent evt) {
                formWindowOpened(evt);
            }
        });

        jPanel1.setLayout(null);

        list1.addListSelectionListener(new javax.swing.event.ListSelectionListener() {
            public void valueChanged(javax.swing.event.ListSelectionEvent evt) {
                list1ValueChanged(evt);
            }
        });
        jScrollPane2.setViewportView(list1);

        jPanel1.add(jScrollPane2);
        jScrollPane2.setBounds(20, 30, 1159, 178);

        jLabel2.setFont(new java.awt.Font("Tahoma", 1, 13)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setText("Level :");
        jPanel1.add(jLabel2);
        jLabel2.setBounds(40, 330, 50, 30);

        jLabel3.setFont(new java.awt.Font("Tahoma", 1, 13)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(255, 255, 255));
        jLabel3.setText("Class :");
        jPanel1.add(jLabel3);
        jLabel3.setBounds(40, 370, 42, 30);

        jButton1.setBackground(new java.awt.Color(255, 0, 0));
        jButton1.setFont(new java.awt.Font("Tahoma", 1, 13)); // NOI18N
        jButton1.setForeground(new java.awt.Color(255, 255, 255));
        jButton1.setText("Refresh");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        jPanel1.add(jButton1);
        jButton1.setBounds(1090, 240, 92, 25);

        jLabel4.setFont(new java.awt.Font("Tahoma", 1, 13)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(255, 255, 255));
        jLabel4.setText("Exp points : ");
        jPanel1.add(jLabel4);
        jLabel4.setBounds(20, 410, 79, 30);

        deletebtn.setBackground(new java.awt.Color(255, 0, 0));
        deletebtn.setFont(new java.awt.Font("Tahoma", 1, 13)); // NOI18N
        deletebtn.setForeground(new java.awt.Color(255, 255, 255));
        deletebtn.setText("Delete");
        deletebtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                deletebtnActionPerformed(evt);
            }
        });
        jPanel1.add(deletebtn);
        deletebtn.setBounds(150, 510, 92, 25);

        jTextField3.setHorizontalAlignment(javax.swing.JTextField.LEFT);
        jTextField3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextField3ActionPerformed(evt);
            }
        });
        jPanel1.add(jTextField3);
        jTextField3.setBounds(130, 370, 131, 30);

        updatebtn.setBackground(new java.awt.Color(255, 0, 0));
        updatebtn.setFont(new java.awt.Font("Tahoma", 1, 13)); // NOI18N
        updatebtn.setForeground(new java.awt.Color(255, 255, 255));
        updatebtn.setText("Modify");
        updatebtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                updatebtnActionPerformed(evt);
            }
        });
        jPanel1.add(updatebtn);
        updatebtn.setBounds(150, 480, 92, 25);

        jLabel1.setBackground(new java.awt.Color(255, 255, 255));
        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 13)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setText("(*) Only Character Name can be Modified .");
        jPanel1.add(jLabel1);
        jLabel1.setBounds(290, 290, 320, 30);

        jButton4.setBackground(new java.awt.Color(255, 0, 0));
        jButton4.setFont(new java.awt.Font("Tahoma", 1, 13)); // NOI18N
        jButton4.setForeground(new java.awt.Color(255, 255, 255));
        jButton4.setText("Back to Mangement Screen");
        jButton4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton4ActionPerformed(evt);
            }
        });
        jPanel1.add(jButton4);
        jButton4.setBounds(90, 540, 220, 25);

        jTextField4.setHorizontalAlignment(javax.swing.JTextField.LEFT);
        jTextField4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextField4ActionPerformed(evt);
            }
        });
        jPanel1.add(jTextField4);
        jTextField4.setBounds(130, 410, 131, 30);

        jButton5.setBackground(new java.awt.Color(255, 0, 0));
        jButton5.setFont(new java.awt.Font("Tahoma", 1, 13)); // NOI18N
        jButton5.setForeground(new java.awt.Color(255, 255, 255));
        jButton5.setText("Exit");
        jButton5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton5ActionPerformed(evt);
            }
        });
        jPanel1.add(jButton5);
        jButton5.setBounds(150, 570, 92, 25);

        searchtext.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                searchtextActionPerformed(evt);
            }
        });
        jPanel1.add(searchtext);
        searchtext.setBounds(20, 240, 201, 30);

        searchbtn.setBackground(new java.awt.Color(255, 0, 0));
        searchbtn.setFont(new java.awt.Font("Tahoma", 1, 13)); // NOI18N
        searchbtn.setForeground(new java.awt.Color(255, 255, 255));
        searchbtn.setText("Search By Name");
        searchbtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                searchbtnActionPerformed(evt);
            }
        });
        jPanel1.add(searchbtn);
        searchbtn.setBounds(240, 240, 160, 30);

        jTextField1.setHorizontalAlignment(javax.swing.JTextField.LEFT);
        jTextField1.setCursor(new java.awt.Cursor(java.awt.Cursor.TEXT_CURSOR));
        jTextField1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextField1ActionPerformed(evt);
            }
        });
        jPanel1.add(jTextField1);
        jTextField1.setBounds(130, 290, 131, 30);

        jTextField2.setHorizontalAlignment(javax.swing.JTextField.LEFT);
        jPanel1.add(jTextField2);
        jTextField2.setBounds(130, 330, 131, 30);

        jButton3.setBackground(new java.awt.Color(255, 0, 0));
        jButton3.setFont(new java.awt.Font("Tahoma", 1, 13)); // NOI18N
        jButton3.setForeground(new java.awt.Color(255, 255, 255));
        jButton3.setText("Loginin");
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });
        jPanel1.add(jButton3);
        jButton3.setBounds(150, 450, 92, 25);

        jLabel6.setBackground(new java.awt.Color(255, 255, 255));
        jLabel6.setFont(new java.awt.Font("Tahoma", 1, 13)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(255, 255, 255));
        jLabel6.setText("Character Name :");
        jPanel1.add(jLabel6);
        jLabel6.setBounds(10, 290, 120, 30);

        jLabel5.setIcon(new javax.swing.ImageIcon(getClass().getResource("/pic/3vs3_BG_1.jpg"))); // NOI18N
        jLabel5.setText("jLabel5");
        jPanel1.add(jLabel5);
        jLabel5.setBounds(-250, -20, 2370, 1320);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, 1931, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, 1000, Short.MAX_VALUE)
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        ViewCharacter v =  new ViewCharacter();
       setVisible(false);
       v.setVisible(true);
        
    }//GEN-LAST:event_jButton1ActionPerformed

    private void jButton5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton5ActionPerformed
        // TODO add your handling code here:
        System.exit(0);
    }//GEN-LAST:event_jButton5ActionPerformed

    private void jButton4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton4ActionPerformed
        // TODO add your handling code here:
        Welcome w = new Welcome();
        w.setVisible(true);
        setVisible(false);
    }//GEN-LAST:event_jButton4ActionPerformed

    private void updatebtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_updatebtnActionPerformed
try{ if (jTextField1.getText().isEmpty()||jTextField2.getText().isEmpty()||jTextField4.getText().isEmpty()||jTextField3.getText().isEmpty()){
                JOptionPane.showMessageDialog(null, "Please fill all required fields.");
                jTextField2.setText("");
                jTextField3.setText("");
                jTextField1.setText("");
                jTextField4.setText("");

            }else{
            Connection con= DriverManager.getConnection("jdbc:mysql://localhost:3306/onlinegame", "root",  "");
            Statement stmt = con.createStatement();
            String Query ="UPDATE Characters SET Charname ='"+ jTextField1.getText()+"' WHERE Charname ='"+list1.getSelectedValue()+"'";
             stmt.execute(Query);
            
  JOptionPane.showMessageDialog(null, "Character Name Updated");
   jTextField1.setText("");
            jTextField2.setText("");
            jTextField3.setText("");
            jTextField4.setText("");
  filllist();
}
            
        }catch (SQLException ex){
        JOptionPane.showMessageDialog(null,ex.toString());
    }       
    }//GEN-LAST:event_updatebtnActionPerformed

    private void deletebtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_deletebtnActionPerformed
      try{
            Connection con= DriverManager.getConnection("jdbc:mysql://localhost:3306/onlinegame", "root",  "");
            Statement stmt = con.createStatement();
            String Query ="DELETE FROM Characters WHERE Charname ='"+list1.getSelectedValue()+"'";
             stmt.execute(Query);
            
  JOptionPane.showMessageDialog(null, "Character Deleted");
   jTextField1.setText("");
            jTextField2.setText("");
            jTextField3.setText("");
            jTextField4.setText("");
  filllist();
           
            
        }catch (SQLException ex){
        JOptionPane.showMessageDialog(null,ex.toString());
    }       
    }//GEN-LAST:event_deletebtnActionPerformed

    private void jTextField1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextField1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextField1ActionPerformed

    private void jTextField4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextField4ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextField4ActionPerformed

    private void list1ValueChanged(javax.swing.event.ListSelectionEvent evt) {//GEN-FIRST:event_list1ValueChanged
               try{
            Connection con= DriverManager.getConnection("jdbc:mysql://localhost:3306/onlinegame", "root",  "");
            Statement stmt = con.createStatement();
            String Query ="Select * FROM Characters WHERE charname ='"+list1.getSelectedValue()+"'";
            
            ResultSet rs = stmt.executeQuery(Query);
            while (rs.next()){
               jTextField1.setText(rs.getString(1));
               jTextField2.setText(rs.getString(2));
               jTextField3.setText(rs.getString(3));
               jTextField4.setText(rs.getString(4));
            }
           
            
        }catch (SQLException ex){
        JOptionPane.showMessageDialog(null,ex.toString());
    }
    
    }//GEN-LAST:event_list1ValueChanged

    private void searchbtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_searchbtnActionPerformed
      int result=  list1.getNextMatch(searchtext.getText(), 0, Position.Bias.Forward);
      list1.setSelectedIndex(result);
     
    }//GEN-LAST:event_searchbtnActionPerformed

    private void searchtextActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_searchtextActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_searchtextActionPerformed

    private void jTextField3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextField3ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextField3ActionPerformed

    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jButton3ActionPerformed

    private void formWindowOpened(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowOpened
                                          
        /*InputStream music; 
        try{
         music = new FileInputStream (new File("src\\\\pic\\\\m2.WAV")) ;
         AudioStream audios=new AudioStream(music);  
         AudioPlayer.player.start(audios);    
        }catch (Exception e){
            JOptionPane.showMessageDialog(null, e.getLocalizedMessage());
        }
       */
    }//GEN-LAST:event_formWindowOpened

    /**
     * @param args the command line arguments
     */
    

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.ButtonGroup buttonGroup1;
    private javax.swing.JButton deletebtn;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton3;
    private javax.swing.JButton jButton4;
    private javax.swing.JButton jButton5;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JTextField jTextField1;
    private javax.swing.JTextField jTextField2;
    private javax.swing.JTextField jTextField3;
    private javax.swing.JTextField jTextField4;
    private javax.swing.JList list1;
    private javax.swing.JButton searchbtn;
    private javax.swing.JTextField searchtext;
    private javax.swing.JButton updatebtn;
    // End of variables declaration//GEN-END:variables
}
