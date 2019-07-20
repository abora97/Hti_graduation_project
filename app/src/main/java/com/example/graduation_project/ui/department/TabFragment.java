package com.example.graduation_project.ui.department;


import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.HorizontalScrollView;
import android.widget.TextView;
import android.widget.Toast;

import com.example.graduation_project.R;

import java.util.ArrayList;
import java.util.List;

import butterknife.BindView;
import butterknife.ButterKnife;
import butterknife.Unbinder;

/**
 * A simple {@link Fragment} subclass.
 */
public class TabFragment extends Fragment {

    int position;
    @BindView(R.id.rec_tab)
    RecyclerView recTab;
    Unbinder unbinder;
    // private TextView textView;

    private MyAdapterTabs myAdapterTabs;
    private RecyclerView.LayoutManager mLayoutManager;

    List<String> list=new ArrayList<String>();

    public TabFragment() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View view = inflater.inflate(R.layout.fragment_tab, container, false);
        unbinder = ButterKnife.bind(this, view);



        mLayoutManager = new LinearLayoutManager(getActivity(), LinearLayoutManager.VERTICAL, false);

        return view;
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
//        textView = (TextView) view.findViewById(R.id.textView);

        if (position == 0) {
            // textView.setText(getString(R.string.eng));
            list.clear();
            list.add("fff");
            list.add("dd");
            list.add("dd");
            list.add("dd");
            list.add("dd");
            setAdapter(list);

        } else if (position == 1) {
            list.clear();
            list.add("dr 1");
            list.add("dr 2");
            list.add("dr 3");
            list.add("dr 5");
            setAdapter(list);

        } else if (position == 2) {

        } else if (position == 3) {

        } else {
            Toast.makeText(getContext(), "no department", Toast.LENGTH_SHORT).show();
        }


    }

    void setAdapter(List<String> list){
        myAdapterTabs = new MyAdapterTabs(getActivity(), list);
        recTab.setLayoutManager(mLayoutManager);
        recTab.setAdapter(myAdapterTabs);
    }
    @Override
    public void onDestroyView() {
        super.onDestroyView();
        unbinder.unbind();
    }
}
