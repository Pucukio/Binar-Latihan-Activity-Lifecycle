package com.pucuk.latihan_activity_lifecycle

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle

class ExampleLifeCycleActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_example_life_cycle)
    }
}