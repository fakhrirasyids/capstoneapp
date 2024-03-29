package com.project.capstoneapp.models

import android.os.Parcelable
import kotlinx.parcelize.Parcelize

@Parcelize
data class Food(
    var foodName: String = "",
    var foodDetail: String = "",
    var foodTime: String = "",
    var foodCal: Int = 0,
) : Parcelable