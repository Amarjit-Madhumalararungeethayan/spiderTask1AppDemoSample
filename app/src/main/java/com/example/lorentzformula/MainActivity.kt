package com.example.lorentzformula

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Toast
import com.example.lorentzformula.databinding.ActivityMainBinding
import kotlin.math.pow
import kotlin.math.sqrt

class MainActivity : AppCompatActivity() {

    lateinit var binding: ActivityMainBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)

        binding.textView6.text = ""

        binding.button.setOnClickListener(){

            var a = binding.editTextNumberDecimal.text.toString().toDoubleOrNull()

            if((a == null)|| a>=300000000){
                Toast.makeText(this, "Invalid Input", Toast.LENGTH_LONG).show()
            }
            else{
                var b = 300000000

                var res = 1/ sqrt(1-(a/b).pow(2))

                binding.textView6.text = res.toString()
            }

        }
    }
}