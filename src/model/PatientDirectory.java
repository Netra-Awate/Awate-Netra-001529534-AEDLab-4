/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author NetrA
 */
public class PatientDirectory {
     private List<Patient> patientDirectory;

    public PatientDirectory() {
        patientDirectory = new ArrayList<>();
    }

    public List<Patient> getpatientDirectory() {
        return patientDirectory;
    }

    public void setpatientDirectory(List<Patient> patientDirectory) {
        this.patientDirectory = patientDirectory;
    }
    
    
    public Patient addPatient(Patient patient) {
        patientDirectory.add(patient);
        return patient;
    }
    
    public void removePatient(Patient patient) {
        patientDirectory.remove(patient);
    }
    
    public Patient searchPatient(String patientName) {
        for(Patient patient : patientDirectory) {
            if(patient.getName().equalsIgnoreCase(patientName)) {
                return patient;
            }
        }
        return null;
    }  
    
    
}
