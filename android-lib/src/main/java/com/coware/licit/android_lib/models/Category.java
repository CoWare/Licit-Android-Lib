package com.coware.licit.android_lib.models;

import java.util.List;

/**
 * Created by bolorundurowb on 12/23/16.
 */

public class Category {
    private String Name;
    private String CategoryId;
    private List<String> DocumentIds;
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
