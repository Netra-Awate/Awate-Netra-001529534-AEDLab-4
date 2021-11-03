/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model;

import java.util.Date;

/**
 *
 * @author NetrA
 */

public class Encounter { 
    PatientDirectory pDirectory = new PatientDirectory();
        Encounter eh;
    
    
    private String dateOfEncounter;
    private VitalSigns vitalSigns;
    

    @Override
    public String toString() {
        return "Encounter{" + "dateOfEncounter=" + dateOfEncounter + ", vitalSigns=" + vitalSigns + '}';
    }

    public Encounter(String dateOfEncounter, VitalSigns vitalSigns) {
        this.dateOfEncounter = dateOfEncounter;
        this.vitalSigns = vitalSigns;
    }

    public VitalSigns getVitalSigns() {
        return vitalSigns;
    }

    public void setVitalSigns(VitalSigns vitalSigns) {
        this.vitalSigns = vitalSigns;
    }

    public String getDateOfEncounter() {
        return dateOfEncounter;
    }

    public void setDateOfEncounter(String dateOfEncounter) {
        this.dateOfEncounter = dateOfEncounter;
    }
    //implement logic to decide if patient is normal

    public boolean isPatientNormal() {

        return false;
    }

//    public boolean isVitalSignAbNormalBP(Patient paitient, String community) {
//        System.out.println("  out of for"+community);
//        
//       for(int i=0; i<pDirectory.getpatientDirectory().size(); i++){
//           Double pbp = eh.getVitalSigns().getBp();
//           System.out.println("  in of for"+pbp);
//           String pcommunity = community;
//                if(pbp <=  50 && pbp >=  70)
//                {
//                    return true;
//                       }
//       }
//        return false;
//    
//    }

    public Boolean isVitalSignAbNormalBP(Encounter r) {
        if(r.getVitalSigns().getBp() <= 50  || r.getVitalSigns().getBp() >= 70)
        {
        return true;
        }
        else{
        return false;
        }
   
    } public Boolean isVitalSignAbNormalRespiration(Encounter r) {
        if(r.getVitalSigns().getRespiratoryRate() <= 90  || r.getVitalSigns().getBp() >= 100)
        {
        return true;
        }
        else{
        return false;
        }
   
    } public Boolean isVitalSignAbNormalPulse(Encounter r) {
        if(r.getVitalSigns().getHeartRate() <= 60  || r.getVitalSigns().getHeartRate() >= 100)
        {
        return true;
        }
        else{
        return false;
        }
   
    } public Boolean isVitalSignAbNormalBT(Encounter r) {
        if(r.getVitalSigns().getBt() <= 90  || r.getVitalSigns().getBt() >= 105)
        {
        return true;
        }
        else{
        return false;
        }
   
    }
}

   
