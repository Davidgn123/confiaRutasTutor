package com.example.pruebaapp.fragments

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import com.example.pruebaapp.R
import com.google.android.gms.maps.CameraUpdateFactory
import com.google.android.gms.maps.GoogleMap
import com.google.android.gms.maps.MapView
import com.google.android.gms.maps.OnMapReadyCallback
import com.google.android.gms.maps.model.LatLng
import com.google.android.gms.maps.model.MarkerOptions

class MapsFragment : Fragment(), OnMapReadyCallback {

    private lateinit var googleMap: GoogleMap
    private lateinit var mapView: MapView

    companion object {
        // Constantes para la ubicación en Colombia
        private const val COLOMBIA_LATITUDE = 4.570868
        private const val COLOMBIA_LONGITUDE = -74.297333
        private const val ZOOM_LEVEL = 5f
    }

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        val view = inflater.inflate(R.layout.fragment_maps, container, false)

        mapView = view.findViewById(R.id.map)
        mapView.onCreate(savedInstanceState)
        mapView.getMapAsync(this)

        return view
    }

    override fun onMapReady(map: GoogleMap) {
        googleMap = map

        // Agregar un solo marcador en Colombia
        val colombia = LatLng(COLOMBIA_LATITUDE, COLOMBIA_LONGITUDE)
        googleMap.addMarker(MarkerOptions().position(colombia).title("Colombia"))

        // Mover la cámara a Colombia con el nivel de zoom definido
        googleMap.moveCamera(CameraUpdateFactory.newLatLngZoom(colombia, ZOOM_LEVEL))
    }

    override fun onResume() {
        super.onResume()
        mapView.onResume()
    }

    override fun onPause() {
        super.onPause()
        mapView.onPause()
    }

    override fun onDestroy() {
        super.onDestroy()
        mapView.onDestroy()
    }

    override fun onLowMemory() {
        super.onLowMemory()
        mapView.onLowMemory()
    }
}