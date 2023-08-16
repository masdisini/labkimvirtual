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

class MateriInteraksi4Fragment : Fragment (R.layout.fragment_materi) {

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
        materititle.text = "Gaya London"
        val materidesc : TextView = view.findViewById(R.id.textmateridesc)
        materidesc.text = "Selanjutnya, ada gaya London atau gaya yang dihasilkan dari interaksi antar dipol terinduksi dan dipol terinduksi lainnya. Gaya London lebih lemah dibandingkan dengan gaya Van der Waals. Bisa dikatakan juga bahwa gaya ini adalah yang terlemah dibandingkan dengan gaya lainnya. Gaya ini pertama kali ditemukan oleh ahli fisika asal Jerman bernama Fritz London pada 1930.\n" +
                "Tarikan lemah yang dihasilkan oleh gaya London karena dipol imbasan sesaat yang terjadi akibat pergerakan elektron dalam suatu orbital. Pergerakan itu menyebabkan tidak meratanya kerapatan elektron pada atom, sehingga ada atom yang salah satu sisinya bermuatan lebih negatif.\n" +
                "Kekuatan gaya dipol terinduksi tergantung dari seberapa mudah awan elektron terdistribusi. Semakin besar ukuran atom atau molekul, maka akan semakin mudah juga distribusi elektronnya. Proses menginduksi dipol disebut polarisasi, sedangkan derajat di mana awan elektron suatu atom atau molekul bisa diinduksi disebut polarisabilitas.\n"
        val prevbtn : Button = view.findViewById(R.id.btnprev)
        prevbtn.setOnClickListener {
            val fragment = MateriInteraksi3Fragment()
            val transaction = fragmentManager?.beginTransaction()
            transaction?.replace(R.id.materiFragment, fragment)?.commit()
        }
        val nextbtn : Button = view.findViewById(R.id.btnnext)
        nextbtn.visibility = View.GONE
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