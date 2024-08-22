import java.io.*;
import java.util.concurrent.*;

class MyTask implements Runnable {
    public void run() {
        PrintWriter writer = null;
        try {
            writer = new PrintWriter("C:\\Users\\sathwika.kintali\\Desktop\\java\\Workshop.txt");
            writer.println("Hello, World!");
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } finally {
            if (writer != null) {
                writer.close();
            }
        }
    }
}

public class ExceptionHandling {
    public static void main(String[] args) {
        ExecutorService executor = Executors.newSingleThreadExecutor();

        MyTask task = new MyTask();

        executor.submit(task);
        executor.shutdown();
    }
}
