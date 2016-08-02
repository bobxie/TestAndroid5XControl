package cn.lovecoder.testandroid5xcontrol;

import android.app.Activity;
import android.os.Bundle;

public class MainActivity extends Activity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
//       StatusBarCompat.compat(this, getResources().getColor(R.color.colorAccent));
        //StatusBarCompat.compat(this);
    }


}
