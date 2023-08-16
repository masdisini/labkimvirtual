package com.kemaszaid.labkimvirtual.fragments.materi.kaidah

import android.app.AlertDialog
import android.os.Bundle
import android.view.View
import android.widget.Button
import android.widget.ImageView
import android.widget.TextView
import androidx.fragment.app.Fragment
import com.bumptech.glide.Glide
import com.kemaszaid.labkimvirtual.R

class MateriKaidah1Fragment : Fragment (R.layout.fragment_materi) {

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        val imgmateri : ImageView = view.findViewById(R.id.imgmateri)
        Glide.with(this).load(R.drawable.na3n).into(imgmateri)
        imgmateri.visibility = View.GONE
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
        materititle.text = "Aturan Duplet dan Aturan Oktet"
        val materidesc : TextView = view.findViewById(R.id.textmateridesc)
        materidesc.text = "Sebagian besar unsur-unsur yang ada di alam berusaha untuk stabil. Kestabilan unsur gas mulia disebabkan oleh elektron valensinya yang berjumlah delapan kecuali Helium yang memiliki dua elektron. Setiap unsur dalam membentuk senyawa membentuk konfigurasi elektron stabil, yaitu konfigurasi elektron membentuk 8 elektron valensi (Kaidah Oktet) atau 2 elektron valensi (Kaidah Duplet). Bisa elektron valensinya ditambah sehingga berjumlah delapan, bisa juga dikurangi elektron valensinya sehingga berjumlah dua."
        val prevbtn : Button = view.findViewById(R.id.btnprev)
        prevbtn.visibility = View.GONE
        val nextbtn : Button = view.findViewById(R.id.btnnext)
        nextbtn.setOnClickListener {
            val fragment = MateriKaidah2Fragment()
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