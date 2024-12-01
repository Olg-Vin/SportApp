package com.vinio.sportapp

import android.os.Bundle
import android.util.Log
import androidx.appcompat.app.AppCompatActivity


class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
    }

    override fun onStart() {
        super.onStart()
        Log.d("TAG", "Main activity onStart")
    }

    override fun onResume() {
        super.onResume()
        Log.d("TAG", "Main activity onResume")
    }

    override fun onStop() {
        super.onStop()
        Log.d("TAG", "Main activity onStop")
    }

    override fun onDestroy() {
        super.onDestroy()
        Log.d("TAG", "Main activity onDestroy")
    }
}