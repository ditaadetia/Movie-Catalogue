package com.ditadetian.moviecatalogue.ui.splash

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.os.Handler
import android.os.Looper
import android.view.Window
import android.widget.TextView
import com.ditadetian.moviecatalogue.R
import com.ditadetian.moviecatalogue.ui.home.HomeActivity

class SplashActivity : AppCompatActivity() {
    var tvSplash: TextView? = null
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        this.requestWindowFeature(Window.FEATURE_NO_TITLE)
        setContentView(R.layout.activity_splash)
        tvSplash = findViewById(R.id.tvSplash)

        Handler(Looper.getMainLooper()).postDelayed({
            startActivity(Intent(applicationContext, HomeActivity::class.java))
            finish()
        }, 3000L) //3000 L = 3 detik

    }
}