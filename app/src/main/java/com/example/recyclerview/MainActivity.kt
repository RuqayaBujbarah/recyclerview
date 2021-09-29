package com.example.recyclerview

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        var btn = findViewById<Button>(R.id.btn)
        var ctxt = findViewById<EditText>(R.id.ctxt)
        var colors = ArrayList<String>()
        val myRV = findViewById<RecyclerView>(R.id.rvMain)

        colors.add("Red")
        colors.add("Green")

        myRV.adapter = RecyclerViewAdapter(colors)
        myRV.layoutManager = LinearLayoutManager(this)

        btn.setOnClickListener(){
            colors.add("${ctxt.text}")
            myRV.adapter = RecyclerViewAdapter(colors)
        }
    }
}