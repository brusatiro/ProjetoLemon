package com.example.testmyproject

import android.location.Address
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle

import com.google.android.gms.maps.CameraUpdateFactory
import com.google.android.gms.maps.GoogleMap
import com.google.android.gms.maps.OnMapReadyCallback
import com.google.android.gms.maps.SupportMapFragment
import com.google.android.gms.maps.model.LatLng
import com.google.android.gms.maps.model.MarkerOptions
//import com.example.testmyproject.databinding.ActivityMapsBinding
import com.google.android.gms.maps.model.LatLngBounds

//class MapsActivity : AppCompatActivity(), OnMapReadyCallback {
class MainActivity5 : AppCompatActivity() {

    data class Place(
        val name: String,
        val latLng: LatLng,
        val address: String
    )

    private val places = arrayListOf(
        Place("Ecoponto Jardim Maria do Carmo", LatLng(-23.5965994,-46.7529815), "R. Caminho do Engenho, 800 - Ferreira, São Paulo - SP, 05524-000"),
        Place("Ecoponto Bandeirantes", LatLng(-23.4862880, -46.6951634), "R. Itaiquara, 237 - Parque Monteiro Soares"),
        Place("Ecoponto Tereza Cristina", LatLng(-23.5691189,-46.6105852), "Rua Tereza Cristina, nº 10 X Av. do Estado"),
        Place("Ecoponto Itaim Paulista", LatLng(-23.5045774,-46.3749025), "Rua Barão de Almeida Galeão, nº58"),
        Place("Ecoponto Corinthians", LatLng(-23.5477054,-46.4389728), "Rua Ana Perena Nº 155 (Distrito José Bonifácio)"),
        Place("Ecoponto Jabaquara", LatLng(-23.6537048,-46.6527311), "Rua Genaro de Carvalho x Rua Jupatis"),
        Place("Ecoponto Vila Jaragua", LatLng(-23.5164776,-46.7442295), "Rua Agrestina X Av. Marginal Direita do Tietê"),
        Place("Ecoponto Tatuapé", LatLng(-23.5299145,-46.5852123), "Av. Salim Farah Maluf, n°179"),
        Place("Ecoponto Bras", LatLng(-23.5570721,-46.7127192), "Rua Palmorino Mônaco x Rua da Moóca"),
        Place("Ecoponto Berrini", LatLng(-23.6250818,-46.7195716), "Praça. do Cancioneiro, nº 15"),
        Place("Ecoponto Mooca", LatLng(-23.5479585,-46.6050114), "Av. Pires do Rio X Rua Bresser"),
        Place("Ecoponto Alto de Pinheiros", LatLng(-23.5570721,-46.7127192), "Praça Arcipreste Anselmo de Oliveira"),
        Place("Ecoponto Tucuruvi", LatLng(-23.4672646,-46.6121335), "Rua Eduardo Vicente Nasser n. 519"),
        Place("Ecoponto Liberdade", LatLng(-23.5565917,-46.6392435), "Rua Jaceguai, Nº 67 x Av. Liberdade"),
        Place("Ecoponto Barrafunda", LatLng(-23.5271629,-46.6507547), "Rua Sólon")
    )


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main5)

        val mapFragment = supportFragmentManager
            .findFragmentById(R.id.map) as SupportMapFragment
        mapFragment.getMapAsync { googleMap -> addMarkers(googleMap)

            googleMap.setOnMapLoadedCallback {
                val bounds = LatLngBounds.builder()

                places.forEach {
                    bounds.include(it.latLng)
                }

                googleMap.moveCamera(CameraUpdateFactory.newLatLngBounds(bounds.build(), 100))
            }
        }
    }

    private fun addMarkers(googleMap: GoogleMap) {
        places.forEach { place ->
            val marker = googleMap.addMarker(
                MarkerOptions()
                    .title(place.name)
                    .snippet(place.address)
                    .position(place.latLng)
            )
        }

        //override fun onMapReady(googleMap: GoogleMap) {
        //  mMap = googleMap

        // Add a marker in Sydney and move the camera
        //val sydney = LatLng(-34.0, 151.0)
        //mMap.addMarker(MarkerOptions().position(sydney).title("Marker in Sydney"))
        //mMap.moveCamera(CameraUpdateFactory.newLatLng(sydney))

    }
}

//data class Place(
//    val name: String,
//    val latLng: LatLng,
//    val address: String
//)


