package com.example.imagefindmvp.app.ui

import android.util.Log
import com.example.imagefindmvp.data.models.ImageListNet
import com.example.imagefindmvp.domain.models.ImageDao
import com.example.imagefindmvp.domain.models.ImageList
import com.example.imagefindmvp.domain.usecase.GetImageByName
import io.reactivex.rxjava3.android.schedulers.AndroidSchedulers
import io.reactivex.rxjava3.disposables.Disposable
import io.reactivex.rxjava3.schedulers.Schedulers
import javax.inject.Inject

class ImageListPresenter @Inject constructor(
    private val getImageByName: GetImageByName
) :
    AbstractPresenter<ImageListContract.View>(),
    ImageListContract.Presenter {
    private var dispos : Disposable? = null

    override fun getImageListByName(name: String) {
        val result = getImageByName.get(name)
        dispos = result.subscribeOn(Schedulers.io())
            .observeOn(AndroidSchedulers.mainThread())
            .subscribe({
                val imageList = networkDaoToImageDomain(it)
                setImageListToRecycleView(imageList.hits)
            }, {
                Log.e("AAA", it.localizedMessage!!)
            })
    }

    private fun networkDaoToImageDomain(imageListNet: ImageListNet): ImageList {
        val imageList = ImageList(ArrayList())
        for (imageDao in imageListNet.hits) {
            imageList.hits.add(ImageDao(imageDao.id, imageDao.url))
        }
        return imageList
    }

    override fun setImageListToRecycleView(imageList: List<ImageDao>) {
        view?.glideImageList(imageList)
    }

    override fun onDestroy() {
        dispos?.dispose()
    }


}