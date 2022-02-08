package com.example.imagefindmvp.app.ui

import android.annotation.SuppressLint
import android.app.Application
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Toast
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import com.example.imagefindmvp.R
import com.example.imagefindmvp.app.App
import com.example.imagefindmvp.app.ui.adapters.ImageListAdapter
import com.example.imagefindmvp.domain.models.ImageDao
import javax.inject.Inject

class MainActivity : AppCompatActivity(), ImageListContract.View {

    @Inject
    lateinit var presenter: ImageListContract.Presenter
    var recyclerView: RecyclerView? = null

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        (application as App).appComponent.inject(this)
        recyclerView = findViewById(R.id.recycleView)
        recyclerView?.layoutManager = LinearLayoutManager(this)
        presenter.attach(this)
        presenter.getImageListByName("android")


    }

    @SuppressLint("NotifyDataSetChanged")
    override fun glideImageList(imageList: List<ImageDao>) {
        val adapter = ImageListAdapter(imageList, this)
        recyclerView?.adapter = adapter
       // adapter.notifyDataSetChanged()
    }
}