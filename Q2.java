import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

public class Q2 {
    public static void main(String[] args) {
    String sourceFile = "source.txt";
    String destinationFile = "destination.txt";

    try (FileInputStream inputStream = new FileInputStream(sourceFile);
        FileOutputStream outputStream = new FileOutputStream(destinationFile)) {
      byte[] buffer = new byte[1024];
      int bytesRead;
      int count = 0;

      while ((bytesRead = inputStream.read(buffer)) != -1) {
        count += bytesRead;
        outputStream.write(buffer, 0, bytesRead);
      }

      System.out.println("File copying is done.");
      System.out.println("Number of bytes copied : " + count);

    } catch (IOException e) {
      System.out.println("Error");
      e.printStackTrace();
    }
  }
}
