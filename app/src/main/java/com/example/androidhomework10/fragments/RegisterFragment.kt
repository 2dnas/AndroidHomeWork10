package com.example.androidhomework10.fragments

import android.content.Context
import android.content.SharedPreferences
import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Button
import android.widget.EditText
import android.widget.Toast
import androidx.fragment.app.Fragment
import com.example.androidhomework10.R

class RegisterFragment : Fragment(R.layout.fragment_register) {
    private lateinit var sharedPref : SharedPreferences
    private lateinit var nameEdit : EditText
    private lateinit var emailEdit : EditText
    private lateinit var genderEdit : EditText
    private lateinit var imageEdit : EditText
    private lateinit var button : Button

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        sharedPref = context?.getSharedPreferences("SharedPrefs", Context.MODE_PRIVATE)!!
    }

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        return inflater.inflate(R.layout.fragment_register,container,false)
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        nameEdit = view.findViewById(R.id.name_registration)
        emailEdit = view.findViewById(R.id.email_registration)
        genderEdit = view.findViewById(R.id.gender_registration)
        imageEdit = view.findViewById(R.id.image_registration)
        button = view.findViewById(R.id.save_registration)
        button.setOnClickListener {
            if(nameEdit.text.isEmpty() || emailEdit.text.isEmpty() || genderEdit.text.isEmpty() || imageEdit.text.isEmpty()){
                Toast.makeText(context,"Please fill everything",Toast.LENGTH_LONG).show()
            } else {
                sharedPref.edit().apply {
                    putString("name",nameEdit.text.toString())
                    putString("email",emailEdit.text.toString())
                    putString("gender",genderEdit.text.toString())
                    putString("image",imageEdit.text.toString())
                }.apply()
            }
        }
    }
}