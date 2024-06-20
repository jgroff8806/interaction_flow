package com.example.interaction_flow;

// Main class to demonstrate the interaction flow
public class App {
    public static void main(String[] args) {
        // Create the subject (StockData)
        StockData stockData = new StockData();

        // Create the observers (CurrentPriceDisplay and AveragePriceDisplay)
        CurrentPriceDisplay currentDisplay = new CurrentPriceDisplay();
        AveragePriceDisplay averageDisplay = new AveragePriceDisplay();

        // Register the observers with the subject
        stockData.registerObserver(currentDisplay);
        stockData.registerObserver(averageDisplay);

        // Change the stock price, which notifies the observers
        stockData.setPrice(100.0f);
        stockData.setPrice(102.0f);
        stockData.setPrice(101.0f);
    }
}