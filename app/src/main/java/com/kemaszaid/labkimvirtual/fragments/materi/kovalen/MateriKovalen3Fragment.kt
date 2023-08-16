package com.kemaszaid.labkimvirtual.fragments.materi.kovalen

import android.app.AlertDialog
import android.content.Intent
import android.os.Bundle
import android.view.View
import android.widget.Button
import android.widget.ImageView
import android.widget.TextView
import androidx.fragment.app.Fragment
import com.bumptech.glide.Glide
import com.kemaszaid.labkimvirtual.KovSimActivity
import com.kemaszaid.labkimvirtual.R

class MateriKovalen3Fragment : Fragment (R.layout.fragment_materi) {

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        val imgmateri : ImageView = view.findViewById(R.id.imgmateri)
        Glide.with(this).load(R.drawable.h2o).into(imgmateri)
        imgmateri.setOnClickListener {
            val dialogmateri = ImageView(requireContext())
            dialogmateri.setImageResource(R.drawable.jh2o)
            val dialog = AlertDialog.Builder(requireContext(), android.R.style.Theme_Material_Light_NoActionBar_Fullscreen)
                .setView(dialogmateri)
                .setPositiveButton("Kembali"){
                        dialog, _ -> dialog.cancel()
                }
            dialog.show()
        }
        val materititle : TextView = view.findViewById(R.id.materititle)
        materititle.text = "Jenis-jenis Ikatan Kovalen"
        val materidesc : TextView = view.findViewById(R.id.textmateridesc)
        materidesc.text = "Ikatan Kovalen Tunggal\n" +
                "Ikatan kovalen tunggal merupakan ikatan yang hanya melibatkan sepasang elektron untuk digunakan bersama. Berarti, masing-masing atom hanya saling memberikan satu elektron untuk dapat digunakan bersama. Elo bisa lihat contoh ikatan kovalen tunggal pada molekul H2O.\n\n" +
                "Ikatan Kovalen Rangkap 2\n" +
                "Ikatan kovalen rangkap 2 adalah ikatan yang masing-masing atomnya memberikan sumbangan dua elektron valensi untuk membentuk dua pasang elektron ikatan. Hal itulah yang membuatnya menjadi ikatan rangkap dua. Contohnya adalah O2 dan CO2. \n\n" +
                "Ikatan Kovalen Rangkap 3\n" +
                "Ikatan kovalen rangkap tiga merupakan ikatan yang terjadi antara dua atom yang melibatkan enam elektron ikatan dalam satu ikatan kovalen. Contohnya adalah molekul N2 dan asetilena.\n" +
                "\n" +
                "Ikatan Kovalen Koordinasi\n" +
                "Di atas, kita telah mengenal ikatan kovalen, dan diketahui bahwa ikatan kovalen koordinasi merupakan jenis ikatan kovalen yang dibedakan berdasarkan sumber elektron yang akan dipakai bersama. Ikatan kovalen koordinasi terjadi karena hanya ada satu atom aja yang menyumbangkan pasangan elektron. Jadi, atom pasangannya tidak bisa menyumbangkan elektron. ikatan ini hanya akan terjadi antar unsur-unsur non logam. Contoh kovalen koordinasi adalah molekul HNO3, SO3, NH4Cl, dan H2SO4.\n\n" +
                "Ikatan Kovalen Polar\n" +
                "Jenis ikatan kovalen yang jika dilihat berdasarkan muatan di dalam molekul akibat distribusi elektron ikatan, yaitu ikatan kovalen polar dan non polar. Nah, sekarang aku akan membahas dulu tentang ikatan kovalen polar.\n" +
                "Ikatan kovalen polar terjadi ketika pasangan elektron ikatan tertarik lebih kuat ke salah satu atom. Hal ini karena adanya perbedaan keelektronegatifan antar atom tersebut. Makin besar selisihnya, maka akan makin besar pula kepolaran ikatannya. Contohnya adalah H-Cl, dimana keelektronegatifan atom Cl adalah 3,0 sedangkan atom H nilainya 2,1. \n" +
                "Selain itu, zat polar akan cenderung tertarik kepada zat polar lainnya. Begitu juga dengan zat non polar cenderung lebih tertarik kepada zat non polar juga. Contohnya adalah air yang merupakan zat polar dan minyak yang yang merupakan zat non polar.\n"
        val prevbtn : Button = view.findViewById(R.id.btnprev)
        prevbtn.setOnClickListener {
            val fragment = MateriKovalen2Fragment()
            val transaction = fragmentManager?.beginTransaction()
            transaction?.replace(R.id.materiFragment, fragment)?.commit()
        }
        val nextbtn : Button = view.findViewById(R.id.btnnext)
        nextbtn.visibility = View.GONE
        nextbtn.setOnClickListener {
            val fragment = MateriKovalen3Fragment()
            val transaction = fragmentManager?.beginTransaction()
            transaction?.replace(R.id.materiFragment, fragment)?.commit()
        }
        val simbtn : Button = view.findViewById(R.id.btnsim)
        simbtn.setOnClickListener {
            val i = Intent(requireContext(), KovSimActivity::class.java)
            startActivity(i)
        }

    }
}