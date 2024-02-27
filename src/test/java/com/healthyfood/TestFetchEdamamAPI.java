package com.healthyfood;

import com.healthyfood.connectivity.FetchApiFood;
import com.healthyfood.utils.CapitalizeTheFirstLetter;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.Mock;
import org.mockito.Mockito;
import org.mockito.junit.jupiter.MockitoExtension;

import static org.junit.jupiter.api.Assertions.assertEquals;

@ExtendWith(MockitoExtension.class)
public class TestFetchEdamamAPI {
    @Mock
    private FetchApiFood mockitoFetch;
    private final FetchApiFood fetchApiFood = new FetchApiFood();
    private final String jsonProductDetails = "{\"text\":\"Apple\",\"parsed\":[{\"food\":{\"foodId\":\"food_a1gb9ubb72c7snbuxr3weagwv0dd\",\"label\":\"Apple\",\"knownAs\":\"apple\",\"nutrients\":{\"ENERC_KCAL\":52.0,\"PROCNT\":0.26,\"FAT\":0.17,\"CHOCDF\":13.8,\"FIBTG\":2.4},\"category\":\"Generic foods\",\"categoryLabel\":\"food\",\"image\":\"https://www.edamam.com/food-img/42c/42c006401027d35add93113548eeaae6.jpg\"}}],\"hints\":[{\"food\":{\"foodId\":\"food_a1gb9ubb72c7snbuxr3weagwv0dd\",\"label\":\"Apple\",\"knownAs\":\"apple\",\"nutrients\":{\"ENERC_KCAL\":52.0,\"PROCNT\":0.26,\"FAT\":0.17,\"CHOCDF\":13.8,\"FIBTG\":2.4},\"category\":\"Generic foods\",\"categoryLabel\":\"food\",\"image\":\"https://www.edamam.com/food-img/42c/42c006401027d35add93113548eeaae6.jpg\"},\"measures\":[{\"uri\":\"http://www.edamam.com/ontologies/edamam.owl#Measure_serving\",\"label\":\"Serving\",\"weight\":242.0},{\"uri\":\"http://www.edamam.com/ontologies/edamam.owl#Measure_unit\",\"label\":\"Whole\",\"weight\":182.0,\"qualified\":[{\"qualifiers\":[{\"uri\":\"http://www.edamam.com/ontologies/edamam.owl#Qualifier_large\",\"label\":\"large\"}],\"weight\":223.0},{\"qualifiers\":[{\"uri\":\"http://www.edamam.com/ontologies/edamam.owl#Qualifier_small\",\"label\":\"small\"}],\"weight\":149.0},{\"qualifiers\":[{\"uri\":\"http://www.edamam.com/ontologies/edamam.owl#Qualifier_medium\",\"label\":\"medium\"}],\"weight\":182.0}]},{\"uri\":\"http://www.edamam.com/ontologies/edamam.owl#Measure_apple\",\"label\":\"Apple\",\"weight\":182.0},{\"uri\":\"http://www.edamam.com/ontologies/edamam.owl#Measure_gram\",\"label\":\"Gram\",\"weight\":1.0},{\"uri\":\"http://www.edamam.com/ontologies/edamam.owl#Measure_ounce\",\"label\":\"Ounce\",\"weight\":28.349523125},{\"uri\":\"http://www.edamam.com/ontologies/edamam.owl#Measure_pound\",\"label\":\"Pound\",\"weight\":453.59237},{\"uri\":\"http://www.edamam.com/ontologies/edamam.owl#Measure_kilogram\",\"label\":\"Kilogram\",\"weight\":1000.0},{\"uri\":\"http://www.edamam.com/ontologies/edamam.owl#Measure_cup\",\"label\":\"Cup\",\"weight\":109.0,\"qualified\":[{\"qualifiers\":[{\"uri\":\"http://www.edamam.com/ontologies/edamam.owl#Qualifier_quartered\",\"label\":\"quartered\"},{\"uri\":\"http://www.edamam.com/ontologies/edamam.owl#Qualifier_chopped\",\"label\":\"chopped\"}],\"weight\":125.0}]}]},{\"food\":{\"foodId\":\"food_a1gb9ubb72c7snbuxr3weagwv0dd\",\"label\":\"Empire Apple\",\"knownAs\":\"apple\",\"nutrients\":{\"ENERC_KCAL\":52.0,\"PROCNT\":0.26,\"FAT\":0.17,\"CHOCDF\":13.8,\"FIBTG\":2.4},\"category\":\"Generic foods\",\"categoryLabel\":\"food\",\"image\":\"https://www.edamam.com/food-img/42c/42c006401027d35add93113548eeaae6.jpg\"},\"measures\":[{\"uri\":\"http://www.edamam.com/ontologies/edamam.owl#Measure_serving\",\"label\":\"Serving\",\"weight\":242.0},{\"uri\":\"http://www.edamam.com/ontologies/edamam.owl#Measure_unit\",\"label\":\"Whole\",\"weight\":182.0,\"qualified\":[{\"qualifiers\":[{\"uri\":\"http://www.edamam.com/ontologies/edamam.owl#Qualifier_large\",\"label\":\"large\"}],\"weight\":223.0},{\"qualifiers\":[{\"uri\":\"http://www.edamam.com/ontologies/edamam.owl#Qualifier_small\",\"label\":\"small\"}],\"weight\":149.0},{\"qualifiers\":[{\"uri\":\"http://www.edamam.com/ontologies/edamam.owl#Qualifier_medium\",\"label\":\"medium\"}],\"weight\":182.0}]},{\"uri\":\"http://www.edamam.com/ontologies/edamam.owl#Measure_apple\",\"label\":\"Apple\",\"weight\":182.0},{\"uri\":\"http://www.edamam.com/ontologies/edamam.owl#Measure_gram\",\"label\":\"Gram\",\"weight\":1.0},{\"uri\":\"http://www.edamam.com/ontologies/edamam.owl#Measure_ounce\",\"label\":\"Ounce\",\"weight\":28.349523125},{\"uri\":\"http://www.edamam.com/ontologies/edamam.owl#Measure_pound\",\"label\":\"Pound\",\"weight\":453.59237},{\"uri\":\"http://www.edamam.com/ontologies/edamam.owl#Measure_kilogram\",\"label\":\"Kilogram\",\"weight\":1000.0},{\"uri\":\"http://www.edamam.com/ontologies/edamam.owl#Measure_cup\",\"label\":\"Cup\",\"weight\":109.0,\"qualified\":[{\"qualifiers\":[{\"uri\":\"http://www.edamam.com/ontologies/edamam.owl#Qualifier_quartered\",\"label\":\"quartered\"},{\"uri\":\"http://www.edamam.com/ontologies/edamam.owl#Qualifier_chopped\",\"label\":\"chopped\"}],\"weight\":125.0}]}]},{\"food\":{\"foodId\":\"food_a1gb9ubb72c7snbuxr3weagwv0dd\",\"label\":\"Sorb Apple\",\"knownAs\":\"apple\",\"nutrients\":{\"ENERC_KCAL\":52.0,\"PROCNT\":0.26,\"FAT\":0.17,\"CHOCDF\":13.8,\"FIBTG\":2.4},\"category\":\"Generic foods\",\"categoryLabel\":\"food\",\"image\":\"https://www.edamam.com/food-img/42c/42c006401027d35add93113548eeaae6.jpg\"},\"measures\":[{\"uri\":\"http://www.edamam.com/ontologies/edamam.owl#Measure_serving\",\"label\":\"Serving\",\"weight\":242.0},{\"uri\":\"http://www.edamam.com/ontologies/edamam.owl#Measure_unit\",\"label\":\"Whole\",\"weight\":182.0,\"qualified\":[{\"qualifiers\":[{\"uri\":\"http://www.edamam.com/ontologies/edamam.owl#Qualifier_large\",\"label\":\"large\"}],\"weight\":223.0},{\"qualifiers\":[{\"uri\":\"http://www.edamam.com/ontologies/edamam.owl#Qualifier_small\",\"label\":\"small\"}],\"weight\":149.0},{\"qualifiers\":[{\"uri\":\"http://www.edamam.com/ontologies/edamam.owl#Qualifier_medium\",\"label\":\"medium\"}],\"weight\":182.0}]},{\"uri\":\"http://www.edamam.com/ontologies/edamam.owl#Measure_apple\",\"label\":\"Apple\",\"weight\":182.0},{\"uri\":\"http://www.edamam.com/ontologies/edamam.owl#Measure_gram\",\"label\":\"Gram\",\"weight\":1.0},{\"uri\":\"http://www.edamam.com/ontologies/edamam.owl#Measure_ounce\",\"label\":\"Ounce\",\"weight\":28.349523125},{\"uri\":\"http://www.edamam.com/ontologies/edamam.owl#Measure_pound\",\"label\":\"Pound\",\"weight\":453.59237},{\"uri\":\"http://www.edamam.com/ontologies/edamam.owl#Measure_kilogram\",\"label\":\"Kilogram\",\"weight\":1000.0},{\"uri\":\"http://www.edamam.com/ontologies/edamam.owl#Measure_cup\",\"label\":\"Cup\",\"weight\":109.0,\"qualified\":[{\"qualifiers\":[{\"uri\":\"http://www.edamam.com/ontologies/edamam.owl#Qualifier_quartered\",\"label\":\"quartered\"},{\"uri\":\"http://www.edamam.com/ontologies/edamam.owl#Qualifier_chopped\",\"label\":\"chopped\"}],\"weight\":125.0}]}]},{\"food\":{\"foodId\":\"food_amhlqj0by3ozesbg96kkhar1atxt\",\"label\":\"Fuji Apple\",\"knownAs\":\"fuji apple\",\"nutrients\":{\"ENERC_KCAL\":63.0,\"PROCNT\":0.2,\"FAT\":0.18,\"CHOCDF\":15.2,\"FIBTG\":2.1},\"category\":\"Generic foods\",\"categoryLabel\":\"food\",\"image\":\"https://www.edamam.com/food-img/327/327e8b398000b83e4764ca0bab240f14.jpg\"},\"measures\":[{\"uri\":\"http://www.edamam.com/ontologies/edamam.owl#Measure_serving\",\"label\":\"Serving\",\"weight\":55.0},{\"uri\":\"http://www.edamam.com/ontologies/edamam.owl#Measure_unit\",\"label\":\"Whole\",\"weight\":197.15555555555557,\"qualified\":[{\"qualifiers\":[{\"uri\":\"http://www.edamam.com/ontologies/edamam.owl#Qualifier_medium\",\"label\":\"medium\"}],\"weight\":192.0},{\"qualifiers\":[{\"uri\":\"http://www.edamam.com/ontologies/edamam.owl#Qualifier_large\",\"label\":\"large\"}],\"weight\":236.0},{\"qualifiers\":[{\"uri\":\"http://www.edamam.com/ontologies/edamam.owl#Qualifier_small\",\"label\":\"small\"}],\"weight\":158.0}]},{\"uri\":\"http://www.edamam.com/ontologies/edamam.owl#Measure_gram\",\"label\":\"Gram\",\"weight\":1.0},{\"uri\":\"http://www.edamam.com/ontologies/edamam.owl#Measure_ounce\",\"label\":\"Ounce\",\"weight\":28.349523125},{\"uri\":\"http://www.edamam.com/ontologies/edamam.owl#Measure_pound\",\"label\":\"Pound\",\"weight\":453.59237},{\"uri\":\"http://www.edamam.com/ontologies/edamam.owl#Measure_kilogram\",\"label\":\"Kilogram\",\"weight\":1000.0},{\"uri\":\"http://www.edamam.com/ontologies/edamam.owl#Measure_cup\",\"label\":\"Cup\",\"weight\":109.0,\"qualified\":[{\"qualifiers\":[{\"uri\":\"http://www.edamam.com/ontologies/edamam.owl#Qualifier_sliced\",\"label\":\"sliced\"}],\"weight\":109.0}]}]},{\"food\":{\"foodId\":\"food_bfh0qoxboaspbtbj3gqnkafdf2r9\",\"label\":\"Gala Apple\",\"knownAs\":\"gala apple\",\"nutrients\":{\"ENERC_KCAL\":57.0,\"PROCNT\":0.25,\"FAT\":0.12,\"CHOCDF\":13.7,\"FIBTG\":2.3},\"category\":\"Generic foods\",\"categoryLabel\":\"food\",\"image\":\"https://www.edamam.com/food-img/256/2568844fd3c89a9fa6ef0a07757ed572.jpg\"},\"measures\":[{\"uri\":\"http://www.edamam.com/ontologies/edamam.owl#Measure_serving\",\"label\":\"Serving\",\"weight\":55.0},{\"uri\":\"http://www.edamam.com/ontologies/edamam.owl#Measure_unit\",\"label\":\"Whole\",\"weight\":180.44444444444446,\"qualified\":[{\"qualifiers\":[{\"uri\":\"http://www.edamam.com/ontologies/edamam.owl#Qualifier_medium\",\"label\":\"medium\"}],\"weight\":172.0},{\"qualifiers\":[{\"uri\":\"http://www.edamam.com/ontologies/edamam.owl#Qualifier_large\",\"label\":\"large\"}],\"weight\":200.0},{\"qualifiers\":[{\"uri\":\"http://www.edamam.com/ontologies/edamam.owl#Qualifier_small\",\"label\":\"small\"}],\"weight\":157.0}]},{\"uri\":\"http://www.edamam.com/ontologies/edamam.owl#Measure_gram\",\"label\":\"Gram\",\"weight\":1.0},{\"uri\":\"http://www.edamam.com/ontologies/edamam.owl#Measure_ounce\",\"label\":\"Ounce\",\"weight\":28.349523125},{\"uri\":\"http://www.edamam.com/ontologies/edamam.owl#Measure_pound\",\"label\":\"Pound\",\"weight\":453.59237},{\"uri\":\"http://www.edamam.com/ontologies/edamam.owl#Measure_kilogram\",\"label\":\"Kilogram\",\"weight\":1000.0},{\"uri\":\"http://www.edamam.com/ontologies/edamam.owl#Measure_cup\",\"label\":\"Cup\",\"weight\":109.0,\"qualified\":[{\"qualifiers\":[{\"uri\":\"http://www.edamam.com/ontologies/edamam.owl#Qualifier_sliced\",\"label\":\"sliced\"}],\"weight\":109.0}]}]},{\"food\":{\"foodId\":\"food_bxlgb9vbmjhys5bt5sopab22g4ld\",\"label\":\"Peeled Apple\",\"knownAs\":\"peeled apple\",\"nutrients\":{\"ENERC_KCAL\":48.0,\"PROCNT\":0.27,\"FAT\":0.13,\"CHOCDF\":12.8,\"FIBTG\":1.3},\"category\":\"Generic foods\",\"categoryLabel\":\"food\",\"image\":\"https://www.edamam.com/food-img/5aa/5aac39c4acdc63e48312cea5c28329f4.jpg\"},\"measures\":[{\"uri\":\"http://www.edamam.com/ontologies/edamam.owl#Measure_serving\",\"label\":\"Serving\",\"weight\":110.0},{\"uri\":\"http://www.edamam.com/ontologies/edamam.owl#Measure_cup\",\"label\":\"Cup\",\"weight\":110.0},{\"uri\":\"http://www.edamam.com/ontologies/edamam.owl#Measure_unit\",\"label\":\"Whole\",\"weight\":169.93333333333334,\"qualified\":[{\"qualifiers\":[{\"uri\":\"http://www.edamam.com/ontologies/edamam.owl#Qualifier_large\",\"label\":\"large\"}],\"weight\":216.0},{\"qualifiers\":[{\"uri\":\"http://www.edamam.com/ontologies/edamam.owl#Qualifier_small\",\"label\":\"small\"}],\"weight\":132.0},{\"qualifiers\":[{\"uri\":\"http://www.edamam.com/ontologies/edamam.owl#Qualifier_medium\",\"label\":\"medium\"}],\"weight\":161.0}]},{\"uri\":\"http://www.edamam.com/ontologies/edamam.owl#Measure_gram\",\"label\":\"Gram\",\"weight\":1.0},{\"uri\":\"http://www.edamam.com/ontologies/edamam.owl#Measure_ounce\",\"label\":\"Ounce\",\"weight\":28.349523125},{\"uri\":\"http://www.edamam.com/ontologies/edamam.owl#Measure_pound\",\"label\":\"Pound\",\"weight\":453.59237},{\"uri\":\"http://www.edamam.com/ontologies/edamam.owl#Measure_kilogram\",\"label\":\"Kilogram\",\"weight\":1000.0}]},{\"food\":{\"foodId\":\"food_b4m99bgatuhmfybeq0d7xa9uvr1b\",\"label\":\"Smith Apple\",\"knownAs\":\"granny smith apple\",\"nutrients\":{\"ENERC_KCAL\":58.0,\"PROCNT\":0.44,\"FAT\":0.19,\"CHOCDF\":13.6,\"FIBTG\":2.8},\"category\":\"Generic foods\",\"categoryLabel\":\"food\",\"image\":\"https://www.edamam.com/food-img/288/288a6646dd6bb05a482f4405bf6e2861.jpg\"},\"measures\":[{\"uri\":\"http://www.edamam.com/ontologies/edamam.owl#Measure_serving\",\"label\":\"Serving\",\"weight\":55.0},{\"uri\":\"http://www.edamam.com/ontologies/edamam.owl#Measure_unit\",\"label\":\"Whole\",\"weight\":174.6,\"qualified\":[{\"qualifiers\":[{\"uri\":\"http://www.edamam.com/ontologies/edamam.owl#Qualifier_large\",\"label\":\"large\"}],\"weight\":206.0},{\"qualifiers\":[{\"uri\":\"http://www.edamam.com/ontologies/edamam.owl#Qualifier_medium\",\"label\":\"medium\"}],\"weight\":167.0},{\"qualifiers\":[{\"uri\":\"http://www.edamam.com/ontologies/edamam.owl#Qualifier_small\",\"label\":\"small\"}],\"weight\":144.0}]},{\"uri\":\"http://www.edamam.com/ontologies/edamam.owl#Measure_gram\",\"label\":\"Gram\",\"weight\":1.0},{\"uri\":\"http://www.edamam.com/ontologies/edamam.owl#Measure_ounce\",\"label\":\"Ounce\",\"weight\":28.349523125},{\"uri\":\"http://www.edamam.com/ontologies/edamam.owl#Measure_pound\",\"label\":\"Pound\",\"weight\":453.59237},{\"uri\":\"http://www.edamam.com/ontologies/edamam.owl#Measure_kilogram\",\"label\":\"Kilogram\",\"weight\":1000.0},{\"uri\":\"http://www.edamam.com/ontologies/edamam.owl#Measure_cup\",\"label\":\"Cup\",\"weight\":109.0,\"qualified\":[{\"qualifiers\":[{\"uri\":\"http://www.edamam.com/ontologies/edamam.owl#Qualifier_sliced\",\"label\":\"sliced\"}],\"weight\":109.0}]}]},{\"food\":{\"foodId\":\"food_bacmbq9afv8uq3bm26em4anhw12o\",\"label\":\"Golden Delicious Apple\",\"knownAs\":\"golden delicious apple\",\"nutrients\":{\"ENERC_KCAL\":57.0,\"PROCNT\":0.28,\"FAT\":0.15,\"CHOCDF\":13.6,\"FIBTG\":2.4},\"category\":\"Generic foods\",\"categoryLabel\":\"food\",\"image\":\"https://www.edamam.com/food-img/683/6838f8020957c737b95ad3236ba710a3.jpg\"},\"measures\":[{\"uri\":\"http://www.edamam.com/ontologies/edamam.owl#Measure_serving\",\"label\":\"Serving\",\"weight\":200.0},{\"uri\":\"http://www.edamam.com/ontologies/edamam.owl#Measure_unit\",\"label\":\"Whole\",\"weight\":171.0,\"qualified\":[{\"qualifiers\":[{\"uri\":\"http://www.edamam.com/ontologies/edamam.owl#Qualifier_medium\",\"label\":\"medium\"}],\"weight\":169.0},{\"qualifiers\":[{\"uri\":\"http://www.edamam.com/ontologies/edamam.owl#Qualifier_large\",\"label\":\"large\"}],\"weight\":215.0},{\"qualifiers\":[{\"uri\":\"http://www.edamam.com/ontologies/edamam.owl#Qualifier_small\",\"label\":\"small\"}],\"weight\":129.0}]},{\"uri\":\"http://www.edamam.com/ontologies/edamam.owl#Measure_gram\",\"label\":\"Gram\",\"weight\":1.0},{\"uri\":\"http://www.edamam.com/ontologies/edamam.owl#Measure_ounce\",\"label\":\"Ounce\",\"weight\":28.349523125},{\"uri\":\"http://www.edamam.com/ontologies/edamam.owl#Measure_pound\",\"label\":\"Pound\",\"weight\":453.59237},{\"uri\":\"http://www.edamam.com/ontologies/edamam.owl#Measure_kilogram\",\"label\":\"Kilogram\",\"weight\":1000.0},{\"uri\":\"http://www.edamam.com/ontologies/edamam.owl#Measure_cup\",\"label\":\"Cup\",\"weight\":109.0,\"qualified\":[{\"qualifiers\":[{\"uri\":\"http://www.edamam.com/ontologies/edamam.owl#Qualifier_sliced\",\"label\":\"sliced\"}],\"weight\":109.0}]}]},{\"food\":{\"foodId\":\"food_a6ew6eha0m4nx4blvb73tbhfjcw6\",\"label\":\"Red Delicious Apple\",\"knownAs\":\"red delicious apple\",\"nutrients\":{\"ENERC_KCAL\":59.0,\"PROCNT\":0.27,\"FAT\":0.2,\"CHOCDF\":14.1,\"FIBTG\":2.3},\"category\":\"Generic foods\",\"categoryLabel\":\"food\",\"image\":\"https://www.edamam.com/food-img/e9a/e9a0cedf31414f009fba31eab13e552b.jpg\"},\"measures\":[{\"uri\":\"http://www.edamam.com/ontologies/edamam.owl#Measure_unit\",\"label\":\"Whole\",\"weight\":210.2222222222222,\"qualified\":[{\"qualifiers\":[{\"uri\":\"http://www.edamam.com/ontologies/edamam.owl#Qualifier_small\",\"label\":\"small\"}],\"weight\":158.0},{\"qualifiers\":[{\"uri\":\"http://www.edamam.com/ontologies/edamam.owl#Qualifier_medium\",\"label\":\"medium\"}],\"weight\":212.0},{\"qualifiers\":[{\"uri\":\"http://www.edamam.com/ontologies/edamam.owl#Qualifier_large\",\"label\":\"large\"}],\"weight\":260.0}]},{\"uri\":\"http://www.edamam.com/ontologies/edamam.owl#Measure_gram\",\"label\":\"Gram\",\"weight\":1.0},{\"uri\":\"http://www.edamam.com/ontologies/edamam.owl#Measure_ounce\",\"label\":\"Ounce\",\"weight\":28.349523125},{\"uri\":\"http://www.edamam.com/ontologies/edamam.owl#Measure_pound\",\"label\":\"Pound\",\"weight\":453.59237},{\"uri\":\"http://www.edamam.com/ontologies/edamam.owl#Measure_kilogram\",\"label\":\"Kilogram\",\"weight\":1000.0},{\"uri\":\"http://www.edamam.com/ontologies/edamam.owl#Measure_cup\",\"label\":\"Cup\",\"weight\":109.0,\"qualified\":[{\"qualifiers\":[{\"uri\":\"http://www.edamam.com/ontologies/edamam.owl#Qualifier_sliced\",\"label\":\"sliced\"}],\"weight\":109.0}]}]},{\"food\":{\"foodId\":\"food_bolksj5afv46p1a5n3ulob8h9sgr\",\"label\":\"Apple Pie Apples\",\"knownAs\":\"Apple Pie Apples\",\"nutrients\":{\"ENERC_KCAL\":167.80950741564678,\"PROCNT\":1.5223941070108622,\"FAT\":7.356528684026531,\"CHOCDF\":25.355779943622316,\"FIBTG\":2.5129645332811448},\"category\":\"Generic meals\",\"categoryLabel\":\"meal\",\"foodContentsLabel\":\"apples; apple pie filling; ground cinnamon; pie crust\"},\"measures\":[{\"uri\":\"http://www.edamam.com/ontologies/edamam.owl#Measure_unit\",\"label\":\"Whole\",\"weight\":166.70285859979188},{\"uri\":\"http://www.edamam.com/ontologies/edamam.owl#Measure_serving\",\"label\":\"Serving\",\"weight\":166.70285859979188},{\"uri\":\"http://www.edamam.com/ontologies/edamam.owl#Measure_gram\",\"label\":\"Gram\",\"weight\":1.0},{\"uri\":\"http://www.edamam.com/ontologies/edamam.owl#Measure_ounce\",\"label\":\"Ounce\",\"weight\":28.349523125},{\"uri\":\"http://www.edamam.com/ontologies/edamam.owl#Measure_pound\",\"label\":\"Pound\",\"weight\":453.59237},{\"uri\":\"http://www.edamam.com/ontologies/edamam.owl#Measure_kilogram\",\"label\":\"Kilogram\",\"weight\":1000.0},{\"uri\":\"http://www.edamam.com/ontologies/edamam.owl#Measure_milliliter\",\"label\":\"Milliliter\",\"weight\":1.0}]},{\"food\":{\"foodId\":\"food_bwy4zdhatwyt7bazilhn6acizh5b\",\"label\":\"Apple Butter, Apple\",\"knownAs\":\"APPLE BUTTER, APPLE\",\"nutrients\":{\"ENERC_KCAL\":176.0,\"PROCNT\":0.0,\"FAT\":0.0,\"CHOCDF\":47.060001373291016},\"brand\":\"Knouse Foods Inc.\",\"category\":\"Packaged foods\",\"categoryLabel\":\"food\",\"foodContentsLabel\":\"INGREDIENTS: APPLES; SUGAR; HIGH FRUCTOSE CORN SYRUP; APPLE CIDER CONCENTRATE AND SPICE.\",\"image\":\"https://www.edamam.com/food-img/406/406d813c1cbd761174accd4f8030c658.jpg\",\"servingSizes\":[{\"uri\":\"http://www.edamam.com/ontologies/edamam.owl#Measure_gram\",\"label\":\"Gram\",\"quantity\":17.0},{\"uri\":\"http://www.edamam.com/ontologies/edamam.owl#Measure_tablespoon\",\"label\":\"Tablespoon\",\"quantity\":1.0}]},\"measures\":[{\"uri\":\"http://www.edamam.com/ontologies/edamam.owl#Measure_serving\",\"label\":\"Serving\",\"weight\":17.0},{\"uri\":\"http://www.edamam.com/ontologies/edamam.owl#Measure_tablespoon\",\"label\":\"Tablespoon\",\"weight\":17.0},{\"uri\":\"http://www.edamam.com/ontologies/edamam.owl#Measure_gram\",\"label\":\"Gram\",\"weight\":1.0},{\"uri\":\"http://www.edamam.com/ontologies/edamam.owl#Measure_ounce\",\"label\":\"Ounce\",\"weight\":28.349523125},{\"uri\":\"http://www.edamam.com/ontologies/edamam.owl#Measure_pound\",\"label\":\"Pound\",\"weight\":453.59237},{\"uri\":\"http://www.edamam.com/ontologies/edamam.owl#Measure_kilogram\",\"label\":\"Kilogram\",\"weight\":1000.0}]},{\"food\":{\"foodId\":\"food_bylv5y6bh8ye6zabcekfkbl8sxfr\",\"label\":\"Apple Juice, Apple\",\"knownAs\":\"APPLE JUICE, APPLE\",\"nutrients\":{\"ENERC_KCAL\":61.0,\"PROCNT\":0.3400000035762787,\"FAT\":0.0,\"CHOCDF\":14.529999732971191},\"brand\":\"S. Martinelli & Co.\",\"category\":\"Packaged foods\",\"categoryLabel\":\"food\",\"foodContentsLabel\":\"PASTEURIZED 100% APPLE JUICE FROM U.S. GROWN FRESH APPLES; NATURAL SEDIMENT MAY OCCUR.\",\"image\":\"https://www.edamam.com/food-img/475/475a914f6303f44caf92dda9b7fc8a7c.jpg\",\"servingSizes\":[{\"uri\":\"http://www.edamam.com/ontologies/edamam.owl#Measure_ounce\",\"label\":\"Ounce\",\"quantity\":10.0},{\"uri\":\"http://www.edamam.com/ontologies/edamam.owl#Measure_milliliter\",\"label\":\"Milliliter\",\"quantity\":296.0}],\"servingsPerContainer\":9.0},\"measures\":[{\"uri\":\"http://www.edamam.com/ontologies/edamam.owl#Measure_serving\",\"label\":\"Serving\",\"weight\":283.49523125},{\"uri\":\"http://www.edamam.com/ontologies/edamam.owl#Measure_package\",\"label\":\"Package\",\"weight\":2551.45708125},{\"uri\":\"http://www.edamam.com/ontologies/edamam.owl#Measure_gram\",\"label\":\"Gram\",\"weight\":1.0},{\"uri\":\"http://www.edamam.com/ontologies/edamam.owl#Measure_ounce\",\"label\":\"Ounce\",\"weight\":28.349523125},{\"uri\":\"http://www.edamam.com/ontologies/edamam.owl#Measure_pound\",\"label\":\"Pound\",\"weight\":453.59237},{\"uri\":\"http://www.edamam.com/ontologies/edamam.owl#Measure_kilogram\",\"label\":\"Kilogram\",\"weight\":1000.0},{\"uri\":\"http://www.edamam.com/ontologies/edamam.owl#Measure_milliliter\",\"label\":\"Milliliter\",\"weight\":0.9577541596283784}]},{\"food\":{\"foodId\":\"food_aajg9pna90ej51bemy5nlb6q6ow0\",\"label\":\"Apple Sauce, Apple\",\"knownAs\":\"APPLE SAUCE, APPLE\",\"nutrients\":{\"ENERC_KCAL\":67.0,\"PROCNT\":0.0,\"FAT\":0.0,\"CHOCDF\":15.5600004196167,\"FIBTG\":2.200000047683716},\"brand\":\"Manzana Products Co Inc\",\"category\":\"Packaged foods\",\"categoryLabel\":\"food\",\"foodContentsLabel\":\"ORGANIC APPLES.\",\"servingSizes\":[{\"uri\":\"http://www.edamam.com/ontologies/edamam.owl#Measure_gram\",\"label\":\"Gram\",\"quantity\":90.0},{\"uri\":\"http://www.edamam.com/ontologies/edamam.owl#Measure_ounce\",\"label\":\"Ounce\",\"quantity\":3.200000047683716}]},\"measures\":[{\"uri\":\"http://www.edamam.com/ontologies/edamam.owl#Measure_serving\",\"label\":\"Serving\",\"weight\":90.71847535181061},{\"uri\":\"http://www.edamam.com/ontologies/edamam.owl#Measure_gram\",\"label\":\"Gram\",\"weight\":1.0},{\"uri\":\"http://www.edamam.com/ontologies/edamam.owl#Measure_ounce\",\"label\":\"Ounce\",\"weight\":28.349523125},{\"uri\":\"http://www.edamam.com/ontologies/edamam.owl#Measure_pound\",\"label\":\"Pound\",\"weight\":453.59237},{\"uri\":\"http://www.edamam.com/ontologies/edamam.owl#Measure_kilogram\",\"label\":\"Kilogram\",\"weight\":1000.0}]},{\"food\":{\"foodId\":\"food_b5gdwzob2922r0b1gja58biyt2zh\",\"label\":\"Apple Sauce, Apple\",\"knownAs\":\"APPLE SAUCE, APPLE\",\"nutrients\":{\"ENERC_KCAL\":64.0,\"PROCNT\":0.0,\"FAT\":0.0,\"CHOCDF\":15.710000038146973,\"FIBTG\":2.0999999046325684},\"brand\":\"Manzana Products Co Inc\",\"category\":\"Packaged foods\",\"categoryLabel\":\"food\",\"foodContentsLabel\":\"ORGANIC APPLES.\",\"image\":\"https://www.edamam.com/food-img/561/56161c5713df86aaf6e7497e5e34913e.png\",\"servingSizes\":[{\"uri\":\"http://www.edamam.com/ontologies/edamam.owl#Measure_gram\",\"label\":\"Gram\",\"quantity\":140.0},{\"uri\":\"http://www.edamam.com/ontologies/edamam.owl#Measure_cup\",\"label\":\"Cup\",\"quantity\":0.6666666666666666}]},\"measures\":[{\"uri\":\"http://www.edamam.com/ontologies/edamam.owl#Measure_serving\",\"label\":\"Serving\",\"weight\":140.0},{\"uri\":\"http://www.edamam.com/ontologies/edamam.owl#Measure_gram\",\"label\":\"Gram\",\"weight\":1.0},{\"uri\":\"http://www.edamam.com/ontologies/edamam.owl#Measure_ounce\",\"label\":\"Ounce\",\"weight\":28.349523125},{\"uri\":\"http://www.edamam.com/ontologies/edamam.owl#Measure_pound\",\"label\":\"Pound\",\"weight\":453.59237},{\"uri\":\"http://www.edamam.com/ontologies/edamam.owl#Measure_kilogram\",\"label\":\"Kilogram\",\"weight\":1000.0},{\"uri\":\"http://www.edamam.com/ontologies/edamam.owl#Measure_cup\",\"label\":\"Cup\",\"weight\":210.0}]},{\"food\":{\"foodId\":\"food_agyb6gwbneptnaa7ftp5rbtfst4c\",\"label\":\"Apple Juice, Apple\",\"knownAs\":\"APPLE JUICE, APPLE\",\"nutrients\":{\"ENERC_KCAL\":46.0,\"PROCNT\":0.0,\"FAT\":0.0,\"CHOCDF\":11.8100004196167},\"brand\":\"FARMS\",\"category\":\"Packaged foods\",\"categoryLabel\":\"food\",\"foodContentsLabel\":\"FRESH APPLES GROWN IN THE USA; POTASSIUM SORBATE (PRESERVATIVE); MAY CONTAIN APPLE MALIC ACID OR CITRIC ACID (FOR TARTNESS).\",\"servingSizes\":[{\"uri\":\"http://www.edamam.com/ontologies/edamam.owl#Measure_ounce\",\"label\":\"Ounce\",\"quantity\":8.0},{\"uri\":\"http://www.edamam.com/ontologies/edamam.owl#Measure_milliliter\",\"label\":\"Milliliter\",\"quantity\":237.0}],\"servingsPerContainer\":16.0},\"measures\":[{\"uri\":\"http://www.edamam.com/ontologies/edamam.owl#Measure_serving\",\"label\":\"Serving\",\"weight\":226.796185},{\"uri\":\"http://www.edamam.com/ontologies/edamam.owl#Measure_package\",\"label\":\"Package\",\"weight\":3628.73896},{\"uri\":\"http://www.edamam.com/ontologies/edamam.owl#Measure_gram\",\"label\":\"Gram\",\"weight\":1.0},{\"uri\":\"http://www.edamam.com/ontologies/edamam.owl#Measure_ounce\",\"label\":\"Ounce\",\"weight\":28.349523125},{\"uri\":\"http://www.edamam.com/ontologies/edamam.owl#Measure_pound\",\"label\":\"Pound\",\"weight\":453.59237},{\"uri\":\"http://www.edamam.com/ontologies/edamam.owl#Measure_kilogram\",\"label\":\"Kilogram\",\"weight\":1000.0},{\"uri\":\"http://www.edamam.com/ontologies/edamam.owl#Measure_milliliter\",\"label\":\"Milliliter\",\"weight\":0.9569459282700422}]},{\"food\":{\"foodId\":\"food_awxgflrbidvg1ibhy7dk4bwgydmu\",\"label\":\"Apple Sauce, Apple\",\"knownAs\":\"APPLE SAUCE, APPLE\",\"nutrients\":{\"ENERC_KCAL\":47.0,\"PROCNT\":0.0,\"FAT\":0.0,\"CHOCDF\":12.5,\"FIBTG\":1.600000023841858},\"brand\":\"Baugher Enterprises\",\"category\":\"Packaged foods\",\"categoryLabel\":\"food\",\"foodContentsLabel\":\"APPLES; VITAMIN C (ASCORBIC ACID).\",\"servingSizes\":[{\"uri\":\"http://www.edamam.com/ontologies/edamam.owl#Measure_gram\",\"label\":\"Gram\",\"quantity\":128.0},{\"uri\":\"http://www.edamam.com/ontologies/edamam.owl#Measure_cup\",\"label\":\"Cup\",\"quantity\":0.5}]},\"measures\":[{\"uri\":\"http://www.edamam.com/ontologies/edamam.owl#Measure_serving\",\"label\":\"Serving\",\"weight\":128.0},{\"uri\":\"http://www.edamam.com/ontologies/edamam.owl#Measure_gram\",\"label\":\"Gram\",\"weight\":1.0},{\"uri\":\"http://www.edamam.com/ontologies/edamam.owl#Measure_ounce\",\"label\":\"Ounce\",\"weight\":28.349523125},{\"uri\":\"http://www.edamam.com/ontologies/edamam.owl#Measure_pound\",\"label\":\"Pound\",\"weight\":453.59237},{\"uri\":\"http://www.edamam.com/ontologies/edamam.owl#Measure_kilogram\",\"label\":\"Kilogram\",\"weight\":1000.0},{\"uri\":\"http://www.edamam.com/ontologies/edamam.owl#Measure_cup\",\"label\":\"Cup\",\"weight\":256.0}]},{\"food\":{\"foodId\":\"food_bb8xj3eak0myn4axbed0qau1e46y\",\"label\":\"Apple Jelly, Apple\",\"knownAs\":\"APPLE JELLY, APPLE\",\"nutrients\":{\"ENERC_KCAL\":250.0,\"PROCNT\":0.0,\"FAT\":0.0,\"CHOCDF\":65.0},\"brand\":\"Associated Wholesale Grocers, Inc.\",\"category\":\"Packaged foods\",\"categoryLabel\":\"food\",\"foodContentsLabel\":\"APPLE JUICE WATER; APPLE JUICE CONCENTRATE); HIGH FRUCTOSE CORN SYRUP; CORN SYRUP; CONTAINS LESS THAN 2% OF FRUIT PECTIN; CITRIC ACID.\",\"servingSizes\":[{\"uri\":\"http://www.edamam.com/ontologies/edamam.owl#Measure_gram\",\"label\":\"Gram\",\"quantity\":20.0},{\"uri\":\"http://www.edamam.com/ontologies/edamam.owl#Measure_tablespoon\",\"label\":\"Tablespoon\",\"quantity\":1.0}]},\"measures\":[{\"uri\":\"http://www.edamam.com/ontologies/edamam.owl#Measure_serving\",\"label\":\"Serving\",\"weight\":20.0},{\"uri\":\"http://www.edamam.com/ontologies/edamam.owl#Measure_tablespoon\",\"label\":\"Tablespoon\",\"weight\":20.0},{\"uri\":\"http://www.edamam.com/ontologies/edamam.owl#Measure_gram\",\"label\":\"Gram\",\"weight\":1.0},{\"uri\":\"http://www.edamam.com/ontologies/edamam.owl#Measure_ounce\",\"label\":\"Ounce\",\"weight\":28.349523125},{\"uri\":\"http://www.edamam.com/ontologies/edamam.owl#Measure_pound\",\"label\":\"Pound\",\"weight\":453.59237},{\"uri\":\"http://www.edamam.com/ontologies/edamam.owl#Measure_kilogram\",\"label\":\"Kilogram\",\"weight\":1000.0}]},{\"food\":{\"foodId\":\"food_aimp4ssb497uf4abtlrxja1brl02\",\"label\":\"Apple Butter, Apple\",\"knownAs\":\"APPLE BUTTER, APPLE\",\"nutrients\":{\"ENERC_KCAL\":176.0,\"PROCNT\":0.0,\"FAT\":0.0,\"CHOCDF\":47.060001373291016,\"FIBTG\":0.0},\"brand\":\"Supervalu, Inc.\",\"category\":\"Packaged foods\",\"categoryLabel\":\"food\",\"foodContentsLabel\":\"APPLES; SUGAR; SPICES (CINNAMON AND CLOVES).\",\"image\":\"https://www.edamam.com/food-img/686/68619fb1b102f305b1801f0efae1810e.jpg\",\"servingSizes\":[{\"uri\":\"http://www.edamam.com/ontologies/edamam.owl#Measure_gram\",\"label\":\"Gram\",\"quantity\":17.0},{\"uri\":\"http://www.edamam.com/ontologies/edamam.owl#Measure_tablespoon\",\"label\":\"Tablespoon\",\"quantity\":1.0}]},\"measures\":[{\"uri\":\"http://www.edamam.com/ontologies/edamam.owl#Measure_serving\",\"label\":\"Serving\",\"weight\":17.0},{\"uri\":\"http://www.edamam.com/ontologies/edamam.owl#Measure_tablespoon\",\"label\":\"Tablespoon\",\"weight\":17.0},{\"uri\":\"http://www.edamam.com/ontologies/edamam.owl#Measure_gram\",\"label\":\"Gram\",\"weight\":1.0},{\"uri\":\"http://www.edamam.com/ontologies/edamam.owl#Measure_ounce\",\"label\":\"Ounce\",\"weight\":28.349523125},{\"uri\":\"http://www.edamam.com/ontologies/edamam.owl#Measure_pound\",\"label\":\"Pound\",\"weight\":453.59237},{\"uri\":\"http://www.edamam.com/ontologies/edamam.owl#Measure_kilogram\",\"label\":\"Kilogram\",\"weight\":1000.0}]},{\"food\":{\"foodId\":\"food_b7vybbmbjrnnhsap9kdrvalal3u9\",\"label\":\"Apple Sauce, Apple\",\"knownAs\":\"APPLE SAUCE, APPLE\",\"nutrients\":{\"ENERC_KCAL\":50.0,\"PROCNT\":1.1100000143051147,\"FAT\":0.0,\"CHOCDF\":13.329999923706055,\"FIBTG\":3.299999952316284},\"brand\":\"Tree Top Inc.\",\"category\":\"Packaged foods\",\"categoryLabel\":\"food\",\"foodContentsLabel\":\"APPLES; WATER; ASCORBIC ACID (VITAMIN C).\",\"servingSizes\":[{\"uri\":\"http://www.edamam.com/ontologies/edamam.owl#Measure_pouch\",\"label\":\"Pouch\",\"quantity\":1.0},{\"uri\":\"http://www.edamam.com/ontologies/edamam.owl#Measure_gram\",\"label\":\"Gram\",\"quantity\":90.0}],\"servingsPerContainer\":20.0},\"measures\":[{\"uri\":\"http://www.edamam.com/ontologies/edamam.owl#Measure_pouch\",\"label\":\"Pouch\",\"weight\":90.0},{\"uri\":\"http://www.edamam.com/ontologies/edamam.owl#Measure_serving\",\"label\":\"Serving\",\"weight\":90.0},{\"uri\":\"http://www.edamam.com/ontologies/edamam.owl#Measure_package\",\"label\":\"Package\",\"weight\":1800.0},{\"uri\":\"http://www.edamam.com/ontologies/edamam.owl#Measure_gram\",\"label\":\"Gram\",\"weight\":1.0},{\"uri\":\"http://www.edamam.com/ontologies/edamam.owl#Measure_ounce\",\"label\":\"Ounce\",\"weight\":28.349523125},{\"uri\":\"http://www.edamam.com/ontologies/edamam.owl#Measure_pound\",\"label\":\"Pound\",\"weight\":453.59237},{\"uri\":\"http://www.edamam.com/ontologies/edamam.owl#Measure_kilogram\",\"label\":\"Kilogram\",\"weight\":1000.0}]},{\"food\":{\"foodId\":\"food_bo3vukubebopr4aaqg098azzeilj\",\"label\":\"Apple Sauce, Apple\",\"knownAs\":\"APPLE SAUCE, APPLE\",\"nutrients\":{\"ENERC_KCAL\":50.0,\"PROCNT\":1.1100000143051147,\"FAT\":0.0,\"CHOCDF\":13.329999923706055,\"FIBTG\":1.100000023841858},\"brand\":\"Santa Cruz Natural\",\"category\":\"Packaged foods\",\"categoryLabel\":\"food\",\"foodContentsLabel\":\"ORGANIC APPLES; WATER; ASCORBIC ACID (VITAMIN C).\",\"image\":\"https://www.edamam.com/food-img/ff2/ff22eb59316ca8a12d577b2c2a686e80.jpg\",\"servingSizes\":[{\"uri\":\"http://www.edamam.com/ontologies/edamam.owl#Measure_pouch\",\"label\":\"Pouch\",\"quantity\":1.0},{\"uri\":\"http://www.edamam.com/ontologies/edamam.owl#Measure_gram\",\"label\":\"Gram\",\"quantity\":90.0}],\"servingsPerContainer\":4.0},\"measures\":[{\"uri\":\"http://www.edamam.com/ontologies/edamam.owl#Measure_pouch\",\"label\":\"Pouch\",\"weight\":90.0},{\"uri\":\"http://www.edamam.com/ontologies/edamam.owl#Measure_serving\",\"label\":\"Serving\",\"weight\":90.0},{\"uri\":\"http://www.edamam.com/ontologies/edamam.owl#Measure_package\",\"label\":\"Package\",\"weight\":360.0},{\"uri\":\"http://www.edamam.com/ontologies/edamam.owl#Measure_gram\",\"label\":\"Gram\",\"weight\":1.0},{\"uri\":\"http://www.edamam.com/ontologies/edamam.owl#Measure_ounce\",\"label\":\"Ounce\",\"weight\":28.349523125},{\"uri\":\"http://www.edamam.com/ontologies/edamam.owl#Measure_pound\",\"label\":\"Pound\",\"weight\":453.59237},{\"uri\":\"http://www.edamam.com/ontologies/edamam.owl#Measure_kilogram\",\"label\":\"Kilogram\",\"weight\":1000.0}]},{\"food\":{\"foodId\":\"food_bcquihybwyzy1kaoc0gefav5pczg\",\"label\":\"Apple Sauce, Apple\",\"knownAs\":\"APPLE SAUCE, APPLE\",\"nutrients\":{\"ENERC_KCAL\":50.0,\"PROCNT\":0.0,\"FAT\":0.0,\"CHOCDF\":13.329999923706055,\"FIBTG\":1.100000023841858},\"brand\":\"Harris-Teeter Inc.\",\"category\":\"Packaged foods\",\"categoryLabel\":\"food\",\"foodContentsLabel\":\"ORGANIC APPLES; ASCORBIC ACID (TO MAINTAIN COLOR).\",\"servingSizes\":[{\"uri\":\"http://www.edamam.com/ontologies/edamam.owl#Measure_pouch\",\"label\":\"Pouch\",\"quantity\":1.0},{\"uri\":\"http://www.edamam.com/ontologies/edamam.owl#Measure_gram\",\"label\":\"Gram\",\"quantity\":90.0}],\"servingsPerContainer\":1.0},\"measures\":[{\"uri\":\"http://www.edamam.com/ontologies/edamam.owl#Measure_pouch\",\"label\":\"Pouch\",\"weight\":90.0},{\"uri\":\"http://www.edamam.com/ontologies/edamam.owl#Measure_serving\",\"label\":\"Serving\",\"weight\":90.0},{\"uri\":\"http://www.edamam.com/ontologies/edamam.owl#Measure_package\",\"label\":\"Package\",\"weight\":90.0},{\"uri\":\"http://www.edamam.com/ontologies/edamam.owl#Measure_gram\",\"label\":\"Gram\",\"weight\":1.0},{\"uri\":\"http://www.edamam.com/ontologies/edamam.owl#Measure_ounce\",\"label\":\"Ounce\",\"weight\":28.349523125},{\"uri\":\"http://www.edamam.com/ontologies/edamam.owl#Measure_pound\",\"label\":\"Pound\",\"weight\":453.59237},{\"uri\":\"http://www.edamam.com/ontologies/edamam.owl#Measure_kilogram\",\"label\":\"Kilogram\",\"weight\":1000.0}]},{\"food\":{\"foodId\":\"food_bsb32rva1q7wuba1jh1jna433bkx\",\"label\":\"Apple Sauce, Apple\",\"knownAs\":\"APPLE SAUCE, APPLE\",\"nutrients\":{\"ENERC_KCAL\":50.0,\"PROCNT\":1.1100000143051147,\"FAT\":0.0,\"CHOCDF\":13.329999923706055,\"FIBTG\":1.100000023841858},\"brand\":\"Santa Cruz Natural\",\"category\":\"Packaged foods\",\"categoryLabel\":\"food\",\"foodContentsLabel\":\"ORGANIC APPLES; WATER; ASCORBIC ACID (VITAMIN C).\",\"image\":\"https://www.edamam.com/food-img/18d/18d14d9b11556b0d7bcd12e6784ec2ab.jpg\",\"servingSizes\":[{\"uri\":\"http://www.edamam.com/ontologies/edamam.owl#Measure_pouch\",\"label\":\"Pouch\",\"quantity\":1.0},{\"uri\":\"http://www.edamam.com/ontologies/edamam.owl#Measure_gram\",\"label\":\"Gram\",\"quantity\":90.0}],\"servingsPerContainer\":1.0},\"measures\":[{\"uri\":\"http://www.edamam.com/ontologies/edamam.owl#Measure_pouch\",\"label\":\"Pouch\",\"weight\":90.0},{\"uri\":\"http://www.edamam.com/ontologies/edamam.owl#Measure_serving\",\"label\":\"Serving\",\"weight\":90.0},{\"uri\":\"http://www.edamam.com/ontologies/edamam.owl#Measure_package\",\"label\":\"Package\",\"weight\":90.0},{\"uri\":\"http://www.edamam.com/ontologies/edamam.owl#Measure_gram\",\"label\":\"Gram\",\"weight\":1.0},{\"uri\":\"http://www.edamam.com/ontologies/edamam.owl#Measure_ounce\",\"label\":\"Ounce\",\"weight\":28.349523125},{\"uri\":\"http://www.edamam.com/ontologies/edamam.owl#Measure_pound\",\"label\":\"Pound\",\"weight\":453.59237},{\"uri\":\"http://www.edamam.com/ontologies/edamam.owl#Measure_kilogram\",\"label\":\"Kilogram\",\"weight\":1000.0}]}],\"_links\":{\"next\":{\"title\":\"Next page\",\"href\":\"https://api.edamam.com/api/food-database/v2/parser?session=44&app_id=a5c1a6e2&app_key=+917d9904d1aa8302eb4d353787034eb6&ingr=Apple&nutrition-type=cooking\"}}}";

    @Test
    public void connectivityToEdamAPITest(){
        Assertions.assertEquals(jsonProductDetails,fetchApiFood.getProductByName("Apple"));
    }
    @Test
    public void connectivityToEdamAPITest2(){
        Assertions.assertEquals(jsonProductDetails,fetchApiFood.getProductByName("APPLE"));
    }
    @Test
    public void connectivityToEdamAPITest3(){
        Assertions.assertEquals(jsonProductDetails,fetchApiFood.getProductByName("ApPlE"));
    }

    @Test
    public void mockFetchTest() {
        Mockito.when(mockitoFetch.getProductByName("apple")).thenReturn(jsonProductDetails);
        assertEquals(jsonProductDetails, mockitoFetch.getProductByName("apple"));
    }

    @Test
    public void mockFetchTest2() {
        Mockito.when(mockitoFetch.getProductByName(("Apple"))).thenReturn(jsonProductDetails);
        Assertions.assertEquals(mockitoFetch.getProductByName(("Apple")), fetchApiFood.getProductByName("Apple"));
    }
}