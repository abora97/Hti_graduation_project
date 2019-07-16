package com.example.graduation_project.ui.department;

import android.content.Context;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentPagerAdapter;

import com.example.graduation_project.R;

import java.util.ArrayList;

public class TabsAdapter extends FragmentPagerAdapter {

   // private Context context;

  // private String departs[] = {context.getString(R.string.eng), context.getString(R.string.cs), context.getString(R.string.man_en), context.getString(R.string.man_ar)};
 // private String departs[] = {"o","s","ddd"};
  private   ArrayList<String> departs;

    public TabsAdapter(FragmentManager fm, ArrayList departs) {
        super(fm);
       this.departs=departs;
    }

    @Override
    public Fragment getItem(int position) {
        return TabFragment.getInstance(position);
    }

    @Override
    public int getCount() {
        return departs.size();
    }

    @Override
    public CharSequence getPageTitle(int position) {
        return departs.get(position);
    }
}
