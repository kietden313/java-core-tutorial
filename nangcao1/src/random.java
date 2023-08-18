import java.io.*;
import java.util.*;

public class random {

    {
            Random random = new Random();
            int x = random.nextInt(1000);
            System.out.println(x);
    }
}
/*public class Main {
    public static void main(String[] args) {
        Timer timer = new Timer();
        int i = 1;
        TimerTask task = new TimerTask() {
            @Override
            public void run() {
                System.out.println("Currnet time: " + new Date());
            }
        };
        timer.schedule(task, 0, i*1000);
            }
        }
 */
