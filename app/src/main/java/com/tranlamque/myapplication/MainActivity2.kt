package com.tranlamque.myapplication

import android.annotation.SuppressLint
import android.content.Context
import android.os.Bundle
import android.widget.Button
import android.widget.TextView
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat
import com.tranlamque.myapplication.R

class MainActivity2 : AppCompatActivity() {
    var context: Context = this
    @SuppressLint("MissingInflatedId")
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main2)
        var btnGet=findViewById<Button>(R.id.btnGetData)
        var tvKQ=findViewById<TextView>(R.id.tvKQ)
        val fn1 = VolleyFn1()
        btnGet!!.setOnClickListener {
            fn1.getALLData(context,tvKQ!!)
        }
    }
}