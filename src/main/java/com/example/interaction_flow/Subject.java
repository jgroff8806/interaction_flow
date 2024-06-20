package com.example.interaction_flow;

// Subject interface to be implemented by any class that needs to notify observers
public interface Subject {
    void registerObserver(Observer o);  // Register an observer
    void removeObserver(Observer o);    // Remove an observer
    void notifyObservers();             // Notify all registered observers of changes
}
