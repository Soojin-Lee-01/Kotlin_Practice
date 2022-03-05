package com.soojin.mytrip_application

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.ImageView
import android.widget.Toast

class ImageInsideActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {

        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_image_inside)

        val getData = intent.getStringExtra("data")

        val tripImage = findViewById<ImageView>(R.id.tripImageArea)

        //Toast.makeText(this, getData, Toast.LENGTH_LONG).show()

        if(getData == "1"){
            tripImage.setImageResource(R.drawable.trip1)
        }

        if(getData == "2"){
            tripImage.setImageResource(R.drawable.trip2)
        }

        if(getData == "3") {
            tripImage.setImageResource(R.drawable.trip3)
        }

        if(getData == "4") {
            tripImage.setImageResource(R.drawable.trip4)
        }

        if(getData == "5") {
            tripImage.setImageResource(R.drawable.trip5)
        }

        if(getData == "6") {
            tripImage.setImageResource(R.drawable.trip6)
        }

        if(getData == "7") {
            tripImage.setImageResource(R.drawable.trip7)
        }

        if(getData == "8") {
            tripImage.setImageResource(R.drawable.trip8)
        }

        if(getData == "9") {
            tripImage.setImageResource(R.drawable.trip9)
        }

        }
}