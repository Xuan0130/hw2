package com.example.hw2;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;

public class FakeDatabase {

    public static Food getFoodById(int foodID) {
        return foods.get(foodID);
    }


    public static ArrayList<Food> getAllFoods() {
        return new ArrayList<Food>((List) Arrays.asList(foods.values().toArray()));
    }

    private static final HashMap<Integer, Food> foods = new HashMap<>();


    static {
        foods.put(1, new Food(
                1,
                "Zinger Stacker Burger",
                3,
                1,
                "This fab burger has two crunchy Zinger fillets, Supercharged Sauce and chilli relish, because we know you like it big. This offer is not everywhere and not forever.",
                R.drawable.zingerstackerburger
        ));
        foods.put(2,new Food(
                2,
                "Double Tender Burger Combo ",
                3,
                1,
                "Two Original Tenders, creamy pepper mayo, crisp lettuce on a warm sesame seed bun, served with chips and a drink. Did someone say yum?",
                R.drawable.doubletenderburgercombo
        ));
        foods.put(3,new Food(
                3,
                "Double Tender Burger",
                2,
                1,
                "Double the tenders, double the drool. Topped off with saucy lil' peppermayo and crisp lettuce goodness, all on a warm sesame seed bun. It's the ultimate cure to your silly season-itis. This offer is not everywhere and not forever.",
                R.drawable.doubletenderburger
        ));
        foods.put(4,new Food(
                4,
                "Original Fillet Burger",
                2,
                1,
                "100% breast chicken fillet coated in our 11 secret herbs and spices and freshly prepared with crisp lettuce and mayo on a sesame seeded bun.",
                R.drawable.originalfilletburger
        ));
        foods.put(5,new Food(
                5,
                "Zinger Burger",
                4,
                1,
                "100% breast fillet chicken coated in Zinger flavouring, lettuce and mayo all perfectly matched to deliver a spicy flavor hit.",
                R.drawable.zingerburger
        ));
        foods.put(6,new Food(
                6,
                "Kentucky Burger",
                4,
                1,
                "A juicy Original Recipe fillet, coleslaw, crispy onions, two slices of cheese, bacon and smoky BBQ sauce. Oooh yeah!\n",
                R.drawable.kentuckyburger
        ));
        foods.put(7,new Food(
                7,
                "Zinger Bacon & Cheese Burger",
                4,
                1,
                "Your fave spicy Zinger Fillet Burger with the addition of delicious bacon and cheese! Because everything’s better with bacon and cheese.",
                R.drawable.zingerbaconcheeseburger
        ));

        foods.put(8,new Food(
                8,
                "3 Wicked Wings",
                3,
                1,
                "Add some bite to your meal and order our chicken wings with a spicy marinade and a crispy crunchy coating.",
                R.drawable.wickedwings
        ));

        foods.put(9,new Food(
                9,
                "Regular Popcorn",
                3,
                1,
                "Bite size pieces of real breast fillet chicken tumbled in our signature marinade and cooked in a crunchy coating.",
                R.drawable.regularpopcorn
        ));

        foods.put(10,new Food(
                10,
                "3 Original Tenders",
                2,
                1,
                "Boneless Original Recipe chicken just perfect for dipping. Served with creamy aioli dipping sauce.",
                R.drawable.originaltenders
        ));

        foods.put(11,new Food(
                11,
                "Large Seasoned Chips",
                3,
                1,
                "Golden, thick-cut chips sprinkled with our signature seasoning to leave you wanting more… no wonder they’re Australia’s best tasting chips. Yeah, we went there.",
                R.drawable.largeseasonedchips
        ));

        foods.put(12,new Food(
                12,
                "Regular Potato & Gravy",
                3,
                1,
                "Soft and fluffy potato mash with warm, rich gravy. Mmmmm…",
                R.drawable.regularpotatogravy
        ));

        foods.put(13,new Food(
                13,
                "Pepsi",
                2,
                1,
                "Quench your thirst with Pepsi. Available in 375mL Cans, 600mL and 1.25L bottles.",
                R.drawable.pepsi
        ));

        foods.put(14,new Food(
                14,
                "Bottled Water",
                3,
                1,
                "Quench your thirst with refreshing Australian spring water from Cool Ridge.",
                R.drawable.bottledwater
        ));

        foods.put(15,new Food(
                15,
                "Orange Juice",
                5,
                1,
                "Enjoy a Spring Valley Orange Juice, made from the best fruit for that refreshing flavour.",
                R.drawable.orangejuice
        ));
    }

}
