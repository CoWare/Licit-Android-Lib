package com.coware.licit.lib.models;

import com.coware.licit.lib.models.Enums.UserType;
import com.google.gson.annotations.SerializedName;

import java.util.List;

/**
 * Created by bolorundurowb on 12/23/16.
 */

public class User {
    @SerializedName("username")
    private String Name;

    @SerializedName("email")
    private String Email;

    @SerializedName("password")
    private String Password;

    @SerializedName("_id")
    private String UserId;

    @SerializedName("documents")
    private List<Document> Documents;

    @SerializedName("type")
    private UserType UserType;

    public User(String name, String email, String password, String userId, List<Document> documents, com.coware.licit.lib.models.Enums.UserType userType) {
        Name = name;
        Email = email;
        Password = password;
        UserId = userId;
        Documents = documents;
        UserType = userType;
    }

    public String getName() {
        return Name;
    }

    public void setName(String name) {
        Name = name;
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
        Password = password;
    }

    public String getUserId() {
        return UserId;
    }

    public void setUserId(String userId) {
        UserId = userId;
    }

    public List<Document> getDocuments() {
        return Documents;
    }

    public void setDocuments(List<Document> documents) {
        Documents = documents;
    }

    public UserType getUserType() {
        return UserType;
    }

    public void setUserType(UserType userType) {
        UserType = userType;
    }
}
