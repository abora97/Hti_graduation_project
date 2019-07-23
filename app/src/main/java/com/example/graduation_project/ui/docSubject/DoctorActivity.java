package com.example.graduation_project.ui.docSubject;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.RecyclerView;

import com.example.graduation_project.R;

import butterknife.BindView;
import butterknife.ButterKnife;

public class DoctorActivity extends AppCompatActivity {

    @BindView(R.id.rec_doc_subject)
    RecyclerView recDocSubject;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_doctor);
        ButterKnife.bind(this);
    }
}
