package com.healthyfood;

import com.healthyfood.connectivity.FetchApiFood;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import java.io.*;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class TestFetchFoodAPI {
    private final FetchApiFood fetchApiFood = new FetchApiFood();

    public String readDataFromFile() throws IOException {
        String file = "C:\\Users\\Patty\\IdeaProjects\\HealthyFood\\src\\test\\java\\resources\\jsonData.txt";
        BufferedReader reader = new BufferedReader(new FileReader(file));
        String currentLine = reader.readLine();
        reader.close();
        return currentLine;
    }
    @Test
    public void connectivityToEdamAPIWithCorrectLetters() throws IOException {
        assertEquals(readDataFromFile(), fetchApiFood.getProductByName("Apple"));
    }
    @Test
    public void connectivityToEdamAPIUppercase() throws IOException {
        Assertions.assertEquals(readDataFromFile(), fetchApiFood.getProductByName("APPLE"));
    }
    @Test
    public void connectivityToEdamAPILowercase() throws IOException {
        Assertions.assertEquals(readDataFromFile(),fetchApiFood.getProductByName("apple"));
    }
    @Test
    public void connectivityToEdamAPIDifferentLetters() throws IOException {
        Assertions.assertEquals(readDataFromFile(),fetchApiFood.getProductByName("ApPlE"));
    }
 }

