package com.example.customebuttomnav

import android.os.Bundle
import android.view.View
import androidx.appcompat.app.AppCompatActivity
import androidx.constraintlayout.widget.ConstraintLayout
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val firstFragment = FirstFragment()
        val secondFragment = SecondFragment()
        val thirdFragment = ThirdFragment()
        val viewOne = findViewById<ConstraintLayout>(R.id.starter)

        imageView2.setOnClickListener {
            supportFragmentManager.beginTransaction().apply {
                replace(R.id.frSwitcher, firstFragment)
                commit()
                viewOne.visibility = View.GONE
            }
        }

        imageView4.setOnClickListener {
            supportFragmentManager.beginTransaction().apply {
                replace(R.id.frSwitcher, secondFragment)
                commit()
                viewOne.visibility = View.GONE
            }
        }

        imageView3.setOnClickListener {
            supportFragmentManager.beginTransaction().apply {
                replace(R.id.frSwitcher, thirdFragment)
                commit()
                viewOne.visibility = View.GONE
            }

        }
    }
}