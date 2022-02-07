package com.example.newalias
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.newalias.databinding.ActivityMainBinding


class MainActivity : AppCompatActivity() {
    private lateinit var binding: ActivityMainBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)
    }


    fun OnStart() {
        super.onStart()
    }

    fun OnResume() {
        super.onResume()
    }

    override fun onDestroy() {
        super.onDestroy()


    }
}