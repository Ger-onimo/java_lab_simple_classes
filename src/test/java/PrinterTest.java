import static org.junit.Assert.assertEquals;
import org.junit.Before;
import org.junit.Test;

public class PrinterTest {

    Printer printer;

    @Before
    public void before(){
        printer = new Printer(500);
    }

    @Test
    public void totalSheetsNeededToPrint(){
        assertEquals(100, printer.totalSheets(2, 50));
    }

    @Test
    public void printerHasEnoughPaper(){
        assertEquals(true, printer.enoughPaper(2, 50));
    }

    @Test
    public void printerDoesNotHaveEnoughPaper(){
        assertEquals(false, printer.enoughPaper(2, 500));
    }


}
