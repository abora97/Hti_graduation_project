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

    String docID, subjectName, token;

    @BindView(R.id.tv_course_name)
    TextView tvCourseName;
    @BindView(R.id.tv_doc_name)
    TextView tvDocName;


    @BindView(R.id.tv_workshop)
    TextView tvWorkshop;
    @BindView(R.id.tv_classroom)
    TextView tvClassroom;
    @BindView(R.id.tv_course)
    TextView tvCourse;
    @BindView(R.id.tv_exam)
    TextView tvExam;
    @BindView(R.id.tv_lec)
    TextView tvLec;
    @BindView(R.id.tv_professor)
    TextView tvProfessor;
    @BindView(R.id.tv_target)
    TextView tvTarget;
    @BindView(R.id.tv_instructor)
    TextView tvInstructor;

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

        token = list.get(0).getToken();


        loadData();
    }

    private void loadData() {

        tvCourseName.setText(subjectName);

        ApiCall.getQResult(token, docID, subjectName, new QResultCallBack() {
            @Override
            public void onError(String msg) {
                Toast.makeText(ResultActivity.this, "" + msg, Toast.LENGTH_SHORT).show();
            }

            @Override
            public void onSecuess(Qresult qresult) {
                // Toast.makeText(ResultActivity.this, "ha ha ha ha "+qresult.getData().getData().getCategoriesRules().getLectures(), Toast.LENGTH_SHORT).show();
                String workShop = String.valueOf(qresult.getData().getData().getCategoriesRules().getFactoriesAndWorkshops());
                tvWorkshop.setText(" % " + workShop);

                String doc = String.valueOf(qresult.getData().getData().getCategoriesRules().getDoctor());
                tvInstructor.setText(" % " + doc);

                String lec = String.valueOf(qresult.getData().getData().getCategoriesRules().getLectures());
                tvLec.setText(" % " + lec);

                String opin = String.valueOf(qresult.getData().getData().getCategoriesRules().getOpinionsAboutCourse());
                tvCourse.setText(" % " + opin);

                String ass = String.valueOf(qresult.getData().getData().getCategoriesRules().getDoctorAssistant());
                tvProfessor.setText(" % " + ass);

                String targrt = String.valueOf(qresult.getData().getData().getCategoriesRules().getTargetedLearningOutcomes());
                tvTarget.setText(" % " + targrt);

                String exam = String.valueOf(qresult.getData().getData().getCategoriesRules().getEvolutionSystem());
                tvExam.setText(" % " + exam);

                String room = String.valueOf(qresult.getData().getData().getCategoriesRules().getStandsAndRooms());
                tvClassroom.setText(" % " + room);

                tvDocName.setText(qresult.getData().getData().getDoctor().getName());
            }
        });

    }
}
