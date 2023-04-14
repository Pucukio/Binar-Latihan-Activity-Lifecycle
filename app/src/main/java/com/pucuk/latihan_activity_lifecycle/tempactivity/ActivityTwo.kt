package com.pucuk.latihan_activity_lifecycle.tempactivity

import android.content.Intent
import android.net.Uri
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.pucuk.latihan_activity_lifecycle.R
import com.pucuk.latihan_activity_lifecycle.databinding.ActivityTwoBinding

class ActivityTwo : AppCompatActivity() {
    lateinit var binding: ActivityTwoBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityTwoBinding.inflate(layoutInflater)
        setContentView(binding.root)

        binding.btnTwo.setOnClickListener {
            startActivity(Intent(this, ActivityOne::class.java))
        }
        binding.btnWeb.setOnClickListener {
            val web = Intent(Intent.ACTION_VIEW)
            web.data = Uri.parse("https://google.com")
            startActivity(web)
        }

    }
}