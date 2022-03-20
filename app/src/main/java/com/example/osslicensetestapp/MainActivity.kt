package com.example.osslicensetestapp

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import com.example.osslicensetestapp.databinding.ActivityMainBinding
import com.mikepenz.aboutlibraries.LibsBuilder
import kotlinx.coroutines.NonCancellable.start

class MainActivity : AppCompatActivity() {

    private lateinit var viewBinding: ActivityMainBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        viewBinding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(viewBinding.root)
        
        setUpShowOssButton()
    }

    private fun setUpShowOssButton() {
        viewBinding.showOssButton.setOnClickListener {
            LibsBuilder().start(this)

        }

    }
}