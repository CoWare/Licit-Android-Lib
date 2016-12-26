package com.coware.licit.lib.models;

import com.google.gson.annotations.SerializedName;

import java.util.List;

/**
 * Created by bolorundurowb on 12/23/16.
 */

public class Category {
    @SerializedName("name")
    private String Name;

    @SerializedName("_id")
    private String CategoryId;

    @SerializedName("did")
    private List<String> DocumentIds;

    @SerializedName("timeCreated")
    private String Time;

    public Category(String name, String categoryId, List<String> documentIds, String time) {
        Name = name;
        CategoryId = categoryId;
        DocumentIds = documentIds;
        Time = time;
    }

    public String getName() {
        return Name;
    }

    public void setName(String name) {
        Name = name;
    }

    public String getCategoryId() {
        return CategoryId;
    }

    public void setCategoryId(String categoryId) {
        CategoryId = categoryId;
    }

    public List<String> getDocumentIds() {
        return DocumentIds;
    }

    public void setDocumentIds(List<String> documentIds) {
        DocumentIds = documentIds;
    }

    public String getTime() {
        return Time;
    }

    public void setTime(String time) {
        Time = time;
    }
}
