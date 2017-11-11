package ltd.srspvt.wifi;

import android.content.Context;
import android.net.wifi.WifiManager;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.CompoundButton;
import android.widget.ToggleButton;

public class MainActivity extends AppCompatActivity {
    ToggleButton ONOFF;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        ONOFF = (ToggleButton) findViewById(R.id.togglebutton);
        ONOFF.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(CompoundButton compoundButton, boolean b) {
                if (b) {
                    WifiManager won = (WifiManager) getApplicationContext().getSystemService(Context.WIFI_SERVICE);
                won.setWifiEnabled(true);
                }
                else {WifiManager wof=(WifiManager) getApplicationContext().getSystemService(Context.WIFI_SERVICE);
                wof.setWifiEnabled(false);}
            }
        });
    }

}
