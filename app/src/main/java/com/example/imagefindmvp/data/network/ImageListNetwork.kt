package com.example.imagefindmvp.data.network

import com.example.imagefindmvp.data.models.ImageListNet
import io.reactivex.rxjava3.core.Single

interface ImageListNetwork {
    fun getImageList(name: String) : Single<ImageListNet>
}