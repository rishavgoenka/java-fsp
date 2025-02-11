package com.fsp.fsp;

import org.springframework.stereotype.Component;

@Component
public class StudentAddress {
    private String streetNo;
    private String city;
    private String state;
    private String country;

    public String getCountry() {
        return country;
    }
    public void setCountry(String country) {
        this.country = country;
    }
    public String getState() {
        return state;
    }
    public void setState(String state) {
        this.state = state;
    }
    public String getCity() {
        return city;
    }
    public void setCity(String city) {
        this.city = city;
    }
    
    public String getStreetNo() {
        return streetNo;
    }
    public void setStreetNo(String streetNo) {
        this.streetNo = streetNo;
    }
    
}