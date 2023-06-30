package com.coding.meet.datapassactivitytoactivityapp.intent

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.TextView
import com.coding.meet.datapassactivitytoactivityapp.R

class SecondActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_second)

        val idTxt = findViewById<TextView>(R.id.idTxt)
        val nameTxt = findViewById<TextView>(R.id.nameTxt)
        val ageTxt = findViewById<TextView>(R.id.ageTxt)
        val salaryTxt = findViewById<TextView>(R.id.salaryTxt)
        val genderTxt = findViewById<TextView>(R.id.genderTxt)

        idTxt.text = intent.getLongExtra("rollNo", 0).toString()
        nameTxt.text = intent.getStringExtra("name")!!
        ageTxt.text = intent.getIntExtra("age", 0).toString()
        salaryTxt.text = intent.getDoubleExtra("salary", 0.0).toString()
        genderTxt.text = if (intent.getBooleanExtra("gender", true)) {
            "Male"
        } else {
            "Female"
        }

    }
}