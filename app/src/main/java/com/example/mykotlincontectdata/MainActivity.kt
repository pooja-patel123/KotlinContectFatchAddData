package com.example.mykotlincontectdata

import android.Manifest
import android.content.Intent
import android.content.pm.PackageManager
import android.os.Build
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import androidx.recyclerview.widget.RecyclerView

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
    }



    fun  readdata(view: View){
        val intent = Intent(this, ReadContectActivity::class.java)
        startActivity(intent)
    }

    fun  adddata(view: View){
        val intent = Intent(this, AddContetcActivity::class.java)
        startActivity(intent)
    }


}