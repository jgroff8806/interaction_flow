package com.example.interaction_flow;

// Observer interface to be implemented by any class that needs to be notified of changes
public interface Observer {
    void update(float price);  // Method to update the observer with new data
}