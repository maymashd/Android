package com.example.moviedb.presentation.movie.cinema.map

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.lifecycle.Observer
import androidx.lifecycle.ViewModelProviders
import androidx.navigation.NavController
import androidx.navigation.Navigation
import com.example.moviedb.R
import com.example.moviedb.base.BaseFragment
import com.example.moviedb.presentation.movie.cinema.CinemaViewModel
import com.example.moviedb.utils.AppConstants
import com.google.android.gms.maps.CameraUpdateFactory
import com.google.android.gms.maps.GoogleMap
import com.google.android.gms.maps.OnMapReadyCallback
import com.google.android.gms.maps.SupportMapFragment
import com.google.android.gms.maps.model.LatLng
import com.google.android.gms.maps.model.Marker
import com.google.android.gms.maps.model.MarkerOptions
import org.koin.android.ext.android.inject


class CinemaMapFragment : BaseFragment(),
    OnMapReadyCallback,
    GoogleMap.OnMarkerClickListener {

    private lateinit var map: GoogleMap
    private val viewModel: CinemaViewModel by inject()
    private lateinit var navController: NavController

    companion object {
        fun newInstance(): CinemaMapFragment = CinemaMapFragment()
    }

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        return inflater.inflate(R.layout.fragment_cinema_map, container, false)
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        bindViews(view)
        setData()
    }

    override fun bindViews(view: View) = with(view) {
        navController = Navigation.findNavController(this)
        val mapFragment = childFragmentManager
            .findFragmentById(R.id.map) as SupportMapFragment
        mapFragment.getMapAsync(this@CinemaMapFragment)
    }

    override fun setData() {
        viewModel.liveData.observe(viewLifecycleOwner, Observer { cinemaList ->
            cinemaList.map { cinema ->
                val currentLatLng = cinema.latitude?.let{lat ->
                    cinema.longitude?.let{LatLng(cinema.latitude, cinema.longitude)}}
                map.addMarker(
                    currentLatLng?.let {lat->
                        cinema.id?.let { id->
                        MarkerOptions()
                            .position(lat)
                            .title(cinema.name)
                            .alpha(id.toFloat())}
                    }
                )
                map.animateCamera(CameraUpdateFactory.newLatLngZoom(currentLatLng, 12f))
            }
        })
    }

    override fun onMapReady(googleMap: GoogleMap) {
        map = googleMap
        map.uiSettings.isZoomControlsEnabled = true
        map.setOnMarkerClickListener(this)
    }

    override fun onMarkerClick(p0: Marker?): Boolean {
        val bundle = Bundle()
        p0?.alpha?.let { bundle.putInt(AppConstants.CINEMA_ID, p0?.alpha.toInt()) }

        navController.navigate(
            R.id.action_cinemaFragment_to_cinemaDetailsFragment,
            bundle
        )
        return false
    }
}
