package com.example.pruebaapp

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.LayoutInflater
import com.example.pruebaapp.databinding.ActivityCrearRutaBinding
import com.example.pruebaapp.databinding.ActivityMainBinding

class CrearRutaActivity : AppCompatActivity() {

    private lateinit var binding: ActivityCrearRutaBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        ///Binding
        binding = ActivityCrearRutaBinding.inflate(LayoutInflater.from(this))
        setContentView(binding.root)

        val fragmentContainer = binding.fragmentContainer



    }
}