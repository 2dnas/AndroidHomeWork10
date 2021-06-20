package com.example.androidhomework10

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.viewpager2.widget.ViewPager2
import com.example.androidhomework10.adapter.Adapter

class MainActivity : AppCompatActivity() {
    private lateinit var viewpager : ViewPager2
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        viewpager = findViewById(R.id.viewpager2)

        viewpager.adapter = Adapter(this)



    }
}