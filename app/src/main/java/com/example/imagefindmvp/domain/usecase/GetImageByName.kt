package com.example.imagefindmvp.domain.usecase

import com.example.imagefindmvp.data.models.ImageListNet
import com.example.imagefindmvp.domain.models.ImageDao
import com.example.imagefindmvp.domain.models.ImageList
import com.example.imagefindmvp.domain.service.ImageService
import io.reactivex.rxjava3.core.Single
import javax.inject.Inject

class GetImageByName @Inject constructor(private val imageService: ImageService) {
    fun get(name: String): Single<ImageListNet> {
        return imageService.get(name)
    }
}