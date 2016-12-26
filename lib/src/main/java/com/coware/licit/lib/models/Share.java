package com.coware.licit.lib.models;

import com.coware.licit.lib.models.Enums.Permission;
import com.google.gson.annotations.SerializedName;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by bolorundurowb on 12/23/16.
 */

public class Share {
    @SerializedName("_id")
    private String UserId;

    @SerializedName("permissions")
    private List<Permission> Permissions = new ArrayList();

    public Share(List<Permission> permissions, String userId) {
        Permissions = permissions;
        UserId = userId;
    }

    public String getUserId() {
        return UserId;
    }

    public void setUserId(String userId) {
        UserId = userId;
    }

    public List<Permission> getPermissions() {
        return Permissions;
    }

    public void setPermissions(List<Permission> permissions) {
        Permissions = permissions;
    }
}
