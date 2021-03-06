package com.mobileoid2.celltone.network.model.treadingMedia;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

import java.io.Serializable;
import java.util.List;

public class Song  implements Serializable{
    private int isAudio =0;
    private String type ="";

    @SerializedName("genre")
    @Expose
    private List<Object> genre = null;
    @SerializedName("category")
    @Expose
    private List<Object> category = null;
    @SerializedName("setCount")
    @Expose
    private Integer setCount;
    @SerializedName("active")
    @Expose
    private Boolean active;
    @SerializedName("deleted")
    @Expose
    private Boolean deleted;
    @SerializedName("_id")
    @Expose
    private String id;
    @SerializedName("title")
    @Expose
    private String title;
    @SerializedName("contentType")
    @Expose
    private String contentType;
    @SerializedName("artistName")
    @Expose
    private String artistName;
    @SerializedName("createdAt")
    @Expose
    private String createdAt;
    @SerializedName("updatedAt")
    @Expose
    private String updatedAt;
    @SerializedName("__v")
    @Expose
    private Integer v;
    @SerializedName("clipArtUrl")
    @Expose
    private String clipArtUrl;
    @SerializedName("originalFileUrl")
    @Expose
    private String originalFileUrl;
    @SerializedName("sampleFileUrl")
    @Expose
    private String sampleFileUrl;

    public List<Object> getGenre() {
        return genre;
    }

    public void setGenre(List<Object> genre) {
        this.genre = genre;
    }

    public List<Object> getCategory() {
        return category;
    }

    public void setCategory(List<Object> category) {
        this.category = category;
    }

    public Integer getSetCount() {
        return setCount;
    }

    public void setSetCount(Integer setCount) {
        this.setCount = setCount;
    }

    public Boolean getActive() {
        return active;
    }

    public void setActive(Boolean active) {
        this.active = active;
    }

    public Boolean getDeleted() {
        return deleted;
    }

    public void setDeleted(Boolean deleted) {
        this.deleted = deleted;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getContentType() {
        return contentType;
    }

    public void setContentType(String contentType) {
        this.contentType = contentType;
    }

    public String getArtistName() {
        return artistName;
    }

    public void setArtistName(String artistName) {
        this.artistName = artistName;
    }

    public String getCreatedAt() {
        return createdAt;
    }

    public void setCreatedAt(String createdAt) {
        this.createdAt = createdAt;
    }

    public String getUpdatedAt() {
        return updatedAt;
    }

    public void setUpdatedAt(String updatedAt) {
        this.updatedAt = updatedAt;
    }

    public Integer getV() {
        return v;
    }

    public void setV(Integer v) {
        this.v = v;
    }

    public String getClipArtUrl() {
        return clipArtUrl;
    }

    public void setClipArtUrl(String clipArtUrl) {
        this.clipArtUrl = clipArtUrl;
    }

    public String getOriginalFileUrl() {
        return originalFileUrl;
    }

    public void setOriginalFileUrl(String originalFileUrl) {
        this.originalFileUrl = originalFileUrl;
    }

    public String getSampleFileUrl() {
        return sampleFileUrl;
    }

    public void setSampleFileUrl(String sampleFileUrl) {
        this.sampleFileUrl = sampleFileUrl;
    }

    public int getIsAudio() {
        return isAudio;
    }

    public void setIsAudio(int isAudio) {
        this.isAudio = isAudio;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }
}
