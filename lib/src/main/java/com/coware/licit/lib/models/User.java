package com.coware.licit.lib.models;

import com.coware.licit.lib.models.Enums.UserType;

import java.util.List;

/**
 * Created by bolorundurowb on 12/23/16.
 */

public class User {

    private String Username;
    private String Email;
    private String Password;
    private String UserId;
    private List<Document> Documents;
    private UserType UserType;

    public String getUsername() {
        return Username;
    }

    public void setUsername(String username) {
        Username = username;
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
