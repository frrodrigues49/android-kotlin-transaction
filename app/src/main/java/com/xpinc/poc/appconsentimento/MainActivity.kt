package com.xpinc.poc.appconsentimento

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        btn_confirmpayment.setOnClickListener{
            openNextActivity()
        }
    }

    private fun openNextActivity() {
        val intent = Intent(this, RedirectActivity::class.java)
        startActivity(intent)
    }
}
