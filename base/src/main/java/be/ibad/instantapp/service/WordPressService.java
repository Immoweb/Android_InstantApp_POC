package be.ibad.instantapp.service;

import be.ibad.instantapp.data.Result;
import retrofit2.Call;
import retrofit2.http.GET;
import retrofit2.http.Query;

/**
 * Created by nvandamme on 19-07-17.
 * All right reserved for Immoweb InstantAppPOC
 */

public interface WordPressService {

    String ENDPOINT = "https://ibad.be/";

    @GET("api/get_post")
    Call<Result> getPost(@Query("id") String nbr);

}
