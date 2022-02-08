package com.example.imagefindmvp.app.di

import com.example.imagefindmvp.app.ui.ImageListContract
import com.example.imagefindmvp.app.ui.ImageListPresenter
import com.example.imagefindmvp.app.ui.MainActivity
import com.example.imagefindmvp.data.api.ImageApi
import com.example.imagefindmvp.data.network.ImageListNetwork
import com.example.imagefindmvp.data.network.ImageListNetworkImpl
import com.example.imagefindmvp.data.service.ImageServiceImpl
import com.example.imagefindmvp.domain.service.ImageService
import com.example.imagefindmvp.domain.usecase.GetImageByName
import dagger.Module
import dagger.Provides

@Module
class ImageListModule {
    @Provides
    fun providePresenter(
        getImageByName: GetImageByName
    ): ImageListContract.Presenter = ImageListPresenter(getImageByName)

    @Provides
    fun provideImageListNetwork(imageApi: ImageApi): ImageListNetwork =
        ImageListNetworkImpl(imageApi)

    @Provides
    fun provideImageService(imageListNetwork: ImageListNetwork): ImageService {
        return ImageServiceImpl(imageListNetwork)
    }

}