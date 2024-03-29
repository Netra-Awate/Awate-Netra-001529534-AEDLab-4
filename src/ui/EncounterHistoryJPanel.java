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
import javax.swing.table.DefaultTableModel;
import model.City;
import model.Encounter;
import model.Patient;
import model.PatientDirectory;
import model.Person;
import model.PersonDirectory;

/**
 *
 * @author NetrA
 */
public class EncounterHistoryJPanel extends javax.swing.JPanel {

    /**
     * Creates new form EncounterHistoryJPanel
     */
    PatientDirectory pDirectory;
    City city;
    public EncounterHistoryJPanel(PatientDirectory history,City city) {
        initComponents();
        this.pDirectory = history;
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

        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        txtName = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        txtID = new javax.swing.JTextField();
        btnEncounter = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        tblEncounter = new javax.swing.JTable();

        setBackground(new java.awt.Color(255, 255, 255));
        setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setFont(new java.awt.Font("Lucida Grande", 1, 18)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(0, 102, 102));
        jLabel1.setText("Enter Patient Name and PatientID to view Encounter visit history.");
        add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(270, 40, -1, -1));

        jLabel2.setForeground(new java.awt.Color(0, 102, 102));
        jLabel2.setText("Patient Name:");
        add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 90, -1, 30));

        txtName.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                txtNameKeyReleased(evt);
            }
        });
        add(txtName, new org.netbeans.lib.awtextra.AbsoluteConstraints(300, 90, 80, -1));

        jLabel3.setForeground(new java.awt.Color(0, 102, 102));
        jLabel3.setText("PatientID:");
        add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(490, 90, -1, 30));

        txtID.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                txtIDKeyReleased(evt);
            }
        });
        add(txtID, new org.netbeans.lib.awtextra.AbsoluteConstraints(560, 90, 80, -1));

        btnEncounter.setForeground(new java.awt.Color(0, 102, 102));
        btnEncounter.setText("View History");
        btnEncounter.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnEncounterActionPerformed(evt);
            }
        });
        add(btnEncounter, new org.netbeans.lib.awtextra.AbsoluteConstraints(730, 90, -1, -1));

        tblEncounter.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null}
            },
            new String [] {
                "Patient Name", "Patient ID", "Blood Pressure", "Pulse Rate", "Respiration", "Body Temperature"
            }
        ));
        jScrollPane1.setViewportView(tblEncounter);

        add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 230, 770, 160));
    }// </editor-fold>//GEN-END:initComponents
 
    
    private void addObjectToRow(Patient p)
    {
        DefaultTableModel model = (DefaultTableModel)tblEncounter.getModel();
        model.setRowCount(0);
        for(Encounter e: p.getEncounterHistory().getEncounterHistory())
        {
            Object[] object=
             {           
            p.getName(),
            p.getPatientID(),
            e.getVitalSigns().getBt(),
            e.getVitalSigns().getHeartRate(),
            e.getVitalSigns().getBp(),
            e.getVitalSigns().getRespiratoryRate()
             };
            model.addRow(object); 
        }
        
    }

    private void btnEncounterActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnEncounterActionPerformed
        // TODO add your handling code here:
        DefaultTableModel model = (DefaultTableModel)tblEncounter.getModel();
      
        model.setRowCount(0);
        
        Integer id = Integer.parseInt(txtID.getText());
            String name = txtName.getText();
            
            if (id == null || name ==null){
            
             JOptionPane.showMessageDialog(this,"Enter all values for the search!","ERROR",JOptionPane.ERROR_MESSAGE);
            }
            
        for(int i=0; i<pDirectory.getpatientDirectory().size(); i++){ 
            
            Patient p=pDirectory.getpatientDirectory().get(i);
            if (id==p.getPatientID() || name==p.getName()){
                          
                addObjectToRow(p);
     
            }
           
            
            else{
             JOptionPane.showMessageDialog(this,"No record exists for given values!!","ERROR",JOptionPane.ERROR_MESSAGE );
                
            }
        }
    }//GEN-LAST:event_btnEncounterActionPerformed

    private void txtNameKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtNameKeyReleased
        // TODO add your handling code here:
//        String PATTERN="^[a-zA-Z- ]{5,10}$";
//       Pattern patt=Pattern.compile(PATTERN);
//       Matcher match=patt.matcher(txtName.getText());
//       if(!match.matches()){
//       txtName.setBackground(Color.red);
//       }
//       
       
       
    }//GEN-LAST:event_txtNameKeyReleased

    private void txtIDKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtIDKeyReleased
        // TODO add your handling code here:
//        String PATTERN="^[0-9]{1,2}$";
//       Pattern patt=Pattern.compile(PATTERN);
//       Matcher match=patt.matcher(txtID.getText());
//       if(!match.matches()){
//       txtID.setBackground(Color.red);
//       }
       
       
       
    }//GEN-LAST:event_txtIDKeyReleased


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnEncounter;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable tblEncounter;
    private javax.swing.JTextField txtID;
    private javax.swing.JTextField txtName;
    // End of variables declaration//GEN-END:variables
}
