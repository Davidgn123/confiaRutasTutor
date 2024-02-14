package com.example.pruebaapp.fragments

import android.content.Intent
import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import com.example.pruebaapp.CrearRutaActivity
import com.example.pruebaapp.MainActivity
import com.example.pruebaapp.R
import com.example.pruebaapp.RegistroRContrasenaActivity
import com.example.pruebaapp.SplashActivity
import com.example.pruebaapp.databinding.FragmentInicioBinding

class InicioFragment : Fragment() {

    private lateinit var binding: FragmentInicioBinding

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {

        // Inflate the layout for this fragment
        binding = FragmentInicioBinding.inflate(inflater, container, false)
        val view = binding.root

        val botonflotante = binding.floatingActionButton

        botonflotante.setOnClickListener {
            val intent = Intent(context, CrearRutaActivity::class.java)
            startActivity(intent)
        }

        return view
    }

}
