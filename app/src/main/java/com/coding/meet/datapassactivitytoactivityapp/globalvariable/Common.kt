package com.coding.meet.datapassactivitytoactivityapp.globalvariable

class Common {
    companion object {

        // First Way
        var id : Long = 0
        var name = ""
        var age = 0
        var salary: Double = 0.0
        var gender = true


        var Profile = Profile() /// default value
    }
}
data class Profile(
    var id : Long = 0,
    var name :String= "",
    var age :Int= 0,
    var salary: Double = 0.0,
    var gender :Boolean= true
)