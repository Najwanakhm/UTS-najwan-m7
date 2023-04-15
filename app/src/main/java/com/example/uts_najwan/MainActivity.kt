package com.example.uts_Najwan

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import com.example.uts_najwan.mobil

class MainActivity : AppCompatActivity() {

    companion object{
        val INTENT_PARCELABLE = "OBJECT_INTENT"
    }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val mobilList = listOf<mobil>(
            mobil(
                R.drawable.mobil1,
                namemobil =  "Your Name",
                descmobil = "Lorem ipsum Lorem ipsum Lorem ipsum Lorem ipsum Lorem ipsum"
            ),
            mobil(
                R.drawable.mobil2,
                namemobil =  "Spritted Away",
                descmobil = "Lorem ipsum Lorem ipsum Lorem ipsum Lorem ipsum Lorem ipsum"
            ),
            mobil(
                R.drawable.mobil3,
                namemobil =  "Kimetsu No Yiaba",
                descmobil = "Lorem ipsum Lorem ipsum Lorem ipsum Lorem ipsum Lorem ipsum"
            ),
            mobil(
                R.drawable.mobil4,
                namemobil =  "GO HOME",
                descmobil = "Lorem ipsum Lorem ipsum Lorem ipsum Lorem ipsum Lorem ipsum"
            ),
            mobil(
                R.drawable.mobil5,
                namemobil =  "Naruto The Movie 10",
                descmobil = "Lorem ipsum Lorem ipsum Lorem ipsum Lorem ipsum Lorem ipsum"
            ),
            mobil(
                R.drawable.mobil6,
                namemobil =  "Boruto The Movie",
                descmobil = "Lorem ipsum Lorem ipsum Lorem ipsum Lorem ipsum Lorem ipsum"
            ),
            mobil(
                R.drawable.mobil7,
                namemobil=  "Boku No Hero The Movie",
                descmobil = "Lorem ipsum Lorem ipsum Lorem ipsum Lorem ipsum Lorem ipsum"
            ),
            mobil(
                R.drawable.mobil8,
                namemobil =  "Boku No Hero The Movie 2",
                descmobil = "Lorem ipsum Lorem ipsum Lorem ipsum Lorem ipsum Lorem ipsum"
            ),
            mobil(
                R.drawable.mobil9,
                namemobil =  "Tonikaku Kawaii",
                descmobil = "Lorem ipsum Lorem ipsum Lorem ipsum Lorem ipsum Lorem ipsum"
            ),
            mobil(
                R.drawable.mobil10,
                namemobil =  "No Game No Life Movie",
                descmobil = "Lorem ipsum Lorem ipsum Lorem ipsum Lorem ipsum Lorem ipsum"
            ),
            mobil(
                R.drawable.mobil12,
                namemobil =  "Kami Sama No Hittai",
                descmobil = "Lorem ipsum Lorem ipsum Lorem ipsum Lorem ipsum Lorem ipsum"
            ),
            mobil(
                R.drawable.mobil13,
                namemobil =  "Sword Art Online movie 3",
                descmobil = "Lorem ipsum Lorem ipsum Lorem ipsum Lorem ipsum Lorem ipsum"
            ),
            mobil(
                R.drawable.mobil14,
                namemobil =  "Doraemon Movie 3",
                descmobil = "Lorem ipsum Lorem ipsum Lorem ipsum Lorem ipsum Lorem ipsum"
            ),
            mobil(
                R.drawable.mobil15,
                namemobil =  "Doraemon Movie 4",
                descmobil = "Lorem ipsum Lorem ipsum Lorem ipsum Lorem ipsum Lorem ipsum"
            )
        )
         val recyclerView = findViewById<RecyclerView>(R.id.rv_anime)
        recyclerView.layoutManager = LinearLayoutManager(this)
        recyclerView.setHasFixedSize(true)
        recyclerView.adapter = MobilAdapter(this,mobilList){
            val intent = Intent (this, DetailmobilActivity::class.java)
            intent.putExtra(INTENT_PARCELABLE, it)
            startActivity(intent)
        }
    }
}