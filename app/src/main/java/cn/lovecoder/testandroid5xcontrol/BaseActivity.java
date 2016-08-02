package cn.lovecoder.testandroid5xcontrol;

import android.os.Bundle;
import android.os.PersistableBundle;
import android.support.v4.app.FragmentActivity;
import android.util.Log;

import cn.lovecoder.testandroid5xcontrol.util.StatusBarCompat;

/**
 * Created by haibo on 2016/8/1.
 */
public class BaseActivity extends FragmentActivity{
    @Override
    public void onCreate(Bundle savedInstanceState, PersistableBundle persistentState) {
        super.onCreate(savedInstanceState, persistentState);
//        StatusBarCompat.compat(this);
    }

    @Override
    public void onWindowFocusChanged(boolean hasFocus) {
        super.onWindowFocusChanged(hasFocus);
        Log.d("admin","hasFocus==" +hasFocus);
        StatusBarCompat.compat(this, getResources().getColor(R.color.colorAccent));
    }
}
