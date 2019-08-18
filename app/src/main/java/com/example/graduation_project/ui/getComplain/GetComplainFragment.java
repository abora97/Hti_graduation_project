package com.example.graduation_project.ui.getComplain;


import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Toast;

import com.example.graduation_project.R;
import com.example.graduation_project.callBack.GetComplainCallBack;
import com.example.graduation_project.data.remote.ApiCall;
import com.example.graduation_project.model.getComplain.GetComplaints;
import com.example.graduation_project.model.sql.DataBaseUserHelper;
import com.example.graduation_project.model.sql.userSql;

import java.util.List;

import butterknife.BindView;
import butterknife.ButterKnife;
import butterknife.Unbinder;

/**
 * A simple {@link Fragment} subclass.
 */
public class GetComplainFragment extends Fragment {


    @BindView(R.id.rec_get_complain)
    RecyclerView recGetComplain;
    Unbinder unbinder;

    private DataBaseUserHelper dataBaseCartHelper;
    private List<userSql> list;

    private GetComplainAdapter getComplainAdapter ;
    private RecyclerView.LayoutManager mLayoutManager;
    String token;

    public GetComplainFragment() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View view = inflater.inflate(R.layout.fragment_get_complain, container, false);
        unbinder = ButterKnife.bind(this, view);

        //DataBase
        dataBaseCartHelper = new DataBaseUserHelper(getContext());
        list = dataBaseCartHelper.getAllRecord();

        token = list.get(0).getToken();

        init();

        return view;
    }

    private void init() {

        ApiCall.getComplin(token, new GetComplainCallBack() {
            @Override
            public void onError(String msg) {
                Toast.makeText(getContext(), "" + msg, Toast.LENGTH_SHORT).show();
            }

            @Override
            public void onSecuess(GetComplaints complain) {
                mLayoutManager = new LinearLayoutManager(getActivity(), LinearLayoutManager.VERTICAL, false);
                getComplainAdapter = new GetComplainAdapter(getActivity(), complain.getData().getData().getComplains());
                recGetComplain.setLayoutManager(mLayoutManager);
                recGetComplain.setAdapter(getComplainAdapter);
            }
        });

    }

    @Override
    public void onDestroyView() {
        super.onDestroyView();
        unbinder.unbind();
    }


}
