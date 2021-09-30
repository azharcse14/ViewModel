package com.azhar.viewmodel

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.TextView
import androidx.lifecycle.ViewModelProvider

class MainActivity : AppCompatActivity() {

    lateinit var textView:TextView
    lateinit var mainViewModel:MainViewModel


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        textView = findViewById(R.id.textCounter)

        mainViewModel = ViewModelProvider(this).get(MainViewModel::class.java)
    }

    fun increment(view: android.view.View) {

        mainViewModel.increment()
        textView.text = mainViewModel.i.toString()

//        i++
//        textView.text = i.toString()
////        setText()
    }
//
//    private fun setText() {
//        textView.text = i.toString()
//    }
}