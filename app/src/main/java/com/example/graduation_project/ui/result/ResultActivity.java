package com.example.graduation_project.ui.result;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.widget.TextView;
import android.widget.Toast;

import com.example.graduation_project.R;
import com.example.graduation_project.callBack.QResultCallBack;
import com.example.graduation_project.data.remote.ApiCall;
import com.example.graduation_project.model.QResult.Qresult;
import com.example.graduation_project.model.sql.DataBaseUserHelper;
import com.example.graduation_project.model.sql.userSql;

import java.util.List;

import butterknife.BindView;
import butterknife.ButterKnife;

public class ResultActivity extends AppCompatActivity {

    @BindView(R.id.tv_course_name)
    TextView tvCourseName;
    @BindView(R.id.tv_doc_name)
    TextView tvDocName;

    String docID, subjectName, token;
    private DataBaseUserHelper dataBaseCartHelper;
    private List<userSql> list;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_result);
        ButterKnife.bind(this);

        //DataBase
        dataBaseCartHelper = new DataBaseUserHelper(this);
        list = dataBaseCartHelper.getAllRecord();

        subjectName = getIntent().getStringExtra("subject_name");
        docID = getIntent().getStringExtra("doctor_id");

        tvCourseName.setText(subjectName);
        token = list.get(0).getToken();

        loadData();
    }

    private void loadData() {

        ApiCall.getQResult(token, docID, subjectName, new QResultCallBack() {
            @Override
            public void onError(String msg) {
                Toast.makeText(ResultActivity.this, ""+msg, Toast.LENGTH_SHORT).show();
            }

            @Override
            public void onSecuess(Qresult qresult) {
                Toast.makeText(ResultActivity.this, "ha ha ha ha "+qresult.getData().getData().getCategoriesRules().getLectures(), Toast.LENGTH_SHORT).show();
            }
        });

    }
}
