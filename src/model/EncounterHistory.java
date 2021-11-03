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
public class EncounterHistory {
      
    private List<Encounter> encounterHistory;
    
    public EncounterHistory() {
        encounterHistory = new ArrayList<>();
    }

    public List<Encounter> getEncounterHistory() {
        return encounterHistory;
    }

    public void setEncounterHistory(List<Encounter> encounterHistory) {
        this.encounterHistory = encounterHistory;
    }
    
    public Encounter addNewEncounter(Encounter encounter) {
        encounterHistory.add(encounter);
        return encounter;
    }
}
