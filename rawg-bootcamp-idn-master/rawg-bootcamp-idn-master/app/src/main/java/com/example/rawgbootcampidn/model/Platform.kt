package com.example.rawgbootcampidn.model


import android.os.Parcelable
import com.google.gson.annotations.SerializedName
import kotlinx.parcelize.Parcelize

@Parcelize
data class Platform(
    @SerializedName("id")
    val id: Int?,
    @SerializedName("name")
    val name: String?
):Parcelable