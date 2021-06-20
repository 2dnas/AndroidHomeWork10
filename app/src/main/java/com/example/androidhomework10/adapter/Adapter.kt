package com.example.androidhomework10.adapter

import androidx.appcompat.app.AppCompatActivity
import androidx.fragment.app.Fragment
import androidx.viewpager2.adapter.FragmentStateAdapter
import com.example.androidhomework10.fragments.ProfileFragment
import com.example.androidhomework10.fragments.RegisterFragment


const val NUM_PAGES = 2
class Adapter(activity : AppCompatActivity) : FragmentStateAdapter(activity) {
    override fun getItemCount() = NUM_PAGES


    override fun createFragment(position: Int): Fragment {
        return when (position){
            0 -> ProfileFragment()
            1 -> RegisterFragment()
            else -> ProfileFragment()
        }
    }
}