package com.kemaszaid.labkimvirtual

import android.content.Intent
import android.os.Bundle
import android.os.Handler
import android.view.View
import android.view.WindowManager
import android.view.animation.AnimationUtils
import android.widget.ImageView
import android.widget.TextView
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.WindowCompat
import androidx.core.view.WindowInsetsCompat
import androidx.core.view.WindowInsetsControllerCompat

@Suppress("DEPRECATION")
class SplashActivity : AppCompatActivity() {

    private lateinit var img1: ImageView
    private lateinit var img2: ImageView
    private lateinit var txt1: TextView
    private lateinit var txt2: TextView

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_splash)

        WindowCompat.setDecorFitsSystemWindows(window, false)
        WindowInsetsControllerCompat(window,
            window.decorView.findViewById(android.R.id.content)).let { controller ->
            controller.hide(WindowInsetsCompat.Type.systemBars())
            controller.systemBarsBehavior = WindowInsetsControllerCompat.BEHAVIOR_SHOW_TRANSIENT_BARS_BY_SWIPE
        }

        img1 = findViewById(R.id.imageView3)
        img2 = findViewById(R.id.imageView2)
        txt1 = findViewById(R.id.textView)
        txt2 = findViewById(R.id.textView2)

        window.setFlags(
            WindowManager.LayoutParams.FLAG_FULLSCREEN,
            WindowManager.LayoutParams.FLAG_FULLSCREEN,
        )

        Handler().postDelayed({
            val anim = AnimationUtils.loadAnimation(this, androidx.appcompat.R.anim.abc_fade_out)
            anim.duration = 1000
            img1.startAnimation(anim)
            img2.startAnimation(anim)
            txt1.startAnimation(anim)
            txt2.startAnimation(anim)
            img1.visibility = View.GONE
            img2.visibility = View.GONE
            txt1.visibility = View.GONE
            txt2.visibility = View.GONE
        },2000)

        View.SYSTEM_UI_FLAG_LAYOUT_HIDE_NAVIGATION
        Handler().postDelayed({
            val intent = Intent(this, MainActivity::class.java)
            intent.addFlags(Intent.FLAG_ACTIVITY_NO_ANIMATION)
            startActivity(intent)
            overridePendingTransition(0,0)
            finish()
        }, 3000) // 3000 is the delayed time in milliseconds.
    }
}