package com.diordnadev.androidkotlin.imccalculator

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.TextView
import androidx.core.content.ContextCompat
import com.diordnadev.androidkotlin.R
import com.diordnadev.androidkotlin.imccalculator.ImcCalculatorActivity.Companion.IMC_KEY

class ResultImcActivity : AppCompatActivity() {

    private lateinit var tvResult: TextView
    private lateinit var tvIMC: TextView
    private lateinit var tvDescription: TextView
    private lateinit var btnRecalculate: Button

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_result_imc)

        val result = intent.extras?.getDouble(IMC_KEY) ?: -1.0

        initComponents()
        initListeners()
        initUI(result)
    }

    private fun initComponents() {
        tvResult = findViewById(R.id.tvResult)
        tvIMC = findViewById(R.id.tvIMC)
        tvDescription = findViewById(R.id.tvDescription)
        btnRecalculate = findViewById(R.id.btnRecalculate)
    }

    private fun initListeners() {
        btnRecalculate.setOnClickListener {
            onBackPressedDispatcher.onBackPressed()
        }
    }

    private fun initUI(result: Double){
        tvIMC.text = result.toString()
        when(result){
            in 0.00..18.50 -> { //bajo peso
                tvResult.text = getString(R.string.underweight_title)
                tvResult.setTextColor(ContextCompat.getColor(this, R.color.underweight))
                tvDescription.text = getString(R.string.underweight_description)
            }
            in 18.51..24.99 -> { //peso normal
                tvResult.text = getString(R.string.normal_title)
                tvResult.setTextColor(ContextCompat.getColor(this, R.color.normal))
                tvDescription.text = getString(R.string.normal_description)
            }
            in 25.00..29.99 -> { //sobrepeso
                tvResult.text = getString(R.string.overweight_title)
                tvResult.setTextColor(ContextCompat.getColor(this, R.color.overweight))
                tvDescription.text = getString(R.string.overweight_description)
            }
            in 30.00..99.99 -> { //obesidad
                tvResult.text = getString(R.string.obesity_title)
                tvResult.setTextColor(ContextCompat.getColor(this, R.color.obesity))
                tvDescription.text = getString(R.string.obesity_description)
            }
            else -> {//error
                tvIMC.text = getString(R.string.error)
                tvResult.text = getString(R.string.error)
                tvDescription.text = getString(R.string.error)
            }
        }
    }

}