package rooms;

import models.Room;
import models.Service;

import java.util.List;

public class SuiteRoom extends Room {
    public SuiteRoom(int number, double baseRate) {
        super(number, baseRate);
    }

    public SuiteRoom(int number, double baseRate, List<Service> services) {
        super(number, baseRate, services);
    }

    public String getDescription() {
        return "Suite Room";
    }
}
