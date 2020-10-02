package RWFiles;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.PrintWriter;
import java.nio.file.FileAlreadyExistsException;

public class RWFiles {
    public static void main(String[] arg) {
        boolean successR = readFile();
        if (!successR) {
            System.out.println("File does not exists");
            boolean successW = writeFile();
            if (!successW) { System.out.println("File already exists"); }
        }
    }

    private static boolean writeFile() {
        try {
            File file = new File("./assets/test");

            if (file.exists()) {
                return false;
            }

            file.createNewFile();
            PrintWriter printWriter = new PrintWriter(file);
            printWriter.println("New file has been instantiated");
            printWriter.println(12);
            printWriter.close();

        } catch (Exception e) {
            System.out.println(e);
            return false;
        } finally {
            System.out.println("Done Writing File");
        }

        return true;
    }

    private static boolean readFile() {
        BufferedReader br = null;

        try {
            br = new BufferedReader(new FileReader("./assets/test"));
            String line;

            while( (line = br.readLine()) != null) {
                System.out.println(line);
            }
        } catch (Exception e) {
            System.out.println(e);
            return false;
        } finally {
            System.out.println("Done Reading File");
        }

        return true;
    }
}
