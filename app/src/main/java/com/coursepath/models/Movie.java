package com.coursepath.models;

import org.json.JSONException;
import org.json.JSONObject;
import org.parceler.Parcel;

@Parcel
public class Movie {
    private String title;
    private String overview;
    private String posterPath;
    private String backdropPath;
    private Double voteAverage;
    private String releaseDate;
    private Integer id;

    public Movie() {}

    public Movie(JSONObject object) throws JSONException {
        title = object.getString("title");
        overview = object.getString("overview");
        posterPath = object.getString("poster_path");
        backdropPath = object.getString("backdrop_path");
        voteAverage = object.getDouble("vote_average");
        releaseDate = object.getString("release_date");
        id = object.getInt("id");
    }

    public String getBackdropPath() { return backdropPath; }

    public String getTitle() {
        return title;
    }

    public String getOverview() {
        return overview;
    }

    public String getPosterPath() {
        return posterPath;
    }

    public Double getVoteAverage() { return voteAverage; }

    public String getReleaseDate() { return releaseDate; }

    public Integer getId() { return id; }
}
