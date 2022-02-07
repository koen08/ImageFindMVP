package com.example.imagefindmvp.domain.usecase

import com.example.imagefindmvp.domain.models.ImageDao
import com.example.imagefindmvp.domain.service.ImageService
import javax.inject.Inject

class GetImageByName @Inject constructor(private val imageService: ImageService) {
    fun get(name: String): List<ImageDao> {
        return imageService.get(name)
    }
}