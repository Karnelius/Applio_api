package com.company;

public class Devices_mesure {

    private String name;
    private String comment;
    private String manufacturer;
    public String model;
    private String id;

    public String getModel() {
        return this.model;
    }



    public String toString(){
        return "\n"+ " [Dev-id = " + id + " - " + " Manufacturer: " + manufacturer + " - " + " Model: "+ model + " - " + " Own Name: " +name + "]";

    }
}
