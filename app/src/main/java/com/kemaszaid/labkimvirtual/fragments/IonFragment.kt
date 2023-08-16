package com.kemaszaid.labkimvirtual.fragments

import android.content.Intent
import android.os.Bundle
import android.view.View
import android.widget.Button
import android.widget.TextView
import androidx.fragment.app.Fragment
import com.kemaszaid.labkimvirtual.MateriIonActivity
import com.kemaszaid.labkimvirtual.R

class IonFragment : Fragment(R.layout.fragment_dashboard) {

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        val dashtitle : TextView = view.findViewById(R.id.textdashboardtitle)
        dashtitle.text = "Ikatan Ion"
        val dashdesc : TextView = view.findViewById(R.id.textdashboarddesc)
        dashdesc.text = "Ikatan ion adalah ikatan yang terjadi akibat adanya serah terima elektron sehingga membentuk ion positif dan ion negatif yang konfigurasi elektronnya sama dengan gas mulia. Ion positif dan ion negatif diikat oleh suatu gaya elektrostatik. Senyawa yang dihasilkan disebut senyawa ion."
        val btnMateri : Button = view.findViewById(R.id.btnmateri)
        btnMateri.setOnClickListener {
            val i = Intent(requireContext(), MateriIonActivity::class.java)
            startActivity(i)
        }
    }
}