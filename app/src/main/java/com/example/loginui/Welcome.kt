package com.example.loginui

import android.os.Bundle
import android.os.PersistableBundle
import android.widget.Toast
import androidx.appcompat.app.AppCompatActivity

class Welcome : AppCompatActivity() {

//    override fun onCreate(savedInstanceState: Bundle?){
//        super.onCreate(savedInstanceState)
//    }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.welcome)
        Toast.makeText(this,"welcome ${intent.getStringExtra("userName")}",Toast.LENGTH_SHORT).show()



    }
}