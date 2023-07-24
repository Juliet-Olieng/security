package com.julietolieng.hackathon1

import android.content.Intent
import android.os.Bundle
import android.widget.Toast
import androidx.appcompat.app.AppCompatActivity
import com.julietolieng.hackathon1.databinding.ActivityMainBinding
import com.julietolieng.hackathon1.databinding.LoginBinding

class Login_Activity:AppCompatActivity() {
    lateinit var binding: LoginBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding= LoginBinding.inflate(layoutInflater)
        setContentView(binding.root)


        binding.btnNext.setOnClickListener {
            val intent=Intent(this,HomePage::class.java)
            startActivity(intent)
        }

    }

    override fun onResume() {
        super.onResume()

    }


}