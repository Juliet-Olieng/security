package com.julietolieng.hackathon1

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import com.julietolieng.hackathon1.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {
    lateinit var binding: ActivityMainBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding= ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)

        binding.btnSignup.setOnClickListener {
            val intent=Intent(this,Login_Activity::class.java)
            startActivity(intent)
        }
        binding.btnLogin.setOnClickListener {
            val intent=Intent(this,Login_Activity::class.java)
            startActivity(intent)
        }
        binding.btnReport.setOnClickListener {
            val intent=Intent(this,Register::class.java)
            startActivity(intent)
        }





    }

    override fun onResume() {
        super.onResume()
        displayLogin()
    }
    fun displayLogin(){
        val firstName=binding.etFName.text.toString()
        val lastName=binding.etLastName.text.toString()
        val email=binding.etEmail.text.toString()
        val passWord=binding.etPassword.text.toString()
        val confirmPassword=binding.etComfirmPassword.text.toString()
        var error=false

        if (firstName.isEmpty()) {
            binding.etFName.error = "First name is required"
            error= true

        }
        if (lastName.isEmpty()) {
            binding.etLastName.error = "Last name is required"
            error= true

        }
        if (email.isEmpty()) {
            binding.etEmail.error = "Email is required"
            error = true

        }

        if (passWord.isEmpty()) {
            binding.etPassword.error = "PassWord is required"
            error = true

        }


        if (confirmPassword.isEmpty()) {
            binding.etComfirmPassword.error = "Password is required"
            error = true

        }


    }

    }
