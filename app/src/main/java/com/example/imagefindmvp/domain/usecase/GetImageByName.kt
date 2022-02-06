package com.example.imagefindmvp.domain.usecase

import com.example.imagefindmvp.domain.models.ImageDao
import com.example.imagefindmvp.domain.service.ImageService

class GetImageByName(private val imageService: ImageService) {
    fun get(name: String): List<ImageDao> {
        return imageService.get(name)
    }
}