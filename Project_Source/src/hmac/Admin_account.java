/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package hmac;

import java.awt.event.KeyEvent;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.regex.Pattern;
import javax.swing.InputMap;
import static javax.swing.JComponent.WHEN_FOCUSED;
import javax.swing.JOptionPane;
import javax.swing.KeyStroke;

/**
 *
 * @author Anshul
 */
public class Admin_account extends javax.swing.JInternalFrame {

    /**
     * Creates new form Update_Doctor
     */
    public Admin_account() {
        initComponents();
          this.getRootPane().setDefaultButton(jButton1);
         InputMap im1 = jButton1.getInputMap(WHEN_FOCUSED);

im1.put(KeyStroke.getKeyStroke(KeyEvent.VK_ENTER, 0, false), "pressed");
im1.put(KeyStroke.getKeyStroke(KeyEvent.VK_ENTER, 0, true), "released");
        
      
        
        
        
        
        
        
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
        jPanel3 = new javax.swing.JPanel();
        jPanel6 = new javax.swing.JPanel();
        jPanel2 = new javax.swing.JPanel();
        jButton1 = new javax.swing.JButton();
        jLabel14 = new javax.swing.JLabel();
        jTextField3 = new javax.swing.JTextField();
        jLabel15 = new javax.swing.JLabel();
        jLabel16 = new javax.swing.JLabel();
        jButton7 = new javax.swing.JButton();
        jLabel17 = new javax.swing.JLabel();
        jPasswordField1 = new javax.swing.JPasswordField();
        jPasswordField2 = new javax.swing.JPasswordField();
        jPasswordField3 = new javax.swing.JPasswordField();
        jPanel4 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();

        setClosable(true);
        setTitle("Account Details");
        setToolTipText("Account Details");
        try {
            setSelected(true);
        } catch (java.beans.PropertyVetoException e1) {
            e1.printStackTrace();
        }
        setVisible(true);
        getContentPane().setLayout(new javax.swing.BoxLayout(getContentPane(), javax.swing.BoxLayout.LINE_AXIS));

        jPanel1.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "ALL    FIELDS   ARE    MANDATORY", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Andalus", 1, 16))); // NOI18N
        jPanel1.setLayout(new java.awt.BorderLayout());

        jPanel3.add(jPanel6);

        jPanel2.setBorder(javax.swing.BorderFactory.createTitledBorder(javax.swing.BorderFactory.createEtchedBorder(java.awt.Color.gray, java.awt.Color.lightGray), "", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Andalus", 3, 16))); // NOI18N

        jButton1.setFont(new java.awt.Font("Andalus", 0, 14)); // NOI18N
        jButton1.setText("Update");
        jButton1.setBorder(javax.swing.BorderFactory.createEtchedBorder(javax.swing.border.EtchedBorder.RAISED, java.awt.Color.gray, java.awt.Color.lightGray));
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        jLabel14.setFont(new java.awt.Font("Andalus", 0, 14)); // NOI18N
        jLabel14.setText("Email Address");

        jTextField3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextField3ActionPerformed(evt);
            }
        });

        jLabel15.setFont(new java.awt.Font("Andalus", 0, 14)); // NOI18N
        jLabel15.setText("Confirm Password");

        jLabel16.setFont(new java.awt.Font("Andalus", 0, 14)); // NOI18N
        jLabel16.setText("New Password");

