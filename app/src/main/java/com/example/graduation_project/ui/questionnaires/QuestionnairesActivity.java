package com.example.graduation_project.ui.questionnaires;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
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

    TextView textView7, textView8, textView9, textView10, textView11,
            txtQuestion1_1, txtQuestion1_2, txtQuestion1_3, txtQuestion1_4, txtQuestion1_5, txtQuestion1_6, txtQuestion1_7,
            txtQuestion2_1, txtQuestion2_2, txtQuestion2_3, txtQuestion2_4,
            txtQuestion3_1, txtQuestion3_2, txtQuestion3_3, txtQuestion3_4, txtQuestion3_5, txtQuestion3_6, txtQuestion3_7, txtQuestion3_8,
            txtQuestion4_1, txtQuestion4_2, txtQuestion4_3, txtQuestion4_4, txtQuestion4_5, txtQuestion4_6, txtQuestion4_7, txtQuestion4_8, txtQuestion4_9, txtQuestion4_10,
            txtQuestion5_1, txtQuestion5_2, txtQuestion5_3, txtQuestion5_4, txtQuestion5_5,
            txtQuestion6_1, txtQuestion6_2, txtQuestion6_3, txtQuestion6_4, txtQuestion6_5, txtQuestion6_6, txtQuestion6_7, txtQuestion6_8, txtQuestion6_9, txtQuestion6_10,
            txtQuestion7_1, txtQuestion7_2, txtQuestion7_3, txtQuestion7_4, txtQuestion7_5, txtQuestion7_6, txtQuestion7_7, txtQuestion7_8,
            txtQuestion8_1, txtQuestion8_2, txtQuestion8_3, txtQuestion8_4, txtQuestion8_5, txtQuestion8_6, txtQuestion8_7;
    Button submit;
    RadioGroup RadioGroup_1_1, RadioGroup_1_2, RadioGroup_1_3, RadioGroup_1_4, RadioGroup_1_5, RadioGroup_1_6, RadioGroup_1_7, RadioGroup_2_1, RadioGroup_2_2, RadioGroup_2_3,
            RadioGroup_2_4, RadioGroup_3_1, RadioGroup_3_2, RadioGroup_3_3, RadioGroup_3_4, RadioGroup_3_5, RadioGroup_3_6, RadioGroup_3_7, RadioGroup_3_8, RadioGroup_4_1,
            RadioGroup_4_2, RadioGroup_4_3, RadioGroup_4_4, RadioGroup_4_5, RadioGroup_4_6, RadioGroup_4_7, RadioGroup_4_8, RadioGroup_4_9, RadioGroup_4_10,
            RadioGroup_5_1, RadioGroup_5_2, RadioGroup_5_3, RadioGroup_5_4, RadioGroup_5_5, RadioGroup_6_1, RadioGroup_6_2, RadioGroup_6_3, RadioGroup_6_4, RadioGroup_6_5,
            RadioGroup_6_6, RadioGroup_6_7, RadioGroup_6_8, RadioGroup_6_9, RadioGroup_6_10, RadioGroup_7_1, RadioGroup_7_2, RadioGroup_7_3, RadioGroup_7_4, RadioGroup_7_5,
            RadioGroup_7_6, RadioGroup_7_7, RadioGroup_7_8, RadioGroup_8_1, RadioGroup_8_2, RadioGroup_8_3, RadioGroup_8_4, RadioGroup_8_5, RadioGroup_8_6, RadioGroup_8_7;


    String subjectID, doctorID, assID, token;
    private DataBaseUserHelper dataBaseCartHelper;
    private List<userSql> list;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_questionnaires);
        textView7 = findViewById(R.id.textView7);
        textView8 = findViewById(R.id.textView8);
        textView9 = findViewById(R.id.textView9);
        textView10 = findViewById(R.id.textView10);
        textView11 = findViewById(R.id.textView11);
        txtQuestion1_1 = findViewById(R.id.txtQuestion1_1);
        txtQuestion1_2 = findViewById(R.id.txtQuestion1_2);
        txtQuestion1_3 = findViewById(R.id.txtQuestion1_3);
        txtQuestion1_4 = findViewById(R.id.txtQuestion1_4);
        txtQuestion1_5 = findViewById(R.id.txtQuestion1_5);
        txtQuestion1_6 = findViewById(R.id.txtQuestion1_6);
        txtQuestion1_7 = findViewById(R.id.txtQuestion1_7);
        txtQuestion2_1 = findViewById(R.id.txtQuestion2_1);
        txtQuestion2_2 = findViewById(R.id.txtQuestion2_2);
        txtQuestion2_3 = findViewById(R.id.txtQuestion2_3);
        txtQuestion2_4 = findViewById(R.id.txtQuestion2_4);
        txtQuestion3_1 = findViewById(R.id.txtQuestion3_1);
        txtQuestion3_2 = findViewById(R.id.txtQuestion3_2);
        txtQuestion3_3 = findViewById(R.id.txtQuestion3_3);
        txtQuestion3_4 = findViewById(R.id.txtQuestion3_4);
        txtQuestion3_5 = findViewById(R.id.txtQuestion3_5);
        txtQuestion3_6 = findViewById(R.id.txtQuestion3_6);
        txtQuestion3_7 = findViewById(R.id.txtQuestion3_7);
        txtQuestion3_8 = findViewById(R.id.txtQuestion3_8);
        txtQuestion4_1 = findViewById(R.id.txtQuestion4_1);
        txtQuestion4_2 = findViewById(R.id.txtQuestion4_2);
        txtQuestion4_3 = findViewById(R.id.txtQuestion4_3);
        txtQuestion4_4 = findViewById(R.id.txtQuestion4_4);
        txtQuestion4_5 = findViewById(R.id.txtQuestion4_5);
        txtQuestion4_6 = findViewById(R.id.txtQuestion4_6);
        txtQuestion4_7 = findViewById(R.id.txtQuestion4_7);
        txtQuestion4_8 = findViewById(R.id.txtQuestion4_8);
        txtQuestion4_9 = findViewById(R.id.txtQuestion4_9);
        txtQuestion4_10 = findViewById(R.id.txtQuestion4_10);
        txtQuestion5_1 = findViewById(R.id.txtQuestion5_1);
        txtQuestion5_2 = findViewById(R.id.txtQuestion5_2);
        txtQuestion5_3 = findViewById(R.id.txtQuestion5_3);
        txtQuestion5_4 = findViewById(R.id.txtQuestion5_4);
        txtQuestion5_5 = findViewById(R.id.txtQuestion5_5);
        txtQuestion6_1 = findViewById(R.id.txtQuestion6_1);
        txtQuestion6_2 = findViewById(R.id.txtQuestion6_2);
        txtQuestion6_3 = findViewById(R.id.txtQuestion6_3);
        txtQuestion6_4 = findViewById(R.id.txtQuestion6_4);
        txtQuestion6_5 = findViewById(R.id.txtQuestion6_5);
        txtQuestion6_6 = findViewById(R.id.txtQuestion6_6);
        txtQuestion6_7 = findViewById(R.id.txtQuestion6_7);
        txtQuestion6_7 = findViewById(R.id.txtQuestion6_7);
        txtQuestion6_9 = findViewById(R.id.txtQuestion6_9);
        txtQuestion6_10 = findViewById(R.id.txtQuestion6_10);
        txtQuestion7_1 = findViewById(R.id.txtQuestion7_1);
        txtQuestion7_2 = findViewById(R.id.txtQuestion7_2);
        txtQuestion7_3 = findViewById(R.id.txtQuestion7_3);
        txtQuestion7_4 = findViewById(R.id.txtQuestion7_4);
        txtQuestion7_5 = findViewById(R.id.txtQuestion7_5);
        txtQuestion7_6 = findViewById(R.id.txtQuestion7_6);
        txtQuestion7_7 = findViewById(R.id.txtQuestion7_7);
        txtQuestion7_8 = findViewById(R.id.txtQuestion7_8);
        txtQuestion8_1 = findViewById(R.id.txtQuestion8_1);
        txtQuestion8_2 = findViewById(R.id.txtQuestion8_2);
        txtQuestion8_3 = findViewById(R.id.txtQuestion8_3);
        txtQuestion8_4 = findViewById(R.id.txtQuestion8_4);
        txtQuestion8_5 = findViewById(R.id.txtQuestion8_5);
        txtQuestion8_6 = findViewById(R.id.txtQuestion8_6);
        txtQuestion8_7 = findViewById(R.id.txtQuestion8_7);


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
                    Toast.makeText(QuestionnairesActivity.this, " Please Select All Questionnaires", Toast.LENGTH_SHORT).show();
                }

