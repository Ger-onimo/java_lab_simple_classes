import static org.junit.Assert.assertEquals;
import org.junit.Before;
import org.junit.Test;

public class PrinterTest {

    Printer printer;

    @Before
    public void before(){
        printer = new Printer(500, 3);
    }


}
