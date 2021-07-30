package com.proway.primeiroprojetoandroid.ui

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.proway.primeiroprojetoandroid.R
import com.proway.primeiroprojetoandroid.classes.SingletonTest

class ApplicationActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_application)


        SingletonTest.uid

    }
}