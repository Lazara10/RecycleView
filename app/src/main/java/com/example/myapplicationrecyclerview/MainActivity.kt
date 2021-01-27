package com.example.myapplicationrecyclerview

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)


        val images = listOf<image>(
                image("C Programming", R.drawable.cpro),
                image("C++", R.drawable.cplus),
                image("Java", R.drawable.java),
                image("Python", R.drawable.pyhon),
                image("Bootstrap", R.drawable.bootstrap),
                image("ASP.NET", R.drawable.asp),
                image("PHP", R.drawable.php),
                image("Unix", R.drawable.unix)
        )
        val recyclerView = findViewById<RecyclerView>(R.id.ImagesRecyclerView)
        recyclerView.layoutManager = LinearLayoutManager(this)
        recyclerView.setHasFixedSize(true)
        recyclerView.adapter = ImageAdapter(this, images)
    }
}