package com.mhyne.template.ui.walisantri

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.TextView
import com.mhyne.template.R

class DashboardWaliActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_dashboard_wali)

        onclick()
    }

    private fun onclick(){
        val back = findViewById<TextView>(R.id.imageview)

        back.setOnClickListener {
            onBackPressed()
            onSupportNavigateUp()
        }
    }

}