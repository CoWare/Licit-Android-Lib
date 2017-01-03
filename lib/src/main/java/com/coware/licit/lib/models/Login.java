package com.coware.licit.lib.models;

import com.google.gson.annotations.SerializedName;

/**
 * Created by bolorundurowb on 1/3/17.
 */

public class Login {
    @SerializedName("email")
    private String Email;

    @SerializedName("Password")
    private String Password;

    public Login(String email, String password) {
        Email = email;
        Password = password;
    }

    public String getEmail() {
        return Email;
    }

    public void setEmail(String email) {
        Email = email;
    }

    public String getPassword() {
        return Password;
    }

    public void setPassword(String password) {
        this.Password = password;
    }
}
