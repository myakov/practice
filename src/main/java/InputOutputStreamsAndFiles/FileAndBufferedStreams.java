package InputOutputStreamsAndFiles;

import java.io.*;

public class FileAndBufferedStreams {

    public static void main(String[] args) {

        doTryWithResources();
        writeData(Constants.data);

    }


    private static void doTryWithResources() {
        char[] buff = new char[8];
        int length;
        try (BufferedReader reader = new BufferedReader(new FileReader("/Users/milenyakov/Desktop/repo/practice/src/main/resources/file1.txt"))) {
            while ((length = reader.read(buff)) >= 0) {
                System.out.println("\nlength: " + length);
                for (int i = 0; i < length; i++) {
                    System.out.println(buff[i]);
                }
            }
        } catch (IOException e) {
            System.out.println(e.getClass().getSimpleName() + " - " + e.getMessage());
        }
    }

    private static void writeData(String[] data) {
        try (BufferedWriter bw = new BufferedWriter(new FileWriter("/Users/milenyakov/Desktop/repo/practice/src/main/resources/data.txt"))) {
            for (String d : data) {
                bw.write(d);
                bw.newLine();
            }
        } catch (IOException e) {
            System.out.println(e.getClass().getSimpleName() + e.getMessage());
        }
    }


    interface Constants {
        String[] data = {
                "Line 1",
                "Line 2 2",
                "Line 3 3 3",
                "Line 4 4 4 4",
                "Line 5 5 5 5 5"};
    }
}
