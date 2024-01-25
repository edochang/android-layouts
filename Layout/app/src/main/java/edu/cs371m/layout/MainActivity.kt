package edu.cs371m.layout

import android.content.Intent
import android.os.Bundle
import android.util.Log
import androidx.appcompat.app.AppCompatActivity
import com.google.android.material.snackbar.BaseTransientBottomBar
import com.google.android.material.snackbar.Snackbar
import edu.cs371m.layout.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        val activityMainBinding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(activityMainBinding.root)

        Log.d("INFO", "Created MainActivity")

        val activitySet = "Constraint Layout Activity"
        val myActivitySnackbar = Snackbar.make(
            activityMainBinding.root,
            activitySet,
            BaseTransientBottomBar.LENGTH_SHORT
        )
        myActivitySnackbar.show()

        activityMainBinding.button.setOnClickListener {
            Log.d("INFO", "Clicked B1")
            val getMainActivityLinearIntent = Intent(this, MainActivityLinear::class.java)
            startActivity(getMainActivityLinearIntent)
        }

        activityMainBinding.button2.setOnClickListener {
            Log.d("INFO", "Clicked B2")
            val getAiActivityIntent = Intent(this, AiActivity::class.java)
            startActivity(getAiActivityIntent)
        }
    }
}
