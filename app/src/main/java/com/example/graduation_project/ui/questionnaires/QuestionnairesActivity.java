package com.example.graduation_project.ui.questionnaires;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.view.ViewGroup;
import android.view.autofill.AutofillValue;
import android.widget.Button;
import android.widget.RadioButton;
import android.widget.RadioGroup;
import android.widget.TextView;
import android.widget.Toast;

import com.example.graduation_project.R;
import com.example.graduation_project.callBack.QuestionnairesCallBack;
import com.example.graduation_project.data.remote.ApiCall;
import com.example.graduation_project.model.Questionnaires.Questionnaires;
import com.example.graduation_project.model.sql.DataBaseUserHelper;
import com.example.graduation_project.model.sql.userSql;
import com.example.graduation_project.ui.home.HomeActivity;
import com.example.graduation_project.util.Constant;

import java.util.List;

import static android.widget.Toast.LENGTH_SHORT;

public class QuestionnairesActivity extends AppCompatActivity {

    TextView textView7, textView8, textView9, textView10, textView11;
    Button submit;
    RadioGroup RadioGroup_1_1, RadioGroup_1_2, RadioGroup_1_3, RadioGroup_1_4, RadioGroup_1_5, RadioGroup_1_6, RadioGroup_1_7, RadioGroup_2_1, RadioGroup_2_2, RadioGroup_2_3,
            RadioGroup_2_4, RadioGroup_3_1, RadioGroup_3_2, RadioGroup_3_3, RadioGroup_3_4, RadioGroup_3_5, RadioGroup_3_6, RadioGroup_3_7, RadioGroup_3_8, RadioGroup_4_1,
            RadioGroup_4_2, RadioGroup_4_3, RadioGroup_4_4, RadioGroup_4_5, RadioGroup_4_6, RadioGroup_4_7, RadioGroup_4_8, RadioGroup_4_9, RadioGroup_4_10,
            RadioGroup_5_1, RadioGroup_5_2, RadioGroup_5_3, RadioGroup_5_4, RadioGroup_5_5, RadioGroup_6_1, RadioGroup_6_2, RadioGroup_6_3, RadioGroup_6_4, RadioGroup_6_5,
            RadioGroup_6_6, RadioGroup_6_7, RadioGroup_6_8, RadioGroup_6_9, RadioGroup_6_10, RadioGroup_7_1, RadioGroup_7_2, RadioGroup_7_3, RadioGroup_7_4, RadioGroup_7_5,
            RadioGroup_7_6, RadioGroup_7_7, RadioGroup_7_8, RadioGroup_8_1, RadioGroup_8_2, RadioGroup_8_3, RadioGroup_8_4, RadioGroup_8_5, RadioGroup_8_6, RadioGroup_8_7;
    int conter = 59;
    int Q_1_1 = 0, Q_1_2 = 0, Q_1_3 = 0, Q_1_4 = 0, Q_1_5 = 0, Q_1_6 = 0, Q_1_7 = 0, Q_2_1 = 0, Q_2_2 = 0, Q_2_3 = 0,
            Q_2_4 = 0, Q_3_1 = 0, Q_3_2 = 0, Q_3_3 = 0, Q_3_4 = 0, Q_3_5 = 0, Q_3_6 = 0, Q_3_7 = 0, Q_3_8 = 0, Q_4_1 = 0,
            Q_4_2 = 0, Q_4_3 = 0, Q_4_4 = 0, Q_4_5 = 0, Q_4_6 = 0, Q_4_7 = 0, Q_4_8 = 0, Q_4_9 = 0, Q_4_10 = 0,
            Q_5_1 = 0, Q_5_2 = 0, Q_5_3 = 0, Q_5_4 = 0, Q_5_5 = 0, Q_6_1 = 0, Q_6_2 = 0, Q_6_3 = 0, Q_6_4 = 0, Q_6_5 = 0,
            Q_6_6 = 0, Q_6_7 = 0, Q_6_8 = 0, Q_6_9 = 0, Q_6_10 = 0, Q_7_1 = 0, Q_7_2 = 0, Q_7_3 = 0, Q_7_4 = 0, Q_7_5 = 0,
            Q_7_6 = 0, Q_7_7 = 0, Q_7_8 = 0, Q_8_1 = 0, Q_8_2 = 0, Q_8_3 = 0, Q_8_4 = 0, Q_8_5 = 0, Q_8_6 = 0, Q_8_7 = 0;
    String subjectID, doctorID, assID, token;
    private DataBaseUserHelper dataBaseCartHelper;
    private List<userSql> list;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        //  ApiCall.
        setContentView(R.layout.activity_questionnaires);
        textView7 = findViewById(R.id.textView7);
        textView8 = findViewById(R.id.textView8);
        textView9 = findViewById(R.id.textView9);
        textView10 = findViewById(R.id.textView10);
        textView11 = findViewById(R.id.textView11);

