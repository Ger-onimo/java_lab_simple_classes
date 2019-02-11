public class Printer {
    private int sheetNumber;


    public Printer(int sheetNumber) {
        this.sheetNumber = sheetNumber;
    }

    public int totalSheets(int pages, int copies){
        return pages * copies;
    }

    public boolean enoughPaper(int pages, int copies){
        return this.sheetNumber >= this.totalSheets(pages, copies);
    }

    
}
