
import java.sql.DriverManager;
import java.sql.*;
import javax.swing.DefaultComboBoxModel;
import javax.swing.JOptionPane;


/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Rockstar_0901
 */
public class CAB_BOOKINGS extends javax.swing.JFrame {

    /**
     * Creates new form CAB_BOOKINGS
     */

    public CAB_BOOKINGS() {
        initComponents();
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
        jPanel2 = new javax.swing.JPanel();
        jComboBox1 = new javax.swing.JComboBox<>();
        jPanel3 = new javax.swing.JPanel();
        jComboBox2 = new javax.swing.JComboBox<>();
        jLabel2 = new javax.swing.JLabel();
        txtcid = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        txtdid = new javax.swing.JTextField();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jPanel4 = new javax.swing.JPanel();
        jComboBox3 = new javax.swing.JComboBox<>();
        jLabel5 = new javax.swing.JLabel();
        txtcustid = new javax.swing.JTextField();
        jButton1 = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();
        jLabel8 = new javax.swing.JLabel();
        txtnod = new javax.swing.JTextField();
        jLabel1 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        addWindowListener(new java.awt.event.WindowAdapter() {
            public void windowOpened(java.awt.event.WindowEvent evt) {
                formWindowOpened(evt);
            }
        });
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel1.setBackground(new java.awt.Color(9, 114, 209));
        jPanel1.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0), 2));
        jPanel1.setForeground(new java.awt.Color(255, 255, 255));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel2.setBackground(new java.awt.Color(9, 114, 209));
        jPanel2.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "CABS", 0, 0, new java.awt.Font("Times New Roman", 3, 14), new java.awt.Color(255, 255, 255))); // NOI18N
        jPanel2.setForeground(new java.awt.Color(255, 255, 255));

        jComboBox1.setBackground(new java.awt.Color(9, 114, 209));
        jComboBox1.setEditable(true);
        jComboBox1.setFont(new java.awt.Font("Times New Roman", 3, 12)); // NOI18N
        jComboBox1.setForeground(new java.awt.Color(255, 255, 255));
        jComboBox1.setVerifyInputWhenFocusTarget(false);
        jComboBox1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jComboBox1ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jComboBox1, 0, 223, Short.MAX_VALUE)
                .addContainerGap())
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jComboBox1, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
        );

        jPanel1.add(jPanel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 11, -1, -1));

        jPanel3.setBackground(new java.awt.Color(9, 114, 209));
        jPanel3.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "DRIVERS", 0, 0, new java.awt.Font("Times New Roman", 3, 14), new java.awt.Color(255, 255, 255))); // NOI18N
        jPanel3.setForeground(new java.awt.Color(255, 255, 255));

        jComboBox2.setBackground(new java.awt.Color(9, 114, 209));
        jComboBox2.setEditable(true);
        jComboBox2.setFont(new java.awt.Font("Times New Roman", 3, 12)); // NOI18N
        jComboBox2.setForeground(new java.awt.Color(255, 255, 255));
        jComboBox2.setAutoscrolls(true);
        jComboBox2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jComboBox2ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jComboBox2, 0, 196, Short.MAX_VALUE)
                .addContainerGap())
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jComboBox2, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)
        );

        jPanel1.add(jPanel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(300, 10, -1, -1));

        jLabel2.setBackground(new java.awt.Color(9, 114, 209));
        jLabel2.setFont(new java.awt.Font("Times New Roman", 3, 18)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setText("CAB NO");
        jPanel1.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 160, 161, 32));

        txtcid.setBackground(new java.awt.Color(9, 114, 209));
        txtcid.setFont(new java.awt.Font("Times New Roman", 3, 18)); // NOI18N
        txtcid.setForeground(new java.awt.Color(255, 255, 255));
        jPanel1.add(txtcid, new org.netbeans.lib.awtextra.AbsoluteConstraints(240, 160, 294, 32));

        jLabel4.setBackground(new java.awt.Color(9, 114, 209));
        jLabel4.setFont(new java.awt.Font("Times New Roman", 3, 18)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(255, 255, 255));
        jLabel4.setText("DRIVER ID");
        jPanel1.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 200, 161, 35));

        txtdid.setBackground(new java.awt.Color(9, 114, 209));
        txtdid.setFont(new java.awt.Font("Times New Roman", 3, 18)); // NOI18N
        txtdid.setForeground(new java.awt.Color(255, 255, 255));
        jPanel1.add(txtdid, new org.netbeans.lib.awtextra.AbsoluteConstraints(240, 200, 294, 35));

        jLabel6.setBackground(new java.awt.Color(9, 114, 209));
        jLabel6.setFont(new java.awt.Font("Times New Roman", 3, 18)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(255, 255, 255));
        jLabel6.setText("TO");
        jPanel1.add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 320, 161, 35));

        jLabel7.setBackground(new java.awt.Color(9, 114, 209));
        jLabel7.setFont(new java.awt.Font("Times New Roman", 3, 18)); // NOI18N
        jLabel7.setForeground(new java.awt.Color(255, 255, 255));
        jLabel7.setText("FROM");
        jPanel1.add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 280, 161, 35));

        jPanel4.setBackground(new java.awt.Color(9, 114, 209));
        jPanel4.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "CUSTOMER", 0, 0, new java.awt.Font("Times New Roman", 3, 14), new java.awt.Color(255, 255, 255))); // NOI18N
        jPanel4.setForeground(new java.awt.Color(255, 255, 255));

        jComboBox3.setBackground(new java.awt.Color(9, 114, 209));
        jComboBox3.setEditable(true);
        jComboBox3.setFont(new java.awt.Font("Times New Roman", 3, 12)); // NOI18N
        jComboBox3.setForeground(new java.awt.Color(255, 255, 255));
        jComboBox3.setVerifyInputWhenFocusTarget(false);
        jComboBox3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jComboBox3ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel4Layout = new javax.swing.GroupLayout(jPanel4);
        jPanel4.setLayout(jPanel4Layout);
        jPanel4Layout.setHorizontalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jComboBox3, 0, 223, Short.MAX_VALUE)
                .addContainerGap())
        );
        jPanel4Layout.setVerticalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jComboBox3, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
        );

        jPanel1.add(jPanel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 90, -1, -1));

        jLabel5.setBackground(new java.awt.Color(9, 114, 209));
        jLabel5.setFont(new java.awt.Font("Times New Roman", 3, 18)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(255, 255, 255));
        jLabel5.setText("CUSTOMER ID");
        jPanel1.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 240, 161, 35));

        txtcustid.setBackground(new java.awt.Color(9, 114, 209));
        txtcustid.setFont(new java.awt.Font("Times New Roman", 3, 18)); // NOI18N
        txtcustid.setForeground(new java.awt.Color(255, 255, 255));
        jPanel1.add(txtcustid, new org.netbeans.lib.awtextra.AbsoluteConstraints(240, 240, 294, 35));

        jButton1.setBackground(new java.awt.Color(9, 114, 209));
        jButton1.setFont(new java.awt.Font("Times New Roman", 3, 18)); // NOI18N
        jButton1.setForeground(new java.awt.Color(255, 255, 255));
        jButton1.setText("BOOK");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        jPanel1.add(jButton1, new org.netbeans.lib.awtextra.AbsoluteConstraints(91, 416, 116, 40));

        jButton2.setBackground(new java.awt.Color(9, 114, 209));
        jButton2.setFont(new java.awt.Font("Times New Roman", 3, 18)); // NOI18N
        jButton2.setForeground(new java.awt.Color(255, 255, 255));
        jButton2.setText("BACK");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });
        jPanel1.add(jButton2, new org.netbeans.lib.awtextra.AbsoluteConstraints(348, 416, 116, 40));

        jLabel8.setBackground(new java.awt.Color(9, 114, 209));
        jLabel8.setFont(new java.awt.Font("Times New Roman", 3, 18)); // NOI18N
        jLabel8.setForeground(new java.awt.Color(255, 255, 255));
        jLabel8.setText("NO OF DAYS");
        jPanel1.add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 360, 161, 35));

        txtnod.setBackground(new java.awt.Color(9, 114, 209));
        txtnod.setFont(new java.awt.Font("Times New Roman", 3, 18)); // NOI18N
        txtnod.setForeground(new java.awt.Color(255, 255, 255));
        jPanel1.add(txtnod, new org.netbeans.lib.awtextra.AbsoluteConstraints(240, 360, 294, 35));

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/book Taxi copy.jpg"))); // NOI18N
        jPanel1.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 60, 460, 420));

        getContentPane().add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 540, -1));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jComboBox1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jComboBox1ActionPerformed
       String choice =(String) jComboBox1.getSelectedItem();
        String s[] = choice.split("~");
        
        try
        {
            Class.forName("java.sql.Driver");
            Connection con = (Connection) DriverManager.getConnection("jdbc:mysql://localhost:3306/bmtt","root","mysql");
            Statement stmt = (Statement) con.createStatement();
            String hh = "select * from cabs where cid = "+s[1];
            ResultSet rs1 = stmt.executeQuery(hh);
            rs1.first();
                txtcid.setText(rs1.getString("cid"));
            
        
        }
        catch (Exception e)
        {
            JOptionPane.showMessageDialog(this, e.getMessage());
        }
    }//GEN-LAST:event_jComboBox1ActionPerformed

    private void formWindowOpened(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowOpened
  try {
            Class.forName("com.mysql.jdbc.Driver");
            Connection con = (Connection)
                    DriverManager.getConnection("jdbc:mysql://localhost:3306/bmtt","root","mysql");
            Statement stmt = con.createStatement();  
           String strSQL = "SELECT MAX(BID) FROM bookings";
              ResultSet rs = stmt.executeQuery(strSQL);
           
            System.out.println(rs + " rows effected");
            con.close();
        } catch (Exception e) {
            JOptionPane.showMessageDialog(this,e.getMessage());
            e.printStackTrace();
        } 
        DefaultComboBoxModel cModel;
        cModel = (DefaultComboBoxModel) jComboBox1.getModel(); 
        try
        {
            Class.forName("java.sql.Driver");
            Connection con = (Connection) DriverManager.getConnection("jdbc:mysql://localhost:3306/bmtt","root","mysql");
            Statement stmt = (Statement) con.createStatement();
            String hh1 = "select * from cabs where available = 'Y'";
           
            ResultSet rs1 = stmt.executeQuery(hh1);
           
            while (rs1.next())
            {
                String cname = rs1.getString("cname");
                String cid = rs1.getString("cid");
                
                        cModel.addElement(cname+"~"+cid);
            }
        }
        catch (Exception e)
        {
            JOptionPane.showMessageDialog(this, e.getMessage());
        }
        
        DefaultComboBoxModel dModel;
        dModel = (DefaultComboBoxModel) jComboBox2.getModel();
        try
        {
              Class.forName("java.sql.Driver");
            Connection con = (Connection) DriverManager.getConnection("jdbc:mysql://localhost:3306/bmtt","root","mysql");
            Statement stmt = (Statement) con.createStatement();
             String hh = "select * from drivers where available = 'Y'";
              ResultSet rs = stmt.executeQuery(hh);
             while (rs.next())
            {
                String dname = rs.getString("dname");
                String did = rs.getString("did");
                
                        dModel.addElement(dname+"~"+did);
            }  
        }
        catch (Exception e)
        {
            JOptionPane.showMessageDialog(this, e.getMessage());
        }
         DefaultComboBoxModel custModel;
        custModel = (DefaultComboBoxModel) jComboBox3.getModel();
           try
        {
              Class.forName("java.sql.Driver");
            Connection con = (Connection) DriverManager.getConnection("jdbc:mysql://localhost:3306/bmtt","root","mysql");
            Statement stmt = (Statement) con.createStatement();
             String hc = "select * from customers where book = 'n'";
              ResultSet rs3 = stmt.executeQuery(hc);
             while (rs3.next())
            {
                String cname = rs3.getString("cust_name");
                String custid = rs3.getString("cust_id");
                
                        custModel.addElement(cname+"~"+custid);
            }  
        }
        catch (Exception e)
        {
            JOptionPane.showMessageDialog(this, e.getMessage());
        }
    }//GEN-LAST:event_formWindowOpened

    private void jComboBox3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jComboBox3ActionPerformed
         String choice =(String) jComboBox3.getSelectedItem();
        String s[] = choice.split("~");
        
        try
        {
            Class.forName("java.sql.Driver");
            Connection con = (Connection) DriverManager.getConnection("jdbc:mysql://localhost:3306/bmtt","root","mysql");
            Statement stmt = (Statement) con.createStatement();
            String hh = "select * from customers where cust_id = "+s[1];
            ResultSet rs1 = stmt.executeQuery(hh);
            rs1.first();
                txtcustid.setText(rs1.getString("cust_id"));
            
        
        }
        catch (Exception e)
        {
            JOptionPane.showMessageDialog(this, e.getMessage());
        }
    }//GEN-LAST:event_jComboBox3ActionPerformed

    private void jComboBox2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jComboBox2ActionPerformed
               String choice =(String) jComboBox2.getSelectedItem();
        String s[] = choice.split("~");
        
        try
        {
            Class.forName("java.sql.Driver");
            Connection con = (Connection) DriverManager.getConnection("jdbc:mysql://localhost:3306/bmtt","root","mysql");
            Statement stmt = (Statement) con.createStatement();
            String hh = "select * from drivers where did = "+s[1];
            ResultSet rs1 = stmt.executeQuery(hh);
            rs1.first();
                txtdid.setText(rs1.getString("did"));
            
        
        }
        catch (Exception e)
        {
            JOptionPane.showMessageDialog(this, e.getMessage());
        }
    }//GEN-LAST:event_jComboBox2ActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
       try
       {
            Class.forName("com.mysql.jdbc.Driver");
            Connection conn = (Connection)
                    DriverManager.getConnection("jdbc:mysql://localhost:3306/bmtt","root","mysql");
            Statement stmt = conn.createStatement();  
            String cid = txtcid.getText();
            
            String did = txtdid.getText();
            String custid = txtcustid.getText();
            java.util.Date d1 = jd1.getDate();
           java.util.Date d2 = jd2.getDate();
           String s1 = (d1.getYear()+1900)+"/"+(d1.getMonth()+1)+"/"+d1.getDate();
           String s2 = (d2.getYear()+1900)+"/"+(d2.getMonth()+1)+"/"+d2.getDate();
           long diff = d2.getTime()-d1.getTime();
           long nod = diff/(24L*60L*60L*1000L);
           txtnod.setText(""+nod);
           JOptionPane.showMessageDialog(this, "No of days = " + nod);
           String strSQL = "INSERT INTO bookings(cid, did, custid,from_date,to_date,nod) VALUES ('"+(cid)+"','"+(did)+"','"+(custid)+"','"+(s1)+"','"+(s2)+"','"+(nod)+"');";
           String h1 = "update cabs set available = 'n' where cid ="+(cid);
           String h2 = "update drivers set available = 'n' where did ="+(did);
           String h3 = "update customers set book = 'Y' where cust_id ="+(custid);
           int rs1 = stmt.executeUpdate(h1);
           int rs2 = stmt.executeUpdate(h2);
           int rs3 = stmt.executeUpdate(h3);
            int rowsEffected = stmt.executeUpdate(strSQL);
            JOptionPane.showMessageDialog(this, "Record successfully inserted");
            System.out.println(rowsEffected + " rows effected");
            conn.close();
           
          
       }
       catch(Exception e)
       {
           JOptionPane.showMessageDialog(this, e.getMessage());
       }
    }//GEN-LAST:event_jButton1ActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
       this.setVisible(false);
        new MAIN_FRAME().setVisible(true);
    }//GEN-LAST:event_jButton2ActionPerformed

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
            java.util.logging.Logger.getLogger(CAB_BOOKINGS.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(CAB_BOOKINGS.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(CAB_BOOKINGS.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(CAB_BOOKINGS.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new CAB_BOOKINGS().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JComboBox<String> jComboBox1;
    private javax.swing.JComboBox<String> jComboBox2;
    private javax.swing.JComboBox<String> jComboBox3;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JTextField txtcid;
    private javax.swing.JTextField txtcustid;
    private javax.swing.JTextField txtdid;
    private javax.swing.JTextField txtnod;
    // End of variables declaration//GEN-END:variables
}
