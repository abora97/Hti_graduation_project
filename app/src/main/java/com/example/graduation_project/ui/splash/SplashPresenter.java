package com.example.graduation_project.ui.splash;

import com.example.graduation_project.ui.base.BasePresenter;

public class SplashPresenter extends BasePresenter implements SplashContract.Presenter {

    private SplashContract.launch launch;

    SplashPresenter(SplashContract.launch launch) {
        this.launch = launch;
    }

    void initialization() {
        startActivityMethod();
    }


    void startActivityMethod() {
        new Thread() {
            @Override
            public void run() {
                try {
                    sleep(5000);
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