        RadioGroup_1_1 = findViewById(R.id.RadioGroup_1_1);
        RadioGroup_1_2 = findViewById(R.id.RadioGroup_1_2);
        RadioGroup_1_3 = findViewById(R.id.RadioGroup_1_3);
        RadioGroup_1_4 = findViewById(R.id.RadioGroup_1_4);
        RadioGroup_1_5 = findViewById(R.id.RadioGroup_1_5);
        RadioGroup_1_6 = findViewById(R.id.RadioGroup_1_6);
        RadioGroup_1_7 = findViewById(R.id.RadioGroup_1_7);
        RadioGroup_2_1 = findViewById(R.id.RadioGroup_2_1);
        RadioGroup_2_2 = findViewById(R.id.RadioGroup_2_2);
        RadioGroup_2_3 = findViewById(R.id.RadioGroup_2_3);
        RadioGroup_2_4 = findViewById(R.id.RadioGroup_2_4);
        RadioGroup_3_1 = findViewById(R.id.RadioGroup_3_1);
        RadioGroup_3_2 = findViewById(R.id.RadioGroup_3_2);
        RadioGroup_3_3 = findViewById(R.id.RadioGroup_3_3);
        RadioGroup_3_4 = findViewById(R.id.RadioGroup_3_4);
        RadioGroup_3_5 = findViewById(R.id.RadioGroup_3_5);
        RadioGroup_3_6 = findViewById(R.id.RadioGroup_3_6);
        RadioGroup_3_7 = findViewById(R.id.RadioGroup_3_7);
        RadioGroup_3_8 = findViewById(R.id.RadioGroup_3_8);
        RadioGroup_4_1 = findViewById(R.id.RadioGroup_4_1);
        RadioGroup_4_2 = findViewById(R.id.RadioGroup_4_2);
        RadioGroup_4_3 = findViewById(R.id.RadioGroup_4_3);
        RadioGroup_4_4 = findViewById(R.id.RadioGroup_4_4);
        RadioGroup_4_5 = findViewById(R.id.RadioGroup_4_5);
        RadioGroup_4_6 = findViewById(R.id.RadioGroup_4_6);
        RadioGroup_4_7 = findViewById(R.id.RadioGroup_4_7);
        RadioGroup_4_8 = findViewById(R.id.RadioGroup_4_8);
        RadioGroup_4_9 = findViewById(R.id.RadioGroup_4_9);
        RadioGroup_4_10 = findViewById(R.id.RadioGroup_4_10);
        RadioGroup_5_1 = findViewById(R.id.RadioGroup_5_1);
        RadioGroup_5_2 = findViewById(R.id.RadioGroup_5_2);
        RadioGroup_5_3 = findViewById(R.id.RadioGroup_5_3);
        RadioGroup_5_4 = findViewById(R.id.RadioGroup_5_4);
        RadioGroup_5_5 = findViewById(R.id.RadioGroup_5_5);
        RadioGroup_6_1 = findViewById(R.id.RadioGroup_6_1);
        RadioGroup_6_2 = findViewById(R.id.RadioGroup_6_2);
        RadioGroup_6_3 = findViewById(R.id.RadioGroup_6_3);
        RadioGroup_6_4 = findViewById(R.id.RadioGroup_6_4);
        RadioGroup_6_5 = findViewById(R.id.RadioGroup_6_5);
        RadioGroup_6_6 = findViewById(R.id.RadioGroup_6_6);
        RadioGroup_6_7 = findViewById(R.id.RadioGroup_6_7);
        RadioGroup_6_8 = findViewById(R.id.RadioGroup_6_8);
        RadioGroup_6_9 = findViewById(R.id.RadioGroup_6_9);
        RadioGroup_6_10 = findViewById(R.id.RadioGroup_6_10);
        RadioGroup_7_1 = findViewById(R.id.RadioGroup_7_1);
        RadioGroup_7_2 = findViewById(R.id.RadioGroup_7_2);
        RadioGroup_7_3 = findViewById(R.id.RadioGroup_7_3);
        RadioGroup_7_4 = findViewById(R.id.RadioGroup_7_4);
        RadioGroup_7_5 = findViewById(R.id.RadioGroup_7_5);
        RadioGroup_7_6 = findViewById(R.id.RadioGroup_7_6);
        RadioGroup_7_7 = findViewById(R.id.RadioGroup_7_7);
        RadioGroup_7_8 = findViewById(R.id.RadioGroup_7_8);
        RadioGroup_8_1 = findViewById(R.id.RadioGroup_8_1);
        RadioGroup_8_2 = findViewById(R.id.RadioGroup_8_2);
        RadioGroup_8_3 = findViewById(R.id.RadioGroup_8_3);
        RadioGroup_8_4 = findViewById(R.id.RadioGroup_8_4);
        RadioGroup_8_5 = findViewById(R.id.RadioGroup_8_5);
        RadioGroup_8_6 = findViewById(R.id.RadioGroup_8_6);
        RadioGroup_8_7 = findViewById(R.id.RadioGroup_8_7);

        submit = findViewById(R.id.submit);

        init();


        submit.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                int Selsct_id_1_1 = RadioGroup_1_1.getCheckedRadioButtonId();
                RadioButton radioButton_selected_1_1 = findViewById(Selsct_id_1_1);

                int Selsct_id_1_2 = RadioGroup_1_2.getCheckedRadioButtonId();
                RadioButton radioButton_selected_1_2 = findViewById(Selsct_id_1_2);
                int Selsct_id_1_3 = RadioGroup_1_3.getCheckedRadioButtonId();
                RadioButton radioButton_selected_1_3 = findViewById(Selsct_id_1_3);

                int Selsct_id_1_4 = RadioGroup_1_4.getCheckedRadioButtonId();
                RadioButton radioButton_selected_1_4 = findViewById(Selsct_id_1_4);

                int Selsct_id_1_5 = RadioGroup_1_5.getCheckedRadioButtonId();
                RadioButton radioButton_selected_1_5 = findViewById(Selsct_id_1_5);

                int Selsct_id_1_6 = RadioGroup_1_6.getCheckedRadioButtonId();
                RadioButton radioButton_selected_1_6 = findViewById(Selsct_id_1_6);

                int Selsct_id_1_7 = RadioGroup_1_7.getCheckedRadioButtonId();
                RadioButton radioButton_selected_1_7 = findViewById(Selsct_id_1_7);

                int Selsct_id_2_1 = RadioGroup_2_1.getCheckedRadioButtonId();
                RadioButton radioButton_selected_2_1 = findViewById(Selsct_id_2_1);

                int Selsct_id_2_2 = RadioGroup_2_2.getCheckedRadioButtonId();
                RadioButton radioButton_selected_2_2 = findViewById(Selsct_id_2_2);

                int Selsct_id_2_3 = RadioGroup_2_3.getCheckedRadioButtonId();
                RadioButton radioButton_selected_2_3 = findViewById(Selsct_id_2_3);

                int Selsct_id_2_4 = RadioGroup_2_4.getCheckedRadioButtonId();
                RadioButton radioButton_selected_2_4 = findViewById(Selsct_id_2_4);

                int Selsct_id_3_1 = RadioGroup_3_1.getCheckedRadioButtonId();
                RadioButton radioButton_selected_3_1 = findViewById(Selsct_id_3_1);

                int Selsct_id_3_2 = RadioGroup_3_2.getCheckedRadioButtonId();
                RadioButton radioButton_selected_3_2 = findViewById(Selsct_id_3_2);

                int Selsct_id_3_3 = RadioGroup_3_3.getCheckedRadioButtonId();
                RadioButton radioButton_selected_3_3 = findViewById(Selsct_id_3_3);

                int Selsct_id_3_4 = RadioGroup_3_4.getCheckedRadioButtonId();
                RadioButton radioButton_selected_3_4 = findViewById(Selsct_id_3_4);

                int Selsct_id_3_5 = RadioGroup_3_5.getCheckedRadioButtonId();
                RadioButton radioButton_selected_3_5 = findViewById(Selsct_id_3_5);

                int Selsct_id_3_6 = RadioGroup_3_6.getCheckedRadioButtonId();
                RadioButton radioButton_selected_3_6 = findViewById(Selsct_id_3_6);

                int Selsct_id_3_7 = RadioGroup_3_7.getCheckedRadioButtonId();
                RadioButton radioButton_selected_3_7 = findViewById(Selsct_id_3_7);

