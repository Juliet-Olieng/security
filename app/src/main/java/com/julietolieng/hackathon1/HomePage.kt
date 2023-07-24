package com.julietolieng.hackathon1

import android.content.Intent
import android.os.Bundle
import android.os.PersistableBundle
import android.view.View
import androidx.appcompat.app.AppCompatActivity
import com.julietolieng.hackathon1.databinding.HomepageBinding

class HomePage:AppCompatActivity() {
    lateinit var binding: HomepageBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = HomepageBinding.inflate(layoutInflater)
        setContentView(binding.root)


        binding.btnReport.setOnClickListener {
            val intent= Intent(this,Register::class.java)
            startActivity(intent)
        }

    }


}