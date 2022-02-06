package com.example.imagefindmvp.domain.service

import com.example.imagefindmvp.domain.models.ImageDao

interface ImageService {
    fun get(name: String): List<ImageDao>
}