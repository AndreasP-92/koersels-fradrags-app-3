package com.example.krselsfradragapp

import android.os.Bundle
import android.view.View
import android.widget.Button
import android.widget.EditText
import androidx.appcompat.app.AlertDialog
import androidx.appcompat.app.AppCompatActivity
import com.google.android.gms.maps.CameraUpdateFactory
import com.google.android.gms.maps.GoogleMap
import com.google.android.gms.maps.MapView
import com.google.android.gms.maps.OnMapReadyCallback
import com.google.android.gms.maps.model.LatLng
import com.google.android.gms.maps.model.MarkerOptions

class Activity1 : BaseActivity(), OnMapReadyCallback {

    private var tmpVar: String? = null
    private lateinit var mapView: MapView
    private lateinit var googleMap: GoogleMap

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_activity1) // Replace with the layout for Activity1

        val homeButton = findViewById<Button>(R.id.home)
        val buttonActivity1 = findViewById<Button>(R.id.buttonActivity1)
        val buttonActivity2 = findViewById<Button>(R.id.buttonActivity2)
        val buttonActivity3 = findViewById<Button>(R.id.buttonActivity3)

        setNavigationBarButtons(homeButton, buttonActivity1, buttonActivity2, buttonActivity3)

        val inputField = findViewById<EditText>(R.id.inputField)
        val saveButton = findViewById<Button>(R.id.saveButton)

        mapView = findViewById(R.id.mapView)
        mapView.onCreate(savedInstanceState)
        mapView.getMapAsync(this)

        // Set an OnClickListener to the "Save Text" button
        saveButton.setOnClickListener {
            tmpVar = inputField.text.toString()
            createWorkPlace(tmpVar)

        }

    }

    override fun onMapReady(map: GoogleMap) {
        googleMap = map

        // Example: Add a marker at a specific location
        val location = LatLng(37.7749, -122.4194) // San Francisco, CA
        googleMap.addMarker(MarkerOptions().position(location).title("Marker in San Francisco"))
        googleMap.moveCamera(CameraUpdateFactory.newLatLng(location))
    }

    fun createWorkPlace(tmpVar:String?){

        if(!tmpVar.isNullOrEmpty()){
            showAlertDialog("Text Saved", "The entered text has been saved." + tmpVar)
        }

    }

    private fun showAlertDialog(title: String, message: String) {
        val alertDialogBuilder = AlertDialog.Builder(this)
        alertDialogBuilder.setTitle(title)
        alertDialogBuilder.setMessage(message)
        alertDialogBuilder.setPositiveButton("OK") { dialog, _ ->
            dialog.dismiss()
        }
        val alertDialog = alertDialogBuilder.create()
        alertDialog.show()
    }
}