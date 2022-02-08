package com.example.imagefindmvp.data.network

import android.bluetooth.BluetoothAdapter.ERROR
import android.util.Log
import android.util.Log.ERROR
import com.example.imagefindmvp.data.api.ImageApi
import com.example.imagefindmvp.data.models.ImageListNet
import io.reactivex.rxjava3.android.schedulers.AndroidSchedulers
import io.reactivex.rxjava3.core.Single
import io.reactivex.rxjava3.schedulers.Schedulers
import javax.inject.Inject

class ImageListNetworkImpl @Inject constructor(val imageApi: ImageApi) : ImageListNetwork {
    override fun getImageList(name: String): Single<ImageListNet> {
        return imageApi.getImageList("25581308-ddc9b39954bc82683e4afb26b", name, "horizontal")
    }
}