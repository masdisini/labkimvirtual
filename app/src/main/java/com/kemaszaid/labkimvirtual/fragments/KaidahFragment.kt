package com.kemaszaid.labkimvirtual.fragments

import android.content.Intent
import android.os.Bundle
import android.view.View
import android.widget.Button
import android.widget.TextView
import androidx.fragment.app.Fragment
import com.kemaszaid.labkimvirtual.MateriKaidahActivity
import com.kemaszaid.labkimvirtual.R

class KaidahFragment : Fragment(R.layout.fragment_dashboard) {

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        val dashtitle : TextView = view.findViewById(R.id.textdashboardtitle)
        dashtitle.text = "Kaidah Duplet Oktet"
        val dashdesc : TextView = view.findViewById(R.id.textdashboarddesc)
        dashdesc.text = "Sebagian besar unsur-unsur yang ada di alam berusaha untuk stabil. Kestabilan unsur gas mulia disebabkan oleh elektron valensinya yang berjumlah delapan kecuali Helium yang memiliki dua elektron. Setiap unsur dalam membentuk senyawa membentuk konfigurasi elektron stabil, yaitu konfigurasi elektron membentuk 8 elektron valensi (Kaidah Oktet) atau 2 elektron valensi (Kaidah Duplet). Bisa elektron valensinya ditambah sehingga berjumlah delapan, bisa juga dikurangi elektron valensinya sehingga berjumlah dua."
        val btnMateri : Button = view.findViewById(R.id.btnmateri)
        btnMateri.setOnClickListener {
            val i = Intent(requireContext(), MateriKaidahActivity::class.java)
            startActivity(i)
        }
    }
}