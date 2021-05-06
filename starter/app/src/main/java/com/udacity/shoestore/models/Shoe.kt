package com.udacity.shoestore.models

import android.os.Parcelable
import kotlinx.android.parcel.Parcelize

@Parcelize
data class Shoe(var name: String="name", var size: String="size", var company: String="company", var description: String="description",
                val images: List<String> = mutableListOf()) : Parcelable