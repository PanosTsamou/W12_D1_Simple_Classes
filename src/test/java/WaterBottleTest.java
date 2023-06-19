import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;


public class WaterBottleTest {
    Water_Bottle waterBottle;

    @Before
    public void before(){
        waterBottle = new Water_Bottle();
    }

    @Test
    public void init_bottle(){
        int level = waterBottle.waterLevel();
        assertEquals(100,level);
    }
    @Test
    public void can_drink(){
        waterBottle.drink();
        waterBottle.drink();
        int level = waterBottle.waterLevel();
        assertEquals(80,level);
    }
    @Test
    public void empty_bottle(){
        waterBottle.empty();
        int level = waterBottle.waterLevel();
        assertEquals(0,level);
    }
    @Test
    public void  full_bottle(){
        waterBottle.drink();
        waterBottle.drink();
        waterBottle.drink();
        waterBottle.full();
        int level = waterBottle.waterLevel();
        assertEquals(100, level);
    }
}
