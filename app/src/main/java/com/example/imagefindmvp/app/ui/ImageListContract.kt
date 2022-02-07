package com.example.imagefindmvp.app.ui

import com.example.imagefindmvp.domain.models.ImageDao

interface ImageListContract {
    interface View : BaseView {
        fun glideImageList(imageList: List<ImageDao>)
    }

    interface Presenter : BasePresenter<View> {
        fun getImageListByName(name: String)
        fun setImageListToRecycleView(imageList: List<ImageDao>)
    }
}