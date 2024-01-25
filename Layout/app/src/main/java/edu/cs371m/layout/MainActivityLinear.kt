package edu.cs371m.layout

import android.content.Intent
import android.os.Bundle
import android.util.Log
import androidx.appcompat.app.AppCompatActivity
import com.google.android.material.snackbar.BaseTransientBottomBar
import com.google.android.material.snackbar.Snackbar
import edu.cs371m.layout.databinding.ActivityMainLinearBinding

class MainActivityLinear : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        val activityMainLinearBinding = ActivityMainLinearBinding.inflate(layoutInflater)
        setContentView(activityMainLinearBinding.root)

        Log.d("INFO", "Created MainActivityLinear")

        val activityLinearSet = "Linear Layout Activity"
        val myActivityLinearSnackbar = Snackbar.make(
            activityMainLinearBinding.root,
            activityLinearSet,
            BaseTransientBottomBar.LENGTH_SHORT)
        myActivityLinearSnackbar.show()

        activityMainLinearBinding.button5.setOnClickListener {
            Log.d("INFO", "Clicked B1")
            val getMainActivityIntent = Intent(this, MainActivity::class.java)
            startActivity(getMainActivityIntent)
        }

        activityMainLinearBinding.button6.setOnClickListener {
            Log.d("INFO", "Clicked B2")
            val getAiActivityIntent = Intent(this, AiActivity::class.java)
            startActivity(getAiActivityIntent)
        }
    }
}
