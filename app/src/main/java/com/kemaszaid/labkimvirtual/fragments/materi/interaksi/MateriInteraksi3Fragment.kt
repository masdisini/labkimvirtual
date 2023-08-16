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

class MateriInteraksi3Fragment : Fragment (R.layout.fragment_materi) {

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
        materititle.text = "Gaya Van der Waals"
        val materidesc : TextView = view.findViewById(R.id.textmateridesc)
        materidesc.text = "Gaya ini pertama kali ditemukan oleh Johannes Van der Waals (1837-1923). Gaya ini merupakan gaya tarik menarik listrik yang relatif lemah. Hal ini karena kepolaran molekul yang permanen atau terinduksi. Ketika molekul memiliki kutub yang sama, maka keduanya akan saling tolak menolak. Sebaliknya, ketika keduanya memiliki kutub yang berbeda, maka akan saling tarik menarik.\n\n" +
                "Gaya Van der Waals dibagi menjadi 4 berdasarkan kepolaran partikelnya, yaitu:\n" +
                "•\tInteraksi ion-dipol\n" +
                "Interaksi ini terjadi karena adanya tarik-menarik antara ion dengan molekul polar yang relatif kuat. Interaksi ini digunakan untuk menentukan kelarutan.\n" +
                "•\tInteraksi dipol-dipol\n" +
                "Gaya dipol dipol ini terjadi antar sesama molekul polar yang terjadi pada ekor dan kepala molekul itu sendiri.\n" +
                "•\tInteraksi ion-dipol terinduksi\n" +
                "Interaksi ini terjadi antara ion dan dipol terinduksi. Ikatan ini relatif lemah karena kepolaran molekul terinduksi relatif kecil daripada dipol permanen.\n" +
                "•\tInteraksi dipol-dipol terinduksi\n" +
                "Molekul dipol bisa membuat molekul netral lainnya yang bersifat dipol terinduksi, sehingga ada interaksi dipol-dipol terinduksi. Ikatan dari interaksi yang dihasilkan bersifat lemah. Itulah mengapa proses interaksi ini berlangsung lambat.\n"
        val prevbtn : Button = view.findViewById(R.id.btnprev)
        prevbtn.setOnClickListener {
            val fragment = MateriInteraksi2Fragment()
            val transaction = fragmentManager?.beginTransaction()
            transaction?.replace(R.id.materiFragment, fragment)?.commit()
        }
        val nextbtn : Button = view.findViewById(R.id.btnnext)
        nextbtn.setOnClickListener {
            val fragment = MateriInteraksi4Fragment()
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