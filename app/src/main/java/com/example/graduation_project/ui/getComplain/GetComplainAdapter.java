package com.example.graduation_project.ui.getComplain;


import android.content.Context;
import android.support.annotation.NonNull;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import com.example.graduation_project.R;
import com.example.graduation_project.model.getComplain.Complain;

import java.util.List;

import butterknife.BindView;
import butterknife.ButterKnife;

public class GetComplainAdapter extends RecyclerView.Adapter<GetComplainAdapter.viewHolder> {

    Context context;
    List<Complain> complains;


    public GetComplainAdapter(Context context, List<Complain> complains) {
        this.complains = complains;
        this.context = context;
    }

    @NonNull
    @Override
    public viewHolder onCreateViewHolder(@NonNull ViewGroup viewGroup, int i) {
        View inflate = LayoutInflater.from(viewGroup.getContext()).inflate(R.layout.item_get_copmlain, viewGroup, false);
        return new viewHolder(inflate);
    }

    @Override
    public void onBindViewHolder(@NonNull viewHolder viewHolder, final int i) {

        viewHolder.tvType.setText(complains.get(i).getType());
        viewHolder.tvTopic.setText(complains.get(i).getTopic());
        viewHolder.tvDescription.setText(complains.get(i).getDescription());

        String departmentID = complains.get(i).getDepartmentId();

        if (departmentID.equals("1")) {
            viewHolder.tvDepartmentName.setText("computer science");
        } else if (departmentID.equals("2")) {
            viewHolder.tvDepartmentName.setText("Engineering");
        } else {
            viewHolder.tvDepartmentName.setText("business management");
        }


    }

    @Override
    public int getItemCount() {
        return complains.size();
    }

    class viewHolder extends RecyclerView.ViewHolder {

        @BindView(R.id.tv_type)
        TextView tvType;
        @BindView(R.id.tv_topic)
        TextView tvTopic;
        @BindView(R.id.tv_description)
        TextView tvDescription;
        @BindView(R.id.tv_department)
        TextView tvDepartmentName;

        public viewHolder(@NonNull View itemView) {
            super(itemView);
            ButterKnife.bind(this, itemView);
        }
    }


}
