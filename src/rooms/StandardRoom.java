package rooms;

import models.Room;
import models.Service;

import java.util.List;

public class StandardRoom extends Room {
    public StandardRoom(int number, double baseRate) {
        super(number, baseRate);
    }

    public StandardRoom(int number, double baseRate, List<Service> services) {
        super(number, baseRate, services);
    }

    public String getDescription() {
        return "Standard Room";
    }
}
