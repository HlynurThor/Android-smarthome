package hlynurthor.com.smarthome;

import android.widget.Button;
import android.widget.SeekBar;
import android.widget.TextView;

/**
 * Created by Hlynur on 15-Apr-2018.
 */

public class ActionLights {

    private class yourListener implements SeekBar.OnSeekBarChangeListener {
        Button buttonlightOn;
        SeekBar seekbar_Light;
        TextView LightText1;

        public void onProgressChanged(SeekBar seekBar, int progress,
                                      boolean fromUser) {
            /*
            Button buttonlightOn = (Button) findViewById(R.id.button_lightOn1);
            SeekBar seekbar_Light = (SeekBar) findViewById(R.id.seekBar_Light1);
            TextView LightText1 = (TextView) findViewById(R.id.LightText1);
            if (seekbar_Light.getProgress() != 0) {

                buttonlightOn.setText("Light off");
                LightText1.setText("Light one "+seekbar_Light.getProgress() +"%");

            }
            else {
                buttonlightOn.setText("Light on");
                LightText1.setText("Light one");
            }
            */
        }


        public void onStartTrackingTouch(SeekBar seekBar) {}

        public void onStopTrackingTouch(SeekBar seekBar) {}

    }
}
