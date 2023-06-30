package com.coding.meet.datapassactivitytoactivityapp

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import com.coding.meet.datapassactivitytoactivityapp.bundle.BFirstActivity
import com.coding.meet.datapassactivitytoactivityapp.globalvariable.GVFirstActivity
import com.coding.meet.datapassactivitytoactivityapp.intent.FirstActivity
import com.coding.meet.datapassactivitytoactivityapp.parcelable.PFirstActivity
import com.coding.meet.datapassactivitytoactivityapp.serializable.SFirstActivity

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        val intentBtn = findViewById<Button>(R.id.intentBtn)
        intentBtn.setOnClickListener {
            startActivity(Intent(this,FirstActivity::class.java))
        }

        val globalVariableBtn = findViewById<Button>(R.id.globalVariableBtn)
        globalVariableBtn.setOnClickListener {
            startActivity(Intent(this, GVFirstActivity::class.java))
        }

        val bundleBtn = findViewById<Button>(R.id.bundleBtn)
        bundleBtn.setOnClickListener {
            startActivity(Intent(this,BFirstActivity::class.java))
        }

        val serializableBtn = findViewById<Button>(R.id.serializableBtn)
        serializableBtn.setOnClickListener {
            startActivity(Intent(this,SFirstActivity::class.java))
        }

        val parcelableBtn = findViewById<Button>(R.id.parcelableBtn)
        parcelableBtn.setOnClickListener {
            startActivity(Intent(this,PFirstActivity::class.java))
        }
    }
}