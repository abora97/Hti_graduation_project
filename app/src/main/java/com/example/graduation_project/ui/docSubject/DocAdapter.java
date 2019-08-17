package com.example.graduation_project.ui.docSubject;

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


import com.example.graduation_project.model.DeanDoctorSubject.Doctor;
import com.example.graduation_project.ui.doctorSubject.DocSubjectActivity;

import java.util.List;

import butterknife.BindView;
import butterknife.ButterKnife;

public class DocAdapter extends RecyclerView.Adapter<DocAdapter.viewHolder> {


    Context context;
    List<Doctor> doctors;

//    public DocAdapter(Context context, List<DeanDepartment> deanDepartment) {
//        this.context = context;
//        this.deanDepartment = deanDepartment;
//    }


    public DocAdapter(Context context, List<Doctor> doctors) {
        this.context = context;
        this.doctors = doctors;
    }


    @NonNull
    @Override
    public DocAdapter.viewHolder onCreateViewHolder(@NonNull ViewGroup viewGroup, int i) {
        View inflate = LayoutInflater.from(viewGroup.getContext()).inflate(R.layout.item_doctor, viewGroup, false);
        return new viewHolder(inflate);
    }

    @Override
    public void onBindViewHolder(@NonNull DocAdapter.viewHolder viewHolder, final int i) {
        viewHolder.tvDoctorName.setText(doctors.get(i).getName());
        String avg=String.valueOf(doctors.get(i).getAvg());
        viewHolder.tvAvrage.setText(avg);
        //viewHolder.tvAvrage.setText(doctors.get(i).get);


        viewHolder.linearLayout.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(context, DocSubjectActivity.class);
                intent.putExtra("docID", String.valueOf(doctors.get(i).getId()));
                context.startActivity(intent);
            }
        });
    }

    @Override
    public int getItemCount() {
        return doctors.size();
    }

    class viewHolder extends RecyclerView.ViewHolder {

        @BindView(R.id.tv_doc_name)
        TextView tvDoctorName;
        @BindView(R.id.tv_doc_average)
        TextView tvAvrage;
        @BindView(R.id.lay_doc)
        LinearLayout linearLayout;

        public viewHolder(@NonNull View itemView) {
            super(itemView);
            ButterKnife.bind(this, itemView);
        }
    }


}
