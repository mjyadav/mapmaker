package com.example.mrityunjay.mapmaker;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;

import com.google.android.gms.maps.CameraUpdateFactory;
import com.google.android.gms.maps.GoogleMap;
import com.google.android.gms.maps.OnMapReadyCallback;
import com.google.android.gms.maps.SupportMapFragment;
import com.google.android.gms.maps.model.LatLng;
import com.google.android.gms.maps.model.MarkerOptions;

import static java.lang.Math.E;

public class MainActivity extends AppCompatActivity implements OnMapReadyCallback {



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        // Retrieve the content view that renders the map.
        setContentView(R.layout.activity_maps);
        // Get the SupportMapFragment and request notification
        // when the map is ready to be used.
        SupportMapFragment mapFragment = (SupportMapFragment) getSupportFragmentManager()
                .findFragmentById(R.id.map);
        mapFragment.getMapAsync(this);
    }
    @Override
    public void onMapReady(GoogleMap googleMap) {
        // Add a marker in acagild, india,
        // and move the map's camera to the same location.
        LatLng acadgild = new LatLng(2.9654, 77.6380);
        googleMap.addMarker(new MarkerOptions().position(acadgild)
                .title("Marker in Acadgild"));

        googleMap.moveCamera(CameraUpdateFactory.newLatLng(acadgild));
    }
}
}
