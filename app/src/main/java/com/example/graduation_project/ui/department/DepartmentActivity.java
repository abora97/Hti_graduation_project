package com.example.graduation_project.ui.department;

import android.content.Intent;
import android.content.SharedPreferences;
import android.content.res.Configuration;
import android.os.Bundle;
import android.os.Handler;
import android.os.Parcelable;
import android.support.design.widget.NavigationView;
import android.support.design.widget.TabLayout;
import android.support.v4.view.GravityCompat;
import android.support.v4.view.ViewPager;
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
import com.example.graduation_project.ui.home.HomeActivity;
import com.example.graduation_project.ui.login.LoginActivity;
import com.example.graduation_project.ui.splash.SplashActivity;
import com.example.graduation_project.util.Constant;

import java.util.ArrayList;
import java.util.List;
import java.util.Locale;

import butterknife.BindView;
import butterknife.ButterKnife;

public class DepartmentActivity extends AppCompatActivity
        implements NavigationView.OnNavigationItemSelectedListener {

    @BindView(R.id.toolbar)
    Toolbar toolbar;
    @BindView(R.id.tabs)
    TabLayout tabLayout;
    @BindView(R.id.viewpager)
    ViewPager viewPager;
    private DataBaseUserHelper dataBaseCartHelper;
    private List<userSql> list;
    boolean doubleBackToExitPressedOnce = false;
    private String lang;
    private ArrayList<String> arrayList;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.department_activty);
        ButterKnife.bind(this);
        Toolbar toolbar = findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);
        arrayList = new ArrayList<>();

        arrayList.add(getString(R.string.eng));
        arrayList.add(getString(R.string.cs));
        arrayList.add(getString(R.string.man_en));

        NavigationView navigationView = findViewById(R.id.nav_view); //displays text of header of nav drawer
        View header = navigationView.getHeaderView(0);
        TextView name = header.findViewById(R.id.tv_manager_name);


        //DataBase
        dataBaseCartHelper = new DataBaseUserHelper(this);
        list = dataBaseCartHelper.getAllRecord();

        TabsAdapter adapter = new TabsAdapter(getSupportFragmentManager(), arrayList);
        viewPager.setAdapter(adapter);

        tabLayout.setupWithViewPager(viewPager);

        DrawerLayout drawer = findViewById(R.id.drawer_layout);

        ActionBarDrawerToggle toggle = new ActionBarDrawerToggle(
                this, drawer, toolbar, R.string.navigation_drawer_open, R.string.navigation_drawer_close);
        drawer.addDrawerListener(toggle);
        toggle.syncState();
        navigationView.setNavigationItemSelectedListener(this);

        name.setText(String.valueOf(list.get(0).getUserName()));
    }

    @Override
    public void onBackPressed() {
        DrawerLayout drawer = findViewById(R.id.drawer_layout);
        if (drawer.isDrawerOpen(GravityCompat.START)) {
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
        getMenuInflater().inflate(R.menu.department_activty, menu);
        return true;
    }


    @SuppressWarnings("StatementWithEmptyBody")
    @Override
    public boolean onNavigationItemSelected(MenuItem item) {
        // Handle navigation view item clicks here.
        int id = item.getItemId();

        if (id == R.id.nav_language_dep) {
            SharedPreferences sharedPreferences = getSharedPreferences(Constant.HTI, MODE_PRIVATE);
            lang = sharedPreferences.getString(Constant.LANGUAGE, "en");
            changeLanguage(lang.equals("en") ? "ar" : "en");
        } else if (id == R.id.nav_logout_dep) {
            dataBaseCartHelper.deleteAll();
            startActivity(new Intent(DepartmentActivity.this, SplashActivity.class));
            finish();
        }

        DrawerLayout drawer = findViewById(R.id.drawer_layout);
        drawer.closeDrawer(GravityCompat.START);
        return true;
    }

    private void changeLanguage(String o) {
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
}