                int Selsct_id_3_8 = RadioGroup_3_8.getCheckedRadioButtonId();
                RadioButton radioButton_selected_3_8 = findViewById(Selsct_id_3_8);

                int Selsct_id_4_1 = RadioGroup_4_1.getCheckedRadioButtonId();
                RadioButton radioButton_selected_4_1 = findViewById(Selsct_id_4_1);


                int Selsct_id_4_2 = RadioGroup_4_2.getCheckedRadioButtonId();
                RadioButton radioButton_selected_4_2 = findViewById(Selsct_id_4_2);


                int Selsct_id_4_3 = RadioGroup_4_3.getCheckedRadioButtonId();
                RadioButton radioButton_selected_4_3 = findViewById(Selsct_id_4_3);

                int Selsct_id_4_4 = RadioGroup_4_4.getCheckedRadioButtonId();
                RadioButton radioButton_selected_4_4 = findViewById(Selsct_id_4_4);

                int Selsct_id_4_5 = RadioGroup_4_5.getCheckedRadioButtonId();
                RadioButton radioButton_selected_4_5 = findViewById(Selsct_id_4_5);

                int Selsct_id_4_6 = RadioGroup_4_6.getCheckedRadioButtonId();
                RadioButton radioButton_selected_4_6 = findViewById(Selsct_id_4_6);

                int Selsct_id_4_7 = RadioGroup_4_7.getCheckedRadioButtonId();
                RadioButton radioButton_selected_4_7 = findViewById(Selsct_id_4_7);

                int Selsct_id_4_8 = RadioGroup_4_8.getCheckedRadioButtonId();
                RadioButton radioButton_selected_4_8 = findViewById(Selsct_id_4_8);

                int Selsct_id_4_9 = RadioGroup_4_9.getCheckedRadioButtonId();
                RadioButton radioButton_selected_4_9 = findViewById(Selsct_id_4_9);

                int Selsct_id_4_10 = RadioGroup_4_10.getCheckedRadioButtonId();
                RadioButton radioButton_selected_4_10 = findViewById(Selsct_id_4_10);

                int Selsct_id_5_1 = RadioGroup_5_1.getCheckedRadioButtonId();
                RadioButton radioButton_selected_5_1 = findViewById(Selsct_id_5_1);

                int Selsct_id_5_2 = RadioGroup_5_2.getCheckedRadioButtonId();
                RadioButton radioButton_selected_5_2 = findViewById(Selsct_id_5_2);

                int Selsct_id_5_3 = RadioGroup_5_3.getCheckedRadioButtonId();
                RadioButton radioButton_selected_5_3 = findViewById(Selsct_id_5_3);

                int Selsct_id_5_4 = RadioGroup_5_4.getCheckedRadioButtonId();
                RadioButton radioButton_selected_5_4 = findViewById(Selsct_id_5_4);

                int Selsct_id_5_5 = RadioGroup_5_5.getCheckedRadioButtonId();
                RadioButton radioButton_selected_5_5 = findViewById(Selsct_id_5_5);

                int Selsct_id_6_1 = RadioGroup_6_1.getCheckedRadioButtonId();
                RadioButton radioButton_selected_6_1 = findViewById(Selsct_id_6_1);

                int Selsct_id_6_2 = RadioGroup_6_2.getCheckedRadioButtonId();
                RadioButton radioButton_selected_6_2 = findViewById(Selsct_id_6_2);

                int Selsct_id_6_3 = RadioGroup_6_3.getCheckedRadioButtonId();
                RadioButton radioButton_selected_6_3 = findViewById(Selsct_id_6_3);

                int Selsct_id_6_4 = RadioGroup_6_4.getCheckedRadioButtonId();
                RadioButton radioButton_selected_6_4 = findViewById(Selsct_id_6_4);

                int Selsct_id_6_5 = RadioGroup_6_5.getCheckedRadioButtonId();
                RadioButton radioButton_selected_6_5 = findViewById(Selsct_id_6_5);

                int Selsct_id_6_6 = RadioGroup_6_6.getCheckedRadioButtonId();
                RadioButton radioButton_selected_6_6 = findViewById(Selsct_id_6_6);

                int Selsct_id_6_7 = RadioGroup_6_7.getCheckedRadioButtonId();
                RadioButton radioButton_selected_6_7 = findViewById(Selsct_id_6_7);

                int Selsct_id_6_8 = RadioGroup_6_8.getCheckedRadioButtonId();
                RadioButton radioButton_selected_6_8 = findViewById(Selsct_id_6_8);

                int Selsct_id_6_9 = RadioGroup_6_9.getCheckedRadioButtonId();
                RadioButton radioButton_selected_6_9 = findViewById(Selsct_id_6_9);

                int Selsct_id_6_10 = RadioGroup_6_10.getCheckedRadioButtonId();
                RadioButton radioButton_selected_6_10 = findViewById(Selsct_id_6_10);

                int Selsct_id_7_1 = RadioGroup_7_1.getCheckedRadioButtonId();
                RadioButton radioButton_selected_7_1 = findViewById(Selsct_id_7_1);

                int Selsct_id_7_2 = RadioGroup_7_2.getCheckedRadioButtonId();
                RadioButton radioButton_selected_7_2 = findViewById(Selsct_id_7_2);

                int Selsct_id_7_3 = RadioGroup_7_3.getCheckedRadioButtonId();
                RadioButton radioButton_selected_7_3 = findViewById(Selsct_id_7_3);

                int Selsct_id_7_4 = RadioGroup_7_4.getCheckedRadioButtonId();
                RadioButton radioButton_selected_7_4 = findViewById(Selsct_id_7_4);

                int Selsct_id_7_5 = RadioGroup_7_5.getCheckedRadioButtonId();
                RadioButton radioButton_selected_7_5 = findViewById(Selsct_id_7_5);

                int Selsct_id_7_6 = RadioGroup_7_6.getCheckedRadioButtonId();
                RadioButton radioButton_selected_7_6 = findViewById(Selsct_id_7_6);

                int Selsct_id_7_7 = RadioGroup_7_7.getCheckedRadioButtonId();
                RadioButton radioButton_selected_7_7 = findViewById(Selsct_id_7_7);

                int Selsct_id_7_8 = RadioGroup_7_8.getCheckedRadioButtonId();
                RadioButton radioButton_selected_7_8 = findViewById(Selsct_id_7_8);

                int Selsct_id_8_1 = RadioGroup_8_1.getCheckedRadioButtonId();
                RadioButton radioButton_selected_8_1 = findViewById(Selsct_id_8_1);

                int Selsct_id_8_2 = RadioGroup_8_2.getCheckedRadioButtonId();
                RadioButton radioButton_selected_8_2 = findViewById(Selsct_id_8_2);

