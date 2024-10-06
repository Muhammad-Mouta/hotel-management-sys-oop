package services;

import models.Service;

public class GymService implements Service {
    @Override
    public double getCost() {
        return 150;
    }

    @Override
    public String getName() {
        return "Gym Service";
    }
}
