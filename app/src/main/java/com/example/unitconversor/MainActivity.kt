package com.example.unitconversor

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle;
import android.widget.ArrayAdapter;
import android.widget.Spinner;


class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val spinner = findViewById<Spinner>(R.id.spinner_source)

        val unidadesIntroducir = resources.getStringArray(R.array.unitsConversion)
        if (spinner != null){
            val adapter = ArrayAdapter(this, android.R.layout.simple_spinner_item, unidadesIntroducir)
            spinner.adapter = adapter

        }

    }
}