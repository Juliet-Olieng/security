package com.julietolieng.hackathon1

import android.content.Intent
import android.os.Bundle
import android.widget.Toast
import androidx.appcompat.app.AppCompatActivity
import com.julietolieng.hackathon1.databinding.ActivityRegisterBinding
import com.julietolieng.hackathon1.databinding.LoginBinding

class Login_Activity:AppCompatActivity() {
    lateinit var binding: ActivityRegisterBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding= ActivityRegisterBinding.inflate(layoutInflater)
        setContentView(binding.root)

        binding.btnSignup.setOnClickListener {
            val intent = Intent(this,Login_Activity::class.java)
            startActivity(intent)
        }
    }

    override fun onResume() {
        super.onResume()
        validation()
    }
    fun validation(){
        val FirstName=binding.etFirstName.text.toString()
        val LastName=binding.etLastName.text.toString()
        val Email=binding.etEmail.text.toString()
        val password=binding.etPassword.text.toString()
        val confirmPassword=binding.etComfirmPassword.text.toString()
        var error=false
        if (FirstName.isBlank()){
            binding.TilFirstName.error="First Name is required"
            error=true
        }
        if (LastName.isBlank()){
            binding.TilLasName.error="Last name is required"
            error=true
        }
        if (Email.isBlank()){
            binding.TilEmail.error="Email is required"
            error=true
        }
        if (password.isBlank()){
            binding.TilPassword.error="Password is required"
            error=true
        }
        if (confirmPassword.isBlank()){
            binding.TilConfirmPassword.error="Password confirmation is required"
            error=true
        }
        if (!error){
            Toast.makeText(this,"congratulations for signing up ",Toast.LENGTH_LONG).show()
        }

    }
}