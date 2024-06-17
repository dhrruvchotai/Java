import java.text.SimpleDateFormat;
import java.util.Date;

class TimePrinter implements Runnable {
    @Override
    public void run() {
        while (true) {
            Date currentTime = new Date();
            SimpleDateFormat sdf = new SimpleDateFormat("HH:mm:ss");
            System.out.println("Current Time: " + sdf.format(currentTime));
            try {
                Thread.sleep(1000); // Sleep for 1 second
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
}

class Greeting implements Runnable {
    @Override
    public void run() {
        while (true) {
            Date currentTime = new Date();
            SimpleDateFormat sdf = new SimpleDateFormat("HH");
            int currentHour = Integer.parseInt(sdf.format(currentTime));
            if (currentHour < 12) {
                System.out.println("Good Morning!");
            } else if (currentHour < 17) {
                System.out.println("Good Afternoon!");
            } else if (currentHour < 20) {
                System.out.println("Good Evening!");
            } else {
                System.out.println("Good Night!");
            }
            try {
                Thread.sleep(3600000); // Sleep for 1 hour
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
}

public class JavaViva1{
    public static void main(String[] args) {
        Thread timeThread = new Thread(new TimePrinter());
        Thread greetingThread = new Thread(new Greeting());

        timeThread.start();
        greetingThread.start();
    }
}

