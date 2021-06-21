import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        MyThread myThread = new MyThread();
        myThread.setMin(1);
        myThread.setSec(1);
        Thread thread = new Thread(myThread);
        thread.start();
    }
}
