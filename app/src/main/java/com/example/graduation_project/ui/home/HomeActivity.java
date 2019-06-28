package com.example.graduation_project.ui.home;

import android.content.Intent;
import android.content.SharedPreferences;
import android.content.res.Configuration;
import android.os.Bundle;
import android.os.Handler;
import android.support.design.widget.NavigationView;
import android.support.v4.view.GravityCompat;
import android.support.v4.widget.DrawerLayout;
import android.support.v7.app.ActionBarDrawerToggle;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.TextView;
import android.widget.Toast;

import com.example.graduation_project.R;
import com.example.graduation_project.model.sql.DataBaseUserHelper;
import com.example.graduation_project.model.sql.userSql;
import com.example.graduation_project.ui.complain.ComplainFragment;
import com.example.graduation_project.ui.login.LoginActivity;
import com.example.graduation_project.ui.splash.SplashActivity;
import com.example.graduation_project.ui.subject.SubjectFragment;
import com.example.graduation_project.util.Constant;
import com.example.graduation_project.util.FragmentUtil;

import java.util.List;
import java.util.Locale;

import butterknife.ButterKnife;

public class HomeActivity extends AppCompatActivity implements NavigationView.OnNavigationItemSelectedListener, HomeContract.viewMain {

    private String lang;
    boolean doubleBackToExitPressedOnce = false;
    private DataBaseUserHelper dataBaseCartHelper;
    private List<userSql> list;
    private HomePresenter homePresenter;
    private MenuItem changeLan;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_home);
        ButterKnife.bind(this);
        Toolbar toolbar = findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);
        DrawerLayout drawer = findViewById(R.id.drawer_layout);
        NavigationView navigationView = findViewById(R.id.nav_view); //displays text of header of nav drawer
        View header = navigationView.getHeaderView(0);
        TextView name = header.findViewById(R.id.tv_student_id);
        FragmentUtil.swithchFragment(R.id.content_frame, new SubjectFragment(), HomeActivity.this);
        //DataBase
        dataBaseCartHelper = new DataBaseUserHelper(this);
        list = dataBaseCartHelper.getAllRecord();

        homePresenter = new HomePresenter(this);
        setTitle(getString(R.string.app_name));


        // swipeHome.setOnRefreshListener(this);

        ActionBarDrawerToggle toggle = new ActionBarDrawerToggle(
                this, drawer, toolbar, R.string.navigation_drawer_open, R.string.navigation_drawer_close);
        drawer.addDrawerListener(toggle);
        toggle.syncState();
        navigationView.setNavigationItemSelectedListener(this);


        name.setText(String.valueOf(list.get(0).getUserId()));
    }


    @Override
    public void onBackPressed() {
        DrawerLayout drawer = findViewById(R.id.drawer_layout);
        if (drawer.isDrawerOpen(GravityCompat.START)) { //for nav when open close :'D
            drawer.closeDrawer(GravityCompat.START);
        } else {
            if (doubleBackToExitPressedOnce) {
                super.onBackPressed();
                return;
            }
            this.doubleBackToExitPressedOnce = true;
            Toast.makeText(this, "Please click BACK again to exit", Toast.LENGTH_SHORT).show();

            new Handler().postDelayed(new Runnable() {

                @Override
                public void run() {
                    doubleBackToExitPressedOnce = false;
                }
            }, 2000);
        }
    }


    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.home, menu);
        return true;
    }

//    @Override
//    public boolean onOptionsItemSelected(MenuItem item) {
//        // Handle action bar item clicks here. The action bar will
//        // automatically handle clicks on the Home/Up button, so long
//        // as you specify a parent activity in AndroidManifest.xml.
//        int id = item.getItemId();
//
//        //noinspection SimplifiableIfStatement
//        if (id == R.id.action_settings) {
//            return true;
//        }
//
//        return super.onOptionsItemSelected(item);
//    }

    @SuppressWarnings("StatementWithEmptyBody")
    @Override
    public boolean onNavigationItemSelected(MenuItem item) {
        // Handle navigation view item clicks here.
        int id = item.getItemId();

        if (id == R.id.nav_home) {

            FragmentUtil.swithchFragment(R.id.content_frame, new SubjectFragment(), HomeActivity.this);

        } else if (id == R.id.nav_complaints) {
            // startActivity(new Intent(HomeActivity.this, ComplainActivity.class));
            FragmentUtil.swithchFragment(R.id.content_frame, new ComplainFragment(), HomeActivity.this);

        } else if (id == R.id.nav_logout) {
            dataBaseCartHelper.deleteAll();
            startActivity(new Intent(HomeActivity.this, LoginActivity.class));
            finish();
        }else if(id ==R.id.nav_language){
            SharedPreferences sharedPreferences = getSharedPreferences(Constant.HTI, MODE_PRIVATE);
            lang = sharedPreferences.getString(Constant.LANGUAGE, "en");
            changeLanguage(lang.equals("en") ? "ar" : "en");
        }

        DrawerLayout drawer = findViewById(R.id.drawer_layout);
        drawer.closeDrawer(GravityCompat.START);
        return true;
    }

    public void changeLanguage(String o) {
        getResources().getConfiguration().locale = (new Locale(o.toString()));
        SharedPreferences sharedPreferences = getSharedPreferences(Constant.HTI, MODE_PRIVATE);
        SharedPreferences.Editor editor = sharedPreferences.edit();
        editor.putString(Constant.LANGUAGE, o.toString());

        editor.commit();
        if (o.toString().equalsIgnoreCase("ar")) {
            getResources().getConfiguration().screenLayout = Configuration.SCREENLAYOUT_LAYOUTDIR_RTL;

        } else {
            getResources().getConfiguration().screenLayout = Configuration.SCREENLAYOUT_LAYOUTDIR_LTR;
        }

        Intent i = getBaseContext().getPackageManager()
                .getLaunchIntentForPackage(getBaseContext().getPackageName());
        i.addFlags(Intent.FLAG_ACTIVITY_CLEAR_TOP);
        startActivity(i);
        SplashActivity.DefaultLang = o.toString();
        Configuration config = getResources().getConfiguration();
        getApplicationContext().getResources().updateConfiguration(
                config,
                getApplicationContext().getResources().getDisplayMetrics()
        );
        // Utils.reset();
        finish();

    }

//    void changeLangeage() {
//        language = findViewById(R.id.lang);
//        changeLan = findViewById(R.id.change_lan);
//        SharedPreferences sharedPreferences = getSharedPreferences(Constants.ENR, MODE_PRIVATE);
//        language.setText((lang = sharedPreferences.getString(Constants.LANGUAGE, "en")).equals("en") ? "ع" : "EN");
//        changeLan.setOnClickListener(new View.OnClickListener() {
//            @Override
//            public void onClick(View v) {
//                changeLanguage(lang.equals("en") ? "ar" : "en");
//            }
//        });
//    }
}
