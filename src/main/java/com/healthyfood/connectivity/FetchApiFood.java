package com.healthyfood.connectivity;

import com.healthyfood.utils.CapitalizeTheFirstLetter;

import java.io.IOException;
import java.net.URI;
import java.net.http.HttpClient;
import java.net.http.HttpRequest;
import java.net.http.HttpResponse;
import java.util.Collections;
import java.util.List;
import java.util.Objects;

public class FetchApiFood {
    private final HttpClient client = HttpClient.newBuilder().build();
    private final String FOOD_API_KEY = "https://api.edamam.com/api/food-database/v2/parser?app_id=a5c1a6e2&app_key=%20917d9904d1aa8302eb4d353787034eb6&nutrition-type=cooking&ingr=";

    public String getProductByName(String productName) {
        try {
            HttpRequest request = HttpRequest.newBuilder().uri(URI.create(FOOD_API_KEY + CapitalizeTheFirstLetter.capitalizeTheFirstLetter(productName))).GET().build();
            return checkStatusCodeResponse(request);
        } catch (NullPointerException e) {
            e.getMessage();
        }
        return null;
    }

    public String getProductByFoodId(String foodId) {
        try {
            HttpRequest request = HttpRequest.newBuilder().uri(URI.create(FOOD_API_KEY + foodId)).GET().build();
            return checkStatusCodeResponse(request);
        } catch (NullPointerException e) {
            e.getMessage();
        }
        return null;
    }

    public List<String> getAllProducts() {
        try {
            HttpRequest request = HttpRequest.newBuilder().uri(URI.create(FOOD_API_KEY)).GET().build();
            return Collections.singletonList(checkStatusCodeResponse(request));
        } catch (NullPointerException e) {
            e.printStackTrace();
        }
        return Collections.emptyList();
    }

    private HttpResponse<String> getResponse(HttpRequest request) {
        try {
            return client.send(request, HttpResponse.BodyHandlers.ofString());
        } catch (IOException | InterruptedException e) {
            e.printStackTrace();
        }
        return null;
    }

private String checkStatusCodeResponse(HttpRequest request) {
        int statusCode = Objects.requireNonNull(getResponse(request)).statusCode();
        if (statusCode == 200) {
            return getResponse(request).body();
        } else if (statusCode >= 400 && statusCode <= 499) {
            return "The specified URL was not found or couldn't be retrieved";
        } else if (statusCode >= 500 && statusCode <= 599) {
            return "Server error responses";
        } else {
            return String.valueOf(statusCode);
        }
    }

}


