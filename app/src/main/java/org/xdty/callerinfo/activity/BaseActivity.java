package org.xdty.callerinfo.activity;

import android.content.res.Configuration;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;

import org.xdty.callerinfo.utils.Utils;

public abstract class BaseActivity extends AppCompatActivity {
    @Override
    public void onConfigurationChanged(Configuration newConfig) {
        super.onConfigurationChanged(newConfig);
        Utils.checkLocale(getBaseContext());
    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        Utils.checkLocale(getBaseContext());

        setContentView(getLayoutId());
        setTitle(getTitleId());

    }

    protected abstract int getLayoutId();

    protected abstract int getTitleId();

}
