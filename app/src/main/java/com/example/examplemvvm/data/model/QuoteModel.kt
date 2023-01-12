package com.example.examplemvvm.data.model
//SerializedName es para saber el nombre que recibiremos del Backend y lo ingrese
//en el parametro apropiadamente
import com.google.gson.annotations.SerializedName

data class QuoteModel(@SerializedName("quote") val quote:String, @SerializedName("author") val author:String)
