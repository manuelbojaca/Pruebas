
package reloj;

import java.util.Timer;
import java.util.TimerTask;

public class Reloj {
    public static void main(String[] args) {
    Timer timer;
    timer = new Timer();
    final String str = new String("VAN 10 BITCH");
    final TicClass tic = new TicClass(5);

    TimerTask task = new TimerTask() {

        @Override
        public void run()
        {
            if (tic.getValue()%2==0)
                System.out.println("TIC");
            else
                System.out.println("TOC");
                tic.increment();
            if(tic.getValue()%10==0){
                System.out.println(str);
            }
        }
    };
    timer.scheduleAtFixedRate(task, 0, 500);
    }
}