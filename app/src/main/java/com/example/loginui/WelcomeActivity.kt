package com.example.loginui

import android.content.Intent
import android.os.Bundle
import android.widget.Toast
import androidx.appcompat.app.AppCompatActivity
import com.example.loginui.databinding.ActivityWelcomeBinding

class WelcomeActivity : AppCompatActivity() {

//    override fun onCreate(savedInstanceState: Bundle?){
//        super.onCreate(savedInstanceState)
//    }
    private lateinit var binding : ActivityWelcomeBinding


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        binding = ActivityWelcomeBinding.inflate(layoutInflater)
        setContentView(binding.root)

//        setContentView(R.layout.activity_welcome)
        Toast.makeText(this,"welcome ${intent.getStringExtra("userName")}",Toast.LENGTH_SHORT).show()

        binding.hSite.setOnClickListener{
            startActivity(Intent(this,HalolSiteActivity::class.java))
        }


    }
}