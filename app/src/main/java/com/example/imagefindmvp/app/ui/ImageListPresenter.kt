package com.example.imagefindmvp.app.ui

import com.example.imagefindmvp.domain.models.ImageDao

class ImageListPresenter(private val imageService: ImageService) :
    AbstractPresenter<ImageListContract.View>(),
    ImageListContract.Presenter {
    override fun getImageListByName(name: String) {
        imageService.attach(this)
        imageService.requestImageList(name)
    }

    override fun setImageListToRecycleView(imageList: List<ImageDao>) {
        view.glideImageList(imageList)
    }
}