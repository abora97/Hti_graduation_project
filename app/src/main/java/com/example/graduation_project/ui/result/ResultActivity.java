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
    TextView txtQ1,txtQ2,txtQ3,txtQ4,txtQ5,txtQ6,txtQ7,txtQ8;
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
        txtQ1=findViewById(R.id.txtQ1);
        txtQ2=findViewById(R.id.txtQ2);
        txtQ3=findViewById(R.id.txtQ3);
        txtQ4=findViewById(R.id.txtQ4);
        txtQ5=findViewById(R.id.txtQ5);
        txtQ6=findViewById(R.id.txtQ6);
        txtQ7=findViewById(R.id.txtQ7);
        txtQ8=findViewById(R.id.txtQ8);

        //DataBase
        dataBaseCartHelper = new DataBaseUserHelper(this);
        list = dataBaseCartHelper.getAllRecord();

        subjectName = getIntent().getStringExtra("subject_name");
        docID = getIntent().getStringExtra("doctor_id");

        tvCourseName.setText(subjectName);
        token = list.get(0).getToken();
        txtQ1.setText("20%");
        txtQ2.setText("50%");
        txtQ3.setText("60%");
        txtQ4.setText("63%");
        txtQ5.setText("90%");
        txtQ6.setText("92%");
        txtQ7.setText("85%");
        txtQ8.setText("50%");

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
