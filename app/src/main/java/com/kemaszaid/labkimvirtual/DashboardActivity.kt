package com.kemaszaid.labkimvirtual

import android.media.MediaPlayer
import android.os.Bundle
import android.os.PersistableBundle
import android.widget.Button
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.WindowCompat
import androidx.core.view.WindowInsetsCompat
import androidx.core.view.WindowInsetsControllerCompat
import androidx.fragment.app.Fragment
import com.google.android.material.bottomnavigation.BottomNavigationView
import com.kemaszaid.labkimvirtual.fragments.*

@Suppress("DEPRECATION")
class DashboardActivity: AppCompatActivity() {

    private lateinit var music : MediaPlayer
    private lateinit var botNavBarView : BottomNavigationView
    private lateinit var btnBack : Button

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_dashboard)

        WindowCompat.setDecorFitsSystemWindows(window, false)
        WindowInsetsControllerCompat(
            window,
            window.decorView.findViewById(android.R.id.content)
        ).let { controller ->
            controller.hide(WindowInsetsCompat.Type.systemBars())
            controller.systemBarsBehavior =
                WindowInsetsControllerCompat.BEHAVIOR_SHOW_TRANSIENT_BARS_BY_SWIPE
        }

        music = Logics.musicBgm(this)
        music.start()

        val ionFragment = IonFragment()
        val kovFragment = KovalenFragment()
        val shpFragment = BentukFragment()
        val kaidahFragment = KaidahFragment()
        val intrFragment = InteraksiFragment()

        setCurrentFragment(ionFragment)

        botNavBarView = findViewById(R.id.bottomNavigationView)
        botNavBarView.setOnNavigationItemSelectedListener {
            when (it.itemId){
                R.id.ion -> setCurrentFragment(ionFragment)
                R.id.kovalen -> setCurrentFragment(kovFragment)
                R.id.bentuk -> setCurrentFragment(shpFragment)
                R.id.dupletoktet -> setCurrentFragment(kaidahFragment)
                R.id.interaksi -> setCurrentFragment(intrFragment)
            }
            true
        }

        btnBack = findViewById(R.id.btnback)
        btnBack.setOnClickListener {
            onBackPressed()
        }

    }

    private fun setCurrentFragment(fragment: Fragment)=
        supportFragmentManager.beginTransaction().apply {
            replace(R.id.flFragment,fragment)
            commit()
        }

    override fun onBackPressed() {
        super.onBackPressed()
        music.pause()
    }

    override fun onUserLeaveHint() {
        super.onUserLeaveHint()
        music.pause()
    }

    override fun onPause() {
        super.onPause()
        music.pause()
    }

    override fun onResume() {
        super.onResume()
        music.start()
    }
}