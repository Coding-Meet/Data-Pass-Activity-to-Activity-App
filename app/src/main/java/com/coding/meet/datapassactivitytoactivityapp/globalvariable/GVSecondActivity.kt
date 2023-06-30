package com.coding.meet.datapassactivitytoactivityapp.globalvariable

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.TextView
import com.coding.meet.datapassactivitytoactivityapp.R

class GVSecondActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_gvsecond)
        
        val idTxt = findViewById<TextView>(R.id.idTxt)
        val nameTxt = findViewById<TextView>(R.id.nameTxt)
        val ageTxt = findViewById<TextView>(R.id.ageTxt)
        val salaryTxt = findViewById<TextView>(R.id.salaryTxt)
        val genderTxt = findViewById<TextView>(R.id.genderTxt)

//        // First Way
//        idTxt.text = Common.id.toString()
//        nameTxt.text = Common.name
//        ageTxt.text = Common.age.toString()
//        salaryTxt.text = Common.salary.toString()
//        genderTxt.text = if (Common.gender) "Male" else "Female"


        //Second Way same OutPut
        val profile = Common.Profile
        idTxt.text = profile.id.toString()
        nameTxt.text = profile.name
        ageTxt.text = profile.age.toString()
        salaryTxt.text = profile.salary.toString()
        genderTxt.text = if (profile.gender) "Male" else "Female"

    }
}