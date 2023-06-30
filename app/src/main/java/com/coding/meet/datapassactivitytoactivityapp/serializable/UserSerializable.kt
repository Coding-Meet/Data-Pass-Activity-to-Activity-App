package com.coding.meet.datapassactivitytoactivityapp.serializable

import java.io.Serializable

data class UserSerializable(
    val id : Long = 0,
    val name : String = "",
    val age : Int = 0,
    val salary : Double = 0.0,
    val gender : Boolean = true
) : Serializable