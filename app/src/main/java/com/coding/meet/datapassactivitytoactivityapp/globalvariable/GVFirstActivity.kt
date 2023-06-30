package com.coding.meet.datapassactivitytoactivityapp.globalvariable

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.RadioGroup
import com.coding.meet.datapassactivitytoactivityapp.R

class GVFirstActivity : AppCompatActivity() {
    var genderState = true  // default gender state is true and male default selected
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_gvfirst)

        val edName = findViewById<EditText>(R.id.edName)
        val edRollNo = findViewById<EditText>(R.id.edRollNo)
        val edSalary = findViewById<EditText>(R.id.edSalary)
        val edAge = findViewById<EditText>(R.id.edAge)


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
            if (edName.text.toString().isEmpty()){
                edName.error = "Required"
            }else if (edRollNo.text.toString().isEmpty()){
                edRollNo.error = "Required"
            }else if (edSalary.text.toString().isEmpty()){
                edSalary.error = "Required"
            }else if (edAge.text.toString().isEmpty()){
                edAge.error = "Required"
            }else {
//                // First Way
//                Common.id = edRollNo.text.toString().toLong()
//                Common.name = edName.text.toString()
//                Common.age = edAge.text.toString().toInt()
//                Common.salary = edSalary.text.toString().toDouble()
//                Common.gender = genderState

                // Second Way
                Common.Profile = Profile(
                    edRollNo.text.toString().toLong(),
                    edName.text.toString(),
                    edAge.text.toString().toInt(),
                    edSalary.text.toString().toDouble(),
                    genderState
                )

                // please variable name change like sendDataIntent, nextIntent, nextYourActivityNameIntent
                // do not variable name intent
                val sendDataIntent = Intent(this,GVSecondActivity::class.java)
                startActivity(sendDataIntent)
            }
        }
    }
}