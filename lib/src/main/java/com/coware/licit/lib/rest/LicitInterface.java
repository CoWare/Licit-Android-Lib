package com.coware.licit.lib.rest;

import com.coware.licit.lib.models.Category;
import com.coware.licit.lib.models.Document;
import com.coware.licit.lib.models.Login;
import com.coware.licit.lib.models.Register;
import com.coware.licit.lib.models.User;
import com.coware.licit.lib.responses.Categories;
import com.coware.licit.lib.responses.Documents;
import com.coware.licit.lib.responses.Token;
import com.coware.licit.lib.responses.Users;

import retrofit2.Call;
import retrofit2.http.Body;
import retrofit2.http.DELETE;
import retrofit2.http.GET;
import retrofit2.http.POST;
import retrofit2.http.PUT;
import retrofit2.http.Path;

/**
 * Created by bolorundurowb on 12/29/16.
 */

public interface LicitInterface {
    /*Authentication Routes*/
    @POST("auth/signin")
    Call<Token> signin(@Body Login loginDetails);

    @POST("auth/signout")
    Call<String> signout();

    @POST("auth/signup")
    Call<User> signup(@Body Register register);

    /*Category Routes*/
    @GET("categories")
    Call<Categories> getCategories();

    @GET("categories/{id}")
    Call<Category> getCategory(@Path("id") String id);

    /*Document Routes*/
    @GET("documents")
    Call<Documents> getDocuments();

    @GET("documents/{id}")
    Call<Document> getDocuments(@Path("id") String id);

    @POST("documents")
    Call<Document> createDocument(@Body Document document);

    @PUT("documents/{id}")
    Call<Document> updateDocument(@Body Document document);

    @DELETE("documents/{id}")
    Call<Boolean> deleteDocument(@Path("id") String id);

    /*User Routes*/
    @GET("users")
    Call<Users> getUsers();

    @GET("users/{id}")
    Call<User> getUsers(@Path("id") String id);

    @PUT("users/{id}")
    Call<User> updateUser(@Body User user);

    @DELETE("users/{id}")
    Call<Boolean> deleteUser(@Path("id") String id);

    /*Users Documents*/

}
