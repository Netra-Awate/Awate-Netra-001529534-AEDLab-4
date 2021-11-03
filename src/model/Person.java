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
public class Person {
    
    private String name;
    private Integer patientID;
//    private Integer houseNumber;
//    private String aptName;
    private String streetName;
    private City city;
    private Community community;
    private House house;

    public City getCity() {
        return city;
    }

    public void setCity(City city) {
        this.city = city;
    }

    public Community getCommunity() {
        return community;
    }

    public void setCommunity(Community community) {
        this.community = community;
    }

    public House getHouse() {
        return house;
    }

    public void setHouse(House house) {
        this.house = house;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Integer getPatientID() {
        return patientID;
    }

    public void setPatientID(Integer patientID) {
        this.patientID = patientID;
    }



    public String getStreetName() {
        return streetName;
    }

    public void setStreetName(String streetName) {
        this.streetName = streetName;
    }


    public Integer getAge() {
        return age;
    }

    public void setAge(Integer age) {
        this.age = age;
    }

    public Integer getMobileNo() {
        return mobileNo;
    }

    public void setMobileNo(Integer mobileNo) {
        this.mobileNo = mobileNo;
    }
 
    private Integer age;
    private Integer mobileNo;

    
    
     public Person(String name, Integer patientID, Integer age, Integer mobileNo,City city, House house,Community community) {
        this.name = name;
        this.patientID = patientID;
        this.house = house;
        this.community = community;
        this.streetName = streetName;
        this.city = city;
        this.age = age;
        this.mobileNo = mobileNo;
    }
}
