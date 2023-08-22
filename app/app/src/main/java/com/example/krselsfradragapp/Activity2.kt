package com.example.krselsfradragapp

import android.os.Bundle
import android.widget.Button
import androidx.appcompat.app.AppCompatActivity

class Activity2  : BaseActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_activity2) // Replace with the layout for Activity1

        val homeButton = findViewById<Button>(R.id.home)
        val buttonActivity1 = findViewById<Button>(R.id.buttonActivity1)
        val buttonActivity2 = findViewById<Button>(R.id.buttonActivity2)
        val buttonActivity3 = findViewById<Button>(R.id.buttonActivity3)

        setNavigationBarButtons(homeButton, buttonActivity1, buttonActivity2, buttonActivity3)
    }
}