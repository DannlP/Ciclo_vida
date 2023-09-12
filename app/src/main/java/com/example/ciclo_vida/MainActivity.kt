package com.example.ciclo_vida

import android.os.Bundle
import android.util.Log
import androidx.appcompat.app.AppCompatActivity

private const val LOG_TAG: String = "MainActivity"

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        Log.d(LOG_TAG, "onCreate Called")
    }

    override fun onStart() {
        super.onStart()
        Log.d(LOG_TAG, "onStart Called")
    }

    override fun onResume() {
        super.onResume()
        Log.d(LOG_TAG, "onResume Called")
    }

    override fun onPause() {
        super.onPause()
        Log.d(LOG_TAG, "onPause Called")
    }

    override fun onStop() {
        super.onStop()
        Log.d(LOG_TAG, "onStop Called")
    }

    override fun onRestart() {
        super.onRestart()
        Log.d(LOG_TAG, "onRestart Called")
    }

    override fun onDestroy() {
        super.onDestroy()
        Log.d(LOG_TAG, "onDestroy Called")
    }
}
