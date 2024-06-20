package com.example.interaction_flow;

import java.util.ArrayList;
import java.util.List;

// StockData class that implements the Subject interface
public class StockData implements Subject {
    private List<Observer> observers;  // List to hold all registered observers
    private float price;               // Variable to hold the current stock price

    // Constructor to initialize the observers list
    public StockData() {
        observers = new ArrayList<>();
    }

    // Method to set the stock price and notify observers
    public void setPrice(float price) {
        this.price = price;
        notifyObservers();
    }

    // Method to register an observer
    @Override
    public void registerObserver(Observer o) {
        observers.add(o);
    }

    // Method to remove an observer
    @Override
    public void removeObserver(Observer o) {
        observers.remove(o);
    }

    // Method to notify all registered observers of the price change
    @Override
    public void notifyObservers() {
        for (Observer observer : observers) {
            observer.update(price);
        }
    }
}
