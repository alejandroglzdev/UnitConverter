package com.example.unitconversor

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.unitconversor.databinding.ActivityConverterBinding

class ConverterActivity : AppCompatActivity() {
    private lateinit var binding: ActivityConverterBinding
    //TODO: Tipo de sistema a convertir

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        binding = ActivityConverterBinding.inflate(layoutInflater)
        setContentView(binding.root)
        configureUI()
    }

    private fun configureUI() {
        binding.button1.setOnClickListener { addNumber("1") }
        binding.button2.setOnClickListener { addNumber("2") }
        binding.button3.setOnClickListener { addNumber("3") }
        binding.button4.setOnClickListener { addNumber("4") }
        binding.button5.setOnClickListener { addNumber("5") }
        binding.button6.setOnClickListener { addNumber("6") }
        binding.button7.setOnClickListener { addNumber("7") }
        binding.button8.setOnClickListener { addNumber("8") }
        binding.button9.setOnClickListener { addNumber("9") }
        binding.button0.setOnClickListener { addNumber("0") }
        binding.buttonPeriod.setOnClickListener { addNumber(",") }
        binding.buttonClear.setOnClickListener { clearInput() }
    }

    private fun addNumber(character: String) {
        if (character.equals(",")) {
            if (binding.textviewSourceValue.text.isEmpty() || binding.textviewSourceValue.text.contains(',')) {
                return
            }
        }
        binding.textviewSourceValue.setText(binding.textviewSourceValue.text.toString() + character)
        convert()
    }

    private fun clearInput() {
        binding.textviewSourceValue.setText("")
    }

    private fun convert() {
        // val sourceInt = Integer.parseInt(binding.textviewSourceValue.text.toString())
        val sourceInt = binding.textviewSourceValue.text.toString()
        binding.textviewDestinyValue.setText(sourceInt)
    }
}