package edu.cs371m.layout

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import edu.cs371m.layout.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        val activityMainBinding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(activityMainBinding.root)

        Log.d("INFO", "Created MainActivity")
        activityMainBinding.button.setOnClickListener {
            Log.d("INFO", "Clicked B1")
            val getMainActivityLinearIntent = Intent(this, MainActivityLinear::class.java)
            startActivity(getMainActivityLinearIntent)
        }
    }
}
