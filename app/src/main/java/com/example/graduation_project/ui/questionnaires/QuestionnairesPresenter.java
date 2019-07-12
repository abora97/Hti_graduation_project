package com.example.graduation_project.ui.questionnaires;

import android.widget.RadioButton;
import android.widget.RadioGroup;
import android.widget.Toast;

public class QuestionnairesPresenter extends  QuestionnairesActivity {


    public void QuestionnairesPresenter (int Radio_group_id){
        RadioGroup radioGroup = findViewById(Radio_group_id);
        int Selsct_id=radioGroup.getCheckedRadioButtonId();
        RadioButton radioButton_selected=findViewById(Selsct_id);
        if (radioButton_selected==null) {
            Toast.makeText(this,radioButton_selected.getText(),Toast.LENGTH_SHORT).show();
        }else{
            Toast.makeText(this," Thanks",Toast.LENGTH_SHORT).show();
        }


    }
}
