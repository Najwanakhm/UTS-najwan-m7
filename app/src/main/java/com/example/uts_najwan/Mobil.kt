package com.example.uts_najwan

import android.os.Parcelable
import kotlinx.android.parcel.Parcelize

@Parcelize
data class mobil (
    val imgmobil: Int,
    val namemobil: String,
    val descmobil: String
) : Parcelable