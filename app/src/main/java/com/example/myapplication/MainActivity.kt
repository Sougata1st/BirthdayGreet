package com.example.myapplication

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Toast
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
    }

    fun createbirthdaymessage(view: View) {
        val name=Nameinput.editableText.toString()
//        Toast.makeText(this,"name is $name",Toast.LENGTH_SHORT).show()
        if(name.length==0) {
            Toast.makeText(this,"please enter your name",Toast.LENGTH_SHORT).show()
        }else{
            val intent = Intent(this, BirthdayGreetingActivity::class.java)
            intent.putExtra(BirthdayGreetingActivity.NAME_EXTRA, name)
            startActivity(intent)
        }
    }
}