package com.mio.devfast

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import com.mio.devlib.TestUtils

class MainActivity : AppCompatActivity() {
    private val TAG = "MainActivity"
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        Log.d(TAG, "onCreate: ${TestUtils.getString()}")
    }
}