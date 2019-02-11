import static org.junit.Assert.assertEquals;
import org.junit.Before;
import org.junit.Test;

public class PrinterTest {

    Printer printer;

    @Before
    public void before() {
        printer = new Printer(500, 3);
    }


//    @Test
//    public void printTotalSheets() {
//        assertEquals(100, printer.print(2, 50));
//    }

    @Test
    public void print() {
        assertEquals(400, printer.print(2, 50));
    }

    @Test
    public void refillPaper() {
        assertEquals(600, printer.refillPaper(2, 300));
    }




    @Test
    public void hasToner() {
        assertEquals(3, printer.getTonerVolume());
    }
}
//    @Test
//    public void totalSheetsNeededToPrint(){
//        assertEquals(100, printer.totalSheets(2, 50));
//    }

//    @Test
//    public void printerHasEnoughPaper(){
//        assertEquals(true, printer.enoughPaper(2, 50));
//    }
//
//    @Test
//    public void printerDoesNotHaveEnoughPaper(){
//        assertEquals(false, printer.enoughPaper(2, 500));
//    }

//    @Test
//    public void runPrinter(){
//        assertEquals(400, printer.runPrinter(2, 50));
//    }





