package com.yazag.navigationhomework.data.model

import android.os.Parcelable
import kotlinx.parcelize.Parcelize

@Parcelize
data class Results(
    val person : Personal,
    val football : String,
    val feeling : String,
    val social : String
) : Parcelable