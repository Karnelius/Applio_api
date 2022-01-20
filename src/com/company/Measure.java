package com.company;
import static com.company.Devices_mesure.*;


public class Measure extends Devices_mesure {

    private String dev_eui;
    private String data;
    private String type;
    private String receive_date;
   // private String model;



    //TODO - Implement model toString -> Mesure to get name of device in sensor datas. (call api, get data -> insert in "Measure.java".

    public String toString()
    {

        //return "\n"+ " [dev-id = " + dev_eui + " - " + " recieve date " + receive_date +" - " + " type "+type + " - " + " data " +data+ "]";
        //return "\n"+ " [Dev-id = " + dev_eui + " - " + "Model: " + getModel() + " - " + " Recieve date: " + receive_date.substring(0,19) +" - " + " Type: "+type + " - " + " Data: " +data + "]";
        return "\n"+ " [Dev-id = " + dev_eui + " - " + " Recieve date: " + receive_date.substring(0,19) +" - " + " Type: "+type + " - " + " Data: " +data + "]";


    }

}
