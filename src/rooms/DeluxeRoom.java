package rooms;

import models.Room;
import models.Service;

import java.util.List;

public class DeluxeRoom extends Room {
    public DeluxeRoom(int number, double baseRate) {
        super(number, baseRate);
    }

    public DeluxeRoom(int number, double baseRate, List<Service> services) {
        super(number, baseRate, services);
    }

    public String getDescription() {
        return "Deluxe Room";
    }
}
