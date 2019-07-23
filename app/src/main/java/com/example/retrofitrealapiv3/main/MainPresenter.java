package com.example.retrofitrealapiv3.main;

import android.util.Log;

import com.example.retrofitrealapiv3.ApiFatchHandle.User;
import com.example.retrofitrealapiv3.JsonApi.JsonApi;
import com.example.retrofitrealapiv3.JsonApi.ServiceGenerator;

import java.util.List;

import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;

public class MainPresenter implements MainContract.Presenter {

    private MainContract.View mView;

    public MainPresenter(MainContract.View mView) {
        this.mView = mView;
    }

    @Override
    public void getUsers() {
        JsonApi api = ServiceGenerator.createService(JsonApi.class);

        api.getPosts().enqueue(new Callback<List<User>>() {
            @Override
            public void onResponse(Call<List<User>> call, Response<List<User>> response) {
                if(response.isSuccessful()){
                    Log.d("GGGGGGG",response.body().size()+"");
                    mView.showToast("User Found "+response.body().size());
                }
            }

            @Override
            public void onFailure(Call<List<User>> call, Throwable throwable) {
                mView.showToast("Error");
            }
        });
    }
}
