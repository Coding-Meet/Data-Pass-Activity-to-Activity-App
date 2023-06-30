package com.coding.meet.datapassactivitytoactivityapp.bundle

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.RadioGroup
import com.coding.meet.datapassactivitytoactivityapp.R

class BFirstActivity : AppCompatActivity() {
    var genderState = true // default gender state is true and male default selected
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_bfirst)

        val edRollNo = findViewById<EditText>(R.id.edRollNo)
        val edName = findViewById<EditText>(R.id.edName)
        val edAge = findViewById<EditText>(R.id.edAge)
        val edSalary = findViewById<EditText>(R.id.edSalary)

        val genderRG = findViewById<RadioGroup>(R.id.genderRG)
        genderRG.setOnCheckedChangeListener { _, id ->
            if (id == R.id.radioMale){
                genderState = true
            }else if (id == R.id.radioFemale){
                genderState = false
            }
        }

        val sendDataBtn = findViewById<Button>(R.id.sendDataBtn)
        sendDataBtn.setOnClickListener {
            if (edRollNo.text.toString().isEmpty()){
                edRollNo.error = "Required"
            } else if (edName.text.toString().isEmpty()){
                edName.error = "Required"
            } else if (edAge.text.toString().isEmpty()){
                edAge.error = "Required"
            } else if (edSalary.text.toString().isEmpty()){
                edSalary.error = "Required"
            } else {
                // please variable name change like sendDataIntent, nextIntent, nextYourActivityNameIntent
                // do not variable name intent
                val sendDataIntent = Intent(this,BSecondActivity::class.java)

                val bundle = Bundle().apply {
                    //Long
                    putLong("rollNo",edRollNo.text.toString().toLong())

                    // String
                    putString("name",edName.text.toString())

                    // Int
                    putInt("age",edAge.text.toString().toInt())

                    // Double
                    putDouble("salary",edSalary.text.toString().toDouble())

                    // Boolean
                    putBoolean("gender",genderState)
                }
                sendDataIntent.putExtra("user",bundle)
                startActivity(sendDataIntent)
            }
        }
    }
}