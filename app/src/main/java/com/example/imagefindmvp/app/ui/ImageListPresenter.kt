package com.example.imagefindmvp.app.ui

import com.example.imagefindmvp.domain.models.ImageDao

class ImageListPresenter(view: BaseView) :
    AbstractPresenter<ImageListContract.View>(view as ImageListContract.View),
    ImageListContract.Presenter {
    override fun getImageListByName(name: String) {
        val imageService = ImageListService(this)
        imageService.requestImageList(name)
    }

    override fun setImageListToRecycleView(imageList: List<ImageDao>) {
        view.glideImageList(imageList)
    }
}