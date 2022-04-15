package project.Files;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.nio.file.StandardOpenOption;

public class FileService {
    public static void writeInDevFile(String name, char gender, int year, int experience) throws IOException {
        String[] s = new String[4];
        s[0] = name + ",";
        s[1] = gender + ",";
        s[2] = year + ",";
        s[3] = experience + "\n";
        for (int i = 0; i < s.length; i++) {
            Files.write(Paths.get("Dev.txt"), s[i].getBytes(), StandardOpenOption.APPEND);
        }
    }
    public static void writeInQAFile(String name, char gender, int year, int experience) throws IOException {
        String[] s = new String[4];
        s[0] = name + ",";
        s[1] = gender + ",";
        s[2] = year + ",";
        s[3] = experience + "\n";
        for (int i = 0; i < s.length; i++) {
            Files.write(Paths.get("QA.txt"), s[i].getBytes(), StandardOpenOption.APPEND);
        }
    }
    public static void writeInSupportFile(String name, char gender, int year, int experience) throws IOException {
        String[] s = new String[4];
        s[0] = name + ",";
        s[1] = gender + ",";
        s[2] = year + ",";
        s[3] = experience + "\n";
        for (int i = 0; i < s.length; i++) {
            Files.write(Paths.get("Support.txt"), s[i].getBytes(), StandardOpenOption.APPEND);
        }
    }
}
