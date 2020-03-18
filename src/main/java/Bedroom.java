import java.util.ArrayList;

public class Bedroom {
    private int roomNumber;
    private int capacity;
    private ArrayList<Guest> occupants;
    private String roomType;


    public Bedroom(int roomNumber, int capacity, String roomType){
        this.roomNumber = roomNumber;
        this.capacity = capacity;
        this.roomType = roomType;
        this.occupants = new ArrayList<Guest>();
    }

    public int getRoomNumber() {
        return roomNumber;
    }

    public int getCapacity() {
        return capacity;
    }

    public int getOccupants() {
        return occupants.size();
    }

    public String getRoomType() {
        return roomType;
    }

    public void addGuest(Guest guest){
        if (occupants.size() < capacity){
            occupants.add(guest);
        } else {
            System.out.println("Room full");
        }
    }

    public void removeGuest(){
        occupants.clear();
    }
}
