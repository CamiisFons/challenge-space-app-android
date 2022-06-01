package com.devpass.spaceapp.data.model


import android.os.Parcelable
import com.google.gson.annotations.SerializedName
import kotlinx.android.parcel.Parcelize

@Parcelize
data class NextLauchesItem(

    @SerializedName("name") val name: String?,
    @SerializedName("date_local") val dateLocal: String?,
    @SerializedName("flight_number") val flightNumber: Int?,
    @SerializedName("links")  val links: Links?,
    @SerializedName("success") val success: Boolean?

):Parcelable
