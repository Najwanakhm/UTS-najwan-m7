package com.example.uts_Najwan

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.ImageView
import android.widget.TextView
import com.example.uts_najwan.mobil

class DetailmobilActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_detail_mobil)

        supportActionBar?.setDisplayHomeAsUpEnabled(true)

        val mobil = intent.getParcelableExtra<mobil>(MainActivity.INTENT_PARCELABLE)

        val imgmobil = findViewById<ImageView>(R.id.img_item_photo)
        val namemobil = findViewById<TextView>(R.id.tv_item_name)
        val descmobil = findViewById<TextView>(R.id.tv_item_description)

        imgmobil.setImageResource(mobil?.imgmobil!!)
        namemobil.text = mobil.namemobil
        descmobil.text = mobil.descmobil

    }

    override fun onSupportNavigateUp(): Boolean {

        onBackPressed()
        return true
    }
}