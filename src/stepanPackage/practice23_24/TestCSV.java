package stepanPackage.practice23_24;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.List;

public class TestCSV {
    public static void main(String[] args) throws IOException {
        ParsadorCSV csv = new ParsadorCSV();

        List<String> lines = Files.readAllLines(Paths.get("C:\\Users\\studi\\Documents\\GitHub\\mireaJava\\src\\stepanPackage\\practice23_24\\task1\\movementList.csv"));

        for (int i = 1; i < lines.size(); i++) {
            csv.calculateData(lines.get(i));
        }

        csv.printFile();
    }
}
