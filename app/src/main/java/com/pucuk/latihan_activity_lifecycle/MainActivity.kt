package com.pucuk.latihan_activity_lifecycle

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import com.pucuk.latihan_activity_lifecycle.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {
    lateinit var binding: ActivityMainBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)
        binding.tvTxtHello
    }

    override fun onStart() {
        super.onStart()
        Log.d("LifeActivity", "onStart Aktif")

    }

    override fun onRestart() {
        super.onRestart()
        Log.d("LifeActivity", "onRestart Aktif")
    }

    override fun onResume() {
        super.onResume()
        Log.d("LifeActivity", "onResume Aktif")
    }

    override fun onStop() {
        super.onStop()
        Log.d("LifeActivity", "onStop Aktif")
    }

    override fun onDestroy() {
        super.onDestroy()
        Log.d("LifeActivity", "onDestroy Aktif")
    }
}