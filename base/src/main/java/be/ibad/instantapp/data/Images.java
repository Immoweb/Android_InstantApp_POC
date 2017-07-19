package be.ibad.instantapp.data;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

/**
 * Created by nvandamme on 19-07-17.
 * All right reserved for Immoweb InstantAppPOC
 */

public class Images {

    @SerializedName("full")
    @Expose
    private ImageData full;
    @SerializedName("thumbnail")
    @Expose
    private ImageData thumbnail;
    @SerializedName("medium")
    @Expose
    private ImageData medium;
    @SerializedName("medium_large")
    @Expose
    private ImageData mediumLarge;
    @SerializedName("large")
    @Expose
    private ImageData large;
    @SerializedName("tc-thumb")
    @Expose
    private ImageData tcThumb;
    @SerializedName("slider-full")
    @Expose
    private ImageData sliderFull;
    @SerializedName("slider")
    @Expose
    private ImageData slider;
    @SerializedName("tc-grid-full")
    @Expose
    private ImageData tcGridFull;
    @SerializedName("tc-grid")
    @Expose
    private ImageData tcGrid;

    public ImageData getFull() {
        return full;
    }

    public void setFull(ImageData full) {
        this.full = full;
    }

    public ImageData getThumbnail() {
        return thumbnail;
    }

    public void setThumbnail(ImageData thumbnail) {
        this.thumbnail = thumbnail;
    }

    public ImageData getMedium() {
        return medium;
    }

    public void setMedium(ImageData medium) {
        this.medium = medium;
    }

    public ImageData getMediumLarge() {
        return mediumLarge;
    }

    public void setMediumLarge(ImageData mediumLarge) {
        this.mediumLarge = mediumLarge;
    }

    public ImageData getLarge() {
        return large;
    }

    public void setLarge(ImageData large) {
        this.large = large;
    }

    public ImageData getTcThumb() {
        return tcThumb;
    }

    public void setTcThumb(ImageData tcThumb) {
        this.tcThumb = tcThumb;
    }

    public ImageData getSliderFull() {
        return sliderFull;
    }

    public void setSliderFull(ImageData sliderFull) {
        this.sliderFull = sliderFull;
    }

    public ImageData getSlider() {
        return slider;
    }

    public void setSlider(ImageData slider) {
        this.slider = slider;
    }

    public ImageData getTcGridFull() {
        return tcGridFull;
    }

    public void setTcGridFull(ImageData tcGridFull) {
        this.tcGridFull = tcGridFull;
    }

    public ImageData getTcGrid() {
        return tcGrid;
    }

    public void setTcGrid(ImageData tcGrid) {
        this.tcGrid = tcGrid;
    }

}
