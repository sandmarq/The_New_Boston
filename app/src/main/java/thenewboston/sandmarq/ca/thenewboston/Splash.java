package thenewboston.sandmarq.ca.thenewboston;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;

/**
 * Created by SANDRINE.MARQUIS on 2014-11-27.
 */
public class Splash extends Activity {
    @Override
    protected void onCreate(Bundle TravisLoveBacon) {
        super.onCreate(TravisLoveBacon);
        setContentView(R.layout.splash);

        Thread timer = new Thread(){
            @Override
            public void run() {
                try{
                    sleep(5000);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                } finally {
                    Intent openStartingPoint = new Intent("android.intent.action.STARTINGPOINT");
                    startActivity(openStartingPoint);
                }
            }
        };
        timer.start();
    }

    @Override
    protected void onPause() {
        super.onPause();
        finish();
    }
}