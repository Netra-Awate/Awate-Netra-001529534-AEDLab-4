package model;

import java.util.ArrayList;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author NetrA
 */
public class City {
    String cityName;

    public String getCityName() {
        return "New York";
    }

    public void setCityName(String cityName) {
        this.cityName = cityName;
    }
    private ArrayList<Community> communityList;

    public ArrayList<Community> getCommunityList() {
        return communityList;
    }

    public void setCommunityList(ArrayList<Community> communityList) {
        this.communityList = communityList;
    }
    
    public City(){
        communityList = new ArrayList<>();
    }
    
    public Community addCommunity(Community community){
        communityList.add(community);
        return community;
    }
    
    
    
    public Community getCommunity(String community)
    {
        boolean flag =false;
    for(Community c: communityList)
    {
        
        if (c.getCommunityName().equalsIgnoreCase(community))
        {
            
        flag=true;
        return c;}
    }
    if(flag==false){
        Community c=new Community();
    return  c;}
    return null;
}
}