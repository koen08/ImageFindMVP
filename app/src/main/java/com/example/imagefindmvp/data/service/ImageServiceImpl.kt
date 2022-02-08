package com.example.imagefindmvp.data.service

import com.example.imagefindmvp.data.models.ImageListNet
import com.example.imagefindmvp.data.network.ImageListNetwork
import com.example.imagefindmvp.domain.models.ImageDao
import com.example.imagefindmvp.domain.models.ImageList
import com.example.imagefindmvp.domain.service.ImageService
import io.reactivex.rxjava3.core.Single
import javax.inject.Inject

class ImageServiceImpl @Inject constructor(private val imageListNetwork: ImageListNetwork) : ImageService {
    override fun get(name: String): Single<ImageListNet> {
        return imageListNetwork.getImageList(name)
    }
}