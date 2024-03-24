

package com.example.exoplayer;

import retrofit2.Call;
import retrofit2.http.GET;

import java.util.List;


public interface ApiService {
    @GET("showAllVideos")
    Call<List<Video>> getAllVideos(); // Corrected to return Call<List<Video>>
}
