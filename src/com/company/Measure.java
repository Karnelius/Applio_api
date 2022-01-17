package com.company;


public class Measure {

    private String dev_eui;
    private String data;
    private String type;
    private String receive_date;



    public String toString()
    {

        //return "\n"+ " [dev-id = " + dev_eui + " - " + " recieve date " + receive_date +" - " + " type "+type + " - " + " data " +data+ "]";
        return "\n"+ " [dev-id = " + dev_eui + " - " + " recieve date " + receive_date.substring(0,19) +" - " + " type "+type + " - " + " data " +data+ "]";

        //return "\n"+"Test [dev id=" + dev_eui + " type " + type +" data" + data +" ]";

    }}
