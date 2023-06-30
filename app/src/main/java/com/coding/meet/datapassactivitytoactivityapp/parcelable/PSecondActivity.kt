package com.coding.meet.datapassactivitytoactivityapp.parcelable

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.TextView
import com.coding.meet.datapassactivitytoactivityapp.R

class PSecondActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_psecond)

        val idTxt = findViewById<TextView>(R.id.idTxt)
        val nameTxt = findViewById<TextView>(R.id.nameTxt)
        val ageTxt = findViewById<TextView>(R.id.ageTxt)
        val salaryTxt = findViewById<TextView>(R.id.salaryTxt)
        val genderTxt = findViewById<TextView>(R.id.genderTxt)

        val userParcelable = getParcelable("user",UserParcelable::class.java)
        idTxt.text = userParcelable.id.toString()
        nameTxt.text = userParcelable.name
        ageTxt.text = userParcelable.age.toString()
        salaryTxt.text = userParcelable.salary.toString()
        genderTxt.text = if(userParcelable.gender) "Male" else "Female"

    }
}