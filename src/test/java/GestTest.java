import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class GestTest {

    private Guest guest1;

   @Before
    public void before(){
       guest1 = new Guest("Harley");
    }

    @Test
    public void canGetNam(){
       assertEquals("Harley", guest1.getName());
    }
}
