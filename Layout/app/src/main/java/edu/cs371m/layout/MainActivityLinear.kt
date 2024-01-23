package edu.cs371m.layout

import android.content.Intent
import android.os.Bundle
import android.util.Log
import androidx.appcompat.app.AppCompatActivity
import edu.cs371m.layout.databinding.ActivityMainLinearBinding

class MainActivityLinear : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        val activityMainLinearBinding = ActivityMainLinearBinding.inflate(layoutInflater)
        setContentView(activityMainLinearBinding.root)

        Log.d("INFO", "Created MainActivityLinear")
        activityMainLinearBinding.button5.setOnClickListener {
            Log.d("INFO", "Clicked B1")
            val getMainActivityIntent = Intent(this, MainActivity::class.java)
            startActivity(getMainActivityIntent)
        }
    }
}
