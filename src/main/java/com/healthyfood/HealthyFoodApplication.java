package com.healthyfood;

import com.healthyfood.connectivity.FetchApiFood;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import java.net.ConnectException;

@SpringBootApplication
public class HealthyFoodApplication {

    public static void main(String[] args) throws ConnectException {

        SpringApplication.run(HealthyFoodApplication.class, args);
        FetchApiFood fetch = new FetchApiFood();
//        System.out.print(fetch.getProductByName("coffee"));
//        System.out.println(fetch.getAllProducts());
//        System.out.println(fetch.getProductByFoodId("food_bmyxrshbfao9s1amjrvhoauob6mo"));
//        System.out.print(fetch.getProductByFoodId("food_bq6stkiaxkwhxia9q4v7wanjnew0"));
    }
}
