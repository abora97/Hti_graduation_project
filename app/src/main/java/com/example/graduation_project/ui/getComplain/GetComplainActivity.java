package com.example.graduation_project.ui.getComplain;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
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

public class GetComplainActivity extends AppCompatActivity {

    @BindView(R.id.rec_get_complain)
    RecyclerView recGetComplain;

    private DataBaseUserHelper dataBaseCartHelper;
    private List<userSql> list;

    private GetComplainAdapter getComplainAdapter;
    private RecyclerView.LayoutManager mLayoutManager;
    String token;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_get_complain);
        ButterKnife.bind(this);

        //DataBase
        dataBaseCartHelper = new DataBaseUserHelper(this);
        list = dataBaseCartHelper.getAllRecord();

        token = list.get(0).getToken();

        init();
    }

    private void init() {

        ApiCall.getComplin(token, new GetComplainCallBack() {
            @Override
            public void onError(String msg) {
                Toast.makeText(GetComplainActivity.this, "" + msg, Toast.LENGTH_SHORT).show();
            }

            @Override
            public void onSecuess(GetComplaints complain) {
                mLayoutManager = new LinearLayoutManager(GetComplainActivity.this, LinearLayoutManager.VERTICAL, false);
                getComplainAdapter = new GetComplainAdapter(GetComplainActivity.this, complain.getData().getData().getComplains());
                recGetComplain.setLayoutManager(mLayoutManager);
                recGetComplain.setAdapter(getComplainAdapter);
            }
        });

    }

}
