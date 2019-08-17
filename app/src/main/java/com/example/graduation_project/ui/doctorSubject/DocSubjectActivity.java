package com.example.graduation_project.ui.doctorSubject;


import android.os.Bundle;
import android.support.v4.widget.SwipeRefreshLayout;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.widget.Toast;

import com.example.graduation_project.R;
import com.example.graduation_project.callBack.DoctorSubjectCallBack;
import com.example.graduation_project.data.remote.ApiCall;
import com.example.graduation_project.model.DoctorSubject.GetDoctorSubject;
import com.example.graduation_project.model.sql.DataBaseUserHelper;
import com.example.graduation_project.model.sql.userSql;

import java.util.List;

import butterknife.BindView;
import butterknife.ButterKnife;


public class DocSubjectActivity extends AppCompatActivity implements SwipeRefreshLayout.OnRefreshListener {

    String doctorID, token;
    @BindView(R.id.rec_subject)
    RecyclerView recSubject;
    @BindView(R.id.swipe_subject)
    SwipeRefreshLayout swipeSubject;
    private DataBaseUserHelper dataBaseCartHelper;
    private List<userSql> list;



    private DocSubjectAdapter subjectAdapter;
    private RecyclerView.LayoutManager mLayoutManager;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_doc_subject);
        ButterKnife.bind(this);


        //DataBase
        dataBaseCartHelper = new DataBaseUserHelper(this);
        list = dataBaseCartHelper.getAllRecord();
        doctorID = getIntent().getStringExtra("docID");
        token = list.get(0).getToken();

        swipeSubject.setOnRefreshListener(this);
        init();
    }

    private void init() {
        ApiCall.getDoctorSubject(token, doctorID, new DoctorSubjectCallBack() {
            @Override
            public void onError(String msg) {
                Toast.makeText(DocSubjectActivity.this, "" + msg, Toast.LENGTH_SHORT).show();
            }

            @Override
            public void onSecuess(GetDoctorSubject getDoctorSubject) {
                Toast.makeText(DocSubjectActivity.this, "ss " + getDoctorSubject.getData().getData().getSubjects().get(0).getName(), Toast.LENGTH_SHORT).show();

                swipeSubject.setRefreshing(false);
                mLayoutManager = new LinearLayoutManager(DocSubjectActivity.this, LinearLayoutManager.VERTICAL, false);
                subjectAdapter = new DocSubjectAdapter(DocSubjectActivity.this, getDoctorSubject.getData().getData().getSubjects());
                recSubject.setLayoutManager(mLayoutManager);
                recSubject.setAdapter(subjectAdapter);

            }
        });
    }

    @Override
    public void onRefresh() {
        init();
    }
}
