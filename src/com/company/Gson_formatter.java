package com.company;

import com.google.gson.Gson;
import java.util.Arrays;
import java.io.IOException;
import static com.company.Api_requests.api_get_request;
import static com.company.Api_requests.api_post_request;

public class Gson_formatter {

    static String gson_formatter_get(String urls) throws IOException, InterruptedException, IllegalStateException {
        String mes = api_get_request(urls);
        Measure[] mes1 = new Gson().fromJson(mes, Measure[].class);
        //System.out.println(Arrays.toString(mes1));
        //System.out.println(mes1[0]);
        return Arrays.toString(mes1);
    }

    static String gson_formatter_get_devices(String urls) throws IOException, InterruptedException, IllegalStateException {
        String mes = api_get_request(urls);
        Devices_mesure[] mes1 = new Gson().fromJson(mes, Devices_mesure[].class);
        return Arrays.toString(mes1);
    }

    static String gson_formatter_post(String urls) throws IOException, InterruptedException, IllegalStateException {
        String mes = api_post_request(urls);
        Measure[] mes1 = new Gson().fromJson(mes, Measure[].class);
        return Arrays.toString(mes1);
    }

    static String gson_formatter_post_intervalls(String response) throws IOException, InterruptedException, IllegalStateException {
        // String mes = api_post_request(response);
        Measure[] mes1 = new Gson().fromJson(response, Measure[].class);
        return Arrays.toString(mes1);
    }
}
