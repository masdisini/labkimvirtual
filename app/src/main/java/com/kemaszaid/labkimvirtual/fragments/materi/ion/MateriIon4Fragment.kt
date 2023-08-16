package com.kemaszaid.labkimvirtual.fragments.materi.ion

import android.content.Intent
import android.os.Bundle
import android.view.View
import android.widget.Button
import android.widget.ImageView
import android.widget.TextView
import androidx.fragment.app.Fragment
import com.kemaszaid.labkimvirtual.IonSimActivity
import com.kemaszaid.labkimvirtual.R

class MateriIon4Fragment : Fragment (R.layout.fragment_materi) {

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
        materititle.text = "Sifat-sifat Senyawa Ion"
        val materidesc : TextView = view.findViewById(R.id.textmateridesc)
        materidesc.text = "Beberapa sifat-sifat dari senyawa ion antara lain:\n\n" +
                "1. Berbentuk kristal yang keras namun juga rapuh.\n" +
                "Berbentuk kristal keras tetapi juga rapuh Sifat senyawa ion yang pertama adalah memiliki bentuk kristal yang keras namun juga rapuh. senyawa ionik membentuk kristal dengan struktur yang teratur di mana kation dan anion disusun bergantian dan membentuk struktur tiga dimensi. Kristal senyawa ion bersifat keras namun dapat dengan mudah hancur saat dikenakan gaya. Gaya yang diterapkan pada kristal dapat memicu tolakan antara ion yang sama dan menyebabkan kristal pecah.\n" +
                "\n" +
                "2. Dapat menghantarkan listrik.\n" +
                "Dapat mengahantarkan listrik Sifat senyawa ion selanjutnya adalah dapat menghantarkan listrik. Senyawa ion dapat menghantarkan listrik karena memiliki partikel bermuatan atau ion yang dapat membawa elektron dari satu tempat ke tempat lain. Namun, hanya senyawa ion dalam bentuk lelehan atau larutan (terlarut dalam zat cair) yang dapat menghantarkan listrik. Adapun, senyawa ion dalam bentuk padatan tidak dapat menghantarkan listrik karena ion-ionnya terkunci dan tidak dapat berpindah tempat.\n" +
                "\n" +
                "3. Memiliki titik didih dan titik lebur tinggi.\n" +
                "Memiliki titik lebur dan titik didih yang tinggi Sifat senyawa ion selanjutnya adalah memiliki titik didih dan titik lebur yang tinggi. Hal tersebut karena dibutuhkan energi yang besar untuk memutuskan ikatan ion yang kuat dalam kristal. Adapun, energi didapat dari panas. Sehingga, untuk mendapatkan energi yang besar dibutuhkan panas yang besar.\n" +
                "\n" +
                "4. Mudah larut dalam air.  \n" +
                "Hal tersebut secara otomatis menaikkan titik lebur dan titik leleh senyawaion. Mudah larut dalam air Sifat senyawa ion selanjutnya adalah larut dalam air. Senyawa ion mudah larut dalam air karena dapat terdisosiasi sempurna.\n"
        val prevbtn : Button = view.findViewById(R.id.btnprev)
        prevbtn.setOnClickListener {
            val fragment = MateriIon3Fragment()
            val transaction = fragmentManager?.beginTransaction()
            transaction?.replace(R.id.materiFragment, fragment)?.commit()
        }
        val nextbtn : Button = view.findViewById(R.id.btnnext)
        nextbtn.visibility = View.GONE
//        nextbtn.setOnClickListener {
//            val fragment = MateriIon3Fragment()
//            val transaction = fragmentManager?.beginTransaction()
//            transaction?.replace(R.id.materiFragment, fragment)?.commit()
//        }
        val simbtn : Button = view.findViewById(R.id.btnsim)
        simbtn.setOnClickListener {
            val i = Intent(requireContext(), IonSimActivity::class.java)
            startActivity(i)
        }

    }
}