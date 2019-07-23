package com.example.retrofitrealapiv3.main;

public interface MainContract {

    interface Presenter{
        void getUsers();
    }

    interface View{
        void showToast(String message);
    }
}
