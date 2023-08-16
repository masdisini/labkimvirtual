package com.kemaszaid.labkimvirtual

import android.content.Context
import android.media.MediaPlayer

object Logics {

    fun musicBgm(context: Context): MediaPlayer{
        val appContext = context.applicationContext
        val music = MediaPlayer.create(appContext, R.raw.bgm)
        music.isLooping = true
        return music
    }

    private val picspinner = mapOf(
        "Na" to R.drawable.natrium,
        "Mg" to R.drawable.magnesium,
        "Al" to R.drawable.aluminium,
        "Cl" to R.drawable.chlorine,
        "N" to R.drawable.nitrogen,
        "O" to R.drawable.oxygen,
        "H" to R.drawable.hydrogen,
        "S" to R.drawable.sulfur,
    )

    private val pairs = mapOf(
        "Na" to "Na = 2, 8, 1",
        "Mg" to "Mg = 2, 8, 2",
        "Al" to "Al = 2, 8, 3",
        "Cl" to "Cl = 2, 8, 7",
        "N" to "N = 2, 5",
        "O" to "O = 2, 6",
        "H" to "H = 1",
        "S" to "S = 2, 8, 6",
    )

    private val rulesIon = mapOf(
        "NaN" to R.drawable.na3n,
        "NaO" to R.drawable.na2o,
        "NaCl" to R.drawable.nacl,
        "MgN" to R.drawable.mg3n2,
        "MgO" to R.drawable.mgo,
        "MgCl" to R.drawable.mgcl2,
        "AlN" to R.drawable.aln,
        "AlO" to R.drawable.al2o3,
        "AlCl" to R.drawable.alcl3,
    )

    private val rulesIon2 = mapOf(
        "NaN" to R.drawable.jna3n,
        "NaO" to R.drawable.jna2o,
        "NaCl" to R.drawable.jnacl,
        "MgN" to R.drawable.jmg3n2,
        "MgO" to R.drawable.jmgo,
        "MgCl" to R.drawable.jmgcl2,
        "AlN" to R.drawable.jaln,
        "AlO" to R.drawable.jal2o3,
        "AlCl" to R.drawable.jalcl3,
    )

    private val rulesKov = mapOf(
        "- Pilih -" to -22,
        "H" to 2,
        "S" to 4,
        "O" to 8,
        "Cl" to 16,
    )

    private val resultKov = mapOf(
        4 to R.drawable.h2,
        6 to R.drawable.h2s,
        10 to R.drawable.h2o,
        18 to R.drawable.hcl,
        8 to R.drawable.s2,
        12 to R.drawable.so,
        20 to R.drawable.scl2,
        16 to R.drawable.o2,
        24 to R.drawable.cl2o,
        32 to R.drawable.cl2,
    )

    private val resultKov2 = mapOf(
        4 to R.drawable.jh2,
        6 to R.drawable.jh2s,
        10 to R.drawable.jh2o,
        18 to R.drawable.jhcl,
        8 to R.drawable.js2,
        12 to R.drawable.jso,
        20 to R.drawable.jscl2,
        16 to R.drawable.jo2,
        24 to R.drawable.jocl,
        32 to R.drawable.jcl2,
    )

    fun picUnsur(unsur:String) : Int {
        return when (unsur){
            in picspinner -> picspinner[unsur]!!
            else -> R.drawable.questionmark
        }
    }

    fun pairsKet(unsur:String) : String {
        return when (unsur){
            in pairs -> pairs[unsur]!!
            else -> ""
        }
    }

    fun matchingUnsurIon(unsur1:String, unsur2:String) : Int {
        return when ("$unsur1$unsur2"){
            in rulesIon -> rulesIon["$unsur1$unsur2"]!!
            else -> R.drawable.questionmark
        }
    }

    fun matchingUnsurKov(unsur1:String, unsur2:String) : Int {
        val num1 = rulesKov[unsur1]!!
        val num2 = rulesKov[unsur2]!!
        val deter = num1 + num2
        return when (deter){
            in resultKov -> resultKov[deter]!!
            else -> R.drawable.questionmark
        }
    }

    fun matchingUnsurIon2(unsur1:String, unsur2:String) : Int {
        return when ("$unsur1$unsur2"){
            in rulesIon2 -> rulesIon2["$unsur1$unsur2"]!!
            else -> R.drawable.fullquest
        }
    }

    fun matchingUnsurKov2(unsur1:String, unsur2:String) : Int {
        val num1 = rulesKov[unsur1]!!
        val num2 = rulesKov[unsur2]!!
        val deter = num1 + num2
        return when (deter){
            in resultKov2 -> resultKov2[deter]!!
            else -> R.drawable.fullquest
        }
    }

}