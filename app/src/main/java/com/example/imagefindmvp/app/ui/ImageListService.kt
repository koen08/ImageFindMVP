package com.example.imagefindmvp.app.ui

class ImageListService constructor(presenter: BasePresenter<*>) :
    AbstractService<ImageListContract.Presenter>(presenter as ImageListContract.Presenter),
    ImageListContract.Service {
    override fun requestImageList(name: String) {
        TODO("Not yet implemented")
    }
}