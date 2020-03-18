import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;


public class RenceTest {
    private ConferenceRoom conf1;

    @Before
    public void before(){
        conf1 = new ConferenceRoom("Buchanan", 100);
    }

    @Test
    public void hasCapacity() {
        assertEquals(100, conf1.getCapacity());
    }

    @Test
    public void hasName() {
        assertEquals("Buchanan", conf1.getName());
    }
}
