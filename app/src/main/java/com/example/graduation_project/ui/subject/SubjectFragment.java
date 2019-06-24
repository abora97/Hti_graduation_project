package com.example.graduation_project.ui.subject;


import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.support.v4.widget.SwipeRefreshLayout;
import android.support.v7.widget.GridLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Toast;

import com.example.graduation_project.R;
import com.example.graduation_project.model.sql.DataBaseUserHelper;
import com.example.graduation_project.model.sql.userSql;
import com.example.graduation_project.model.subject.SubjectModel;

import java.util.List;

import butterknife.BindView;
import butterknife.ButterKnife;
import butterknife.Unbinder;

/**
 * A simple {@link Fragment} subclass.
 */
public class SubjectFragment extends Fragment implements SubjectContract.viewMain, SwipeRefreshLayout.OnRefreshListener {


    @BindView(R.id.rec_subject)
    RecyclerView recSubject;
    @BindView(R.id.swipe_subject)
    SwipeRefreshLayout swipeSubject;
    Unbinder unbinder;

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

        subjectPresenter=new SubjectPresenter(this);

        swipeSubject.setOnRefreshListener(this);
        //DataBase
        dataBaseCartHelper = new DataBaseUserHelper(getActivity());
        list = dataBaseCartHelper.getAllRecord();
        loadSubject();

        return view;
    }


    private void loadSubject(){
        swipeSubject.setRefreshing(true);
        subjectPresenter.getSubject(list.get(0).getToken());
    }


    @Override
    public void showData(SubjectModel subjects) {
        swipeSubject.setRefreshing(false);
        mLayoutManager = new GridLayoutManager(getActivity(), 2);
        subjectAdapter =new SubjectAdapter(getActivity(),subjects.getData().getData().getSubjects());
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
