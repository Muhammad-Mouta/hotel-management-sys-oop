import models.Room;
import models.Service;

import java.util.HashMap;
import java.util.List;

public class Hotel {
    private final HashMap<Integer, Room> rooms;

    public Hotel(List<Room> rooms) {
        this.rooms = new HashMap<>();
        rooms.forEach(this::addRoom);
    }

    public void addRoom(Room room) {
        this.rooms.put(room.getNumber(), room);
    }

    public Room getRoom(int number) {
        return this.rooms.get(number);
    }

    public void bookRoom(int number, Service service) {
        Room room = this.rooms.get(number);
        room.addService(service);
    }

    public void bookRoom(int number, List<Service> services) {
        Room room = this.rooms.get(number);
        services.forEach(room::addService);
    }

    public void displayBookingDetails(int number) {
        Room room = this.rooms.get(number);
        String serviceString = "";
        if (room.getServices() == null || room.getServices().isEmpty()) {
            serviceString = "No services available";
        } else {
            serviceString = room.getServices().toString();
        }
        System.out.println("Number: " + room.getNumber() + ", Services: " +serviceString + ", Total Cost: " + room.getTotalCost());
    }
}
