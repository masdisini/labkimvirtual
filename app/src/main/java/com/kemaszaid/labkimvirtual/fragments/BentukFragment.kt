package com.kemaszaid.labkimvirtual.fragments

import android.content.Intent
import android.os.Bundle
import android.view.View
import android.widget.Button
import android.widget.TextView
import androidx.fragment.app.Fragment
import com.kemaszaid.labkimvirtual.MateriBentukActivity
import com.kemaszaid.labkimvirtual.MateriInteraksiActivity
import com.kemaszaid.labkimvirtual.R

class BentukFragment : Fragment(R.layout.fragment_dashboard) {

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        val dashtitle : TextView = view.findViewById(R.id.textdashboardtitle)
        dashtitle.text = "Bentuk Molekul"
        val dashdesc : TextView = view.findViewById(R.id.textdashboarddesc)
        dashdesc.text = "Teori VSEPR (valence shell electron pairs repulsion) dikembangkan oleh Gillespie dan Nyholm yang didasari dari ide-ide yang dikemukakan oleh N.V. Sidgwick dan H.E. Powell. Elektron terluar atau elektron valensi ditepati oleh pasangan elektron bebas (PEB) dan pasangan elektron ikatan (PEI)."
        val btnMateri : Button = view.findViewById(R.id.btnmateri)
        btnMateri.setOnClickListener {
            val i = Intent(requireContext(), MateriBentukActivity::class.java)
            startActivity(i)
        }
    }
}