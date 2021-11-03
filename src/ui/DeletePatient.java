/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ui;

import java.awt.Color;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import javax.swing.JOptionPane;
import model.City;
import model.Patient;
import model.PatientDirectory;

/**
 *
 * @author NetrA
 */
public class DeletePatient extends javax.swing.JPanel {

    /**
     * Creates new form DeletePatient
     */
    City city;
    PatientDirectory history;
   public DeletePatient(PatientDirectory history,City city) {
        initComponents();
        this.history = history;
        this.city=city;
    }


     

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jButton1 = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        txtPatientID = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();

        setBackground(new java.awt.Color(255, 255, 255));
        setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jButton1.setForeground(new java.awt.Color(0, 102, 102));
        jButton1.setText("Delete");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        add(jButton1, new org.netbeans.lib.awtextra.AbsoluteConstraints(500, 180, -1, -1));

        jLabel1.setForeground(new java.awt.Color(0, 102, 102));
        jLabel1.setText("Enter Patient ID");
        add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(410, 110, -1, 30));

        txtPatientID.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                txtPatientIDKeyReleased(evt);
            }
        });
        add(txtPatientID, new org.netbeans.lib.awtextra.AbsoluteConstraints(540, 110, 164, -1));

        jLabel2.setFont(new java.awt.Font("Lucida Grande", 1, 18)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(0, 102, 102));
        jLabel2.setText("Delete Patient Record");
        add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(460, 40, -1, -1));
    }// </editor-fold>//GEN-END:initComponents

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
       Integer pID=Integer.parseInt( txtPatientID.getText());
       for(int i=0; i<history.getpatientDirectory().size(); i++)
        {
       int patientid = (history.getpatientDirectory().get(i).getPatientID());
    if(pID == patientid)
    {
        history.removePatient(history.getpatientDirectory().get(i));
        
    }
        }
    }//GEN-LAST:event_jButton1ActionPerformed

    private void txtPatientIDKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtPatientIDKeyReleased
        // TODO add your handling code here:
        String PATTERN1="^[0-9]{1,4}$";
       Pattern patt=Pattern.compile(PATTERN1);
       Matcher match=patt.matcher(txtPatientID.getText().toString());
       if(!match.matches()){
       txtPatientID.setBackground(Color.red);
       }
       
       else  {
       txtPatientID.setBackground(Color.white);
       }
        
    }//GEN-LAST:event_txtPatientIDKeyReleased


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JTextField txtPatientID;
    // End of variables declaration//GEN-END:variables
}