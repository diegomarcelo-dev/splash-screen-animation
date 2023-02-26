package com.diegomarcelo.splashscreen

import android.app.Activity
import android.content.Intent
import android.os.Bundle
import android.os.Handler
import android.view.WindowManager
import android.view.animation.Animation
import android.view.animation.AnimationUtils
import android.widget.ImageView

class SplashScreen : Activity() {
    var topAnim: Animation? = null
    var bottomAnim: Animation? = null
    var image01: ImageView? = null
    var image02: ImageView? = null
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.splash_screen)
        window.setFlags(
            WindowManager.LayoutParams.FLAG_FULLSCREEN,
            WindowManager.LayoutParams.FLAG_FULLSCREEN
        )
        topAnim = AnimationUtils.loadAnimation(this, R.anim.top_animation)
        bottomAnim = AnimationUtils.loadAnimation(this, R.anim.bottom_animation)
        image01 = findViewById(R.id.im01)
        image02 = findViewById(R.id.im02)
        
        Handler().postDelayed({
            startActivity(Intent(baseContext, MainActivity::class.java))
            finish()
        }, 3000)
    }
}