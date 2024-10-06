package services;

import models.Service;

public class DiningService  implements Service {
    @Override
    public double getCost() {
        return 50;
    }

    @Override
    public String getName() {
        return "Dining Service";
    }
}
