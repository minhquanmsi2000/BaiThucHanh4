package com.example.ggmap;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;

import com.google.android.gms.maps.CameraUpdate;
import com.google.android.gms.maps.CameraUpdateFactory;
import com.google.android.gms.maps.GoogleMap;
import com.google.android.gms.maps.MapFragment;
import com.google.android.gms.maps.OnMapReadyCallback;
import com.google.android.gms.maps.model.LatLng;
import com.google.android.gms.maps.model.MarkerOptions;

public class MainActivity extends AppCompatActivity implements OnMapReadyCallback {
    GoogleMap map;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        MapFragment mapFragment= (MapFragment) getFragmentManager().findFragmentById((R.id.myMap));
        mapFragment.getMapAsync(this);
    }

    @Override
    public void onMapReady(GoogleMap googleMap) {
        map= googleMap;
        LatLng daihoc= new LatLng(16.0767381296386, 108.21407508723908);
        map.moveCamera(CameraUpdateFactory.newLatLngZoom(daihoc, 13));
        map.addMarker(new MarkerOptions()
        .title("Trường đại học sư phạm kĩ thuật")
                .position(daihoc));

    }
}