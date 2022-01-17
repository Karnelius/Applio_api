package com.company;

import java.io.IOException;

import static com.company.Api_requests.*;
import static com.company.Gson_formatter.*;
import static com.company.Urls.*;


public class Main {


    public static void main(String[] args) throws IOException, InterruptedException, IllegalStateException {

        /*
        System.out.println("\n");
        System.out.println("-------- Test without gson-formatter --------");
        System.out.println(api_get_request("https://data.applio.tech/data/device/a84041868182d48b/latest"));
        System.out.println("--------------------------------------------------------");
        System.out.println(api_get_request("https://data.applio.tech/data/device/0004a30b00f225a8/latest"));
        System.out.println("\n");

        */


        System.out.println("-------- Devices --------");
        System.out.println(api_get_request(API_ALL_DEVICES));
        System.out.println("--------------------------------------------------------");
        System.out.println("\n");

        /*

        System.out.println("-------- Latest data --------");
        System.out.println(gson_formatter_get(API_DRAGINO_LATEST));
        System.out.println(gson_formatter_get(API_COMFORT_LATEST));
        System.out.println("--------------------------------------------------------");
        System.out.println("\n");

        */

        System.out.println("-------- Latest Temperature --------");
        System.out.println(gson_formatter_get(API_DRAGINO_LATEST_TEMP));
        System.out.println(gson_formatter_get(API_COMFORT_LATEST_TEMP));
        System.out.println("--------------------------------------------------------");
        System.out.println("\n");

        System.out.println("-------- Latest Humidity --------");
        System.out.println(gson_formatter_post(API_DRAGINO_LATEST_HUM));
        System.out.println(gson_formatter_post(API_COMFORT_LATEST_HUM));
        System.out.println("--------------------------------------------------------");
        System.out.println("\n");

        System.out.println("-------- Latest Co2 --------");
        System.out.println(gson_formatter_post(API_COMFORT_LATEST_CO2));
        System.out.println("\n");

        /*

        System.out.println("-------- Last Weeks Temperature --------");
        String response = api_post_request_7days_interval(API_DRAGINO_INTERVAL_TEMP);
        String response2 = api_post_request_7days_interval(API_COMFORT_INTERVAL_TEMP);
        System.out.println(gson_formatter_post_intervalls(response));
        System.out.println("--------------------------------------------------------");
        System.out.println(gson_formatter_post_intervalls(response2));
        System.out.println("\n");

        System.out.println("-------- Last Weeks Humidity --------");
        String resp = api_post_request(API_DRAGINO_INTERVAL_HUM);
        String resp2 = api_post_request_7days_interval(API_COMFORT_INTERVAL_HUM);
        System.out.println(gson_formatter_post_intervalls(resp));
        System.out.println("--------------------------------------------------------");
        System.out.println(gson_formatter_post_intervalls(resp2));
        System.out.println("\n");

        System.out.println("-------- Last 24h Temperature --------");
        String re = api_post_request_24h_interval(API_DRAGINO_INTERVAL_TEMP);
        String re2 = api_post_request_24h_interval(API_COMFORT_INTERVAL_TEMP);
        System.out.println(gson_formatter_post_intervalls(re));
        System.out.println("--------------------------------------------------------");
        System.out.println(gson_formatter_post_intervalls(re2));
        System.out.println("\n");

        System.out.println("-------- Last 24h Humidity --------");
        String r = api_post_request_24h_interval(API_DRAGINO_INTERVAL_HUM);
        String r2 = api_post_request_24h_interval(API_COMFORT_INTERVAL_HUM);
        System.out.println(gson_formatter_post_intervalls(r));
        System.out.println("--------------------------------------------------------");
        System.out.println(gson_formatter_post_intervalls(r2));
        System.out.println("\n");


        System.out.println("-------- Last 24h Co2 --------");
        String rr = api_post_request_24h_interval(API_COMFORT_INTERVAL_CO2);
        System.out.println(gson_formatter_post_intervalls(rr));

        System.out.println("-------- Last Weeks Co2 --------");
        String rrr = api_post_request_7days_interval(API_COMFORT_INTERVAL_CO2);
        System.out.println(gson_formatter_post_intervalls(rrr));
        System.out.println("\n");

        */
        //Test
    }
}
