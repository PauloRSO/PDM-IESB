package br.com.paulogabriel.pdm.Atividades;

import android.content.Intent;
import android.support.v4.app.FragmentActivity;
import android.os.Bundle;

import com.google.android.gms.maps.CameraUpdateFactory;
import com.google.android.gms.maps.GoogleMap;
import com.google.android.gms.maps.OnMapReadyCallback;
import com.google.android.gms.maps.SupportMapFragment;
import com.google.android.gms.maps.model.LatLng;
import com.google.android.gms.maps.model.MarkerOptions;

import br.com.paulogabriel.pdm.R;

public class MapasEscolas extends FragmentActivity implements OnMapReadyCallback {

    private GoogleMap mMap;
    private Float latitude;
    private Float longitude;
    private String nome;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_mapas_escolas);

        Intent intent = getIntent();
        Bundle bundle = intent.getExtras();

        nome = bundle.getString("nome");
        latitude = bundle.getFloat("latitude");
        longitude = bundle.getFloat("longitude");





        // Obtain the SupportMapFragment and get notified when the map is ready to be used.
        SupportMapFragment mapFragment = (SupportMapFragment) getSupportFragmentManager()
                .findFragmentById(R.id.map);
        mapFragment.getMapAsync(this);
    }


    /**
     * Manipulates the map once available.
     * This callback is triggered when the map is ready to be used.
     * This is where we can add markers or lines, add listeners or move the camera. In this case,
     * we just add a marker near Sydney, Australia.
     * If Google Play services is not installed on the device, the user will be prompted to install
     * it inside the SupportMapFragment. This method will only be triggered once the user has
     * installed Google Play services and returned to the app.
     */
    @Override
    public void onMapReady(GoogleMap googleMap) {
        mMap = googleMap;

        // Add a marker in IESB and move the camera
        LatLng iesb = new LatLng(latitude,longitude);
        mMap.addMarker(new MarkerOptions().position(iesb).title(nome));
        mMap.moveCamera(CameraUpdateFactory.newLatLng(iesb));
    }
}
