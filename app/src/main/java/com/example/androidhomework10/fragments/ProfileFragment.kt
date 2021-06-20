package com.example.androidhomework10.fragments

import android.content.Context
import android.content.SharedPreferences
import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.TextView
import androidx.fragment.app.Fragment
import com.example.androidhomework10.R
import com.example.androidhomework10.setImage

class ProfileFragment : Fragment(R.layout.fragment_profile) {
    private lateinit var sharedPrefs : SharedPreferences
    private lateinit var image : ImageView
    private lateinit var name : TextView
    private lateinit var email : TextView
    private lateinit var gender : TextView

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        return inflater.inflate(R.layout.fragment_profile,container,false)
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        image = view.findViewById(R.id.image_profile)
        name = view.findViewById(R.id.name_profile)
        email = view.findViewById(R.id.email_profile)
        gender = view.findViewById(R.id.gender_profile)

        sharedPrefs = context?.getSharedPreferences("SharedPrefs",Context.MODE_PRIVATE)!!

    }

    override fun onResume() {
        super.onResume()
        init()
    }

    fun init() {
        sharedPrefs.apply {
            getString("image","")?.let { image.setImage(it) }
            getString("name","No Name Found")?.let { name.text = it }
            getString("email","No Email Found")?.let { email.text = it }
            getString("gender","No Gender Found")?.let { gender.text = it }
        }
    }
}