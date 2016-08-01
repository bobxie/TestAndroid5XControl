package cn.lovecoder.testandroid5xcontrol;

import android.os.Bundle;
import android.os.PersistableBundle;
import android.support.v4.app.FragmentActivity;

import cn.lovecoder.testandroid5xcontrol.util.StatusBarCompat;

/**
 * Created by haibo on 2016/8/1.
 */
public class BaseActivity extends FragmentActivity{
    @Override
    public void onCreate(Bundle savedInstanceState, PersistableBundle persistentState) {
//        StatusBarCompat.compat(this);
        super.onCreate(savedInstanceState, persistentState);
        StatusBarCompat.compat(this, getResources().getColor(R.color.colorAccent));
//        StatusBarCompat.compat(this);
//        StatusBarCompat.compat(this, getResources().getColor(R.color.colorAccent));
    }
}
