package InputOutputStreamsAndFiles;

import java.io.*;

public class CopyFileContent {

    public static void main(String[] args) {
        copyFileContent();
    }

    private static void copyFileContent() {
        char[] buff = new char[8];
        int length;
        try (Reader reader = new FileReader("/Users/milenyakov/Desktop/repo/practice/src/main/resources/file1.txt");
             Writer writer = new FileWriter("/Users/milenyakov/Desktop/repo/practice/src/main/resources/file2.txt") {
             }) {
            while ((length = reader.read(buff)) >= 0) {
                System.out.println("\nlength: " + length);
                writer.write(buff, 0, length);
            }
        } catch (IOException e) {
            System.out.println((e.getClass()).getSimpleName() + " - " + e.getMessage());
        }
    }

}
