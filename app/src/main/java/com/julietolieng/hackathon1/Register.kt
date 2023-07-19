package com.julietolieng.hackathon1

import android.os.Bundle
import android.view.LayoutInflater
import androidx.appcompat.app.AppCompatActivity
import com.julietolieng.hackathon1.databinding.ActivityMainBinding
import com.julietolieng.hackathon1.databinding.FormBinding

class Register:AppCompatActivity() {
    lateinit var binding: FormBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = FormBinding.inflate(layoutInflater)
        setContentView(binding.root)
    }
    override fun onResume() {
        super.onResume()
        displayLogin()
    }
    fun displayLogin(){
        val firstName=binding.etFName.text.toString()
        val lastName=binding.etLName.text.toString()
        val phoneNumber=binding.etNumber.text.toString()
        val gender=binding.etGender.text.toString()
        val email=binding.etEmails.text.toString()
        val incident=binding.tvIncident.text.toString()
        var error=false

        if (firstName.isEmpty()) {
            binding.etFName.error = "First name is required"
            error= true

        }
        if (lastName.isEmpty()) {
            binding.etLName.error = "Last name is required"
            error= true

        }
        if (email.isEmpty()) {
            binding.etEmails.error = "Email is required"
            error = true

        }

        if (phoneNumber.isEmpty()) {
            binding.etNumber.error = "input your phone number"
            error = true

        }


        if (incident.isEmpty()) {
            binding.tvIncident.error = "describe the incident"
            error = true

        }


    }
}