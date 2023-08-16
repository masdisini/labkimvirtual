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

class MateriBentuk2Fragment : Fragment (R.layout.fragment_materi) {

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        val imgmateri : ImageView = view.findViewById(R.id.imgmateri)
        imgmateri.setImageResource(R.drawable.interaksi1)
        imgmateri.visibility = View.GONE
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
        materititle.text = "Menentukan Geometri Molekul"
        val materidesc : TextView = view.findViewById(R.id.textmateridesc)
        materidesc.text = "Untuk menentukan geometri molekul ikuti langkah-langkah berikut ini:\n\n" +
                "1. Atom pusat dilambangkan dengan A, elektron ikatan dengan X dan setiap domain elektron bebas dinyatakan dengan E. Caranya berbeda tergantung jenis molekul/senyawanya. Senyawa biner berikatan tunggal, maka setiap ikatan hanya menggunakan satu elektron dari atom pusat. Maka, jumlah PEB (E) dapat ditentukan:\n\n" +
                "E = (EV - X) / 2\n" +
                "Dimana EV = jumlah elektron valensi atom pusat X = jumlah atom yang terikat pada atom pusat. Senyawa biner berikatan rangkap atau kovalen koordinat:\n\n" +
                "E = (EV - X') / 2\n" +
                "Dimana X’ : jumlah elektron yang digunakan atom pusat.\n\n" +
                "2. Menentukan geometri domain-domain elektron di sekitar atom pusat yang memberi tolakan minimum.\n\n" +
                "3. Menetapkan domain elektron terikat dengan menuliskan lambang atom yang bersangkutan.\n\n" +
                "4. Menentukan geometri molekul setelah mempertimbangkan pengaruh pasangan elektron bebas."

        val prevbtn : Button = view.findViewById(R.id.btnprev)
        prevbtn.setOnClickListener {
            val fragment = MateriBentuk1Fragment()
            val transaction = fragmentManager?.beginTransaction()
            transaction?.replace(R.id.materiFragment, fragment)?.commit()
        }
        val nextbtn : Button = view.findViewById(R.id.btnnext)
        nextbtn.setOnClickListener {
            val fragment = MateriBentuk3Fragment()
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