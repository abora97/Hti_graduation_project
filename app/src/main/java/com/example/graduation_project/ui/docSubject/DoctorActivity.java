package com.example.graduation_project.ui.docSubject;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.widget.Toast;

import com.example.graduation_project.R;
import com.example.graduation_project.callBack.DeanCallBack;
import com.example.graduation_project.callBack.DeanDoctorSubjectCallBack;
import com.example.graduation_project.data.remote.ApiCall;
import com.example.graduation_project.model.DeanDoctorSubject.DeanDoctor;
import com.example.graduation_project.model.deanDepartment.DeanDepartment;
import com.example.graduation_project.model.sql.DataBaseUserHelper;
import com.example.graduation_project.model.sql.userSql;
import com.example.graduation_project.ui.department.DepartmentActivity;
import com.example.graduation_project.ui.subject.SubjectAdapter;

import java.util.List;

import butterknife.BindView;
import butterknife.ButterKnife;

public class DoctorActivity extends AppCompatActivity {

    @BindView(R.id.rec_doc_subject)
    RecyclerView recDocSubject;

    private DataBaseUserHelper dataBaseCartHelper;
    private List<userSql> list;

    private DocAdapter subjectAdapter;
    private RecyclerView.LayoutManager mLayoutManager;
    String departmentType;
    int derartNum;
    String token;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_doctor);
        ButterKnife.bind(this);

        //DataBase
        dataBaseCartHelper = new DataBaseUserHelper(this);
        list = dataBaseCartHelper.getAllRecord();

        token = list.get(0).getToken();

        departmentType = getIntent().getStringExtra("department");

        if (departmentType.equals("cs")) {
            derartNum = 1;
        } else if (departmentType.equals("eng")) {
            derartNum = 2;
        } else if (departmentType.equals("management")) {
            derartNum = 3;
        }
        init();
        getData();
    }

    private void getData() {


    }

    private void init() {

        String num = String.valueOf(derartNum);


        ApiCall.getDepartmentDoctor(token, num, new DeanDoctorSubjectCallBack() {
            @Override
            public void onError(String msg) {
                Toast.makeText(DoctorActivity.this, "error doctor activity " + msg, Toast.LENGTH_SHORT).show();

            }

            @Override
            public void onSecuess(DeanDoctor deanDepartment) {
                 Toast.makeText(DoctorActivity.this, "rrrr" + deanDepartment.getData().getData().getDepartment().getDoctors().get(0).getName(), Toast.LENGTH_SHORT).show();

                //   deanDepartment.getData().getData().getDepartments()
                mLayoutManager = new LinearLayoutManager(DoctorActivity.this, LinearLayoutManager.VERTICAL, false);
                subjectAdapter = new DocAdapter(DoctorActivity.this, deanDepartment.getData().getData().getDepartment().getDoctors());
                recDocSubject.setLayoutManager(mLayoutManager);
                recDocSubject.setAdapter(subjectAdapter);
            }
        });


    }
}
