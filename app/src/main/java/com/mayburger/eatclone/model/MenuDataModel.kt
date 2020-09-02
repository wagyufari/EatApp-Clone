package com.mayburger.eatclone.model

import com.google.gson.annotations.SerializedName
import java.io.Serializable

data class MenuDataModel(
    @SerializedName("id")
    val id:String? = null,
    @SerializedName("name")
    val name:String? = null,
    @SerializedName("currency")
    val currency:String? = null,
    @SerializedName("price")
    val price:Int = 0,
    @SerializedName("image")
    val image:String? = null,
    @SerializedName("quantity")
    var quantity:Int = 0
):Serializable