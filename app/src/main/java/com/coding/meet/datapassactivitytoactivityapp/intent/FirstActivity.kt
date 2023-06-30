package com.coding.meet.datapassactivitytoactivityapp.intent

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.RadioGroup
import com.coding.meet.datapassactivitytoactivityapp.R

class FirstActivity : AppCompatActivity() {
    var genderState = true  // default gender state is true and male default selected
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_first)

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
            }  else if (edAge.text.toString().isEmpty()){
                edAge.error = "Required"
            }  else if (edSalary.text.toString().isEmpty()){
                edSalary.error = "Required"
            } else {
                // please variable name change like sendDataIntent, nextIntent, nextYourActivityNameIntent
                // do not variable name intent
                val sendDataIntent = Intent(this,SecondActivity::class.java).apply {

                    // Long
                    putExtra("rollNo",edRollNo.text.toString().toLong())

                    // String
                    putExtra("name",edName.text.toString())

                    // int
                    putExtra("age",edAge.text.toString().toInt())

                    // Double
                    putExtra("salary",edSalary.text.toString().toDouble())

                    // Boolean
                    putExtra("gender",genderState)
                }
                startActivity(sendDataIntent)
            }
        }
    }
}