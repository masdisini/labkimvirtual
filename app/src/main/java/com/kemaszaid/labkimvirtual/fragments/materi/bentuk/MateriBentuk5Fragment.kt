package com.kemaszaid.labkimvirtual.fragments.materi.bentuk

import android.app.AlertDialog
import android.os.Bundle
import android.view.View
import android.widget.Button
import android.widget.ImageView
import android.widget.TextView
import androidx.fragment.app.Fragment
import com.bumptech.glide.Glide
import com.kemaszaid.labkimvirtual.R

class MateriBentuk5Fragment : Fragment (R.layout.fragment_materi) {

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        val imgmateri : ImageView = view.findViewById(R.id.imgmateri)
        imgmateri.setImageResource(R.drawable.kov006)
        imgmateri.setOnClickListener {
            val dialogmateri = ImageView(requireContext())
            dialogmateri.setImageResource(R.drawable.kov006)
            val dialog = AlertDialog.Builder(requireContext(), android.R.style.Theme_Material_Light_NoActionBar_Fullscreen)
                .setView(dialogmateri)
                .setPositiveButton("Kembali"){
                    dialog, _ -> dialog.cancel()
                }
            dialog.show()
        }
        val materititle : TextView = view.findViewById(R.id.materititle)
        materititle.text = "Bentuk Molekul"
        val materidesc : TextView = view.findViewById(R.id.textmateridesc)
        materidesc.text = "Sehingga bila dirangkum, berikut bentuk molekul dengan adanya PEB, untuk jumlah domain 2 hingga 4 Berikut bentuk molekul dengan adanya PEB untuk jumlah domain 2 hingga 4."

        val prevbtn : Button = view.findViewById(R.id.btnprev)
        prevbtn.setOnClickListener {
            val fragment = MateriBentuk4Fragment()
            val transaction = fragmentManager?.beginTransaction()
            transaction?.replace(R.id.materiFragment, fragment)?.commit()
        }
        val nextbtn : Button = view.findViewById(R.id.btnnext)
        nextbtn.visibility = View.GONE
        nextbtn.setOnClickListener {
            val fragment = MateriBentuk5Fragment()
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