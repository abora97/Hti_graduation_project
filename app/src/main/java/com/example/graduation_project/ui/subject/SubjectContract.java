package com.example.graduation_project.ui.subject;

import com.example.graduation_project.model.subject.Data;
import com.example.graduation_project.model.subject.Subject;


public interface SubjectContract {
    interface viewMain{

        void showData(Subject subjects);

        void showError(String msg);

    }
    interface presenter{}
}
