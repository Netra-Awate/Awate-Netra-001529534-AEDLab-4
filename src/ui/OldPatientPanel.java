/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package ui;

import java.awt.Color;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import javax.swing.JOptionPane;
import model.City;
import model.Encounter;
import model.EncounterHistory;
import model.PatientDirectory;
import model.VitalSigns;

/**
 *
 * @author NetrA
 */
public class OldPatientPanel extends javax.swing.JPanel {

    /** Creates new form SGraphJPanel */
    PatientDirectory history;
    City city;
    public OldPatientPanel(PatientDirectory history,City city) {
        this.history = history;
        this.city=city;
        initComponents();
        populateTable();
    }

    /** This method is called from within the constructor to
     * initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is
     * always regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        txtPulse = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        txtBP = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        txtBT = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        txtID = new javax.swing.JTextField();
        jLabel6 = new javax.swing.JLabel();
        txtRespiration = new javax.swing.JTextField();
        btnAddVital = new javax.swing.JButton();

        setBackground(new java.awt.Color(255, 255, 255));
        setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setBackground(new java.awt.Color(255, 255, 255));
        jLabel1.setFont(new java.awt.Font("Lucida Grande", 1, 18)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(0, 102, 102));
        jLabel1.setText("Add vitals for Existing Patient");
        add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(430, 50, 300, 20));

        jLabel2.setForeground(new java.awt.Color(0, 102, 102));
        jLabel2.setText("Pulse rate");
        add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(430, 280, -1, 30));

        txtPulse.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                txtPulseKeyReleased(evt);
            }
        });
        add(txtPulse, new org.netbeans.lib.awtextra.AbsoluteConstraints(580, 290, 100, -1));

        jLabel3.setForeground(new java.awt.Color(0, 102, 102));
        jLabel3.setText("Blood pressure");
        add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(400, 200, -1, -1));

        txtBP.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtBPActionPerformed(evt);
            }
        });
        txtBP.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                txtBPKeyReleased(evt);
            }
        });
        add(txtBP, new org.netbeans.lib.awtextra.AbsoluteConstraints(580, 190, 100, -1));

        jLabel4.setForeground(new java.awt.Color(0, 102, 102));
        jLabel4.setText("Body Temperature");
        add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(380, 240, -1, 30));

        txtBT.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                txtBTKeyReleased(evt);
            }
        });
        add(txtBT, new org.netbeans.lib.awtextra.AbsoluteConstraints(580, 240, 100, -1));

        jLabel5.setForeground(new java.awt.Color(0, 102, 102));
        jLabel5.setText("Patient ID");
        add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(430, 150, -1, -1));

        txtID.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                txtIDKeyReleased(evt);
            }
        });
        add(txtID, new org.netbeans.lib.awtextra.AbsoluteConstraints(580, 140, 100, -1));

        jLabel6.setForeground(new java.awt.Color(0, 102, 102));
        jLabel6.setText("Respiration");
        add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(420, 350, -1, -1));

        txtRespiration.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                txtRespirationKeyReleased(evt);
            }
        });
        add(txtRespiration, new org.netbeans.lib.awtextra.AbsoluteConstraints(580, 350, 100, -1));

        btnAddVital.setForeground(new java.awt.Color(0, 102, 102));
        btnAddVital.setText("Add Vitals");
        btnAddVital.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAddVitalActionPerformed(evt);
            }
        });
        add(btnAddVital, new org.netbeans.lib.awtextra.AbsoluteConstraints(510, 420, 130, -1));
    }// </editor-fold>//GEN-END:initComponents

    private void btnAddVitalActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAddVitalActionPerformed
        // TODO add your handling code here:
         Integer id = Integer.parseInt(txtID.getText());
         
        Integer bp = Integer.parseInt(txtBP.getText());
      Integer pulse = Integer.parseInt(txtPulse.getText());
      Integer bt = Integer.parseInt(txtBT.getText());
      Integer respiration = Integer.parseInt(txtRespiration.getText());
    String timestamp = new SimpleDateFormat("MM/dd/yyyy").format(Calendar.getInstance().getTime());

  //chup   Person patient = history.addNewPerson();
      ///////////////////////////////////////////////////////////////////////////////////////
//DefaultTableModel model = (DefaultTableModel)tblPatient.getModel();

for(int i=0; i<history.getpatientDirectory().size(); i++)
{
   int patientid = (history.getpatientDirectory().get(i).getPatientID());
    if(id == patientid)
    {
      EncounterHistory eh=history.getpatientDirectory().get(i).getEncounterHistory();
      VitalSigns vs=new VitalSigns(respiration,pulse,bp,bt);
      Encounter encounter=new Encounter(timestamp,vs);
       eh.addNewEncounter(encounter);
        
    //Object[] object={
   // Patient pat=new Patient( history.getPersonDirectory().get(i).getName(),history.getPersonDirectory().get(i).getPatientID(),history.getPersonDirectory().get(i).getAge(),history.getPersonDirectory().get(i).getMobileNo())
//       patient.setName(history.getPersonDirectory().get(i).getName());
//       patient.setPatientID(history.getPersonDirectory().get(i).getPatientID());
//        patient.setAge(history.getPersonDirectory().get(i).getAge());
//        patient.setMobileNo(history.getPersonDirectory().get(i).getMobileNo());
        //patient.setResidence(history.getPersonDirectory().get(i).getResidence());
        //patient.setCommunity(history.getPersonDirectory().get(i).getCommunity());
      //  patient.setCity(history.getPersonDirectory().get(i).getCity());
//       patient.setBp(bp);
//      patient.setPulse(pulse);
//      patient.setBt(bt);
//      patient.setRespiration(respiration);
//      patient.setTimestamp(timestamp);

        
  // };

     

//model.addRow(object);


      
     
      txtID.setText("");
      txtBP.setText("");
      txtPulse.setText("");
      txtBT.setText("");
      txtRespiration.setText("");
      txtID.setBackground(Color.white);
      txtBP.setBackground(Color.white);
      txtBT.setBackground(Color.white);
      txtRespiration.setBackground(Color.white);
}  JOptionPane.showMessageDialog(this,"New vitals added for the patient.");
}
    }//GEN-LAST:event_btnAddVitalActionPerformed

    private void txtBPActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtBPActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtBPActionPerformed

    private void txtIDKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtIDKeyReleased
        // TODO add your handling code here:
        String PATTERN1="^[0-9]{1,4}$";
       Pattern patt=Pattern.compile(PATTERN1);
       Matcher match=patt.matcher(txtID.getText().toString());
       if(!match.matches()){
       txtID.setBackground(Color.red);
       }
       
       else  {
       txtID.setBackground(Color.white);
       }
        
    }//GEN-LAST:event_txtIDKeyReleased

    private void txtBPKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtBPKeyReleased
        // TODO add your handling code here:
        String PATTERN="^[0-9-. ]{1,5}$";
       Pattern patt=Pattern.compile(PATTERN);
       Matcher match=patt.matcher(txtBP.getText());
       if(!match.matches()){
       txtBP.setBackground(Color.red);
       }
       else{
       txtBP.setBackground(Color.white);
       }
       
       if((txtBP.getText()).isEmpty()){
           txtBP.setBackground(Color.red);
       }
    }//GEN-LAST:event_txtBPKeyReleased

    private void txtBTKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtBTKeyReleased
        // TODO add your handling code here:
        String PATTERN="^[0-9-. ]{1,5}$";
       Pattern patt=Pattern.compile(PATTERN);
       Matcher match=patt.matcher(txtBT.getText());
       if(!match.matches()){
       txtBT.setBackground(Color.red);
       }
       else{
       txtBT.setBackground(Color.white);
       }
       
       if((txtBT.getText()).isEmpty()){
           txtBT.setBackground(Color.red);
       }
    }//GEN-LAST:event_txtBTKeyReleased

    private void txtPulseKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtPulseKeyReleased
        // TODO add your handling code here:
        String PATTERN="^[0-9-. ]{1,5}$";
       Pattern patt=Pattern.compile(PATTERN);
       Matcher match=patt.matcher(txtPulse.getText());
       if(!match.matches()){
       txtPulse.setBackground(Color.red);
       }
       else{
       txtPulse.setBackground(Color.white);
       }
       
       if((txtPulse.getText()).isEmpty()){
           txtPulse.setBackground(Color.red);
       }
    }//GEN-LAST:event_txtPulseKeyReleased

    private void txtRespirationKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtRespirationKeyReleased
        // TODO add your handling code here:
        String PATTERN="^[0-9-. ]{1,5}$";
       Pattern patt=Pattern.compile(PATTERN);
       Matcher match=patt.matcher(txtRespiration.getText());
       if(!match.matches()){
       txtRespiration.setBackground(Color.red);
       }
       else{
       txtRespiration.setBackground(Color.white);
       }
       
       if((txtRespiration.getText()).isEmpty()){
           txtRespiration.setBackground(Color.red);
       }
    }//GEN-LAST:event_txtRespirationKeyReleased
    

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnAddVital;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JTextField txtBP;
    private javax.swing.JTextField txtBT;
    private javax.swing.JTextField txtID;
    private javax.swing.JTextField txtPulse;
    private javax.swing.JTextField txtRespiration;
    // End of variables declaration//GEN-END:variables

    private void populateTable() {
        
        
    }

}
