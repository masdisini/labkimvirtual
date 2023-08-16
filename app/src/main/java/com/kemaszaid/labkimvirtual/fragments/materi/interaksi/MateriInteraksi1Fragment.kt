package com.kemaszaid.labkimvirtual.fragments.materi.interaksi

import android.app.AlertDialog
import android.os.Bundle
import android.view.View
import android.widget.Button
import android.widget.ImageView
import android.widget.TextView
import androidx.fragment.app.Fragment
import com.bumptech.glide.Glide
import com.kemaszaid.labkimvirtual.R

class MateriInteraksi1Fragment : Fragment (R.layout.fragment_materi) {

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
        materititle.text = "Interaksi Antar Molekul"
        val materidesc : TextView = view.findViewById(R.id.textmateridesc)
        materidesc.text = "Interaksi antar molekul adalah gaya elektromagnetik yang terjadi antara molekul-molekul atau antara bagian yang terpisah jauh dari suatu makromolekul. Gaya tersebut dapat berupa kohesi antara molekul serupa, seperti contohnya pada tegangan permukaan, atau adhesi antara molekul tak serupa, contohnya pada kapilaritas."
        val prevbtn : Button = view.findViewById(R.id.btnprev)
        prevbtn.visibility = View.GONE
        val nextbtn : Button = view.findViewById(R.id.btnnext)
        nextbtn.setOnClickListener {
            val fragment = MateriInteraksi2Fragment()
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