package com.example.krselsfradragapp

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Button

class MainActivity : BaseActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val homeButton = findViewById<Button>(R.id.home)
        val buttonActivity1 = findViewById<Button>(R.id.buttonActivity1)
        val buttonActivity2 = findViewById<Button>(R.id.buttonActivity2)
        val buttonActivity3 = findViewById<Button>(R.id.buttonActivity3)

        setNavigationBarButtons(homeButton, buttonActivity1, buttonActivity2, buttonActivity3)
    }

    fun openMain(view: View) {
        val intent = Intent(this, MainActivity::class.java)
        startActivity(intent)
    }
}