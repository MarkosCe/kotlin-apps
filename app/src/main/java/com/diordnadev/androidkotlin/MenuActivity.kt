package com.diordnadev.androidkotlin

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import androidx.appcompat.widget.AppCompatButton
import com.diordnadev.androidkotlin.firstapp.FirstAppActivity
import com.diordnadev.androidkotlin.imccalculator.ImcCalculatorActivity
import com.diordnadev.androidkotlin.settings.SettingsActivity
import com.diordnadev.androidkotlin.superheroapp.SuperHeroListActivity
import com.diordnadev.androidkotlin.todoapp.TodoActivity

class MenuActivity : AppCompatActivity() {

    private lateinit var btnFirstApp: AppCompatButton
    private lateinit var btnImcApp: AppCompatButton
    private lateinit var btnTODO: AppCompatButton
    private lateinit var btnHeroApp: AppCompatButton
    private lateinit var btnSettings: AppCompatButton

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_menu)

        initComponents()
        initListeners()
    }

    private fun initComponents(){
        btnFirstApp = findViewById(R.id.btnFirstApp)
        btnImcApp = findViewById(R.id.btnImcApp)
        btnTODO = findViewById(R.id.btnTODO)
        btnHeroApp = findViewById(R.id.btnHeroApp)
        btnSettings = findViewById(R.id.btnSettings)
    }

    private fun initListeners(){
        btnFirstApp.setOnClickListener {
            navigateToFirstApp()
        }
        btnImcApp.setOnClickListener {
            navigateToImcApp()
        }
        btnTODO.setOnClickListener {
            navigateToTodoApp()
        }
        btnHeroApp.setOnClickListener { navigateToHeroApp() }
        btnSettings.setOnClickListener { navigateToSettings() }
    }


    private fun navigateToFirstApp() {
        val intent = Intent(this, FirstAppActivity::class.java)
        startActivity(intent)
    }

    private fun navigateToImcApp(){
        val intent = Intent(this, ImcCalculatorActivity::class.java)
        startActivity(intent)
    }

    private fun navigateToTodoApp() {
        val intent = Intent(this, TodoActivity::class.java)
        startActivity(intent)
    }

    private fun navigateToHeroApp(){
        val intent = Intent(this, SuperHeroListActivity::class.java)
        startActivity(intent)
    }

    private fun navigateToSettings() {
        val intent = Intent(this, SettingsActivity::class.java)
        startActivity(intent)
    }
}
