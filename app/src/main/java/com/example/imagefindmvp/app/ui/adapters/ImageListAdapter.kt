package com.example.imagefindmvp.app.ui.adapters

import android.content.Context
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import androidx.recyclerview.widget.RecyclerView
import com.bumptech.glide.Glide
import com.example.imagefindmvp.R
import com.example.imagefindmvp.domain.models.ImageDao

class ImageListAdapter(val imageList: List<ImageDao>, val context: Context) :
    RecyclerView.Adapter<ImageListAdapter.ViewHolder>() {
    val inflate = LayoutInflater.from(context)


    class ViewHolder(val view: View) : RecyclerView.ViewHolder(view) {
        val imageView: ImageView = view.findViewById(R.id.imageItem)
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ViewHolder {
        val view = inflate.inflate(R.layout.list_image_item, parent, false)
        return ViewHolder(view)
    }

    override fun onBindViewHolder(holder: ViewHolder, position: Int) {
        val imageDao = imageList[position]
        Glide.with(context).load(imageDao.url).into(holder.imageView);
    }

    override fun getItemCount(): Int {
        return imageList.size
    }
}