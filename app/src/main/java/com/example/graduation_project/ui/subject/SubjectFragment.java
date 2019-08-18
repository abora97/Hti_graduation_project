package com.example.graduation_project.ui.subject;


import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.support.v4.widget.SwipeRefreshLayout;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.LinearLayout;
import android.widget.TextView;
import android.widget.Toast;

import com.example.graduation_project.R;
import com.example.graduation_project.model.sql.DataBaseUserHelper;
import com.example.graduation_project.model.sql.userSql;
import com.example.graduation_project.model.subject.Subject;

import java.util.List;

import butterknife.BindView;
import butterknife.ButterKnife;
import butterknife.Unbinder;

/**
 * A simple {@link Fragment} subclass.
 */
public class SubjectFragment extends Fragment implements SubjectContract.viewMain, SwipeRefreshLayout.OnRefreshListener {
    RecyclerView rec_subject;
    Button bu_result;
    @BindView(R.id.rec_subject)
    RecyclerView recSubject;
    @BindView(R.id.swipe_subject)
    SwipeRefreshLayout swipeSubject;
    Unbinder unbinder;
    @BindView(R.id.tv_student_name)
    TextView tvStudentName;
    @BindView(R.id.tv_student_id)
    TextView tvStudentId;
    @BindView(R.id.tv_student_gpa)
    TextView tvStudentGpa;
    @BindView(R.id.tv_student_depart)
    TextView tvStudentDepart;
    @BindView(R.id.lay_content)
    LinearLayout layoutContent;

    private DataBaseUserHelper dataBaseCartHelper;
    private List<userSql> list;
    private SubjectPresenter subjectPresenter;
    private SubjectAdapter subjectAdapter;
    private RecyclerView.LayoutManager mLayoutManager;


    public SubjectFragment() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View view = inflater.inflate(R.layout.fragment_subject, container, false);
        unbinder = ButterKnife.bind(this, view);
        bu_result = view.findViewById(R.id.bu_result);

        subjectPresenter = new SubjectPresenter(this);

        swipeSubject.setOnRefreshListener(this);
        //DataBase
        dataBaseCartHelper = new DataBaseUserHelper(getActivity());
        list = dataBaseCartHelper.getAllRecord();
        loadSubject();

        return view;
    }


    private void loadSubject() {
        swipeSubject.setRefreshing(true);
        subjectPresenter.getSubject(list.get(0).getToken());

        tvStudentName.setText(list.get(0).getUserName());
        tvStudentGpa.setText(list.get(0).getUserGPA());
        tvStudentId.setText(String.valueOf(list.get(0).getUserId()));
        String deptID = list.get(0).getUserDeptID();


        if (deptID.equals("1")) {
            tvStudentDepart.setText(getString(R.string.cs));
        } else if (deptID.equals("2")) {
            tvStudentDepart.setText(getString(R.string.eng));
        } else if (deptID.equals("3")) {
            tvStudentDepart.setText(getString(R.string.man_en));

        } else {
            tvStudentDepart.setText(getString(R.string.man_ar));
        }

    }


    @Override
    public void showData(Subject subjects) {
        swipeSubject.setRefreshing(false);
        mLayoutManager = new LinearLayoutManager(getActivity(), LinearLayoutManager.VERTICAL, false);
        subjectAdapter = new SubjectAdapter(getActivity(), subjects.getData().getData().getSubjects());
        if (subjects.getData().getData().getSubjects().size() == 0) {
            //   rec_subject.setVisibility(View.INVISIBLE);
            layoutContent.setVisibility(View.GONE);
            bu_result.setVisibility(View.VISIBLE);
        }
        bu_result.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent moveBrowser = new Intent(Intent.ACTION_VIEW, Uri.parse("http://hti.edu.eg/en/student-login.aspx?res=noSe"));
                startActivity(moveBrowser);
            }
        });
        recSubject.setLayoutManager(mLayoutManager);

        recSubject.setAdapter(subjectAdapter);
    }

    @Override
    public void showError(String msg) {
        swipeSubject.setRefreshing(false);
        Toast.makeText(getActivity(), "Error : " + msg, Toast.LENGTH_SHORT).show();
    }

    @Override
    public void onDestroyView() {
        super.onDestroyView();
        unbinder.unbind();
    }

    @Override
    public void onRefresh() {
        loadSubject();
    }
}
