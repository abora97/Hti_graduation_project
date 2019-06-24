package com.example.graduation_project.ui.subject;

import com.example.graduation_project.model.subject.SubjectModel;

public interface SubjectContract {
    interface viewMain{

        void showData(SubjectModel subjects);

        void showError(String msg);

    }
    interface presenter{}
}
