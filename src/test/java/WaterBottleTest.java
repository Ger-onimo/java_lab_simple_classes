import static org.junit.Assert.assertEquals;
import org.junit.Before;
import org.junit.Test;


public class WaterBottleTest {

    WaterBottle waterBottle;

    @Before
    public void before(){
        waterBottle = new WaterBottle();
    }

    @Test
    public void reduceVolume(){
        assertEquals(90, waterBottle.reduceVolume());
    }

    @Test
    public void zeroVolume(){
        assertEquals(0, waterBottle.zeroVolume());
    }

    @Test
    public void fillWaterBottle(){
        assertEquals(100, waterBottle.fillWaterBottle());
    }
}
