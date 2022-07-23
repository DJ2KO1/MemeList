package com.example.memelist.model

import android.os.Parcelable
import com.google.gson.annotations.SerializedName
import kotlinx.parcelize.Parcelize


data class MemeResponse(
    val data: List<MemeItem>,
    val next: String
)

@Parcelize
data class MemeItem(
    @SerializedName("ID")
    val id: Int? = null,
    val bottomText: String? = null,
    val image:String? = null,
    val name: String? = null,
    val rank: Int? = null,
    val tags: String? = null,
    val topText: String? = null
) : Parcelable

@Parcelize
data class IDResponse(
    val data: MemeItem
) : Parcelable