//                } else if (radioButton_selected_1_2 == null) {
//                    txtQuestion1_2.setText(txtQuestion1_2.getText() + "*");
//                } else if (radioButton_selected_1_3 == null) {
//                    txtQuestion1_3.setText(txtQuestion1_3.getText() + "*");
//                } else if (radioButton_selected_1_4 == null) {
//                    txtQuestion1_4.setText(txtQuestion1_4.getText() + "*");
//                } else if (radioButton_selected_1_5 == null) {
//                    txtQuestion1_5.setText(txtQuestion1_5.getText() + "*");
//                } else if (radioButton_selected_1_6 == null) {
//                    txtQuestion1_6.setText(txtQuestion1_6.getText() + "*");
//                } else if (radioButton_selected_1_7== null) {
//                    txtQuestion1_7.setText(txtQuestion1_7.getText() + "*");
//                } else if (radioButton_selected_2_1 == null) {
//                    txtQuestion2_1.setText(txtQuestion2_1.getText() + "*");
//                } else if (radioButton_selected_2_2 == null) {
//                    txtQuestion2_2.setText(txtQuestion2_2.getText() + "*");
//                } else if (radioButton_selected_2_3 == null) {
//                    txtQuestion2_3.setText(txtQuestion2_3.getText() + "*");
//                } else if (radioButton_selected_2_4 == null) {
//                    txtQuestion2_4.setText(txtQuestion2_4.getText() + "*");
//                } else if (radioButton_selected_3_1== null) {
//                    txtQuestion3_1.setText(txtQuestion3_1.getText() + "*");
//                } else if (radioButton_selected_3_2 == null) {
//                    txtQuestion3_2.setText(txtQuestion3_2.getText() + "*");
//                } else if (radioButton_selected_3_3 == null) {
//                    txtQuestion3_3.setText(txtQuestion3_3.getText() + "*");
//                } else if (radioButton_selected_3_4 == null) {
//                    txtQuestion3_4.setText(txtQuestion3_4.getText() + "*");
//                } else if (radioButton_selected_3_5 == null) {
//                    txtQuestion3_5.setText(txtQuestion3_5.getText() + "*");
//                } else if (radioButton_selected_3_6 == null) {
//                    txtQuestion3_6.setText(txtQuestion3_6.getText() + "*");
//                } else if (radioButton_selected_3_7== null) {
//                    txtQuestion3_7.setText(txtQuestion3_6.getText() + "*");
//                } else if (radioButton_selected_3_8 == null) {
//                    txtQuestion3_8.setText(txtQuestion3_8.getText() + "*");
//                } else if (radioButton_selected_4_1 == null) {
//                    txtQuestion4_1.setText(txtQuestion4_1.getText() + "*");
//                } else if (radioButton_selected_4_2 == null) {
//                    txtQuestion4_2.setText(txtQuestion4_2.getText() + "*");
//                } else if (radioButton_selected_4_3 == null) {
//                    txtQuestion4_3.setText(txtQuestion4_3.getText() + "*");
//                } else if (radioButton_selected_4_4 == null) {
//                    txtQuestion4_4.setText(txtQuestion4_4.getText() + "*");
//                } else if (radioButton_selected_4_5 == null) {
//                    txtQuestion4_5.setText(txtQuestion4_5.getText() + "*");
//                } else if (radioButton_selected_4_6 == null) {
//                    txtQuestion4_6.setText(txtQuestion4_6.getText() + "*");
//                } else if (radioButton_selected_4_7== null) {
//                    txtQuestion4_7.setText(txtQuestion4_7.getText() + "*");
//                } else if (radioButton_selected_4_8 == null) {
//                    txtQuestion4_8.setText(txtQuestion4_8.getText() + "*");
//                } else if (radioButton_selected_4_9 == null) {
//                    txtQuestion4_9.setText(txtQuestion4_9.getText() + "*");
//                } else if (radioButton_selected_4_10== null) {
//                    txtQuestion4_10.setText(txtQuestion4_10.getText() + "*");
//                } else if (radioButton_selected_5_1 == null) {
//                    txtQuestion5_1.setText(txtQuestion5_1.getText() + "*");
//                } else if (radioButton_selected_5_2 == null) {
//                    txtQuestion5_2.setText(txtQuestion5_2.getText() + "*");
//                } else if (radioButton_selected_5_3 == null) {
//                    txtQuestion5_3.setText(txtQuestion5_3.getText() + "*");
//                } else if (radioButton_selected_5_4 == null) {
//                    txtQuestion5_4.setText(txtQuestion5_4.getText() + "*");
//                } else if (radioButton_selected_5_5== null) {
//                    txtQuestion5_5.setText(txtQuestion5_5.getText() + "*");
//                } else if (radioButton_selected_6_1 == null) {
//                    txtQuestion6_1.setText(txtQuestion6_1.getText() + "*");
//                } else if (radioButton_selected_6_2 == null) {
//                    txtQuestion6_2.setText(txtQuestion6_2.getText() + "*");
//                } else if (radioButton_selected_6_3 == null) {
//                    txtQuestion6_3.setText(txtQuestion6_3.getText() + "*");
//                } else if (radioButton_selected_6_4== null) {
//                    txtQuestion6_4.setText(txtQuestion6_4.getText() + "*");
//                } else if (radioButton_selected_6_5 == null) {
//                    txtQuestion6_5.setText(txtQuestion6_5.getText() + "*");
//                } else if (radioButton_selected_6_6== null) {
//                    txtQuestion6_6.setText(txtQuestion6_6.getText() + "*");
//                } else if (radioButton_selected_6_7 == null) {
//                    txtQuestion6_7.setText(txtQuestion6_7.getText() + "*");
//                } else if (radioButton_selected_6_8 == null) {
//                    txtQuestion6_8.setText(txtQuestion6_8.getText() + "*");
//                } else if (radioButton_selected_6_9 == null) {
//                    txtQuestion6_9.setText(txtQuestion6_9.getText() + "*");
//                } else if (radioButton_selected_6_10 == null) {
//                    txtQuestion6_10.setText(txtQuestion6_10.getText() + "*");
//                } else if (radioButton_selected_7_1 == null) {
//                    txtQuestion7_1.setText(txtQuestion7_1.getText() + "*");
//                } else if (radioButton_selected_7_2 == null) {
//                    txtQuestion7_2.setText(txtQuestion7_2.getText() + "*");
//                } else if (radioButton_selected_7_3 == null) {
//                    txtQuestion7_3.setText(txtQuestion7_3.getText() + "*");
//                } else if (radioButton_selected_7_4 == null) {
//                    txtQuestion7_4.setText(txtQuestion7_4.getText() + "*");
//                } else if (radioButton_selected_7_5 == null) {
//                    txtQuestion7_5.setText(txtQuestion7_5.getText() + "*");
//                } else if (radioButton_selected_7_6 == null) {
//                    txtQuestion7_6 .setText(txtQuestion7_6 .getText() + "*");
//                } else if (radioButton_selected_7_7 == null) {
//                    txtQuestion7_7.setText(txtQuestion7_7.getText() + "*");
//                } else if (radioButton_selected_7_8 == null) {
//                    txtQuestion7_8.setText(txtQuestion7_8.getText() + "*");
//                } else if (radioButton_selected_8_1 == null) {
//                    txtQuestion8_1 .setText(txtQuestion8_1 .getText() + "*");
//                } else if (radioButton_selected_8_2 == null) {
//                    txtQuestion8_2.setText(txtQuestion8_2.getText() + "*");
//                } else if (radioButton_selected_8_3 == null) {
//                    txtQuestion8_3.setText(txtQuestion8_3.getText() + "*");
//                } else if (radioButton_selected_8_4 == null) {
//                    txtQuestion8_4.setText(txtQuestion8_4.getText() + "*");
//                } else if (radioButton_selected_8_5 == null) {
//                    txtQuestion8_5.setText(txtQuestion8_5.getText() + "*");
//                } else if (radioButton_selected_8_6== null) {
//                    txtQuestion8_6.setText(txtQuestion8_6.getText() + "*");
//                } else if (radioButton_selected_8_7 == null) {
//                    txtQuestion8_7.setText(txtQuestion8_7.getText() + "*");
//                }
                else {
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
                                    Toast.makeText(QuestionnairesActivity.this, " Thanks", Toast.LENGTH_SHORT).show();

                                    startActivity(new Intent(QuestionnairesActivity.this, HomeActivity.class));
                                }
                            });
                }
            }
        });


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
}





