package com.example.graduation_project.ui.subject;

import android.content.Context;
import android.support.annotation.NonNull;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import com.example.graduation_project.R;

import com.example.graduation_project.model.subject.Subject;


import java.util.List;

import butterknife.BindView;
import butterknife.ButterKnife;

public class SubjectAdapter extends RecyclerView.Adapter<SubjectAdapter.viewHolder> {


    Context context;
    List<Subject> list;


    public SubjectAdapter(Context context, List<Subject> list) {
        this.context = context;
        this.list = list;
    }

    @NonNull
    @Override
    public SubjectAdapter.viewHolder onCreateViewHolder(@NonNull ViewGroup viewGroup, int i) {
        View inflate = LayoutInflater.from(viewGroup.getContext()).inflate(R.layout.item_subject, viewGroup, false);
        return new viewHolder(inflate);
    }

    @Override
    public void onBindViewHolder(@NonNull SubjectAdapter.viewHolder viewHolder, int i) {
        viewHolder.tnSubjectName.setText(list.get(i).getName());
    }

    @Override
    public int getItemCount() {
        return list.size();
    }

    class viewHolder extends RecyclerView.ViewHolder {
        @BindView(R.id.tv_subject_name)
        TextView tnSubjectName;
        @BindView(R.id.iv_subject)
        ImageView ivSubject;

        viewHolder(View view) {
            super(view);
            ButterKnife.bind(this, view);
        }
    }

}
