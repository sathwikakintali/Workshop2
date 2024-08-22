import java.nio.file.*;
import java.io.*;

public class FileHandling {
    public static void main(String[] args) {
        Path dir = Paths.get("C:\\Users\\sathwika.kintali\\Desktop\\M");
        try (DirectoryStream<Path> stream = Files.newDirectoryStream(dir)) {
            for (Path file: stream) {
                System.out.println(file.getFileName());
            }
        } catch (IOException x) {
            x.printStackTrace();
        } catch (DirectoryIteratorException x) {
            x.printStackTrace();
        }
    }
}
