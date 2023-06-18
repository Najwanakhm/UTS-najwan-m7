package com.example.uts_Najwan

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.fragment.app.Fragment
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import com.example.uts_Najwan.databinding.ActivityMainBinding
import com.example.uts_najwan.Home
import com.example.uts_najwan.Profile
import com.example.uts_najwan.mobil

class MainActivity : AppCompatActivity() {

    private lateinit var binding : ActivityMainBinding

    companion object{
        val INTENT_PARCELABLE = "OBJECT_INTENT"
    }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)
        replaceFragment(Home())

        binding.bottomNavigationView.setOnItemSelectedListener {

            when(it.itemId){
                R.id.home_button -> replaceFragment(Home())
                R.id.profile_button -> replaceFragment(Profile())

                else ->{

                }
            }
            true

        }


        val mobilList = listOf<mobil>(
            mobil(
                R.drawable.mobil1,
                namemobil =  "Xenia",
                descmobil = "Lorem ipsum Lorem ipsum Lorem ipsum Lorem ipsum Lorem ipsum"
            ),
            mobil(
                R.drawable.mobil2,
                namemobil =  "Avanza",
                descmobil = "Lorem ipsum Lorem ipsum Lorem ipsum Lorem ipsum Lorem ipsum"
            ),
            mobil(
                R.drawable.mobil3,
                namemobil =  "Ayla",
                descmobil = "Lorem ipsum Lorem ipsum Lorem ipsum Lorem ipsum Lorem ipsum"
            ),
            mobil(
                R.drawable.mobil4,
                namemobil =  "Brio",
                descmobil = "Lorem ipsum Lorem ipsum Lorem ipsum Lorem ipsum Lorem ipsum"
            ),
            mobil(
                R.drawable.mobil5,
                namemobil =  "Civic",
                descmobil = "Lorem ipsum Lorem ipsum Lorem ipsum Lorem ipsum Lorem ipsum"
            ),
            mobil(
                R.drawable.mobil6,
                namemobil =  "Fortuner",
                descmobil = "Lorem ipsum Lorem ipsum Lorem ipsum Lorem ipsum Lorem ipsum"
            ),
            mobil(
                R.drawable.mobil7,
                namemobil=  "HRV",
                descmobil = "Lorem ipsum Lorem ipsum Lorem ipsum Lorem ipsum Lorem ipsum"
            ),
            mobil(
                R.drawable.mobil8,
                namemobil =  "CHR",
                descmobil = "Lorem ipsum Lorem ipsum Lorem ipsum Lorem ipsum Lorem ipsum"
            ),
            mobil(
                R.drawable.mobil9,
                namemobil =  "Inova",
                descmobil = "Lorem ipsum Lorem ipsum Lorem ipsum Lorem ipsum Lorem ipsum"
            ),
            mobil(
                R.drawable.mobil10,
                namemobil =  "Jazz",
                descmobil = "Lorem ipsum Lorem ipsum Lorem ipsum Lorem ipsum Lorem ipsum"
            ),
            mobil(
                R.drawable.mobil12,
                namemobil =  "Raize",
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
//         val recyclerView = findViewById<RecyclerView>(R.id.rv_anime)
//        recyclerView.layoutManager = LinearLayoutManager(this)
//        recyclerView.setHasFixedSize(true)
//        recyclerView.adapter = MobilAdapter(this,mobilList){
//            val intent = Intent (this, DetailmobilActivity::class.java)
//            intent.putExtra(INTENT_PARCELABLE, it)
//            startActivity(intent)
//        }
    }

    private fun replaceFragment(fragment: Fragment){

        val fragmentManager = supportFragmentManager
        val fragmentTransaction = fragmentManager.beginTransaction()
        fragmentTransaction.replace(R.id.frame_layout, fragment)
        fragmentTransaction.commit()
    }
}