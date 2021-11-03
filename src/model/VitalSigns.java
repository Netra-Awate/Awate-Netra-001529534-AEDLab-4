/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model;

/**
 *
 * @author NetrA
 */
public class VitalSigns {
       
   // private String ageGroup;
    private double respiratoryRate;
    private double heartRate;
    private double bp;
    private double bt;
//    private double weightInKilos;
//    private double weightInPounds;

    public double getBt() {
        return bt;
    }

    public void setBt(double bt) {
        this.bt = bt;
    }

    public VitalSigns( double respiratoryRate, double heartRate, double bp, double bt) {
      //  this.ageGroup = ageGroup;
        this.respiratoryRate = respiratoryRate;
        this.heartRate = heartRate;
        this.bp = bp;
        this.bt=bt;
//        this.weightInKilos = weightInKilos;
//        this.weightInPounds = weightInPounds;
    }

    @Override
    public String toString() {
        return "VitalSigns{" +  ", respiratoryRate=" + respiratoryRate + ", heartRate=" + heartRate + ", systolicBloodPressure=" + bp + ",temperature="+bt+'}';
    }

//    public String getAgeGroup() {
//        return ageGroup;
//    }
//
//    public void setAgeGroup(String ageGroup) {
//        this.ageGroup = ageGroup;
//    }

    public double getRespiratoryRate() {
        return respiratoryRate;
    }

    public void setRespiratoryRate(double respiratoryRate) {
        this.respiratoryRate = respiratoryRate;
    }

    public double getHeartRate() {
        return heartRate;
    }

    public void setHeartRate(double heartRate) {
        this.heartRate = heartRate;
    }

    public double getBp() {
        return bp;
    }

    public void setBp(double bp) {
        this.bp = bp;
    }
//
//    public double getWeightInKilos() {
//        return weightInKilos;
//    }
//
//    public void setWeightInKilos(double weightInKilos) {
//        this.weightInKilos = weightInKilos;
//    }
//
//    public double getWeightInPounds() {
//        return weightInPounds;
//    }
//
//    public void setWeightInPounds(double weightInPounds) {
//        this.weightInPounds = weightInPounds;
//    }

}
