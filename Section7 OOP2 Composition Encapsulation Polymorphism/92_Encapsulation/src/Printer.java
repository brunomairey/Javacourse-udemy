public class Printer {
    private int tonerLevel;
    int pagesPrinted;
    boolean duplexPrinter;

    public Printer(int tonerLevel, boolean duplexPrinter) {
        if (tonerLevel >= 0 && tonerLevel <= 100) {
            this.tonerLevel = tonerLevel;
        }
        else {this.tonerLevel=-1;}

        this.pagesPrinted = 0;
        this.duplexPrinter = duplexPrinter;

    }

    public int addToner (int tonerAmount){
        if (tonerAmount>0.0 && tonerAmount <=100){
            if(this.tonerLevel + tonerAmount > 100){
                return -1;
            }
            this.tonerLevel+= tonerAmount;
            return  this.tonerLevel;
        }
        else {return -1;}
    }

    public int printPages (int pages){
        int pagesToprint = pages;
        if (this.duplexPrinter) {
            pagesToprint = (pages/2) + (pages%2);
        }
        System.out.println("Printing in duplex mode");
        this.pagesPrinted +=pagesToprint;
        return pagesToprint;

    }

    public int getPagesPrinted() {
        return pagesPrinted;
    }
}
