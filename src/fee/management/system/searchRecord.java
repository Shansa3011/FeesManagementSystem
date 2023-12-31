/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package fee.management.system;

import java.awt.Color;
import java.awt.Color;
import java.util.Date;
import javax.swing.JOptionPane;
import java.sql.*;
import java.sql.DriverManager;
import javax.xml.transform.Result;
import java.util.Date;
import javax.swing.JOptionPane;
import java.lang.*;
import java.text.SimpleDateFormat;
import javax.swing.RowFilter;
import javax.swing.table.DefaultTableModel;
import javax.swing.table.TableRowSorter;
/**
 *
 * @author sathw
 */
public class searchRecord extends javax.swing.JFrame {
    DefaultTableModel model;
    /**
     * Creates new form searchRecord
     */
    public searchRecord() {
        initComponents();
        setRecordsTable();
    }
    
    public void setRecordsTable(){
        try{
            Connection Con=DBconnection.getConnection();
            PreparedStatement stmt=Con.prepareStatement("select * from fees_details");
            ResultSet rs= stmt.executeQuery();
            while(rs.next()){
             String receiptno=rs.getString("reciept_no");
             String rollno=rs.getString("roll_no");
             String studentname=rs.getString("student_name");
             String Paymentmode=rs.getString("payment_mode");
             String course=rs.getString("course_name");
             String amount=rs.getString("amount");
             
             Object[] obj={receiptno,rollno,studentname,Paymentmode,course,amount};
             model=(DefaultTableModel) tblstudentdata.getModel();
             model.addRow(obj);
             
             
            }
            
        }
        catch(Exception e)
        {
            e.printStackTrace();
            
        }
    }
    public void search(String str){
        model=(DefaultTableModel) tblstudentdata.getModel();
        TableRowSorter<DefaultTableModel> trs=new TableRowSorter<>(model);
        tblstudentdata.setRowSorter(trs);
        trs.setRowFilter(RowFilter.regexFilter(str));
        
    }
    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        panelsidebar = new javax.swing.JPanel();
        paneledit = new javax.swing.JPanel();
        btnedit = new javax.swing.JLabel();
        panelhome = new javax.swing.JPanel();
        btnhome = new javax.swing.JLabel();
        panelsearchrecord = new javax.swing.JPanel();
        btnsearchrecord = new javax.swing.JLabel();
        panelviewall = new javax.swing.JPanel();
        btnviewall = new javax.swing.JLabel();
        panellogout = new javax.swing.JPanel();
        btnlogout = new javax.swing.JLabel();
        panelback = new javax.swing.JPanel();
        btnback = new javax.swing.JLabel();
        jPanel1 = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        tblstudentdata = new javax.swing.JTable();
        jLabel1 = new javax.swing.JLabel();
        jTextField1 = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        panelsidebar.setBackground(new java.awt.Color(255, 255, 255));
        panelsidebar.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED, null, new java.awt.Color(51, 102, 255), null, null));
        panelsidebar.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        paneledit.setBackground(new java.awt.Color(153, 255, 255));
        paneledit.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        paneledit.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                paneleditMouseEntered(evt);
            }
        });
        paneledit.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        btnedit.setFont(new java.awt.Font("Times New Roman", 0, 18)); // NOI18N
        btnedit.setText("        Edit Course");
        btnedit.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btneditMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                btneditMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                btneditMouseExited(evt);
            }
        });
        paneledit.add(btnedit, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 10, 170, -1));

        panelsidebar.add(paneledit, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 170, 170, 40));

        panelhome.setBackground(new java.awt.Color(153, 255, 255));
        panelhome.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        panelhome.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                panelhomeMouseEntered(evt);
            }
        });
        panelhome.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        btnhome.setFont(new java.awt.Font("Times New Roman", 0, 18)); // NOI18N
        btnhome.setText("            Home");
        btnhome.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnhomeMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                btnhomeMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                btnhomeMouseExited(evt);
            }
        });
        panelhome.add(btnhome, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 10, 170, -1));

        panelsidebar.add(panelhome, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 50, 170, 40));

        panelsearchrecord.setBackground(new java.awt.Color(153, 255, 255));
        panelsearchrecord.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED, null, new java.awt.Color(51, 204, 255), null, null));
        panelsearchrecord.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                panelsearchrecordMouseEntered(evt);
            }
        });
        panelsearchrecord.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        btnsearchrecord.setFont(new java.awt.Font("Times New Roman", 0, 18)); // NOI18N
        btnsearchrecord.setText("      Search Record");
        btnsearchrecord.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                btnsearchrecordMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                btnsearchrecordMouseExited(evt);
            }
        });
        panelsearchrecord.add(btnsearchrecord, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 10, 170, -1));

        panelsidebar.add(panelsearchrecord, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 110, 170, 40));

        panelviewall.setBackground(new java.awt.Color(153, 255, 255));
        panelviewall.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        panelviewall.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                panelviewallMouseEntered(evt);
            }
        });
        panelviewall.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        btnviewall.setFont(new java.awt.Font("Times New Roman", 0, 18)); // NOI18N
        btnviewall.setText("   View All Records");
        btnviewall.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnviewallMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                btnviewallMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                btnviewallMouseExited(evt);
            }
        });
        panelviewall.add(btnviewall, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 10, 170, -1));

        panelsidebar.add(panelviewall, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 230, 170, 40));

        panellogout.setBackground(new java.awt.Color(153, 255, 255));
        panellogout.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        panellogout.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                panellogoutMouseEntered(evt);
            }
        });
        panellogout.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        btnlogout.setFont(new java.awt.Font("Times New Roman", 0, 18)); // NOI18N
        btnlogout.setText("          Logout ");
        btnlogout.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnlogoutMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                btnlogoutMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                btnlogoutMouseExited(evt);
            }
        });
        panellogout.add(btnlogout, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 10, 170, -1));

        panelsidebar.add(panellogout, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 350, 170, 40));

        panelback.setBackground(new java.awt.Color(153, 255, 255));
        panelback.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        panelback.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                panelbackMouseEntered(evt);
            }
        });
        panelback.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        btnback.setFont(new java.awt.Font("Times New Roman", 0, 18)); // NOI18N
        btnback.setText("            Back");
        btnback.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnbackMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                btnbackMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                btnbackMouseExited(evt);
            }
        });
        panelback.add(btnback, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 10, 170, -1));

        panelsidebar.add(panelback, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 290, 170, 40));

        getContentPane().add(panelsidebar, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 220, 620));

        jPanel1.setBackground(new java.awt.Color(153, 255, 204));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        tblstudentdata.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Receipt no", "Roll no", "Student name", "course", "payment mode", "amount"
            }
        ));
        jScrollPane1.setViewportView(tblstudentdata);

        jPanel1.add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(18, 156, 547, -1));

        jLabel1.setFont(new java.awt.Font("Times New Roman", 0, 24)); // NOI18N
        jLabel1.setText("Search Record");
        jPanel1.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(250, 10, -1, -1));

        jTextField1.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                jTextField1KeyReleased(evt);
            }
        });
        jPanel1.add(jTextField1, new org.netbeans.lib.awtextra.AbsoluteConstraints(250, 70, 190, -1));

        jLabel2.setText("Enter Search Value:");
        jPanel1.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 70, -1, 20));

        getContentPane().add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(220, 0, 590, 620));

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void btneditMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btneditMouseEntered
        // TODO add your handling code here:
        Color clr=new Color(153,204,255);
        paneledit.setBackground(clr);
    }//GEN-LAST:event_btneditMouseEntered

    private void btneditMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btneditMouseExited
        // TODO add your handling code here:
        Color clr=new Color(153,255,255);
        paneledit.setBackground(clr);
    }//GEN-LAST:event_btneditMouseExited

    private void paneleditMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_paneleditMouseEntered
        // TODO add your handling code here:
    }//GEN-LAST:event_paneleditMouseEntered

    private void btnhomeMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnhomeMouseClicked
        // TODO add your handling code here:.
        home hm=new home();
        hm.show();
        this.dispose();
    }//GEN-LAST:event_btnhomeMouseClicked

    private void btnhomeMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnhomeMouseEntered
        // TODO add your handling code here:
        Color clr=new Color(153,204,255);
        panelhome.setBackground(clr);
    }//GEN-LAST:event_btnhomeMouseEntered

    private void btnhomeMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnhomeMouseExited
        // TODO add your handling code here:
        Color clr=new Color(153,255,255);
        panelhome.setBackground(clr);

    }//GEN-LAST:event_btnhomeMouseExited

    private void panelhomeMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_panelhomeMouseEntered
        // TODO add your handling code here:
    }//GEN-LAST:event_panelhomeMouseEntered

    private void btnsearchrecordMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnsearchrecordMouseEntered
        // TODO add your handling code here:
        Color clr=new Color(153,204,255);
        panelsearchrecord.setBackground(clr);
    }//GEN-LAST:event_btnsearchrecordMouseEntered

    private void btnsearchrecordMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnsearchrecordMouseExited
        // TODO add your handling code here:
        Color clr=new Color(153,255,255);
        panelsearchrecord.setBackground(clr);
    }//GEN-LAST:event_btnsearchrecordMouseExited

    private void panelsearchrecordMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_panelsearchrecordMouseEntered
        // TODO add your handling code here:
    }//GEN-LAST:event_panelsearchrecordMouseEntered

    private void btnviewallMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnviewallMouseEntered
        // TODO add your handling code here:
        Color clr=new Color(153,204,255);
        panelviewall.setBackground(clr);
    }//GEN-LAST:event_btnviewallMouseEntered

    private void btnviewallMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnviewallMouseExited
        // TODO add your handling code here:
        Color clr=new Color(153,255,255);
        panelviewall.setBackground(clr);
    }//GEN-LAST:event_btnviewallMouseExited

    private void panelviewallMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_panelviewallMouseEntered
        // TODO add your handling code here:
    }//GEN-LAST:event_panelviewallMouseEntered

    private void btnlogoutMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnlogoutMouseEntered
        // TODO add your handling code here:
        Color clr=new Color(153,204,255);
        panellogout.setBackground(clr);
    }//GEN-LAST:event_btnlogoutMouseEntered

    private void btnlogoutMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnlogoutMouseExited
        // TODO add your handling code here:
        Color clr=new Color(153,255,255);
        panellogout.setBackground(clr);
    }//GEN-LAST:event_btnlogoutMouseExited

    private void panellogoutMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_panellogoutMouseEntered
        // TODO add your handling code here:

    }//GEN-LAST:event_panellogoutMouseEntered

    private void btnbackMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnbackMouseEntered
        // TODO add your handling code here:
        Color clr=new Color(153,204,255);
        panelback.setBackground(clr);
    }//GEN-LAST:event_btnbackMouseEntered

    private void btnbackMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnbackMouseExited
        // TODO add your handling code here:
        Color clr=new Color(153,255,255);
        panelback.setBackground(clr);
    }//GEN-LAST:event_btnbackMouseExited

    private void panelbackMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_panelbackMouseEntered
        // TODO add your handling code here:
    }//GEN-LAST:event_panelbackMouseEntered

    private void jTextField1KeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jTextField1KeyReleased
        // TODO add your handling code here:
        String searchstr=jTextField1.getText();
        search(searchstr);
    }//GEN-LAST:event_jTextField1KeyReleased

    private void btneditMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btneditMouseClicked
        // TODO add your handling code here:
        editCourse ec=new editCourse();
        ec.show();
        this.dispose();
    }//GEN-LAST:event_btneditMouseClicked

    private void btnviewallMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnviewallMouseClicked
        // TODO add your handling code here:
        viewAllRecord var=new viewAllRecord();
        var.show();
        this.dispose();
    }//GEN-LAST:event_btnviewallMouseClicked

    private void btnbackMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnbackMouseClicked
        // TODO add your handling code here:
        System.exit(0);
    }//GEN-LAST:event_btnbackMouseClicked

    private void btnlogoutMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnlogoutMouseClicked
        // TODO add your handling code here:
        Login lg=new Login();
        lg.show();
        this.dispose();
    }//GEN-LAST:event_btnlogoutMouseClicked

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
            java.util.logging.Logger.getLogger(searchRecord.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(searchRecord.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(searchRecord.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(searchRecord.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new searchRecord().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel btnback;
    private javax.swing.JLabel btnedit;
    private javax.swing.JLabel btnhome;
    private javax.swing.JLabel btnlogout;
    private javax.swing.JLabel btnsearchrecord;
    private javax.swing.JLabel btnviewall;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTextField jTextField1;
    private javax.swing.JPanel panelback;
    private javax.swing.JPanel paneledit;
    private javax.swing.JPanel panelhome;
    private javax.swing.JPanel panellogout;
    private javax.swing.JPanel panelsearchrecord;
    private javax.swing.JPanel panelsidebar;
    private javax.swing.JPanel panelviewall;
    private javax.swing.JTable tblstudentdata;
    // End of variables declaration//GEN-END:variables
}
