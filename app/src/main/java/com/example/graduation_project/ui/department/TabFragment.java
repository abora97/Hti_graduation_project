package com.example.graduation_project.ui.department;


import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import android.widget.Toast;

import com.example.graduation_project.R;

/**
 * A simple {@link Fragment} subclass.
 */
public class TabFragment extends Fragment {

    int position;
    private TextView textView;


    public TabFragment() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        return inflater.inflate(R.layout.fragment_tab, container, false);
    }

    public static Fragment getInstance(int position) {
        Bundle bundle = new Bundle();
        bundle.putInt("pos", position);
        TabFragment tabFragment = new TabFragment();
        tabFragment.setArguments(bundle);
        return tabFragment;
    }

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        position = getArguments().getInt("pos");
    }

    @Override
    public void onViewCreated(View view, @Nullable Bundle savedInstanceState) {
        super.onViewCreated(view, savedInstanceState);
        textView = (TextView) view.findViewById(R.id.textView);

        if (position == 0) {
            textView.setText(getString(R.string.eng));
        } else if (position == 1) {
            textView.setText(getString(R.string.cs));
        } else if (position == 2) {
            textView.setText(getString(R.string.man_en));
        } else if (position == 3) {
            textView.setText(getString(R.string.man_ar));
        } else {
            Toast.makeText(getContext(), "no department", Toast.LENGTH_SHORT).show();
        }


    }
}
