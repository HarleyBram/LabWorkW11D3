import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class BedTest {

    private Bedroom bedroom1;
    private Guest guest1;

    @Before
    public void before(){
        bedroom1 = new Bedroom(12, 2, "double");
    }

    @Test
    public void hasRoomNumber() {
        assertEquals(12, bedroom1.getRoomNumber());
    }

    @Test
    public void hasCapacity() {
        assertEquals(2, bedroom1.getCapacity());
    }

    @Test

    public void hasRoomType() {
        assertEquals("double", bedroom1.getRoomType());
    }

    @Test
    public void canAddGuestToBedroom(){
        bedroom1.addGuest(guest1);
        assertEquals(1, bedroom1.getOccupants());
    }

    @Test
    public void canEmptyGuestArray(){
        bedroom1.addGuest(guest1);
        bedroom1.removeGuest();
        assertEquals(0, bedroom1.getOccupants());
    }
}
