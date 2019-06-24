package com.example.graduation_project.ui.complain;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Spinner;

import com.example.graduation_project.R;

import butterknife.BindView;
import butterknife.ButterKnife;

public class ComplainActivity extends AppCompatActivity {

    @BindView(R.id.spinner_depart)
    Spinner spinnerDepart;
    @BindView(R.id.spinner_type)
    Spinner spinnerType;
    @BindView(R.id.ed_problem_topic)
    EditText edProblemTopic;
    @BindView(R.id.ed_problem_dec)
    EditText edProblemDec;
    @BindView(R.id.bu_suggestion_send)
    Button buSuggestionSend;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_complain);
        ButterKnife.bind(this);

    }
}
