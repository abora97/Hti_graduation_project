package com.example.graduation_project.ui.login;

import java.util.List;

public interface LoginContract {
    /**
     * Call when user interact with the view and other when view OnDestroy()
     * */
    interface presenter{

        void onDestroy();

//        void onRefreshButtonClick();

        void requestDataFromServer(String id,String password);

    }
    /**
     * showProgress() and hideProgress() would be used for displaying and hiding the progressBar
     * while the setDataToRecyclerView and onResponseFailure is fetched from the GetNoticeInteractorImpl class
     **/
    interface MainView {
//
//        void showProgress();
//
//        void hideProgress();
//
//        void setDataToRecyclerView(ArrayList<Notice> noticeArrayList);
//
//        void onResponseFailure(Throwable throwable);

        void getToken(String token);
        void getError(String msg);

    }
}
