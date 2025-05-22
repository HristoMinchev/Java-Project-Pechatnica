import java.io.*;
import java.util.*;

class Printer {
    private String id;
    private int maxSheets;
    private boolean color;
    private int speed;
    private List<Publication> history = new ArrayList<>();

    public Printer(String id, int maxSheets, boolean color, int speed) {
        this.id = id;
        this.maxSheets = maxSheets;
        this.color = color;
        this.speed = speed;
    }

    public void loadPaper(int sheets) throws Exception {
        if (sheets > maxSheets) throw new Exception("Too much paper loaded.");
    }

    public void print(Publication pub, PrintColor color) throws Exception {
        if (!this.color && color == PrintColor.COLOR) {
            throw new Exception("Cannot print in color on black-and-white printer.");
        }
        history.add(pub);
    }

    public int getTotalPagesPrinted() {
        return history.stream().mapToInt(Publication::getTotalPagesPrinted).sum();
    }
}
