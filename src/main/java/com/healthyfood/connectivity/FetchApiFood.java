package com.healthyfood.connectivity;

import com.healthyfood.utils.CapitalizeTheFirstLetter;

import java.io.IOException;
import java.net.URI;
import java.net.http.HttpClient;
import java.net.http.HttpRequest;
import java.net.http.HttpResponse;
import java.util.Collections;
import java.util.List;

public class FetchApiFood {
    private final HttpClient client = HttpClient.newBuilder().build();

    public String getProductByName(String productName) {
        try {
            HttpRequest request = HttpRequest.newBuilder().uri(URI.create("https://api.edamam.com/api/food-database/v2/parser?app_id=a5c1a6e2&app_key=%20917d9904d1aa8302eb4d353787034eb6&ingr=" + CapitalizeTheFirstLetter.capitalizeTheFirstLetter(productName) + "&nutrition-type=cooking")).GET().build();
            return getResponds(request);
        } catch (Exception e) {
            e.printStackTrace();
        }
        return null;
    }

    public String getProductByFoodId(String foodId) {
        try {
            HttpRequest request = HttpRequest.newBuilder().uri(URI.create("https://api.edamam.com/api/food-database/v2/parser?app_id=a5c1a6e2&app_key=%20917d9904d1aa8302eb4d353787034eb6&ingr=" + foodId + "&nutrition-type=cooking")).GET().build();
            return getResponds(request);
        } catch (Exception e) {
            e.printStackTrace();
        }
        return null;
    }

    public List<String> getAllProducts() {
        try {
            HttpRequest request = HttpRequest.newBuilder().uri(URI.create("https://api.edamam.com/api/food-database/v2/parser?app_id=a5c1a6e2&app_key=%20917d9904d1aa8302eb4d353787034eb6")).GET().build();
            return Collections.singletonList(getResponds(request));
        } catch (Exception e) {
            e.printStackTrace();
        }
        return null;
    }

    private String getResponds(HttpRequest request) {
        try {
            HttpResponse<String> response;
            try {
                response = client.send(request, HttpResponse.BodyHandlers.ofString());
            } catch (IOException | InterruptedException e) {
                throw new RuntimeException(e);
            }
            return response.body();
        } catch (Exception e) {
            e.printStackTrace();
        }
        return null;
    }
}
