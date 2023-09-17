package com.yazag.navigationhomework.data.model

import android.os.Parcelable
import kotlinx.parcelize.Parcelize

@Parcelize
data class Personal(
    val name:String,
    val mail:String,
    val phone:String,
    val city:String,
    val live:String
) : Parcelable
