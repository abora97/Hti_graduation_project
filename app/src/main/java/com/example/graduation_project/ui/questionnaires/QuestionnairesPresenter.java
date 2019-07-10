package com.example.graduation_project.ui.questionnaires;

import android.widget.RadioButton;
import android.widget.RadioGroup;
import android.widget.Toast;

public class QuestionnairesPresenter extends  QuestionnairesActivity {


    public void QuestionnairesPresenter (int Radio_group_id){
int radioGriub=Radio_group_id;
        RadioGroup radioGroup = (RadioGroup) findViewById(Radio_group_id);
        int Selsct_id=radioGroup.getCheckedRadioButtonId();
        RadioButton radioButton_selected=findViewById(Selsct_id);
        Toast.makeText(this,"select radio botton"+radioButton_selected.getText(),Toast.LENGTH_SHORT).show();


    }
}
