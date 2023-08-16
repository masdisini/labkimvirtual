package com.kemaszaid.labkimvirtual.fragments

import android.content.Intent
import android.os.Bundle
import android.view.View
import android.widget.Button
import android.widget.TextView
import androidx.fragment.app.Fragment
import com.kemaszaid.labkimvirtual.MateriInteraksiActivity
import com.kemaszaid.labkimvirtual.R

class InteraksiFragment : Fragment(R.layout.fragment_dashboard) {

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        val dashtitle : TextView = view.findViewById(R.id.textdashboardtitle)
        dashtitle.text = "Interaksi antar Ikatan"
        val dashdesc : TextView = view.findViewById(R.id.textdashboarddesc)
        dashdesc.text = "Interaksi antar molekul adalah gaya elektromagnetik yang terjadi antara molekul-molekul atau antara bagian yang terpisah jauh dari suatu makromolekul. Gaya tersebut dapat berupa kohesi antara molekul serupa, seperti contohnya pada tegangan permukaan, atau adhesi antara molekul tak serupa, contohnya pada kapilaritas."
        val btnMateri : Button = view.findViewById(R.id.btnmateri)
        btnMateri.setOnClickListener {
            val i = Intent(requireContext(), MateriInteraksiActivity::class.java)
            startActivity(i)
        }
    }
}