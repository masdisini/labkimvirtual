package com.kemaszaid.labkimvirtual

import android.os.Bundle
import android.widget.Button
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.WindowCompat
import androidx.core.view.WindowInsetsCompat
import androidx.core.view.WindowInsetsControllerCompat
import androidx.fragment.app.Fragment
import com.kemaszaid.labkimvirtual.fragments.materi.interaksi.MateriInteraksi1Fragment
import com.kemaszaid.labkimvirtual.fragments.materi.kovalen.MateriKovalen1Fragment

@Suppress("DEPRECATION")
class MateriInteraksiActivity: AppCompatActivity() {

    private lateinit var backbtn : Button

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_materi)

        WindowCompat.setDecorFitsSystemWindows(window, false)
        WindowInsetsControllerCompat(
            window,
            window.decorView.findViewById(android.R.id.content)
        ).let { controller ->
            controller.hide(WindowInsetsCompat.Type.systemBars())
            controller.systemBarsBehavior =
                WindowInsetsControllerCompat.BEHAVIOR_SHOW_TRANSIENT_BARS_BY_SWIPE
        }

        backbtn = findViewById(R.id.btnmateriback)
        backbtn.setOnClickListener {
            onBackPressed()
        }

        setCurrentFragment(MateriInteraksi1Fragment())

    }

    private fun setCurrentFragment(fragment: Fragment)=
        supportFragmentManager.beginTransaction().apply {
            replace(R.id.materiFragment,fragment)
            commit()
        }
}