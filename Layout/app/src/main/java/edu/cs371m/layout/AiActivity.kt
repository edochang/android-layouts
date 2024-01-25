package edu.cs371m.layout

import android.content.Intent
import android.os.Bundle
import android.util.Log
import androidx.appcompat.app.AppCompatActivity
import com.google.android.material.snackbar.BaseTransientBottomBar
import com.google.android.material.snackbar.Snackbar
import edu.cs371m.layout.databinding.AiChallengeBinding

class AiActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        val aiChallengeBinding = AiChallengeBinding.inflate(layoutInflater)
        setContentView(aiChallengeBinding.root)

        Log.d("INFO", "Created AiActivityLinear")

        val activityAiSet = "AI Challenge Activity"
        val myActivityAiSnackbar = Snackbar.make(
            aiChallengeBinding.root,
            activityAiSet,
            BaseTransientBottomBar.LENGTH_SHORT)
        myActivityAiSnackbar.show()

        aiChallengeBinding.aibutton.setOnClickListener {
            Log.d("INFO", "Clicked 1")
            val getMainActivityIntent = Intent(this, MainActivity::class.java)
            startActivity(getMainActivityIntent)
        }

        aiChallengeBinding.aibutton2.setOnClickListener {
            Log.d("INFO", "Clicked 2")
            val getMainActivityLinearIntent = Intent(this, MainActivityLinear::class.java)
            startActivity(getMainActivityLinearIntent)
        }
    }

}