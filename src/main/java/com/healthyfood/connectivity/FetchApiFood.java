package com.healthyfood.connectivity;

import java.io.IOException;
import java.net.URI;
import java.net.http.HttpClient;
import java.net.http.HttpRequest;
import java.net.http.HttpResponse;
import java.util.Collections;
import java.util.List;

public class FetchApiFood {
    private final HttpClient client = HttpClient.newBuilder().build();
    private final FetchApiFoodVariables fetchApiFoodVariables = new FetchApiFoodVariables();

    public String getProductByName(String productName) {
        HttpRequest request = HttpRequest.newBuilder().uri(URI.create(fetchApiFoodVariables.URL + fetchApiFoodVariables.FOOD_API_KEY + fetchApiFoodVariables.ingredient + capitalizeTheFirstLetter(productName) + fetchApiFoodVariables.nutritionType)).GET().build();
        return String.valueOf(getResponse(request).body());
    }

    public String getProductByFoodId(String foodId) {
            HttpRequest request = HttpRequest.newBuilder().uri(URI.create(fetchApiFoodVariables.URL + fetchApiFoodVariables.FOOD_API_KEY + fetchApiFoodVariables.ingredient + foodId + fetchApiFoodVariables.nutritionType)).GET().build();
            return getResponse(request).body();
    }

    public List<String> getAllProducts() {
            HttpRequest request = HttpRequest.newBuilder().uri(URI.create(fetchApiFoodVariables.URL + fetchApiFoodVariables.FOOD_API_KEY + fetchApiFoodVariables.nutritionType)).GET().build();
            return Collections.singletonList(getResponse(request).body());
    }

    private HttpResponse<String> getResponse(HttpRequest request) {
        try {
            return client.send(request, HttpResponse.BodyHandlers.ofString());
        } catch (IOException | InterruptedException e) {
            e.printStackTrace();
        }
        return null;
    }

    private String capitalizeTheFirstLetter(String word) {
        return word.substring(0, 1).toUpperCase() + word.substring(1).toLowerCase();
    }

}


