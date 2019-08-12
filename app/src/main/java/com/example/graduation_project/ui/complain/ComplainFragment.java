package com.example.graduation_project.ui.complain;


import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Spinner;
import android.widget.Toast;

import com.example.graduation_project.R;
import com.example.graduation_project.callBack.ComplainCallBack;
import com.example.graduation_project.callBack.ComplainCallBackRetrofit;
import com.example.graduation_project.data.remote.ApiCall;
import com.example.graduation_project.model.Complain.Complain;
import com.example.graduation_project.model.sql.DataBaseUserHelper;
import com.example.graduation_project.model.sql.userSql;

import java.util.List;

import butterknife.BindView;
import butterknife.ButterKnife;
import butterknife.Unbinder;

/**
 * A simple {@link Fragment} subclass.
 */
public class ComplainFragment extends Fragment implements View.OnClickListener {


    String dep, type, topic, desc;
    private DataBaseUserHelper dataBaseCartHelper;
    private List<userSql> list;
    @BindView(R.id.spinner_depart)
    Spinner spinnerDepart;
    @BindView(R.id.spinner_type)
    Spinner spinnerType;
    @BindView(R.id.ed_problem_topic)
    EditText edProblemTopic;
    @BindView(R.id.ed_problem_dec)
    EditText edProblemDec;
    @BindView(R.id.bu_suggestion_send)
    Button buSuggestionSend;

    Unbinder unbinder;

    public ComplainFragment() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View view = inflater.inflate(R.layout.fragment_blank, container, false);
        unbinder = ButterKnife.bind(this, view);

        //DataBase
        dataBaseCartHelper = new DataBaseUserHelper(getActivity());
        list = dataBaseCartHelper.getAllRecord();

        buSuggestionSend.setOnClickListener(this);


        return view;
    }

    @Override
    public void onDestroyView() {
        super.onDestroyView();
        unbinder.unbind();
    }

    @Override
    public void onClick(View view) {
        dep = list.get(0).getUserDeptID();
        type = spinnerType.getSelectedItem().toString();
        topic = edProblemTopic.getText().toString();
        desc = edProblemDec.getText().toString();

        int departID = Integer.parseInt(list.get(0).getUserDeptID());

//        ApiCall.makeComplain(dep, type, topic, desc, list.get(0).getToken(), new ComplainCallBack() {
//            @Override
//            public void onError(String msg) {
//                Toast.makeText(getContext(), "Error >> " + msg, Toast.LENGTH_SHORT).show();
//                Log.d("Error Complin", msg);
//
//            }
//
//            @Override
//            public void onSecuess(Complain complain) {
//                Toast.makeText(getContext(), " " + complain.getData().isSuccessful(), Toast.LENGTH_SHORT).show();
//            }
//        });


        ApiCall.Complain(departID, type, topic, desc, list.get(0).getToken(), new ComplainCallBackRetrofit() {
            @Override
            public void onError(String msg) {
                Toast.makeText(getContext(), "Error >> " + msg, Toast.LENGTH_SHORT).show();

        }

            @Override
            public void onSecuess(String complain) {
                Toast.makeText(getContext(), " Your Complain is send" , Toast.LENGTH_SHORT).show();
                edProblemTopic.setText("");
                edProblemDec.setText("");
            }
        });


    }
}
