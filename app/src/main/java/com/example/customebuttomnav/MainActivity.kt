package com.example.customebuttomnav

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.ImageView
import androidx.fragment.app.Fragment
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

//        val firstView: ImageView = findViewById(R.id.imageView2)
        imageView2.setOnClickListener {
            val fragment: Fragment = FirstFragment()
            supportFragmentManager.beginTransaction().add(R.id.first, fragment).addToBackStack(null).commit()
        }

//        val secondView: ImageView = findViewById(R.id.imageView4)
        imageView4.setOnClickListener {

        }

//        val thirdView: ImageView = findViewById(R.id.imageView3)
        imageView3.setOnClickListener {

        }
    }
}