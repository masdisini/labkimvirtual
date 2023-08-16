package com.kemaszaid.labkimvirtual.fragments.materi.kovalen

import android.content.Intent
import android.os.Bundle
import android.view.View
import android.widget.Button
import android.widget.TextView
import androidx.fragment.app.Fragment
import com.kemaszaid.labkimvirtual.KovSimActivity
import com.kemaszaid.labkimvirtual.R

class MateriKovalen1Fragment : Fragment (R.layout.fragment_materi) {

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        val materititle : TextView = view.findViewById(R.id.materititle)
        materititle.text = "Ikatan Kovalen"
        val materidesc : TextView = view.findViewById(R.id.textmateridesc)
        materidesc.text = "Ikatan kovalen adalah ikatan yang terbentuk dari pemakaian bersama pasangan elektron oleh dua atau lebih atom non logam. Ikatan kovalen ini ditemukan oleh Gilbert Newton Lewis. \n" + "\n" +
                "Pada ikatan kovalen, setiap elektron dalam pasangan elektron yang digunakan bersama ditarik oleh inti dari kedua atom non logam. Gaya tarikan elektron ke inti inilah yang mengikat dua atom tersebut sehingga terbentuklah ikatan kovalen, seperti H2, I2, Cl2, O2, dan sebagainya."
        val prevbtn : Button = view.findViewById(R.id.btnprev)
        prevbtn.visibility = View.GONE
        val nextbtn : Button = view.findViewById(R.id.btnnext)
        nextbtn.setOnClickListener {
            val fragment = MateriKovalen2Fragment()
            val transaction = fragmentManager?.beginTransaction()
            transaction?.replace(R.id.materiFragment, fragment)?.commit()
        }
        val simbtn : Button = view.findViewById(R.id.btnsim)
        simbtn.visibility = View.GONE
        simbtn.setOnClickListener {
            val i = Intent(requireContext(), KovSimActivity::class.java)
            startActivity(i)
        }

    }
}