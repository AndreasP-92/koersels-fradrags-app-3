package com.example.krselsfradragapp

import android.content.Intent
import android.os.Bundle
import android.view.View
import androidx.appcompat.app.AppCompatActivity

class Navigation : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.layout_navigation_bar)
    }

    fun openMain(view: View) {
        val intent = Intent(this, MainActivity::class.java)
        startActivity(intent)
    }

    fun openActivity1(view: View) {
        val intent = Intent(this, Activity1::class.java)
        startActivity(intent)
    }

    fun openActivity2(view: View) {
        val intent = Intent(this, Activity2::class.java)
        startActivity(intent)
    }

    fun openActivity3(view: View) {
        val intent = Intent(this, Activity3::class.java)
        startActivity(intent)
    }
}