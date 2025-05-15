import java.io.*;

public class FileCreate {
    public static void main(String[] args) {
        File file;

        try {
             file = new File("c:\\code\\text2.txt");

            if (file.createNewFile()) {
                System.out.println("File created: " + file.getName());
            } else {
                System.out.println("file already exists.");
            }
        }

        catch (

        IOException e) {
            System.out.println("An error occurred.");
            e.printStackTrace();
        } finally {
            file = null;
        }

    }
}
