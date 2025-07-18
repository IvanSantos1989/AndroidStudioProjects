package com.example.welcomelogin

import android.content.Intent
import android.os.Bundle
import android.os.Handler
import android.os.Looper
import androidx.appcompat.app.AppCompatActivity

class SplashScreenActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_splash_screen)

        Handler(Looper.getMainLooper()).postDelayed({
            // Start the MainActivity after a delay
            val intent = Intent(this, MainActivity::class.java)
            startActivity(intent)
            finish() // Finish the SplashScreenActivity so it can't be returned to
        }, 3000) // 3000 milliseconds = 3 seconds
    }
}