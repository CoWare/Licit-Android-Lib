package com.coware.licit.lib.models;

import com.coware.licit.lib.models.Enums.DocumentType;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by bolorundurowb on 12/23/16.
 */

public class Document {
    private String Name;
    private String DocumentId;
    private String OwnerId;
    private List<Category> Categories = new ArrayList();
    private DocumentType Type;
    private List<Share> Shared = new ArrayList();
    private String TimeCreated;

    public Document(String name, String documentId, String ownerId, List<Category> categories, DocumentType type, List<Share> shared, String timeCreated) {
        Name = name;
        DocumentId = documentId;
        OwnerId = ownerId;
        Categories = categories;
        Type = type;
        Shared = shared;
        TimeCreated = timeCreated;
    }

    public String getName() {
        return Name;
    }

    public void setName(String name) {
        Name = name;
    }

    public String getDocumentId() {
        return DocumentId;
    }

    public void setDocumentId(String documentId) {
        DocumentId = documentId;
    }

    public String getOwnerId() {
        return OwnerId;
    }

    public void setOwnerId(String ownerId) {
        OwnerId = ownerId;
    }

    public List<Category> getCategories() {
        return Categories;
    }

    public void setCategories(List<Category> categories) {
        Categories = categories;
    }

    public DocumentType getType() {
        return Type;
    }

    public void setType(DocumentType type) {
        Type = type;
    }

    public List<Share> getShared() {
        return Shared;
    }

    public void setShared(List<Share> shared) {
        Shared = shared;
    }

    public String getTimeCreated() {
        return TimeCreated;
    }

    public void setTimeCreated(String timeCreated) {
        TimeCreated = timeCreated;
    }
}
