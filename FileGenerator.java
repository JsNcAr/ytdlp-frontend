import java.io.File;
import java.io.FileWriter;
import java.io.IOException;


public class FileGenerator {
  public static void write(String command) {
    try {
      FileWriter myWriter = new FileWriter("command.sh");
      myWriter.write(command);
      myWriter.close();
      System.out.println("Successfully wrote to the file.");
    } catch (IOException e) {
      System.out.println("An error occurred.");
      e.printStackTrace();
    }
  }

   public static void clean() {
    try {
      FileWriter myWriter = new FileWriter("command.sh");
      myWriter.write("");
      myWriter.close();
      System.out.println("Successfully clean file.");
    } catch (IOException e3) {
      System.out.println("An error occurred.");
      e3.printStackTrace();
    }
  }
}
