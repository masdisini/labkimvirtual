package com.kemaszaid.labkimvirtual.fragments.materi.kovalen

import android.os.Bundle
import android.view.View
import android.widget.Button
import android.widget.ImageView
import android.widget.TextView
import androidx.fragment.app.Fragment
import com.kemaszaid.labkimvirtual.R

class MateriKovalen2Fragment : Fragment (R.layout.fragment_materi) {

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        val imgmateri : ImageView = view.findViewById(R.id.imgmateri)
        imgmateri.setImageResource(R.drawable.questionmark)
        imgmateri.visibility = View.GONE
//        imgmateri.setOnClickListener {
//            val dialogmateri = ImageView(requireContext())
//            dialogmateri.setImageResource(R.drawable.questionmark)
//            val dialog = AlertDialog.Builder(requireContext(), android.R.style.Theme_Material_Light_NoActionBar_Fullscreen)
//                .setView(dialogmateri)
//                .setPositiveButton("Kembali"){
//                    dialog, _ -> dialog.cancel()
//                }
//            dialog.show()
//        }
        val materititle : TextView = view.findViewById(R.id.materititle)
        materititle.text = "Sifat-sifat Ikatan Kovalen"
        val materidesc : TextView = view.findViewById(R.id.textmateridesc)
        materidesc.text = "Adapun sifat-sifat dari ikatan kovalen adalah sebagai berikut. \n" +
                "\uF0A7\tSebagian senyawa yang memiliki ikatan kovalen mudah menguap.\n" +
                "\uF0A7\tMemiliki titik didih dan titik leleh yang rendah.\n" +
                "\uF0A7\tTidak larut dalam air, tapi larut dalam larutan organik.\n" +
                "\uF0A7\tPada umumnya, tidak menghantarkan listrik.\n" +
                "\uF0A7\tBerupa cairan, gas, atau padatan lunak pada suhu ruang.\n" +
                "\uF0A7\tKeadaan murni bersifat isolator.\n"
        val prevbtn : Button = view.findViewById(R.id.btnprev)
        prevbtn.setOnClickListener {
            val fragment = MateriKovalen1Fragment()
            val transaction = fragmentManager?.beginTransaction()
            transaction?.replace(R.id.materiFragment, fragment)?.commit()
        }
        val nextbtn : Button = view.findViewById(R.id.btnnext)
        nextbtn.setOnClickListener {
            val fragment = MateriKovalen3Fragment()
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