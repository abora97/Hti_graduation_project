package com.example.graduation_project.ui.splash;

import android.content.Context;
import android.content.SharedPreferences;
import android.content.res.Configuration;

import com.example.graduation_project.ui.base.BasePresenter;
import com.example.graduation_project.util.Constant;

import java.util.Locale;

import static android.content.Context.MODE_PRIVATE;

public class SplashPresenter extends BasePresenter implements SplashContract.Presenter {

    private SplashContract.launch launch;
private Context context;
    SplashPresenter(SplashContract.launch launch,Context context) {
        this.launch=launch;
        this.context = context;
    }

    void initialization() {
        startActivityMethod();
    }


    void changeLanguage(){
        SharedPreferences sharedPreferences =context.getSharedPreferences(Constant.HTI, MODE_PRIVATE);
        String o = sharedPreferences.getString(Constant.LANGUAGE, context.getResources().getConfiguration().locale.getISO3Language());
        context.getResources().getConfiguration().locale = (new Locale(o));
        if (o.equalsIgnoreCase("ar"))
            context.getResources().getConfiguration().screenLayout = Configuration.SCREENLAYOUT_LAYOUTDIR_RTL;
        else
            context.getResources().getConfiguration().screenLayout = Configuration.SCREENLAYOUT_LAYOUTDIR_LTR;

       //AppController.getInstance().appInit();
        SplashActivity.DefaultLang = o.toString();
        Configuration config = context.getResources().getConfiguration();
        context.getResources().updateConfiguration(
                config,
                context.getResources().getDisplayMetrics()
        );
        context.getApplicationContext().getResources().updateConfiguration(
                config,
                context.getResources().getDisplayMetrics()
        );
    }

    void startActivityMethod() {
        new Thread() {
            @Override
            public void run() {
                try {
                    sleep(10);
                    launch.startActivityMethod();
                    super.run();
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }
        }.start();
    }

    @Override
    public void detachView() {
        launch = null;
    }
}
