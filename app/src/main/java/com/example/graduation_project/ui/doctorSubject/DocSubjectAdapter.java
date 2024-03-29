package com.example.graduation_project.ui.doctorSubject;

import android.content.Context;
import android.content.Intent;
import android.support.annotation.NonNull;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import android.widget.TextView;

import com.example.graduation_project.R;
import com.example.graduation_project.model.DoctorSubject.Subject;
import com.example.graduation_project.ui.result.ResultActivity;

import java.util.List;

import butterknife.BindView;
import butterknife.ButterKnife;

public class DocSubjectAdapter extends RecyclerView.Adapter<DocSubjectAdapter.viewHolder> {


    Context context;
    List<Subject> list;
    String docID;

    public DocSubjectAdapter(Context context, List<Subject> list, String docID) {
        this.context = context;
        this.list = list;
        this.docID = docID;
    }

    @NonNull
    @Override
    public viewHolder onCreateViewHolder(@NonNull ViewGroup viewGroup, int i) {
        View inflate = LayoutInflater.from(viewGroup.getContext()).inflate(R.layout.item_docsubject, viewGroup, false);
        return new viewHolder(inflate);
    }

    @Override
    public void onBindViewHolder(@NonNull viewHolder viewHolder, final int i) {
        final String courseName = list.get(i).getName();
        final String courseCode = list.get(i).getCode();
        final String courseAvg = String.valueOf(list.get(i).getAvg());
        final String courseGroup = String.valueOf(list.get(i).getId());

//        final String courseInst = list.get(i).get();
//        final String courseAss = list.get(i).getAssistantName();
//        final String docID = String.valueOf(list.get(i).getDoctorId());
//        final String subID = String.valueOf(list.get(i).getId());
//        final String assID = String.valueOf(list.get(i).getAssistantId());

        viewHolder.tvSubjectName.setText(list.get(i).getName());
        viewHolder.tvSubjectCode.setText(list.get(i).getCode());
        viewHolder.tvSubjectGroup.setText(String.valueOf(list.get(i).getId()));
        viewHolder.tvSubjectNum.setText(courseAvg + " % ");

        viewHolder.laySubject.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(context, ResultActivity.class);

                intent.putExtra("subject_name", list.get(i).getName());
                intent.putExtra("doctor_id", docID);

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
