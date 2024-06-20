package com.example.interaction_flow;

import java.util.ArrayList;
import java.util.List;

// AveragePriceDisplay class that implements the Observer interface
public class AveragePriceDisplay implements Observer {
    private List<Float> prices;  // List to hold all recorded prices

    // Constructor to initialize the prices list
    public AveragePriceDisplay() {
        prices = new ArrayList<>();
    }

    // Method to update the list of prices and display the average
    @Override
    public void update(float price) {
        prices.add(price);
        display();
    }

    // Method to calculate and display the average stock price
    public void display() {
        float sum = 0;
        for (float price : prices) {
            sum += price;
        }
        float average = sum / prices.size();
        System.out.println("Average price: " + average + " USD");
    }
}
