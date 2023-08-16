package com.kemaszaid.labkimvirtual

import android.graphics.drawable.Animatable
import android.graphics.drawable.Drawable
import android.media.MediaPlayer
import android.os.Bundle
import android.view.View
import android.view.animation.Animation
import android.view.animation.AnimationUtils
import android.widget.*
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.WindowCompat
import androidx.core.view.WindowInsetsCompat
import androidx.core.view.WindowInsetsControllerCompat
import com.bumptech.glide.Glide
import com.kemaszaid.labkimvirtual.Logics.matchingUnsurIon
import com.kemaszaid.labkimvirtual.Logics.matchingUnsurIon2
import com.kemaszaid.labkimvirtual.Logics.pairsKet
import com.kemaszaid.labkimvirtual.Logics.picUnsur

class IonSimActivity : AppCompatActivity() {
    private lateinit var titles:TextView
    private lateinit var unsura:Spinner
    private lateinit var pica:ImageView
    private lateinit var keta:TextView
    private lateinit var unsurb:Spinner
    private lateinit var picb:ImageView
    private lateinit var ketb:TextView
    private lateinit var results:ImageView
    private lateinit var kembali:Button
    private lateinit var reaksikan:Button
    private lateinit var voicet:MediaPlayer
    private lateinit var voicer:MediaPlayer
    private lateinit var sela: String
    private lateinit var selb: String
    private lateinit var result2:ImageView

    private fun initComponents(){
        titles = findViewById(R.id.titles)
        unsura = findViewById(R.id.unsura)
        pica = findViewById(R.id.unsurai)
        keta = findViewById(R.id.unsurak)
        unsurb = findViewById(R.id.unsurb)
        picb = findViewById(R.id.unsurbi)
        ketb = findViewById(R.id.unsurbk)
        results = findViewById(R.id.result)
        kembali = findViewById(R.id.bt1)
        reaksikan = findViewById(R.id.reaksikan)
        result2 = findViewById(R.id.result2)

        titles.text = "Simulasi Ikatan Ion"
        keta.text = ""
        ketb.text = ""

        voicet = MediaPlayer.create(this, R.raw.tutorsim)
        voicer = MediaPlayer.create(this, R.raw.ionres)
        voicet.start()
    }

    private fun transition(): Animation {
        val animationFadeIn = AnimationUtils.loadAnimation(this, androidx.appcompat.R.anim.abc_tooltip_enter)
        animationFadeIn.duration = 1000
        return animationFadeIn
    }

    private fun setSpinner(){
        val lista = arrayOf("- Pilih -","Na", "Mg", "Al")
        val listb = arrayOf("- Pilih -", "N", "O", "Cl")

        unsura.adapter = ArrayAdapter(this, android.R.layout.simple_spinner_item, lista)
        unsurb.adapter = ArrayAdapter(this, android.R.layout.simple_spinner_item, listb)

        unsura.onItemSelectedListener = object : AdapterView.OnItemSelectedListener{
            override fun onItemSelected(p0: AdapterView<*>?, p1: View?, p2: Int, p3: Long) {
                sela = p0?.getItemAtPosition(p2).toString()
                when (sela){
                    "- Pilih -" -> pica.setImageResource(picUnsur(sela))
                    else ->  Glide.with(this@IonSimActivity).load(picUnsur(sela)).into(pica)
                }
                pica.startAnimation(transition())
                keta.text = pairsKet(sela)
            }
            override fun onNothingSelected(p0: AdapterView<*>?) { }
        }

        unsurb.onItemSelectedListener = object : AdapterView.OnItemSelectedListener{
            override fun onItemSelected(p0: AdapterView<*>?, p1: View?, p2: Int, p3: Long) {
                selb = p0?.getItemAtPosition(p2).toString()
                when (selb){
                    "- Pilih -" -> picb.setImageResource(picUnsur(selb))
                    else ->  Glide.with(this@IonSimActivity).load(picUnsur(selb)).into(picb)
                }
                picb.startAnimation(transition())
                ketb.text = pairsKet(selb)
            }
            override fun onNothingSelected(p0: AdapterView<*>?) { }
        }
    }

    private fun setButton(){
        kembali.setOnClickListener {
            voicet.stop()
            voicet.release()
            when (voicer.isPlaying){
                true -> {
                    voicer.stop()
                    voicer.release()
                }
                else -> { }
            }
            onBackPressed()
        }
        reaksikan.setOnClickListener {
            Glide.with(this).load(matchingUnsurIon(sela,selb)).into(results)
            result2.setImageResource(matchingUnsurIon2(sela,selb))
            when (matchingUnsurIon(sela,selb)){
                R.drawable.questionmark -> {}
                else -> {
                    voicet.pause()
                    voicer.start()
                }
            }
        }
        results.setOnClickListener {
            val drawable = results.drawable
            if (drawable is Animatable) {
                if (drawable.isRunning) drawable.stop()
                else drawable.start()            }
        }

    }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.simulation)

        WindowCompat.setDecorFitsSystemWindows(window, false)
        WindowInsetsControllerCompat(window,
            window.decorView.findViewById(android.R.id.content)).let { controller ->
            controller.hide(WindowInsetsCompat.Type.systemBars())
            controller.systemBarsBehavior = WindowInsetsControllerCompat.BEHAVIOR_SHOW_TRANSIENT_BARS_BY_SWIPE
        }

        initComponents()
        setSpinner()
        setButton()
    }

}