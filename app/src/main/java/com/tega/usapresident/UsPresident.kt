package com.tega.usapresident

import android.os.Parcelable
import kotlinx.android.parcel.Parcelize

@Parcelize
data class UsPresident(
    val imageSrc : Int,
    val firstName: String,
    val lastName : String
) : Parcelable
