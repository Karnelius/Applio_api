package com.company;

import com.fasterxml.jackson.databind.ObjectMapper;

import java.io.IOException;
import java.net.URI;
import java.net.http.HttpClient;
import java.net.http.HttpRequest;
import java.net.http.HttpResponse;
import java.util.HashMap;

public class Api_requests {

    final private static String API_KEY = "no no no ";



    static String api_get_request(String Api_urls) throws IOException, InterruptedException,IllegalStateException {
        var client = HttpClient.newHttpClient();

        var httpRequest = HttpRequest.newBuilder()
                .uri(URI.create(Api_urls))
                .GET()
                .header("accept", "application/json")
                .header("Grpc-Metadata-Authorization", API_KEY)
                .build();
        var response = client.send(httpRequest, HttpResponse.BodyHandlers.ofString());
        return response.body();

    }

    static String api_post_request(String Api_urls) throws IOException, InterruptedException, IllegalStateException{
        var client = HttpClient.newHttpClient();

        var httpRequest = HttpRequest.newBuilder()
                .uri(URI.create(Api_urls))
                .POST(HttpRequest.BodyPublishers.ofString(Api_urls))
                .header("accept", "application/json")
                .header("Grpc-Metadata-Authorization", API_KEY)
                .build();
        var response = client.send(httpRequest, HttpResponse.BodyHandlers.ofString());
        return response.body();
    }

    static String api_post_request_7days_interval(String Api_urls) throws IOException, InterruptedException, IllegalStateException {
        var client = HttpClient.newHttpClient();

        var values = new HashMap<String, String>() {{
            put("start", "-7d");
            put("end", "0d");
        }};

        var ObjectMapper = new ObjectMapper();
        String requestBody = ObjectMapper.writeValueAsString(values);

        var httpRequest = HttpRequest.newBuilder()
                .uri(URI.create(Api_urls))
                .POST(HttpRequest.BodyPublishers.ofString(requestBody))
                .header("accept", "application/json")
                .header("Grpc-Metadata-Authorization", API_KEY)
                .header("Content-Type", "application/json")
                .build();
        HttpResponse<String> response = client.send(httpRequest, HttpResponse.BodyHandlers.ofString());
        return response.body();
    }

    static String api_post_request_24h_interval(String Api_urls) throws IOException, InterruptedException, IllegalStateException {
        var client = HttpClient.newHttpClient();

        var values = new HashMap<String, String>() {{
            put("start", "-1d");
            put("end", "0d");
        }};

        var ObjectMapper = new ObjectMapper();
        String requestBody = ObjectMapper.writeValueAsString(values);

        var httpRequest = HttpRequest.newBuilder()
                .uri(URI.create(Api_urls))
                .POST(HttpRequest.BodyPublishers.ofString(requestBody))
                .header("accept", "application/json")
                .header("Grpc-Metadata-Authorization", API_KEY)
                .header("Content-Type", "application/json")
                .build();
        HttpResponse<String> response = client.send(httpRequest, HttpResponse.BodyHandlers.ofString());
        return response.body();
    }

}
