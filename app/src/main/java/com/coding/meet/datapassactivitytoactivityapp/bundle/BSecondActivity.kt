package com.coding.meet.datapassactivitytoactivityapp.bundle

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.TextView
import com.coding.meet.datapassactivitytoactivityapp.R

class BSecondActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_bsecond)

        val rollNoTxt = findViewById<TextView>(R.id.rollNoTxt)
        val nameTxt = findViewById<TextView>(R.id.nameTxt)
        val ageTxt = findViewById<TextView>(R.id.ageTxt)
        val salaryTxt = findViewById<TextView>(R.id.salaryTxt)
        val genderTxt = findViewById<TextView>(R.id.genderTxt)

        val bundle = intent.getBundleExtra("user")!!
        rollNoTxt.text = bundle.getLong("rollNo",0).toString()
        nameTxt.text = bundle.getString("name")!!
        ageTxt.text = bundle.getInt("age",0).toString()
        salaryTxt.text = bundle.getDouble("salary",0.0).toString()
        genderTxt.text = if(bundle.getBoolean("gender",true)) "Male" else "Female"
    }
}