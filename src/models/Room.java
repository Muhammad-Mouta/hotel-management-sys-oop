package models;

import java.util.ArrayList;
import java.util.List;

public abstract class Room {
    protected int number;
    protected double baseRate;
    protected List<Service> services;

    // Constructors
    public Room(int number, double baseRate) {
        this.number = number;
        this.baseRate = baseRate;
        this.services = new ArrayList<>();
    }
    public Room(int number, double baseRate, List<Service> services) {
        this.number = number;
        this.baseRate = baseRate;
        this.services = services;
    }

    // Getters
    public int getNumber() {
        return this.number;
    }
    public double getBaseRate() {
        return this.baseRate;
    }
    public List<Service> getServices() {
        return this.services;
    }

    // Methods
    public void addService(Service service) {
        this.services.add(service);
    }
    public double getTotalCost() {
        return this.baseRate + this.services.stream().mapToDouble(Service::getCost).sum();
    }
    protected abstract String getDescription();
}
