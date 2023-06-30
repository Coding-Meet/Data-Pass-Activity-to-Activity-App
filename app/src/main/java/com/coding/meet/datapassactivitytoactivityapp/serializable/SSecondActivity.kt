package com.coding.meet.datapassactivitytoactivityapp.serializable

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.TextView
import com.coding.meet.datapassactivitytoactivityapp.R

class SSecondActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_ssecond)

        val rollNoTxt = findViewById<TextView>(R.id.rollNoTxt)
        val nameTxt = findViewById<TextView>(R.id.nameTxt)
        val ageTxt = findViewById<TextView>(R.id.ageTxt)
        val salaryTxt = findViewById<TextView>(R.id.salaryTxt)
        val genderTxt = findViewById<TextView>(R.id.genderTxt)


        val userSerializable = getSerializable("user",UserSerializable::class.java)
        rollNoTxt.text = userSerializable.id.toString()
        nameTxt.text = userSerializable.name
        ageTxt.text = userSerializable.age.toString()
        salaryTxt.text = userSerializable.salary.toString()
        genderTxt.text = if (userSerializable.gender) "Male" else "Female"
    }
}