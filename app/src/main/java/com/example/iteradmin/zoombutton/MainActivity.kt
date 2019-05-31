package com.example.iteradmin.zoombutton

import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.ImageView
import com.bumptech.glide.Glide
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val image = findViewById<ImageView>(R.id.image)
        val zoom = findViewById<Button>(R.id.button3)
        val zoomout = findViewById<Button>(R.id.button4)
        val change = findViewById<Button>(R.id.button5)

        val  image2 ="https://aa1a5178aef33568e9c4-a77ea51e8d8892c1eb8348eb6b3663f6.ssl.cf5.rackcdn.com/p/full/1004d42e-89b5-401e-9dd2-2fee56f3a7b4.jpg"

        zoom.setOnClickListener {
            val x:Float = image.scaleX
            val y:Float = image.scaleY

            image.scaleX=x+1
            image.scaleY =y+1



        }
        zoomout.setOnClickListener {
            val x:Float = image.scaleX
            val y:Float = image.scaleY
            image.scaleX=x-1
            image.scaleY =y-1

        }
        change.setOnClickListener {
            Glide.with(this).load(image2).into(image)
        }
    }
}
