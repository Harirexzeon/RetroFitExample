package com.mmadapps.retrofitexample;

/**
 * Created by gangadhar.g on 9/7/2015.
 */
import retrofit.http.GET;
import retrofit.http.Query;


public interface IApiMethods {

    @GET("/get/curators.json")
    Curator getCurators(
            @Query("AIzaSyAar7l96ITXqBev38GgFvC27RzBywPI_Yo") String key
    );
}
