package com.example.retrofitrealapiv3.main;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.TextView;
import android.widget.Toast;

import com.example.retrofitrealapiv3.JsonApi.JsonApi;
import com.example.retrofitrealapiv3.R;

public class MainActivity extends AppCompatActivity implements MainContract.View {

    private TextView textView;

    private JsonApi jsonApi;

    private MainPresenter mPresenter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);



        textView = (TextView)findViewById(R.id.text_view_result);

        mPresenter = new MainPresenter(this);

        mPresenter.getUsers();


    }

    @Override
    public void showToast(String message) {
        Toast.makeText(this, message, Toast.LENGTH_SHORT).show();
        textView.setText(message);
    }



    /*private void createPost() {

       // PostData postData = new PostData(23,"aveins@gmail.com","aveins","01476621141","Savar,Dhaka");

        Call <PostData> call = jsonApi.createPost("aveins@gmail.com","aveins","01476621141","Savar,Dhaka");


        call.enqueue(new Callback<PostData>() {
            @SuppressLint("SetTextI18n")
            @Override
            public void onResponse(Call<PostData> call, Response<PostData> response) {

                if (!response.isSuccessful())
                {
                    textView.setText("Code :"+ response.code());
                    return;
                }

                PostData postResponse = response.body();

                String content = "";
                content +="Code: "+response.code()+"\n";
                content +="Name: "+postResponse.getName() + "\n";
                content +="Email: "+postResponse.getEmail() + "\n";
                content +="Contact: "+postResponse.getContact() + "\n";
                content +="Address: "+postResponse.getAddress() + "\n\n";
                textView.setText(content);

            }

            @Override
            public void onFailure(Call<PostData> call, Throwable throwable) {
                textView.setText(throwable.getMessage());
            }
        });
    }

    private void getPost() {

            // Call<List<User>> call = jsonApi.getPosts(parameters); //sort null, order null
            Call<List<User>> call = jsonApi.getPosts();

            call.enqueue(new Callback<List<User>>() {
                @SuppressLint("SetTextI18n")
                @Override
                public void onResponse(Call<List<User>> call, Response<List<User>> response) {
                    if (!response.isSuccessful())
                    {
                        textView.setText("Code :"+ response.code());
                        return;
                    }

                    List<User> posts = response.body();
                    for (User post : posts)
                    {
                        String content = "";
                        content +="Name: "+post.getName() + "\n";
                        content +="Email: "+post.getEmail() + "\n";
                        content +="Contact: "+post.getContact() + "\n";
                        content +="Address: "+post.getAddress() + "\n\n";
                        textView.append(content);
                    }
                }

                @Override
                public void onFailure(Call<List<User>> call, Throwable throwable) {

                    textView.setText(throwable.getMessage());
                }
            });
        }*/
}
