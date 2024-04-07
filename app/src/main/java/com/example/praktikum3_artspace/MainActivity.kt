package com.example.praktikum3_artspace

import android.os.Bundle
import android.widget.Button
import android.widget.ImageView
import android.widget.TextView
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity

class MainActivity : AppCompatActivity() {

    private lateinit var imageView: ImageView
    private lateinit var imageNameTextView: TextView

    private val imageList = listOf(
        R.drawable.img1,
        R.drawable.img2,
        R.drawable.img3,
        R.drawable.img4,
        R.drawable.img5,
        R.drawable.img6,
        R.drawable.img7,
        R.drawable.img8,
        R.drawable.img9,
        R.drawable.img10,
        R.drawable.img11,
        R.drawable.img12,
        R.drawable.img13,
    )
    private val imageNameList = listOf(
        "I - Deliverance",
        "II - Ego",
        "III - Discipline",
        "IV - Gold",
        "V - Helix",
        "VI - Decimation",
        "VII - Bodhi",
        "VIII - Setsuna",
        "IX - Daybreak",
        "X - Infinity",
        "XI - Star",
        "XII - Vicissitude",
        "XIII - Reverie",
    )

    private var currentPosition = 0

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_main)

        imageView = findViewById(R.id.imageView)
        imageNameTextView = findViewById(R.id.imageNameTextView)

        updateImage()

        findViewById<Button>(R.id.previousButton).setOnClickListener {
            currentPosition = (currentPosition - 1 + imageList.size) % imageList.size
            updateImage()
        }

        findViewById<Button>(R.id.nextButton).setOnClickListener {
            currentPosition = (currentPosition + 1) % imageList.size
            updateImage()
        }
    }

    private fun updateImage() {
        imageView.setImageResource(imageList[currentPosition])
        imageNameTextView.text = imageNameList[currentPosition]
    }
}
