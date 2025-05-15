import java.io.*;

public class FileHandling {
    static final String FILE_NAME = "test-file.txt";

    public static void main(String[] args) {
        writeToFile();
        readFromFile();
    } 

    private static void readFromFile(){
       try{
        FileReader fileReader = new FileReader(FILE_NAME);
        BufferedReader bufferedReader = new BufferedReader(fileReader);
        bufferedReader.close();
        
    } catch (IOException e) {
        System.out.println("Error reading from file: " + e.getMessage());

    }
}
private static void writeToFile() {
    try (BufferedWriter writer = new BufferedWriter(new FileWriter(FILE_NAME))) {
        writer.write(" test line written  by java code - may 11 2025");
        writer.newLine();
        writer.write("This is a another line by java code");
    } catch (IOException e) {
        System.out.println("Error writing to file: " + e.getMessage());
    }
}
}
