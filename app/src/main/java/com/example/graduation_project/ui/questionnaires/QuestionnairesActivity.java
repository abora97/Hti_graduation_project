package com.example.graduation_project.ui.questionnaires;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.RadioButton;
import android.widget.RadioGroup;
import android.widget.TextView;
import android.widget.Toast;

import com.example.graduation_project.R;

import static android.widget.Toast.LENGTH_SHORT;

public class QuestionnairesActivity extends AppCompatActivity {

    TextView textView7,textView8,textView9,textView10,textView11 ;
    Button submit ;
    RadioGroup RadioGroup_1;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_questionnaires);
        textView7=findViewById(R.id.textView7);
        textView8=findViewById(R.id.textView8);
        textView9=findViewById(R.id.textView9);
        textView10=findViewById(R.id.textView10);
        textView11=findViewById(R.id.textView11);
        RadioGroup_1=findViewById(R.id.RadioGroup_1);
        submit=findViewById(R.id.submit);
        submit.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                int Selsct_id=RadioGroup_1.getCheckedRadioButtonId();
                RadioButton radioButton_selected=findViewById(Selsct_id);
             if (RadioGroup_1.isClickable()) {
                 Toast.makeText(QuestionnairesActivity.this,"Thanks ",Toast.LENGTH_SHORT).show();


             }else{
                Toast.makeText(QuestionnairesActivity.this,"please select all Question ",Toast.LENGTH_SHORT).show();
            }}
        });
    }

}
