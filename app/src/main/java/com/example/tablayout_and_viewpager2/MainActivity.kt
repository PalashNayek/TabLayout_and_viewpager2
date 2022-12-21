package com.example.tablayout_and_viewpager2

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.tablayout_and_viewpager2.databinding.ActivityMainBinding
import com.google.android.material.tabs.TabLayoutMediator

class MainActivity : AppCompatActivity() {
    private lateinit var binding : ActivityMainBinding
    var tabTitle = arrayOf("Message", "Status", "Calls")
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)
        val pager = binding.viewPager2
        val t1 = binding.tabLayout
        pager.adapter = MyAdapter(supportFragmentManager, lifecycle)
        TabLayoutMediator(t1, pager){
            tab, position ->
            tab.text = tabTitle[position]
        }.attach()
    }
}