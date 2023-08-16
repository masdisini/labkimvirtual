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

class MateriInteraksi2Fragment : Fragment (R.layout.fragment_materi) {

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        val imgmateri : ImageView = view.findViewById(R.id.imgmateri)
        imgmateri.setImageResource(R.drawable.interaksi1)
        imgmateri.setOnClickListener {
            val dialogmateri = ImageView(requireContext())
            dialogmateri.setImageResource(R.drawable.interaksi1)
            val dialog = AlertDialog.Builder(requireContext(), android.R.style.Theme_Material_Light_NoActionBar_Fullscreen)
                .setView(dialogmateri)
                .setPositiveButton("Kembali"){
                    dialog, _ -> dialog.cancel()
                }
            dialog.show()
        }
        val materititle : TextView = view.findViewById(R.id.materititle)
        materititle.text = "Ikatan Hidrogen"
        val materidesc : TextView = view.findViewById(R.id.textmateridesc)
        materidesc.text = "Contoh ikatan hidrogen yang terjadi antara metanol dan air\n" +
                "Gaya pertama ada ikatan hidrogen, yaitu gaya tarik menarik yang terjadi antara atom hidrogen dalam senyawa yang terdapat ikatan antara hidrogen dan atom nitrogen (N), oksigen (O), dan fluorin (F). Ikatan ini termasuk yang paling kuat, namun juga memiliki ciri ikatan kovalen, yaitu mempunyai arah, lebih kuat dari gaya van der waals, menghasilkan jarak antar atom yang lebih pendek dari jari-jari van der waals dan melibatkan pasangan dalam jumlah terbatas. Ikatan ini menyebabkan tingginya titik didih air (100 derajat C). Selain itu, ikatan ini juga berperan penting pada struktur polimer sintetik maupun alami.\n"
        val prevbtn : Button = view.findViewById(R.id.btnprev)
        prevbtn.setOnClickListener {
            val fragment = MateriInteraksi1Fragment()
            val transaction = fragmentManager?.beginTransaction()
            transaction?.replace(R.id.materiFragment, fragment)?.commit()
        }
        val nextbtn : Button = view.findViewById(R.id.btnnext)
        nextbtn.setOnClickListener {
            val fragment = MateriInteraksi3Fragment()
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