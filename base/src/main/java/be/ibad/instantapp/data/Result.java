package be.ibad.instantapp.data;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

/**
 * Created by nvandamme on 19-07-17.
 * All right reserved for Immoweb InstantAppPOC
 */

public class Result {

    @SerializedName("status")
    @Expose
    private String status;
    @SerializedName("post")
    @Expose
    private Post post;

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public Post getPost() {
        return post;
    }

    public void setPost(Post post) {
        this.post = post;
    }

}