        jButton7.setFont(new java.awt.Font("Andalus", 0, 14)); // NOI18N
        jButton7.setText("Reset");
        jButton7.setToolTipText("Reset");
        jButton7.setBorder(javax.swing.BorderFactory.createEtchedBorder(javax.swing.border.EtchedBorder.RAISED, java.awt.Color.gray, java.awt.Color.lightGray));
        jButton7.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton7ActionPerformed(evt);
            }
        });

        jLabel17.setFont(new java.awt.Font("Andalus", 0, 14)); // NOI18N
        jLabel17.setText("Old Password");

        jPasswordField2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jPasswordField2ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(26, 26, 26)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel14, javax.swing.GroupLayout.PREFERRED_SIZE, 107, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel16, javax.swing.GroupLayout.PREFERRED_SIZE, 107, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel17, javax.swing.GroupLayout.PREFERRED_SIZE, 107, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel15))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jTextField3, javax.swing.GroupLayout.DEFAULT_SIZE, 243, Short.MAX_VALUE)
                            .addComponent(jPasswordField1)
                            .addComponent(jPasswordField2)
                            .addComponent(jPasswordField3)))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 159, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(61, 61, 61)
                        .addComponent(jButton7, javax.swing.GroupLayout.PREFERRED_SIZE, 162, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 34, Short.MAX_VALUE)))
                .addGap(39, 39, 39))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                .addGap(34, 34, 34)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel14, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(1, 1, 1)
                        .addComponent(jTextField3, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(18, 18, 18)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel17, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jPasswordField1, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel16, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(1, 1, 1)
                        .addComponent(jPasswordField2, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(18, 18, 18)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jPasswordField3, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel15, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(62, 62, 62)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButton7, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jPanel3.add(jPanel2);

        jPanel1.add(jPanel3, java.awt.BorderLayout.CENTER);

        jLabel1.setFont(new java.awt.Font("Copperplate Gothic Bold", 1, 24)); // NOI18N
        jLabel1.setText("Update Password");
        jPanel4.add(jLabel1);

        jPanel1.add(jPanel4, java.awt.BorderLayout.PAGE_START);

        getContentPane().add(jPanel1);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jTextField3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextField3ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextField3ActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed

        
        if(jTextField3.getText().length()!=0&&jPasswordField1.getPassword().length!=0&&jPasswordField2.getPassword().length!=0&&jPasswordField3.getPassword().length!=0)
        {
            
            
         String str1=new String(jPasswordField1.getPassword());
          String str2=new String(jPasswordField2.getPassword());
           String str3=new String(jPasswordField3.getPassword());
         int tep=0;  
             if(str3.trim().equals(str2.trim())){
            
                try{
                    Class.forName("com.mysql.jdbc.Driver");//loads driver
                    String url="jdbc:mysql://localhost/hmac?user=root&password=india@123";
                    Connection cn=DriverManager.getConnection(url); //connection established

                    String q="update register set pass='"+str3+"' where email='"+jTextField3.getText()+"' and pass='"+str1+"'";
                    PreparedStatement st=cn.prepareStatement(q);

                  tep=   st.executeUpdate();

                    cn.close();
                    
                    if(tep==0){
                    
                    JOptionPane.showMessageDialog(null, "Email Address or old password is wrong");
                    
                    }else{
                    JOptionPane.showMessageDialog(null, "Password has been successfully updated");
                    for(Object O:jPanel2.getComponents()) {
                        Validation v1=new Validation(O);
                    }
                    }
                }

                catch(Exception e) {
                    JOptionPane.showMessageDialog(null, e.getMessage());}} else {
           
           
             JOptionPane.showMessageDialog(null, "Password  Mismatch");
           
           }

        } else {
        
         JOptionPane.showMessageDialog(null, "Field's can't be left blank");
        
        
        }
    }//GEN-LAST:event_jButton1ActionPerformed

    private void jButton7ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton7ActionPerformed

        for(Object O:jPanel2.getComponents()) {

            Validation v=new Validation(O);

        }
    }//GEN-LAST:event_jButton7ActionPerformed

    private void jPasswordField2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jPasswordField2ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jPasswordField2ActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton7;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel16;
    private javax.swing.JLabel jLabel17;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JPanel jPanel6;
    private javax.swing.JPasswordField jPasswordField1;
    private javax.swing.JPasswordField jPasswordField2;
    private javax.swing.JPasswordField jPasswordField3;
    private javax.swing.JTextField jTextField3;
    // End of variables declaration//GEN-END:variables
}