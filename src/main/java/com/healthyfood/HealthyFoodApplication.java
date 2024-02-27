package com.healthyfood;

import com.healthyfood.connectivity.FetchApiFood;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class HealthyFoodApplication {

    public static void main(String[] args) {

        SpringApplication.run(HealthyFoodApplication.class, args);
        FetchApiFood fetch = new FetchApiFood();
        System.out.print(fetch.getProductByName("Chicken"));
//        System.out.print(fetch.getProductByFoodId("food_bq6stkiaxkwhxia9q4v7wanjnew0"));
    }
}
