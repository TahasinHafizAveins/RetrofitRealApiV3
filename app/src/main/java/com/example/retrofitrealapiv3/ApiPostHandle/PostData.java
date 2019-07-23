package com.example.retrofitrealapiv3.ApiPostHandle;

import com.google.gson.annotations.SerializedName;

public class PostData {

    private Integer _id;
    private String email;
    private String name;
    private String contact;
    private String address;



    @SerializedName("body")
    private String text;

    public PostData(String email,String name,String contact,String address) {

        this.email = email;
        this.name = name;
        this.contact = contact;
        this.address = address;

    }

    public Integer get_id() {
        return _id;
    }

    public String getEmail() {
        return email;
    }

    public String getName() {
        return name;
    }

    public String getContact() {
        return contact;
    }

    public String getAddress() {
        return address;
    }
}
