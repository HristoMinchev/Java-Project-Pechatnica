import java.io.*;
import java.util.*;

public class Paper {
    private PaperType type;
    private PaperSize size;
    private double basePriceA5;
    private static final Map<PaperSize, Double> sizeMultiplier = Map.of(
            PaperSize.A5, 1.0,
            PaperSize.A4, 1.2,
            PaperSize.A3, 1.5,
            PaperSize.A2, 1.8,
            PaperSize.A1, 2.0
    );

    public Paper(PaperType type, PaperSize size, double basePriceA5) {
        this.type = type;
        this.size = size;
        this.basePriceA5 = basePriceA5;
    }

    public double getPrice() {
        return basePriceA5 * sizeMultiplier.get(size);
    }
}
