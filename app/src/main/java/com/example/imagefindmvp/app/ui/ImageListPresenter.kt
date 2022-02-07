package com.example.imagefindmvp.app.ui

import com.example.imagefindmvp.domain.models.ImageDao
import com.example.imagefindmvp.domain.usecase.GetImageByName
import javax.inject.Inject

class ImageListPresenter @Inject constructor(
    val getImageByName: GetImageByName
) :
    AbstractPresenter<ImageListContract.View>(),
    ImageListContract.Presenter {
    override fun getImageListByName(name: String) {
        val result = getImageByName.get(name)
        setImageListToRecycleView(result)
    }

    override fun setImageListToRecycleView(imageList: List<ImageDao>) {
        view?.glideImageList(imageList)
    }
}