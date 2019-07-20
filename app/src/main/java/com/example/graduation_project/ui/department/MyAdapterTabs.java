package com.example.graduation_project.ui.department;

import android.content.Context;
import android.support.annotation.NonNull;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import android.widget.TextView;
import android.widget.Toast;

import com.example.graduation_project.R;

import java.util.List;

import butterknife.BindView;
import butterknife.ButterKnife;

public class MyAdapterTabs extends RecyclerView.Adapter<MyAdapterTabs.MyHolder> {

    Context context;
    List<String> list;

    public MyAdapterTabs(Context context, List<String> list) {
        this.context = context;
        this.list = list;
    }

    @NonNull
    @Override
    public MyHolder onCreateViewHolder(@NonNull ViewGroup viewGroup, int i) {
        View view = LayoutInflater.from(viewGroup.getContext()).inflate(R.layout.item_doctor, viewGroup, false);
        return new MyHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull MyHolder myHolder, int i) {

        myHolder.tvDocName.setText(list.get(i));

    }

    @Override
    public int getItemCount() {
        return list.size();
    }

    public class MyHolder extends RecyclerView.ViewHolder {
        @BindView(R.id.tv_doc_name)
        TextView tvDocName;
        @BindView(R.id.tv_doc_average)
        TextView tvDocAverage;
        @BindView(R.id.lay_doc)
        LinearLayout layDoc;

        public MyHolder(@NonNull final View itemView) {
            super(itemView);
            ButterKnife.bind(this, itemView);
            layDoc.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View view) {
                    Toast.makeText(context, " >_< " + list.get(getLayoutPosition()) + "  " + getLayoutPosition(), Toast.LENGTH_SHORT).show();
                }
            });
        }
    }
}
