import java.util.*;
import java.text.*;

public class WorldClock {
    
    public static void main(String[] args) {
        Thread clock1 = new Thread(new Clock("New York", -5));
        Thread clock2 = new Thread(new Clock("London", 0));
        Thread clock3 = new Thread(new Clock("Tokyo", 9));
        Thread clock4 = new Thread(new Clock("Sydney", 10));
        Thread clock5 = new Thread(new Clock("Dubai", 4));
        
        clock1.start();
        clock2.start();
        clock3.start();
        clock4.start();
        clock5.start();
    }
    
    static class Clock implements Runnable {
        private String city;
        private int timeZoneOffset;
        
        public Clock(String city, int timeZoneOffset) {
            this.city = city;
            this.timeZoneOffset = timeZoneOffset;
        }
        
        public void run() {
            while(true) {
                try {
                    DateFormat dateFormat = new SimpleDateFormat("yyyy/MM/dd HH:mm:ss");
                    Date date = new Date();
                    date.setTime(date.getTime() + this.timeZoneOffset * 3600000);
                    System.out.println(city + " - " + dateFormat.format(date));
                    Thread.sleep(1000);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }
        }
    }
}