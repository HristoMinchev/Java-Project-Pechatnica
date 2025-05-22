import java.io.*;
import java.util.*;

class Publication {
    public String title;
    public int pages;
    public int copies;
    public Paper paper;
    public double pricePerCopy;

    public Publication(String title, int pages, int copies, Paper paper, double pricePerCopy) {
        this.title = title;
        this.pages = pages;
        this.copies = copies;
        this.paper = paper;
        this.pricePerCopy = pricePerCopy;
    }

    public double getTotalRevenue(double discountThreshold, double discountRate) {
        if (copies > discountThreshold) {
            return copies * pricePerCopy * (1 - discountRate);
        }
        return copies * pricePerCopy;
    }

    public int getTotalPagesPrinted() {
        return pages * copies;
    }
}