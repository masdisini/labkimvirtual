package com.kemaszaid.labkimvirtual.fragments

import android.content.Intent
import android.os.Bundle
import android.view.View
import android.widget.Button
import android.widget.TextView
import androidx.fragment.app.Fragment
import com.kemaszaid.labkimvirtual.MateriKovActivity
import com.kemaszaid.labkimvirtual.R

class KovalenFragment : Fragment(R.layout.fragment_dashboard) {

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        val dashtitle : TextView = view.findViewById(R.id.textdashboardtitle)
        dashtitle.text = "Ikatan Kovalen"
        val dashdesc : TextView = view.findViewById(R.id.textdashboarddesc)
        dashdesc.text = "Ikatan kovalen adalah ikatan yang terbentuk dari pemakaian bersama pasangan elektron oleh dua atau lebih atom non logam. Ikatan kovalen ini ditemukan oleh Gilbert Newton Lewis."
        val btnMateri : Button = view.findViewById(R.id.btnmateri)
        btnMateri.setOnClickListener {
            val i = Intent(requireContext(), MateriKovActivity::class.java)
            startActivity(i)
        }
    }
}