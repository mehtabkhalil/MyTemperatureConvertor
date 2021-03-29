package com.example.mytemperatureconvertor

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import androidx.databinding.DataBindingUtil
import com.example.mytemperatureconvertor.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {
    private lateinit var binding: ActivityMainBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = DataBindingUtil.setContentView(this, R.layout.activity_main)
        binding.button.setOnClickListener {
            getSet(it)
        }
    }

    private fun getSet(view: View) {

        val fah = binding.input.text.toString().toFloat()
        val textView = binding.textView2.apply {
            text = (((fah - 32) * 5) / 9).toString() + " C"
        };
    }
}