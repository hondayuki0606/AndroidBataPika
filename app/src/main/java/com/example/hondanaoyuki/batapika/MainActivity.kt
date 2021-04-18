package com.example.hondanaoyuki.batapika

import android.hardware.camera2.CameraManager
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle

class MainActivity : AppCompatActivity() {
    private val threshold: Float = 10f
    private val oldvalue: Float = 0f
    private lateinit var cameraManager: CameraManager
    private val cameraID: String? = null
    private val lightOn: Boolean = false

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
    }
}