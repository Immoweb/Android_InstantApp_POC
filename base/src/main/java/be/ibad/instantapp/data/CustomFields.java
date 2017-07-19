package be.ibad.instantapp.data;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

import java.util.List;

/**
 * Created by nvandamme on 19-07-17.
 * All right reserved for Immoweb InstantAppPOC
 */

public class CustomFields {

    @SerializedName("tc-thumb-fld")
    @Expose
    private List<String> tcThumbFld = null;
    @SerializedName("layout_key")
    @Expose
    private List<String> layoutKey = null;
    @SerializedName("post_slider_check_key")
    @Expose
    private List<String> postSliderCheckKey = null;

    public List<String> getTcThumbFld() {
        return tcThumbFld;
    }

    public void setTcThumbFld(List<String> tcThumbFld) {
        this.tcThumbFld = tcThumbFld;
    }

    public List<String> getLayoutKey() {
        return layoutKey;
    }

    public void setLayoutKey(List<String> layoutKey) {
        this.layoutKey = layoutKey;
    }

    public List<String> getPostSliderCheckKey() {
        return postSliderCheckKey;
    }

    public void setPostSliderCheckKey(List<String> postSliderCheckKey) {
        this.postSliderCheckKey = postSliderCheckKey;
    }

}