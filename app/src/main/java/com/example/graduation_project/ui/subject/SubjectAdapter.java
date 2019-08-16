package com.example.graduation_project.ui.subject;

import android.content.Context;
import android.content.Intent;
import android.support.annotation.NonNull;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.LinearLayout;
import android.widget.TextView;

import com.example.graduation_project.R;
import com.example.graduation_project.model.subject.Subject;
import com.example.graduation_project.model.subject.Subject_;
import com.example.graduation_project.ui.questionnaires.QuestionnairesActivity;
import com.example.graduation_project.util.Constant;

import java.util.List;

import butterknife.BindView;
import butterknife.ButterKnife;

public class SubjectAdapter extends RecyclerView.Adapter<SubjectAdapter.viewHolder> {

    Context context;
    List<Subject_> list;


    public SubjectAdapter(Context context, List<Subject_> list) {
        this.context = context;
        this.list = list;
    }

    @NonNull
    @Override
    public viewHolder onCreateViewHolder(@NonNull ViewGroup viewGroup, int i) {
        View inflate = LayoutInflater.from(viewGroup.getContext()).inflate(R.layout.item_subject, viewGroup, false);
        return new viewHolder(inflate);
    }

    @Override
    public void onBindViewHolder(@NonNull viewHolder viewHolder, final int i) {
        final String courseName = list.get(i).getName();
        final String courseCode = list.get(i).getCode();
        final String courseGroup = String.valueOf(list.get(i).getId());
        final String courseInst = list.get(i).getDoctorName();
        final String courseAss = list.get(i).getAssistantName();
        final String docID = String.valueOf(list.get(i).getDoctorId());
        final String subID = String.valueOf(list.get(i).getId());
        final String assID = String.valueOf(list.get(i).getAssistantId());

        viewHolder.tvSubjectName.setText(list.get(i).getName());
        viewHolder.tvSubjectCode.setText(list.get(i).getCode());
        viewHolder.tvSubjectGroup.setText(String.valueOf(list.get(i).getId()));
        viewHolder.tvSubjectNum.setText(String.valueOf(i + 1));

        viewHolder.laySubject.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(context, QuestionnairesActivity.class);
                intent.putExtra(Constant.SUB_NAME_COURSE, courseName);
                intent.putExtra(Constant.SUB_ASSISTANT, courseAss);
                intent.putExtra(Constant.SUB_CODE_COURSE, courseCode);
                intent.putExtra(Constant.SUB_GROUP_NUM, courseGroup);
                intent.putExtra(Constant.SUB_INSTRUC, courseInst);
                intent.putExtra(Constant.DOC_ID, docID);
                intent.putExtra(Constant.SUB_ID, subID);
                intent.putExtra(Constant.ASS_ID, assID);

                context.startActivity(intent);
            }
        });
    }

    @Override
    public int getItemCount() {
        return list.size();
    }

    class viewHolder extends RecyclerView.ViewHolder {
        @BindView(R.id.tv_subject_num)
        TextView tvSubjectNum;
        @BindView(R.id.tv_subject_code)
        TextView tvSubjectCode;
        @BindView(R.id.tv_subject_name)
        TextView tvSubjectName;
        @BindView(R.id.tv_subject_group)
        TextView tvSubjectGroup;
        @BindView(R.id.lay_subject)
        LinearLayout laySubject;

        viewHolder(View view) {
            super(view);
            ButterKnife.bind(this, view);
        }
    }

}
