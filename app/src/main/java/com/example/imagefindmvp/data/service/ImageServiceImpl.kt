package com.example.imagefindmvp.data.service

import com.example.imagefindmvp.data.api.ImageApi
import com.example.imagefindmvp.domain.models.ImageDao
import com.example.imagefindmvp.domain.service.ImageService
import javax.inject.Inject

class ImageServiceImpl @Inject constructor(val imageApi: ImageApi) : ImageService {
    override fun get(name: String): List<ImageDao> {
        /*imageApi.getImageList("21810552-7c96cc705e047c7f3d35a1017", "car", "photo")
            .subscribeOn(Schedulers.io())
            //  .delay(10, TimeUnit.SECONDS)
            .observeOn(AndroidSchedulers.mainThread())
            .subscribe({
            }, {

            })*/
        return emptyList()
    }
}