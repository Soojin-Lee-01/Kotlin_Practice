package com.soojin.mypet_application

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.ImageView
import android.widget.Toast

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        // 1. 화면이 클릭되었다는 것을 알아야 합니다! (프로그램이)
        val image1 = findViewById<ImageView>(R.id.ham_image_1)
        image1.setOnClickListener {

            Toast.makeText(this, "1번 클릭 완료", Toast.LENGTH_LONG).show()


            // 2. 화면이 클릭되면, 다음 화면으로 넘어가서, 사진을 크게 보여줌!
            val intent = Intent(this, Ham1Activity::class.java)
            startActivity(intent)

        }

        //7개의 image들의 이름을 다 붙이고, 각각 클릭 시, 다음 액티비티로 이동!
        val image2 = findViewById<ImageView>(R.id.ham_image_2)
        val image3 = findViewById<ImageView>(R.id.ham_image_3)
        val image4 = findViewById<ImageView>(R.id.ham_image_4)
        val image5 = findViewById<ImageView>(R.id.ham_image_5)
        val image6 = findViewById<ImageView>(R.id.ham_image_6)
        val image7 = findViewById<ImageView>(R.id.ham_image_7)

        image2.setOnClickListener {

            Toast.makeText(this, "2번 클릭 완료", Toast.LENGTH_LONG).show()


            val intent = Intent(this, Ham2Activity::class.java)
            startActivity(intent)
        }

        image3.setOnClickListener {

            Toast.makeText(this, "3번 클릭 완료", Toast.LENGTH_LONG).show()

            val intent = Intent(this, Ham3Activity::class.java)
            startActivity(intent)
        }

        image4.setOnClickListener {

            Toast.makeText(this, "4번 클릭 완료", Toast.LENGTH_LONG).show()

            val intent = Intent(this, HAm4Activity::class.java)
            startActivity(intent)
        }

        image5.setOnClickListener {

            Toast.makeText(this, "5번 클릭 완료", Toast.LENGTH_LONG).show()

            val intent = Intent(this, Ham5Activity::class.java)
            startActivity(intent)
        }

        image6.setOnClickListener {

            Toast.makeText(this, "6번 클릭 완료", Toast.LENGTH_LONG).show()

            val intent = Intent(this, Ham6Activity::class.java)
            startActivity(intent)

        }

        image7.setOnClickListener {

            Toast.makeText(this, "7번 클릭 완료", Toast.LENGTH_LONG).show()

            val intent = Intent(this, Ham7Activity::class.java)
            startActivity(intent)
        }






    }
}