                int Selsct_id_8_3 = RadioGroup_8_3.getCheckedRadioButtonId();
                RadioButton radioButton_selected_8_3 = findViewById(Selsct_id_8_3);

                int Selsct_id_8_4 = RadioGroup_8_4.getCheckedRadioButtonId();
                RadioButton radioButton_selected_8_4 = findViewById(Selsct_id_8_4);

                int Selsct_id_8_5 = RadioGroup_8_5.getCheckedRadioButtonId();
                RadioButton radioButton_selected_8_5 = findViewById(Selsct_id_8_5);

                int Selsct_id_8_6 = RadioGroup_8_6.getCheckedRadioButtonId();
                RadioButton radioButton_selected_8_6 = findViewById(Selsct_id_8_6);

                int Selsct_id_8_7 = RadioGroup_8_7.getCheckedRadioButtonId();
                RadioButton radioButton_selected_8_7 = findViewById(Selsct_id_8_7);


                if (radioButton_selected_1_1 == null || radioButton_selected_1_2 == null || radioButton_selected_1_3 == null ||
                        radioButton_selected_1_4 == null || radioButton_selected_1_5 == null || radioButton_selected_1_6 == null
                        || radioButton_selected_1_7 == null || radioButton_selected_2_1 == null || radioButton_selected_2_2 == null
                        || radioButton_selected_2_3 == null || radioButton_selected_2_4 == null || radioButton_selected_3_1 == null
                        || radioButton_selected_3_2 == null || radioButton_selected_3_3 == null || radioButton_selected_3_4 == null
                        || radioButton_selected_3_5 == null || radioButton_selected_3_6 == null || radioButton_selected_3_7 == null || radioButton_selected_3_8 == null
                        || radioButton_selected_4_1 == null || radioButton_selected_4_2 == null || radioButton_selected_4_3 == null || radioButton_selected_4_4 == null
                        || radioButton_selected_4_5 == null || radioButton_selected_4_6 == null || radioButton_selected_4_7 == null
                        || radioButton_selected_4_8 == null || radioButton_selected_4_9 == null || radioButton_selected_4_10 == null
                        || radioButton_selected_5_1 == null || radioButton_selected_5_2 == null || radioButton_selected_5_3 == null
                        || radioButton_selected_5_4 == null || radioButton_selected_5_5 == null || radioButton_selected_6_1 == null ||
                        radioButton_selected_6_2 == null || radioButton_selected_6_3 == null || radioButton_selected_6_4 == null
                        || radioButton_selected_6_5 == null || radioButton_selected_6_6 == null || radioButton_selected_6_7 == null
                        || radioButton_selected_6_8 == null || radioButton_selected_6_9 == null || radioButton_selected_6_10 == null
                        || radioButton_selected_7_1 == null || radioButton_selected_7_2 == null || radioButton_selected_7_3 == null || radioButton_selected_7_4 == null
                        || radioButton_selected_7_5 == null || radioButton_selected_7_6 == null || radioButton_selected_7_7 == null || radioButton_selected_7_8 == null
                        || radioButton_selected_8_1 == null || radioButton_selected_8_2 == null || radioButton_selected_8_3 == null || radioButton_selected_8_4 == null
                        || radioButton_selected_8_5 == null || radioButton_selected_8_6 == null || radioButton_selected_8_7 == null) {
                    Toast.makeText(QuestionnairesActivity.this, getString(R.string.SelectAllQuestionnaires), Toast.LENGTH_SHORT).show();
                } else {
                    String RadioButton_selected_1_1 = (String) radioButton_selected_1_1.getText();
                    String RadioButton_selected_1_2 = (String) radioButton_selected_1_2.getText();
                    String RadioButton_selected_1_3 = (String) radioButton_selected_1_3.getText();
                    String RadioButton_selected_1_4 = (String) radioButton_selected_1_4.getText();
                    String RadioButton_selected_1_5 = (String) radioButton_selected_1_5.getText();
                    String RadioButton_selected_1_6 = (String) radioButton_selected_1_6.getText();
                    String RadioButton_selected_1_7 = (String) radioButton_selected_1_7.getText();
                    String RadioButton_selected_2_1 = (String) radioButton_selected_2_1.getText();
                    String RadioButton_selected_2_2 = (String) radioButton_selected_2_2.getText();
                    String RadioButton_selected_2_3 = (String) radioButton_selected_2_3.getText();
                    String RadioButton_selected_2_4 = (String) radioButton_selected_2_4.getText();
                    String RadioButton_selected_3_1 = (String) radioButton_selected_3_1.getText();
                    String RadioButton_selected_3_2 = (String) radioButton_selected_3_2.getText();
                    String RadioButton_selected_3_3 = (String) radioButton_selected_3_3.getText();
                    String RadioButton_selected_3_4 = (String) radioButton_selected_3_4.getText();
                    String RadioButton_selected_3_5 = (String) radioButton_selected_3_5.getText();
                    String RadioButton_selected_3_6 = (String) radioButton_selected_3_6.getText();
                    String RadioButton_selected_3_7 = (String) radioButton_selected_3_7.getText();
                    String RadioButton_selected_3_8 = (String) radioButton_selected_3_8.getText();
                    String RadioButton_selected_4_1 = (String) radioButton_selected_4_1.getText();
                    String RadioButton_selected_4_2 = (String) radioButton_selected_4_2.getText();
                    String RadioButton_selected_4_3 = (String) radioButton_selected_4_3.getText();
                    String RadioButton_selected_4_4 = (String) radioButton_selected_4_4.getText();
                    String RadioButton_selected_4_5 = (String) radioButton_selected_4_5.getText();
                    String RadioButton_selected_4_6 = (String) radioButton_selected_4_6.getText();
                    String RadioButton_selected_4_7 = (String) radioButton_selected_4_7.getText();
                    String RadioButton_selected_4_8 = (String) radioButton_selected_4_8.getText();
                    String RadioButton_selected_4_9 = (String) radioButton_selected_4_9.getText();
                    String RadioButton_selected_4_10 = (String) radioButton_selected_4_10.getText();
                    String RadioButton_selected_5_1 = (String) radioButton_selected_5_1.getText();
                    String RadioButton_selected_5_2 = (String) radioButton_selected_5_2.getText();
                    String RadioButton_selected_5_3 = (String) radioButton_selected_5_3.getText();
                    String RadioButton_selected_5_4 = (String) radioButton_selected_5_4.getText();
                    String RadioButton_selected_5_5 = (String) radioButton_selected_5_5.getText();
                    String RadioButton_selected_6_1 = (String) radioButton_selected_6_1.getText();
                    String RadioButton_selected_6_2 = (String) radioButton_selected_6_2.getText();
                    String RadioButton_selected_6_3 = (String) radioButton_selected_6_3.getText();
                    String RadioButton_selected_6_4 = (String) radioButton_selected_6_4.getText();
                    String RadioButton_selected_6_5 = (String) radioButton_selected_6_5.getText();
                    String RadioButton_selected_6_6 = (String) radioButton_selected_6_6.getText();
                    String RadioButton_selected_6_7 = (String) radioButton_selected_6_7.getText();
                    String RadioButton_selected_6_8 = (String) radioButton_selected_6_8.getText();
                    String RadioButton_selected_6_9 = (String) radioButton_selected_6_9.getText();
                    String RadioButton_selected_6_10 = (String) radioButton_selected_6_10.getText();
                    String RadioButton_selected_7_1 = (String) radioButton_selected_7_1.getText();
                    String RadioButton_selected_7_2 = (String) radioButton_selected_7_2.getText();
                    String RadioButton_selected_7_3 = (String) radioButton_selected_7_3.getText();
                    String RadioButton_selected_7_4 = (String) radioButton_selected_7_4.getText();
                    String RadioButton_selected_7_5 = (String) radioButton_selected_7_5.getText();
                    String RadioButton_selected_7_6 = (String) radioButton_selected_7_6.getText();
                    String RadioButton_selected_7_7 = (String) radioButton_selected_7_7.getText();
                    String RadioButton_selected_7_8 = (String) radioButton_selected_7_8.getText();
                    String RadioButton_selected_8_1 = (String) radioButton_selected_8_1.getText();
                    String RadioButton_selected_8_2 = (String) radioButton_selected_8_2.getText();
                    String RadioButton_selected_8_3 = (String) radioButton_selected_8_3.getText();
                    String RadioButton_selected_8_4 = (String) radioButton_selected_8_4.getText();
                    String RadioButton_selected_8_5 = (String) radioButton_selected_8_5.getText();
                    String RadioButton_selected_8_6 = (String) radioButton_selected_8_6.getText();
                    String RadioButton_selected_8_7 = (String) radioButton_selected_8_7.getText();

                    ApiCall.getQuestionnaires(token, subjectID, doctorID, assID, RadioButton_selected_1_1, RadioButton_selected_1_2, RadioButton_selected_1_3, RadioButton_selected_1_4, RadioButton_selected_1_5, RadioButton_selected_1_6, RadioButton_selected_1_7,
                            RadioButton_selected_2_1, RadioButton_selected_2_2, RadioButton_selected_2_3, RadioButton_selected_2_4
                            , RadioButton_selected_3_1, RadioButton_selected_3_2, RadioButton_selected_3_3, RadioButton_selected_3_4, RadioButton_selected_3_5, RadioButton_selected_3_6, RadioButton_selected_3_7, RadioButton_selected_3_8
                            , RadioButton_selected_4_1, RadioButton_selected_4_2, RadioButton_selected_4_3, RadioButton_selected_4_4, RadioButton_selected_4_5, RadioButton_selected_4_6, RadioButton_selected_4_7, RadioButton_selected_4_8, RadioButton_selected_4_9, RadioButton_selected_4_10,
                            RadioButton_selected_5_1, RadioButton_selected_5_2, RadioButton_selected_5_3, RadioButton_selected_5_4, RadioButton_selected_5_5,
                            RadioButton_selected_6_1, RadioButton_selected_6_2, RadioButton_selected_6_3, RadioButton_selected_6_4, RadioButton_selected_6_5, RadioButton_selected_6_6, RadioButton_selected_6_7, RadioButton_selected_6_8, RadioButton_selected_6_9, RadioButton_selected_6_10,
                            RadioButton_selected_7_1, RadioButton_selected_7_2, RadioButton_selected_7_3, RadioButton_selected_7_4, RadioButton_selected_7_5, RadioButton_selected_7_6, RadioButton_selected_7_7, RadioButton_selected_7_8,
                            RadioButton_selected_8_1, RadioButton_selected_8_2, RadioButton_selected_8_3, RadioButton_selected_8_4, RadioButton_selected_8_5, RadioButton_selected_8_6, RadioButton_selected_8_7, new QuestionnairesCallBack() {
                                @Override
                                public void onError(String msg) {
                                    Toast.makeText(QuestionnairesActivity.this, " " + msg, Toast.LENGTH_SHORT).show();
                                }

                                @Override
                                public void onSecuess(Questionnaires questionnaires) {
                                    Toast.makeText(QuestionnairesActivity.this, getString(R.string.Thanks), Toast.LENGTH_SHORT).show();

                                    startActivity(new Intent(QuestionnairesActivity.this, HomeActivity.class));
                                }
                            });
                }
            }
        });


        nehal();

    }


    private void init() {
        Intent intent = getIntent();
        String subName = intent.getStringExtra(Constant.SUB_NAME_COURSE);
        String subCode = intent.getStringExtra(Constant.SUB_CODE_COURSE);
        String subGroup = intent.getStringExtra(Constant.SUB_GROUP_NUM);
        String subInst = intent.getStringExtra(Constant.SUB_INSTRUC);
        String subAss = intent.getStringExtra(Constant.SUB_ASSISTANT);

        //DataBase
        dataBaseCartHelper = new DataBaseUserHelper(this);
        list = dataBaseCartHelper.getAllRecord();

        doctorID = intent.getStringExtra(Constant.DOC_ID);
        subjectID = intent.getStringExtra(Constant.SUB_ID);
        assID = intent.getStringExtra(Constant.ASS_ID);

        token = list.get(0).getToken();

        textView7.setText(subName);
        textView8.setText(subCode);
        textView9.setText(subGroup);
        textView10.setText(subInst);
        textView11.setText(subAss);


    }

    private void nehal() {

        RadioGroup_1_1.setOnCheckedChangeListener(new RadioGroup.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(RadioGroup radioGroup, int i) {
                if (Q_1_1 == 0) {
                    Q_1_1 = 1;
                    conter--;
                    Toast.makeText(QuestionnairesActivity.this, "59/" + conter, LENGTH_SHORT).show();
                }
            }
        });
        RadioGroup_1_2.setOnCheckedChangeListener(new RadioGroup.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(RadioGroup radioGroup, int i) {
                if (Q_1_2 == 0) {
                    Q_1_2 = 1;
                    conter--;
                    Toast.makeText(QuestionnairesActivity.this, "59/" + conter, LENGTH_SHORT).show();
                }
            }
        });
        RadioGroup_1_3.setOnCheckedChangeListener(new RadioGroup.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(RadioGroup radioGroup, int i) {
                if (Q_1_3 == 0) {
                    Q_1_3 = 1;
                    conter--;
                    Toast.makeText(QuestionnairesActivity.this, "59/" + conter, LENGTH_SHORT).show();
                }
            }
        });
        RadioGroup_1_4.setOnCheckedChangeListener(new RadioGroup.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(RadioGroup radioGroup, int i) {
                if (Q_1_4 == 0) {
                    Q_1_4 = 1;
                    conter--;
                    Toast.makeText(QuestionnairesActivity.this, "59/" + conter, LENGTH_SHORT).show();
                }
            }
        });
        RadioGroup_1_5.setOnCheckedChangeListener(new RadioGroup.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(RadioGroup radioGroup, int i) {
                if (Q_1_5 == 0) {
                    Q_1_5 = 1;
                    conter--;
                    Toast.makeText(QuestionnairesActivity.this, "59/" + conter, LENGTH_SHORT).show();
                }
            }
        });
        RadioGroup_1_6.setOnCheckedChangeListener(new RadioGroup.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(RadioGroup radioGroup, int i) {
                if (Q_1_6 == 0) {
                    Q_1_6 = 1;
                    conter--;
                    Toast.makeText(QuestionnairesActivity.this, "59/" + conter, LENGTH_SHORT).show();
                }
            }
        });
        RadioGroup_1_7.setOnCheckedChangeListener(new RadioGroup.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(RadioGroup radioGroup, int i) {
                if (Q_1_7 == 0) {
                    Q_1_7 = 1;
                    conter--;
                    Toast.makeText(QuestionnairesActivity.this, "59/" + conter, LENGTH_SHORT).show();
                }
            }
        });
        RadioGroup_2_1.setOnCheckedChangeListener(new RadioGroup.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(RadioGroup radioGroup, int i) {
                if (Q_2_1 == 0) {
                    Q_2_1 = 1;
                    conter--;
                    Toast.makeText(QuestionnairesActivity.this, "59/" + conter, LENGTH_SHORT).show();
                }
            }
        });
        RadioGroup_2_2.setOnCheckedChangeListener(new RadioGroup.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(RadioGroup radioGroup, int i) {
                if (Q_2_2 == 0) {
                    Q_2_2 = 1;
                    conter--;
                    Toast.makeText(QuestionnairesActivity.this, "59/" + conter, LENGTH_SHORT).show();
                }
            }
        });
        RadioGroup_2_3.setOnCheckedChangeListener(new RadioGroup.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(RadioGroup radioGroup, int i) {
                if (Q_2_3 == 0) {
                    Q_2_3 = 1;
                    conter--;
                    Toast.makeText(QuestionnairesActivity.this, "59/" + conter, LENGTH_SHORT).show();
                }
            }
        });
        RadioGroup_2_4.setOnCheckedChangeListener(new RadioGroup.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(RadioGroup radioGroup, int i) {
                if (Q_2_4 == 0) {
                    Q_2_4 = 1;
                    conter--;
                    Toast.makeText(QuestionnairesActivity.this, "59/" + conter, LENGTH_SHORT).show();
                }
            }
        });
        RadioGroup_3_1.setOnCheckedChangeListener(new RadioGroup.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(RadioGroup radioGroup, int i) {
                if (Q_3_1 == 0) {
                    Q_3_1 = 1;
                    conter--;
                    Toast.makeText(QuestionnairesActivity.this, "59/" + conter, LENGTH_SHORT).show();
                }
            }
        });
        RadioGroup_3_2.setOnCheckedChangeListener(new RadioGroup.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(RadioGroup radioGroup, int i) {
                if (Q_3_2 == 0) {
                    Q_3_2 = 1;
                    conter--;
                    Toast.makeText(QuestionnairesActivity.this, "59/" + conter, LENGTH_SHORT).show();
                }
            }
        });

        RadioGroup_3_3.setOnCheckedChangeListener(new RadioGroup.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(RadioGroup radioGroup, int i) {
                if (Q_3_3 == 0) {
                    Q_3_3 = 1;
                    conter--;
                    Toast.makeText(QuestionnairesActivity.this, "59/" + conter, LENGTH_SHORT).show();
                }
            }
        });

        RadioGroup_3_4.setOnCheckedChangeListener(new RadioGroup.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(RadioGroup radioGroup, int i) {
                if (Q_3_4 == 0) {
                    Q_3_4 = 1;
                    conter--;
                    Toast.makeText(QuestionnairesActivity.this, "59/" + conter, LENGTH_SHORT).show();
                }
            }
        });

        RadioGroup_3_5.setOnCheckedChangeListener(new RadioGroup.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(RadioGroup radioGroup, int i) {
                if (Q_3_5 == 0) {
                    Q_3_5 = 1;
                    conter--;
                    Toast.makeText(QuestionnairesActivity.this, "59/" + conter, LENGTH_SHORT).show();
                }
            }
        });

        RadioGroup_3_6.setOnCheckedChangeListener(new RadioGroup.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(RadioGroup radioGroup, int i) {
                if (Q_3_6 == 0) {
                    Q_3_6 = 1;
                    conter--;
                    Toast.makeText(QuestionnairesActivity.this, "59/" + conter, LENGTH_SHORT).show();
                }
            }
        });

        RadioGroup_3_7.setOnCheckedChangeListener(new RadioGroup.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(RadioGroup radioGroup, int i) {
                if (Q_3_7 == 0) {
                    Q_3_7 = 1;
                    conter--;
                    Toast.makeText(QuestionnairesActivity.this, "59/" + conter, LENGTH_SHORT).show();
                }
            }
        });
        RadioGroup_3_8.setOnCheckedChangeListener(new RadioGroup.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(RadioGroup radioGroup, int i) {
                if (Q_3_8 == 0) {
                    Q_3_8 = 1;
                    conter--;
                    Toast.makeText(QuestionnairesActivity.this, "59/" + conter, LENGTH_SHORT).show();
                }
            }
        });
        RadioGroup_4_1.setOnCheckedChangeListener(new RadioGroup.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(RadioGroup radioGroup, int i) {
                if (Q_4_1 == 0) {
                    Q_4_1 = 1;
                    conter--;
                    Toast.makeText(QuestionnairesActivity.this, "59/" + conter, LENGTH_SHORT).show();
                }
            }
        });
        RadioGroup_4_2.setOnCheckedChangeListener(new RadioGroup.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(RadioGroup radioGroup, int i) {
                if (Q_4_2 == 0) {
                    Q_4_2 = 1;
                    conter--;
                    Toast.makeText(QuestionnairesActivity.this, "59/" + conter, LENGTH_SHORT).show();
                }
            }
        });
        RadioGroup_4_3.setOnCheckedChangeListener(new RadioGroup.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(RadioGroup radioGroup, int i) {
                if (Q_4_3 == 0) {
                    Q_4_3 = 1;
                    conter--;
                    Toast.makeText(QuestionnairesActivity.this, "59/" + conter, LENGTH_SHORT).show();
                }
            }
        });
        RadioGroup_4_4.setOnCheckedChangeListener(new RadioGroup.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(RadioGroup radioGroup, int i) {
                if (Q_4_4 == 0) {
                    Q_4_4 = 1;
                    conter--;
                    Toast.makeText(QuestionnairesActivity.this, "59/" + conter, LENGTH_SHORT).show();
                }
            }
        });
        RadioGroup_4_5.setOnCheckedChangeListener(new RadioGroup.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(RadioGroup radioGroup, int i) {
                if (Q_4_5 == 0) {
                    Q_4_5 = 1;
                    conter--;
                    Toast.makeText(QuestionnairesActivity.this, "59/" + conter, LENGTH_SHORT).show();
                }
            }
        });
        RadioGroup_4_6.setOnCheckedChangeListener(new RadioGroup.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(RadioGroup radioGroup, int i) {
                if (Q_4_6 == 0) {
                    Q_4_6 = 1;
                    conter--;
                    Toast.makeText(QuestionnairesActivity.this, "59/" + conter, LENGTH_SHORT).show();
                }
            }
        });
        RadioGroup_4_7.setOnCheckedChangeListener(new RadioGroup.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(RadioGroup radioGroup, int i) {
                if (Q_4_7 == 0) {
                    Q_4_7 = 1;
                    conter--;
                    Toast.makeText(QuestionnairesActivity.this, "59/" + conter, LENGTH_SHORT).show();
                }
            }
        });
        RadioGroup_4_8.setOnCheckedChangeListener(new RadioGroup.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(RadioGroup radioGroup, int i) {
                if (Q_4_8 == 0) {
                    Q_4_8 = 1;
                    conter--;
                    Toast.makeText(QuestionnairesActivity.this, "59/" + conter, LENGTH_SHORT).show();
                }
            }
        });
        RadioGroup_4_9.setOnCheckedChangeListener(new RadioGroup.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(RadioGroup radioGroup, int i) {
                if (Q_4_9 == 0) {
                    Q_4_9 = 1;
                    conter--;
                    Toast.makeText(QuestionnairesActivity.this, "59/" + conter, LENGTH_SHORT).show();
                }
            }
        });
        RadioGroup_4_10.setOnCheckedChangeListener(new RadioGroup.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(RadioGroup radioGroup, int i) {
                if (Q_4_10 == 0) {
                    Q_4_10 = 1;
                    conter--;
                    Toast.makeText(QuestionnairesActivity.this, "59/" + conter, LENGTH_SHORT).show();
                }
            }
        });
        RadioGroup_5_1.setOnCheckedChangeListener(new RadioGroup.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(RadioGroup radioGroup, int i) {
                if (Q_5_1 == 0) {
                    Q_5_1 = 1;
                    conter--;
                    Toast.makeText(QuestionnairesActivity.this, "59/" + conter, LENGTH_SHORT).show();
                }
            }
        });
        RadioGroup_5_2.setOnCheckedChangeListener(new RadioGroup.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(RadioGroup radioGroup, int i) {
                if (Q_5_2 == 0) {
                    Q_5_2 = 1;
                    conter--;
                    Toast.makeText(QuestionnairesActivity.this, "59/" + conter, LENGTH_SHORT).show();
                }
            }
        });
        RadioGroup_5_3.setOnCheckedChangeListener(new RadioGroup.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(RadioGroup radioGroup, int i) {
                if (Q_5_3 == 0) {
                    Q_5_3 = 1;
                    conter--;
                    Toast.makeText(QuestionnairesActivity.this, "59/" + conter, LENGTH_SHORT).show();
                }
            }
        });
        RadioGroup_5_4.setOnCheckedChangeListener(new RadioGroup.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(RadioGroup radioGroup, int i) {
                if (Q_5_4 == 0) {
                    Q_5_4 = 1;
                    conter--;
                    Toast.makeText(QuestionnairesActivity.this, "59/" + conter, LENGTH_SHORT).show();
                }
            }
        });
        RadioGroup_5_5.setOnCheckedChangeListener(new RadioGroup.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(RadioGroup radioGroup, int i) {
                if (Q_5_5 == 0) {
                    Q_5_5 = 1;
                    conter--;
                    Toast.makeText(QuestionnairesActivity.this, "59/" + conter, LENGTH_SHORT).show();
                }
            }
        });
        RadioGroup_6_1.setOnCheckedChangeListener(new RadioGroup.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(RadioGroup radioGroup, int i) {
                if (Q_6_1 == 0) {
                    Q_6_1 = 1;
                    conter--;
                    Toast.makeText(QuestionnairesActivity.this, "59/" + conter, LENGTH_SHORT).show();
                }
            }
        });
        RadioGroup_6_2.setOnCheckedChangeListener(new RadioGroup.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(RadioGroup radioGroup, int i) {
                if (Q_6_2 == 0) {
                    Q_6_2 = 1;
                    conter--;
                    Toast.makeText(QuestionnairesActivity.this, "59/" + conter, LENGTH_SHORT).show();
                }
            }
        });
        RadioGroup_6_3.setOnCheckedChangeListener(new RadioGroup.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(RadioGroup radioGroup, int i) {
                if (Q_6_3 == 0) {
                    Q_6_3 = 1;
                    conter--;
                    Toast.makeText(QuestionnairesActivity.this, "59/" + conter, LENGTH_SHORT).show();
                }
            }
        });
        RadioGroup_6_4.setOnCheckedChangeListener(new RadioGroup.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(RadioGroup radioGroup, int i) {
                if (Q_6_4 == 0) {
                    Q_6_4 = 1;
                    conter--;
                    Toast.makeText(QuestionnairesActivity.this, "59/" + conter, LENGTH_SHORT).show();
                }
            }
        });
        RadioGroup_6_5.setOnCheckedChangeListener(new RadioGroup.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(RadioGroup radioGroup, int i) {
                if (Q_6_5 == 0) {
                    Q_6_5 = 1;
                    conter--;
                    Toast.makeText(QuestionnairesActivity.this, "59/" + conter, LENGTH_SHORT).show();
                }
            }
        });
        RadioGroup_6_6.setOnCheckedChangeListener(new RadioGroup.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(RadioGroup radioGroup, int i) {
                if (Q_6_6 == 0) {
                    Q_6_6 = 1;
                    conter--;
                    Toast.makeText(QuestionnairesActivity.this, "59/" + conter, LENGTH_SHORT).show();
                }
            }
        });
        RadioGroup_6_7.setOnCheckedChangeListener(new RadioGroup.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(RadioGroup radioGroup, int i) {
                if (Q_6_7 == 0) {
                    Q_6_7 = 1;
                    conter--;
                    Toast.makeText(QuestionnairesActivity.this, "59/" + conter, LENGTH_SHORT).show();
                }
            }
        });
        RadioGroup_6_8.setOnCheckedChangeListener(new RadioGroup.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(RadioGroup radioGroup, int i) {
                if (Q_6_8 == 0) {
                    Q_6_8 = 1;
                    conter--;
                    Toast.makeText(QuestionnairesActivity.this, "59/" + conter, LENGTH_SHORT).show();
                }
            }
        });
        RadioGroup_6_9.setOnCheckedChangeListener(new RadioGroup.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(RadioGroup radioGroup, int i) {
                if (Q_6_9 == 0) {
                    Q_6_9 = 1;
                    conter--;
                    Toast.makeText(QuestionnairesActivity.this, "59/" + conter, LENGTH_SHORT).show();
                }
            }
        });
        RadioGroup_6_10.setOnCheckedChangeListener(new RadioGroup.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(RadioGroup radioGroup, int i) {
                if (Q_6_10 == 0) {
                    Q_6_10 = 1;
                    conter--;
                    Toast.makeText(QuestionnairesActivity.this, "59/" + conter, LENGTH_SHORT).show();
                }
            }
        });
        RadioGroup_7_1.setOnCheckedChangeListener(new RadioGroup.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(RadioGroup radioGroup, int i) {
                if (Q_7_1 == 0) {
                    Q_7_1 = 1;
                    conter--;
                    Toast.makeText(QuestionnairesActivity.this, "59/" + conter, LENGTH_SHORT).show();
                }
            }
        });
        RadioGroup_7_2.setOnCheckedChangeListener(new RadioGroup.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(RadioGroup radioGroup, int i) {
                if (Q_7_2 == 0) {
                    Q_7_2 = 1;
                    conter--;
                    Toast.makeText(QuestionnairesActivity.this, "59/" + conter, LENGTH_SHORT).show();
                }
            }
        });
        RadioGroup_7_3.setOnCheckedChangeListener(new RadioGroup.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(RadioGroup radioGroup, int i) {
                if (Q_7_3 == 0) {
                    Q_7_3 = 1;
                    conter--;
                    Toast.makeText(QuestionnairesActivity.this, "59/" + conter, LENGTH_SHORT).show();
                }
            }
        });
        RadioGroup_7_4.setOnCheckedChangeListener(new RadioGroup.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(RadioGroup radioGroup, int i) {
                if (Q_7_4 == 0) {
                    Q_7_4 = 1;
                    conter--;
                    Toast.makeText(QuestionnairesActivity.this, "59/" + conter, LENGTH_SHORT).show();
                }
            }
        });
        RadioGroup_7_5.setOnCheckedChangeListener(new RadioGroup.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(RadioGroup radioGroup, int i) {
                if (Q_7_5 == 0) {
                    Q_7_5 = 1;
                    conter--;
                    Toast.makeText(QuestionnairesActivity.this, "59/" + conter, LENGTH_SHORT).show();
                }
            }
        });
        RadioGroup_7_6.setOnCheckedChangeListener(new RadioGroup.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(RadioGroup radioGroup, int i) {
                if (Q_7_6 == 0) {
                    Q_7_6 = 1;
                    conter--;
                    Toast.makeText(QuestionnairesActivity.this, "59/" + conter, LENGTH_SHORT).show();
                }
            }
        });
        RadioGroup_7_7.setOnCheckedChangeListener(new RadioGroup.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(RadioGroup radioGroup, int i) {
                if (Q_7_7 == 0) {
                    Q_7_7 = 1;
                    conter--;
                    Toast.makeText(QuestionnairesActivity.this, "59/" + conter, LENGTH_SHORT).show();
                }
            }
        });
        RadioGroup_7_8.setOnCheckedChangeListener(new RadioGroup.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(RadioGroup radioGroup, int i) {
                if (Q_7_8 == 0) {
                    Q_7_8 = 1;
                    conter--;
                    Toast.makeText(QuestionnairesActivity.this, "59/" + conter, LENGTH_SHORT).show();
                }
            }
        });
        RadioGroup_8_1.setOnCheckedChangeListener(new RadioGroup.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(RadioGroup radioGroup, int i) {
                if (Q_8_1 == 0) {
                    Q_8_1 = 1;
                    conter--;
                    Toast.makeText(QuestionnairesActivity.this, "59/" + conter, LENGTH_SHORT).show();
                }
            }
        });
        RadioGroup_8_2.setOnCheckedChangeListener(new RadioGroup.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(RadioGroup radioGroup, int i) {
                if (Q_8_2 == 0) {
                    Q_8_2 = 1;
                    conter--;
                    Toast.makeText(QuestionnairesActivity.this, "59/" + conter, LENGTH_SHORT).show();
                }
            }
        });
        RadioGroup_8_3.setOnCheckedChangeListener(new RadioGroup.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(RadioGroup radioGroup, int i) {
                if (Q_8_3 == 0) {
                    Q_8_3 = 1;
                    conter--;
                    Toast.makeText(QuestionnairesActivity.this, "59/" + conter, LENGTH_SHORT).show();
                }
            }
        });
        RadioGroup_8_4.setOnCheckedChangeListener(new RadioGroup.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(RadioGroup radioGroup, int i) {
                if (Q_8_4 == 0) {
                    Q_8_4 = 1;
                    conter--;
                    Toast.makeText(QuestionnairesActivity.this, "59/" + conter, LENGTH_SHORT).show();
                }
            }
        });
        RadioGroup_8_5.setOnCheckedChangeListener(new RadioGroup.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(RadioGroup radioGroup, int i) {
                if (Q_8_5 == 0) {
                    Q_8_5 = 1;
                    conter--;
                    Toast.makeText(QuestionnairesActivity.this, "59/" + conter, LENGTH_SHORT).show();
                }
            }
        });
        RadioGroup_8_6.setOnCheckedChangeListener(new RadioGroup.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(RadioGroup radioGroup, int i) {
                if (Q_8_6 == 0) {
                    Q_8_6 = 1;
                    conter--;
                    Toast.makeText(QuestionnairesActivity.this, "59/" + conter, LENGTH_SHORT).show();
                }
            }
        });
        RadioGroup_8_7.setOnCheckedChangeListener(new RadioGroup.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(RadioGroup radioGroup, int i) {
                if (Q_8_7 == 0) {
                    Q_8_7 = 1;
                    conter--;
                    Toast.makeText(QuestionnairesActivity.this, "59/" + conter, LENGTH_SHORT).show();
                }
            }
        });


    }
}





