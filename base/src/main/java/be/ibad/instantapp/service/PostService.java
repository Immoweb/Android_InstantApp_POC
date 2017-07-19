package be.ibad.instantapp.service;

import android.support.annotation.NonNull;
import android.util.Log;

import com.google.gson.GsonBuilder;

import be.ibad.instantapp.data.Post;
import be.ibad.instantapp.data.Result;
import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;
import retrofit2.Retrofit;
import retrofit2.converter.gson.GsonConverterFactory;

/**
 * Created by nvandamme on 19-07-17.
 * All right reserved for Immoweb InstantAppPOC
 */

public class PostService {

    private static final String TAG = "PostService";
    private static Post mResult;
    private static PostService sWordPressService;

    public static PostService getInstance() {
        if (sWordPressService == null) {
            sWordPressService = new PostService();
        }
        return sWordPressService;
    }

    public void getPostAsync(String postId, final PostCallback callback) {
        if (mResult == null) {
            new Retrofit.Builder()
                    .baseUrl(WordPressService.ENDPOINT)
                    .addConverterFactory(GsonConverterFactory.create(new GsonBuilder().create()))
                    .build()
                    .create(WordPressService.class)
                    .getPost(postId)
                    .enqueue(new Callback<Result>() {

                        @Override
                        public void onResponse(@NonNull Call<Result> call, @NonNull Response<Result> response) {
                            if (response.isSuccessful() && response.body() != null) {
                                mResult = response.body().getPost();
                                callback.success(mResult);
                            }
                        }

                        @Override
                        public void onFailure(@NonNull Call<Result> call, @NonNull Throwable t) {
                            callback.error();
                            Log.e(TAG, "Could not load post, " + t.getMessage());
                        }
                    });
        }
    }

    public interface PostCallback {
        void success(Post post);

        void error();
    }
}
