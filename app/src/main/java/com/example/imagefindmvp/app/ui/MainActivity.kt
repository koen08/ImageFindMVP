package com.example.imagefindmvp.app.ui

import android.app.Application
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Toast
import com.example.imagefindmvp.R
import com.example.imagefindmvp.app.App
import com.example.imagefindmvp.domain.models.ImageDao
import javax.inject.Inject

class MainActivity : AppCompatActivity(), ImageListContract.View {

    @Inject
    lateinit var presenter: ImageListContract.Presenter

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        (application as App).appComponent.inject(this)
        presenter.attach(this)
        presenter.getImageListByName("flowers")

    }

    override fun glideImageList(imageList: List<ImageDao>) {
        Toast.makeText(this, "123456", Toast.LENGTH_LONG).show()
    }
}