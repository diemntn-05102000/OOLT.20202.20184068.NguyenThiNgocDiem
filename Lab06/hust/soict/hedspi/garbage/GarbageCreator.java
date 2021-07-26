package soict.hedspi.garbage;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.nio.file.ReadOnlyFileSystemException;
import java.util.Scanner;
import java.util.logging.Level;
import java.util.logging.Logger;

public class GarbageCreator {
    public static void main(String[] args) throws FileNotFoundException {
        String url = "C:\\Users\\Dell\\IdeaProjects\\AimsProject\\src\\hust\\soict\\hedspi\\garbage\\data.txt";
        FileInputStream fileInputStream = new FileInputStream(url);
        String str = "";
        Scanner scanner = new Scanner(fileInputStream);
        try {
            while (scanner.hasNextLine()) {
                str += "" + scanner.nextLine();
            }
        } finally {
            try {
                scanner.close();
                fileInputStream.close();
            } catch (IOException ex) {
                Logger.getLogger(ReadOnlyFileSystemException.class.getName())
                        .log(Level.SEVERE, null, ex);
            }
        }
        System.out.println(str);
    }
}
