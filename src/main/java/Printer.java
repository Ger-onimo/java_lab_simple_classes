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


    public int refillPaper(int pages, int copies){
        int sheetsToPrint = pages * copies;
        int sheetsDifference = sheetsToPrint - this.sheetNumber;
        {
            return this.sheetNumber + sheetsDifference;
        }

    }

    public int reduceTonerVolume(int pages, int copies){
        int sheetsToPrint = pages * copies;
        {
            return this.tonerVolume - sheetsToPrint;
        }

    }

    public int getTonerVolume() {
        return tonerVolume;
    }

}

//    Create a method to refill the printer paper.
//        Add a toner volume property to the class.
//        Modify the printer so that it reduces the toner by 1 for each page printed.