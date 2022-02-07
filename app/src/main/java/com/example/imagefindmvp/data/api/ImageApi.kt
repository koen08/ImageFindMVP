package com.example.imagefindmvp.data.api

import com.example.imagefindmvp.data.models.ImageList
import io.reactivex.rxjava3.core.Observable
import retrofit2.http.GET
import retrofit2.http.Query

interface ImageApi {
    @GET("/api/")
    fun getImageList(
        @Query("key") key: String,
        @Query("q") param: String,
        @Query("image_type") imageType: String
    ): Observable<ImageList>
}