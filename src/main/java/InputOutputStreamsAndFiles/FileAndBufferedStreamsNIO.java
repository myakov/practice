package InputOutputStreamsAndFiles;

import java.io.BufferedReader;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.List;
    
public class FileAndBufferedStreamsNIO {

    public static void main(String[] args) throws IOException {
        readData();
        readAllData();
    }

    private static void readData() throws IOException {
        try (BufferedReader br = Files.newBufferedReader(Paths.get("/Users/milenyakov/Desktop/repo/practice/src/main/resources/data.txt"))) {
            String inValue;
            while ((inValue = br.readLine()) != null) {
                System.out.println(inValue);
            }
        }
    }


    private static void readAllData() throws IOException {
        List<String> lines = Files.readAllLines(Paths.get("/Users/milenyakov/Desktop/repo/practice/src/main/resources/data.txt"));
        for (String line : lines) {
            System.out.println(line);
        }
    }

}
