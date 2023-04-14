package com.pucuk.latihan_activity_lifecycle.tempactivity

import android.content.Intent
import android.net.Uri
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.pucuk.latihan_activity_lifecycle.R
import com.pucuk.latihan_activity_lifecycle.databinding.ActivityOneBinding


class ActivityOne : AppCompatActivity() {
    lateinit var binding: ActivityOneBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityOneBinding.inflate(layoutInflater)
        setContentView(binding.root)

        binding.btnOne.setOnClickListener {
            startActivity(Intent(this, ActivityTwo::class.java))
        }
        binding.btnWeb.setOnClickListener {
            val web = Intent(Intent.ACTION_VIEW)
            web.data = Uri.parse("https://www.google.com")
            startActivity(web)
        }
    }
}