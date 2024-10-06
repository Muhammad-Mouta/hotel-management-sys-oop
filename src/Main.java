import models.Room;
import models.Service;
import rooms.DeluxeRoom;
import rooms.StandardRoom;
import rooms.SuiteRoom;
import services.DiningService;
import services.SpaService;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        List<Service> deluxeServices = new ArrayList<>();
        deluxeServices.add(new DiningService());
        List<Service> suiteServices = new ArrayList<>();
        suiteServices.add(new SpaService());
        suiteServices.add(new DiningService());
        Room[] rooms = new Room[]{
            new StandardRoom(205, 200),
            new DeluxeRoom(206, 500, deluxeServices),
            new SuiteRoom(207, 950, suiteServices)
        };
        System.out.println("Standard Room Cost = $" + rooms[0].getTotalCost());
        System.out.println("Deluxe Room Cost = $" + rooms[1].getTotalCost());
        System.out.println("Suite Room Cost = $" + rooms[2].getTotalCost());
    }
}