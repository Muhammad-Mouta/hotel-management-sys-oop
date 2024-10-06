package services;

import models.Service;

public class SpaService implements Service {
    @Override
    public double getCost() {
        return 200;
    }

    @Override
    public String getName() {
        return "Spa Service";
    }
}
