package com.example.imagefindmvp.domain.service

import com.example.imagefindmvp.data.models.ImageListNet
import com.example.imagefindmvp.domain.models.ImageDao
import com.example.imagefindmvp.domain.models.ImageList
import io.reactivex.rxjava3.core.Single

interface ImageService {
    fun get(name: String): Single<ImageListNet>
}