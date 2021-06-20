package com.example.androidhomework10

import android.widget.ImageView
import com.bumptech.glide.Glide


fun ImageView.setImage(url : String){
    Glide.with(this)
        .load(url)
        .centerCrop()
        .placeholder(R.drawable.no_image)
        .into((this))
}