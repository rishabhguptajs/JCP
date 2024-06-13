import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

public class Q1 {
  public static void main(String[] args) {
    String sourceFile = "source.txt";
    String destinationFile = "destination.txt";

    try (FileInputStream inputStream = new FileInputStream(sourceFile);
        FileOutputStream outputStream = new FileOutputStream(destinationFile)) {
      byte[] buffer = new byte[1024];
      int bytesRead;

      while ((bytesRead = inputStream.read(buffer)) != -1) {
        outputStream.write(buffer, 0, bytesRead);
      }

      System.out.println("File copying is done.");

    } catch (IOException e) {
      System.out.println("Error");
      e.printStackTrace();
    }
  }
}