package com.kemaszaid.labkimvirtual.fragments.materi.ion

import android.app.AlertDialog
import android.os.Bundle
import android.view.View
import android.widget.Button
import android.widget.ImageView
import android.widget.TextView
import androidx.fragment.app.Fragment
import com.bumptech.glide.Glide
import com.kemaszaid.labkimvirtual.R

class MateriIon3Fragment : Fragment (R.layout.fragment_materi) {

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        val imgmateri : ImageView = view.findViewById(R.id.imgmateri)
        imgmateri.setImageResource(R.drawable.questionmark)
        Glide.with(this).load(R.drawable.nacl).into(imgmateri)
        imgmateri.setOnClickListener {
            val dialogmateri = ImageView(requireContext())
            dialogmateri.setImageResource(R.drawable.jnacl)
            val dialog = AlertDialog.Builder(requireContext())
                .setView(dialogmateri)
                .setPositiveButton("Kembali"){
                    dialog, _ -> dialog.cancel()
                }
            dialog.show()
        }
        val materititle : TextView = view.findViewById(R.id.materititle)
        materititle.text = "Proses Pembentukan Ikatan Ion"
        val materidesc : TextView = view.findViewById(R.id.textmateridesc)
        materidesc.text = "Seperti yang telah dibahas pada kaidah oktet sebelumnya, setiap unsur harus berusaha memiliki konfigurasi elektron seperti gas mulia, bisa dengan melepaskan elektron ataupun menerima elektron, supaya stabil. Peristiwa serah terima elektron ini terjadi pada senyawa NaCl alias garam dapur. Natrium (Na) dengan konfigurasi elektron (2,8,1) akan lebih stabil jika melepaskan 1 elektron sehingga konfigurasi elektron berubah menjadi (2,8). Sedangkan Klorin (Cl), yang mempunyai konfigurasi (2,8,7), akan lebih stabil jika mendapatkan 1 elektron sehingga konfigurasinya menjadi (2,8,8).\n" +
                "\nJadi agar keduanya menjadi lebih stabil, maka natrium menyumbang satu elektron dan klorin akan kedapatan satu elektron dari natrium. Ketika natrium kehilangan satu elektron, maka natrium menjadi lebih kecil. Sedangkan klorin akan menjadi lebih besar karena ketambahan satu elektron. Oleh karena itu ukuran ion positif selalu lebih kecil daripada ukuran sebelumnya, namun ion negatif akan cenderung lebih besar daripada ukuran sebelumnya. Ketika pertukaran elektron terjadi, maka Na akan menjadi bermuatan positif (Na+) dan Cl akan menjadi bermuatan negatif (Cl-). Kemudian terjadi gaya elektrostatik antara Na+ dan Cl- sehingga membentuk ikatan ionik."
        val prevbtn : Button = view.findViewById(R.id.btnprev)
        prevbtn.setOnClickListener {
            val fragment = MateriIon2Fragment()
            val transaction = fragmentManager?.beginTransaction()
            transaction?.replace(R.id.materiFragment, fragment)?.commit()
        }
        val nextbtn : Button = view.findViewById(R.id.btnnext)
        nextbtn.setOnClickListener {
            val fragment = MateriIon4Fragment()
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