package com.example.myapplicationmap

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.viewpager2.widget.ViewPager2

class MainActivityStart : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main_start)

        val vpPager = findViewById<ViewPager2>(R.id.vpPager)

        val fragments = arrayListOf(
            FragmentDev(),
            FragmentInformationMap()
        )

        val viewPagerAdapter = ViewPagerAdapter(fragments,this)
        vpPager.adapter = viewPagerAdapter
    }
}