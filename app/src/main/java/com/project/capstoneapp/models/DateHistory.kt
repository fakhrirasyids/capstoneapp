package com.project.capstoneapp.models

import android.os.Parcelable
import kotlinx.parcelize.Parcelize

@Parcelize
data class DateHistory(
    var day: String = "",
    var date: Int = 0,
    var isSelected: Boolean = false
) : Parcelable
