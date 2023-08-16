package com.kemaszaid.labkimvirtual

import android.content.Intent
import android.media.MediaPlayer
import android.os.Bundle
import android.view.View
import android.widget.*
import androidx.appcompat.app.AlertDialog
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.WindowCompat
import androidx.core.view.WindowInsetsCompat
import androidx.core.view.WindowInsetsControllerCompat
class MainActivity : AppCompatActivity() {

    private lateinit var music : MediaPlayer
    private lateinit var btnlaunch : Button
    private lateinit var btntujuan : Button
    private lateinit var btnoption : Button
    private lateinit var btnabout : Button
    private lateinit var btnexit : Button

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        WindowCompat.setDecorFitsSystemWindows(window, false)
        WindowInsetsControllerCompat(
            window,
            window.decorView.findViewById(android.R.id.content)
        ).let { controller ->
            controller.hide(WindowInsetsCompat.Type.systemBars())
            controller.systemBarsBehavior =
                WindowInsetsControllerCompat.BEHAVIOR_SHOW_TRANSIENT_BARS_BY_SWIPE
        }

//        alertDialog("Aplikasi masih tahap BETA, beberapa fitur mungkin tidak lengkap, silahkan buka dokumentasi materi untuk informasi selengkapnya")

        music = Logics.musicBgm(this)
        music.start()

        btnlaunch = findViewById(R.id.btnlaunch)
        btnlaunch.setOnClickListener {
            val i = Intent(this, DashboardActivity::class.java)
            startActivity(i)
        }

        btntujuan = findViewById(R.id.btntujuan)
        btntujuan.setOnClickListener {
            val arrayTujuan = arrayOf(
                "1. Menjelaskan proses pembentukan ikatan ion",
                "2. Menjelaskan proses pembentukan ikatan kovalen",
                "3. Menjelaskan bentuk molekul ikatan",
                "4. Menjelaskan kaidah duplet oktet",
                "5. Menjelaskan interaksi antar molekul ikatan"
            )
            val message = arrayTujuan.joinToString("\n")
            val dialog = AlertDialog.Builder(this)
                .setTitle("Tujuan Pembelajaran")
                .setMessage(message)
                .setPositiveButton("Kembali") { dialog, _ ->
                    dialog.cancel()
                }
                .create()
            dialog.show()
        }

        btnoption = findViewById(R.id.btnoption)
        btnoption.visibility = View.GONE
        btnoption.setOnClickListener {
            Toast.makeText(this, "Opsi tidak tersedia di perangkat ini.", Toast.LENGTH_LONG).show()
        }

        btnabout = findViewById(R.id.btnabout)
        btnabout.setOnClickListener {
            val arrayAbout = arrayOf(
                "Aplikasi ini dibuat dan didukung oleh:",
                "Kevin Andrean Wijaya (NIM: 06101281924021)",
                "Efdia Santi, S.Pd",
                "Drs. M. Hadeli L., M.Si., Ph.D",
                "\n",
                "LabKim Virtual: Ikatan Kimia",
                "v2023.1.0.1 BETA"
            )
            val message = arrayAbout.joinToString("\n")
            val dialog = AlertDialog.Builder(this)
                .setTitle("Tentang Aplikasi Ini")
                .setMessage(message)
                .setPositiveButton("Kembali") { dialog, _ ->
                    dialog.cancel()
                }
                .create()
            dialog.show()
        }

        btnexit = findViewById(R.id.btnexit)
        btnexit.setOnClickListener {
            onBackPressed()
        }
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

    private fun alertDialog(message: String) {
        val dialog = AlertDialog.Builder(this)
            .setMessage(message)
            .setTitle("Peringatan")
            .setCancelable(false)
            .setPositiveButton("Mengerti") { dialog, _ ->
                dialog.cancel()
            }
            .create()
        dialog.show()
    }
}