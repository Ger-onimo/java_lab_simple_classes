public class Printer {
    private int sheetNumber;
    private int tonerVolume;


    public Printer(int sheetNumber, int tonerVolume) {
        this.sheetNumber = sheetNumber;
        this.tonerVolume = tonerVolume;
    }

    public int print(int pages, int copies){
        int sheetsToPrint = pages * copies;
        {
            if (this.sheetNumber >= sheetsToPrint) {
                this.sheetNumber -= sheetsToPrint;
            }
        }
        return this.sheetNumber;
    }





    public int getTonerVolume() {
        return tonerVolume;
    }

}