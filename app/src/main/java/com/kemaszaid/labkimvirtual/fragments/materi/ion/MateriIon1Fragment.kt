package com.kemaszaid.labkimvirtual.fragments.materi.ion

import android.app.AlertDialog
import android.os.Bundle
import android.view.View
import android.widget.Button
import android.widget.ImageView
import android.widget.TextView
import androidx.fragment.app.Fragment
import com.bumptech.glide.Glide
import com.kemaszaid.labkimvirtual.R

class MateriIon1Fragment : Fragment (R.layout.fragment_materi) {

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        val imgmateri : ImageView = view.findViewById(R.id.imgmateri)
        Glide.with(this).load(R.drawable.na3n).into(imgmateri)
        imgmateri.setOnClickListener {
            val dialogmateri = ImageView(requireContext())
            dialogmateri.setImageResource(R.drawable.na3n)
            val dialog = AlertDialog.Builder(requireContext(), android.R.style.Theme_Material_Light_NoActionBar_Fullscreen)
                .setView(dialogmateri)
                .setPositiveButton("Kembali"){
                    dialog, _ -> dialog.cancel()
                }
            dialog.show()
        }
        val materititle : TextView = view.findViewById(R.id.materititle)
        materititle.text = "Ikatan Ion"
        val materidesc : TextView = view.findViewById(R.id.textmateridesc)
        materidesc.text = "Ikatan ion adalah ikatan yang terjadi akibat adanya serah terima elektron sehingga membentuk ion positif dan ion negatif yang konfigurasi elektronnya sama dengan gas mulia. Ion positif dan ion negatif diikat oleh suatu gaya elektrostatik. Senyawa yang dihasilkan disebut senyawa ion. Salah satu contoh yang sering kita jumpai sehari-hari adalah garam dapur. Nah, garam dapur itu rumus kimianya adalah NaCl (Natrium klorida). Dalam NaCl padat terdapat ikatan antara ion Na+ dan ion Cl- dengan gaya elektrostatik, sehingga disebut ikatan ion.\n" +
                "Pada ikatan ionik, terjadi transfer elektron dari satu atom ke atom lainnya. Oleh karena berpindahnya elektron, maka atom yang mendapatkan elektron menjadi bermuatan negatif, sedangkan atom yang kehilangan elektron akan bermuatan positif. Jika atom ketambahan elektron, maka atom tersebut menjadi ion negatif atau dikenal dengan istilah anion. Sedangkan jika atom kehilangan elektron, maka atom tersebut menjadi ion positif atau kation. Karena adanya perbedaan muatan antar ion (ion positif dan ion negatif), maka ion positif dan negatif akan saling tarik menarik oleh gaya elektrostatik. Kejadian inilah yang merupakan dasar dari ikatan ionik.\n"
        val prevbtn : Button = view.findViewById(R.id.btnprev)
        prevbtn.visibility = View.GONE
        val nextbtn : Button = view.findViewById(R.id.btnnext)
        nextbtn.setOnClickListener {
            val fragment = MateriIon2Fragment()
            val transaction = fragmentManager?.beginTransaction()
            transaction?.replace(R.id.materiFragment, fragment)?.commit()
        }
        val simbtn : Button = view.findViewById(R.id.btnsim)
        simbtn.visibility = View.GONE
//        simbtn.setOnClickListener {
//            val i = Intent(requireContext(), IonSimActivity::class.java)
//            startActivity(i)
//        }

    }
}