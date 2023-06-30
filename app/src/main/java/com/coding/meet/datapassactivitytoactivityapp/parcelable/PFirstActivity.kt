package com.coding.meet.datapassactivitytoactivityapp.parcelable

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.RadioGroup
import com.coding.meet.datapassactivitytoactivityapp.R

class PFirstActivity : AppCompatActivity() {
    var genderState = true // default gender state is true and male default selected
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_pfirst)

        val edId = findViewById<EditText>(R.id.edId)
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
            if (edId.text.toString().isEmpty()){
                edId.error = "Required"
            } else if (edName.text.toString().isEmpty()){
                edName.error = "Required"
            } else if (edAge.text.toString().isEmpty()){
                edAge.error = "Required"
            } else if (edSalary.text.toString().isEmpty()){
                edSalary.error = "Required"
            } else {
                val userParcelable = UserParcelable(
                    edId.text.toString().toLong(),
                    edName.text.toString(),
                    edAge.text.toString().toInt(),
                    edSalary.text.toString().toDouble(),
                    genderState
                )

                // please variable name change like sendDataIntent, nextIntent, nextYourActivityNameIntent
                // do not variable name intent
                val sendDataIntent = Intent(this,PSecondActivity::class.java)
                sendDataIntent.putExtra("user",userParcelable)
                startActivity(sendDataIntent)
            }
        }
    }
}