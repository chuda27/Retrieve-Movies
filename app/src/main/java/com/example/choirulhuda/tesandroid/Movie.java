package com.example.choirulhuda.tesandroid;

/**
 * Created by choirul.huda on 8/9/2017.
 */

public class Movie {
    private String title;
    private String subtitle;
    private String minutes;
    private String status;
    private String genre;
    private String category;
    private double rating;
    private String releaseDate;
    private String overview;
    private String prodCompany;
    private String prodCountries;
    private int background;
    private int profile;

    public Movie(String title, String subtitle, String minutes, String status, String genre, String category, double rating, String releaseDate, String overview, String prodCompany, String prodCountries, int background, int profile) {
        this.title = title;
        this.subtitle = subtitle;
        this.minutes = minutes;
        this.status = status;
        this.genre = genre;
        this.category = category;
        this.rating = rating;
        this.releaseDate = releaseDate;
        this.overview = overview;
        this.prodCompany = prodCompany;
        this.prodCountries = prodCountries;
        this.background = background;
        this.profile = profile;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getSubtitle() {
        return subtitle;
    }

    public void setSubtitle(String subtitle) {
        this.subtitle = subtitle;
    }

    public String getMinutes() {
        return minutes;
    }

    public void setMinutes(String minutes) {
        this.minutes = minutes;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public String getCategory() {
        return category;
    }

    public void setCategory(String category) {
        this.category = category;
    }

    public double getRating() {
        return rating;
    }

    public void setRating(double rating) {
        this.rating = rating;
    }

    public String getReleaseDate() {
        return releaseDate;
    }

    public void setReleaseDate(String releaseDate) {
        this.releaseDate = releaseDate;
    }

    public String getOverview() {
        return overview;
    }

    public void setOverview(String overview) {
        this.overview = overview;
    }

    public String getProdCompany() {
        return prodCompany;
    }

    public void setProdCompany(String prodCompany) {
        this.prodCompany = prodCompany;
    }

    public String getProdCountries() {
        return prodCountries;
    }

    public void setProdCountries(String prodCountries) {
        this.prodCountries = prodCountries;
    }

    public int getBackground() {
        return background;
    }

    public void setBackground(int background) {
        this.background = background;
    }

    public int getProfile() {
        return profile;
    }

    public void setProfile(int profile) {
        this.profile = profile;
    }

    public String getGenre() {
        return genre;
    }

    public void setGenre(String genre) {
        this.genre = genre;
    }
}
