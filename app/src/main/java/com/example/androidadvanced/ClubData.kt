package com.example.androidadvanced

var dataList= mutableListOf<ClubData>()
val CLUB_ID_EXTRA ="clubExtra"
data class ClubData(
    val Clublogo:Int,
    val Clubname:String,
    val id:Int?= dataList.size
)
