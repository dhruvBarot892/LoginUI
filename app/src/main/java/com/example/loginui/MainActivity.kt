package com.example.loginui

import android.content.Intent
import android.content.SharedPreferences
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.loginui.databinding.ActivityMainBinding


class MainActivity : AppCompatActivity() {

    private lateinit var binding : ActivityMainBinding
    private lateinit var spref : SharedPreferences

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)


        spref = getSharedPreferences("userDetails",MODE_PRIVATE)
        val intent= Intent(this,Welcome::class.java)

        if(spref.contains("userName")){
            startActivity(intent)
        }

        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)

//        spref = getSharedPreferences("userDetails",MODE_PRIVATE)
//        val intent= Intent(this,Welcome::class.java)
//
//        if(spref.contains("userName")){
//            startActivity(intent)
//        }


        binding.signInBtn.setOnClickListener {
            if (binding.usr.text == null){

            }
            else if(binding.password.text==null){

            }
            else if(binding.password.text.toString() != "1234"){

            }
            else{
                val editor = spref.edit()
                editor.putString("userName",binding.usr.text.toString())
                editor.apply()
                intent.putExtra("userName",binding.usr.text.toString())
                startActivity(intent)
            }
        }

    }
}