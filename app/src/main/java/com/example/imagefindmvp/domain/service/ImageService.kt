package com.example.imagefindmvp.domain.service

import com.example.imagefindmvp.data.models.ImageListNet
import io.reactivex.rxjava3.core.Single

interface ImageService {
    fun get(name: String): Single<ImageListNet>
}