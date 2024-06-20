package com.example.interaction_flow;

// CurrentPriceDisplay class that implements the Observer interface
public class CurrentPriceDisplay implements Observer {
    private float price;  // Variable to hold the current stock price

    // Method to update the price and display it
    @Override
    public void update(float price) {
        this.price = price;
        display();
    }

    // Method to display the current stock price
    public void display() {
        System.out.println("Current price: " + price + " USD");
    }
}