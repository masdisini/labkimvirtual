package com.kemaszaid.labkimvirtual.fragments.materi.kaidah

import android.app.AlertDialog
import android.os.Bundle
import android.view.View
import android.widget.Button
import android.widget.ImageView
import android.widget.TextView
import androidx.fragment.app.Fragment
import com.bumptech.glide.Glide
import com.kemaszaid.labkimvirtual.R

class MateriKaidah5Fragment : Fragment (R.layout.fragment_materi) {

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        val imgmateri : ImageView = view.findViewById(R.id.imgmateri)
        imgmateri.setImageResource(R.drawable.imgmaterikaidah4)
        imgmateri.setOnClickListener {
            val dialogmateri = ImageView(requireContext())
            dialogmateri.setImageResource(R.drawable.imgmaterikaidah4)
            val dialog = AlertDialog.Builder(requireContext(), android.R.style.Theme_Material_Light_NoActionBar_Fullscreen)
                .setView(dialogmateri)
                .setPositiveButton("Kembali"){
                    dialog, _ -> dialog.cancel()
                }
            dialog.show()
        }
        val materititle : TextView = view.findViewById(R.id.materititle)
        materititle.text = "Pengecualian dan Kegagalan Aturan"
        val materidesc : TextView = view.findViewById(R.id.textmateridesc)
        materidesc.text = "Pada kenyataannya tidak semua senyawa yang berikatan selalu memenuhi aturan oktet maupun aturan duplet, oleh karena itu aturan oktet memiliki beberapa pengecualian dalam merumuskan senyawa. Pengecualian kaidah oktet dibagi dalam tiga kelompok sebagai berikut:\n" +
                "\n" +
                "1. Senyawa yang tidak mencapai aturan oktet (oktet tidak sempurna)\n" +
                "Senyawa yang atom pusatnya mempunyai elektron valensi kurang dari 4 termasuk dalam kategori ini. Hal ini menyebabkan setelah semua elektron valensi dipasangkan tetap saja belum mencapai oktet. Contohnya adalah senyawa BeCl2, BCl3, BF3 dan AlBr3.\n\n" +
                "2. Senyawa dengan jumlah elektron valensi ganjil\n" +
                "Contoh senyawa yang memiliki elektron valensi ganjil adalah NO2. Atom N memiliki elektron valensi 5 dan atom O memiliki elektron valensi 6. Jadi total elektron valensi dalam senyawa NO2 adalah 5 + 6 + 6 = 17 (ganjil). \n\n" +
                "3. Senyawa yang melampaui aturan oktet (oktet terekspansi)\n" +
                "Oktet terekspansi terjadi pada unsur-unsur periode 3 atau lebih yang dapat menampung lebih dari 8 elektron valensi pada kulit terluarnya (perlu kalian ingat bahwa kulit M dapat menampung hingga 18 elektron). Beberapa contoh senyawa yang mengalami oktet terekspansi adalah PCl5, SF6, ClF3, IF7 dan SbCl5.\n\n" +
                "Kegagalan Aturan Oktet\n" +
                "Aturan oktet gagal dalam meramalkan rumus kimia senyawa dari unsur-unsur transisi (golongan B) maupun unsur postransisi (unsur logam setelah unsur transisi dalam sistem periodik modern), seperti galium (Ga), timah (Sn) dan Bismut (Bi). Karena pada umumnya, unsur transisi maupun postransisi tidak memenuhi kaidah oktet.\n" +
                "\n" +
                "Sebagai contoh, unsur Sn mempunyai 4 elektron valensi, tetapi senyawanya lebih banyak dengan tingkat oksidasi +2 seperti Sn(OH)2. Begitu juga dengan Bi yang memiliki 5 elektron valensi, tetapi senyawanya lebih banyak dengan tingkat oksidasi +1 dan +3 seperti Bi(OH)3\n"
        val prevbtn : Button = view.findViewById(R.id.btnprev)
        prevbtn.setOnClickListener {
            val fragment = MateriKaidah4Fragment()
            val transaction = fragmentManager?.beginTransaction()
            transaction?.replace(R.id.materiFragment, fragment)?.commit()
        }
        val nextbtn : Button = view.findViewById(R.id.btnnext)
        nextbtn.visibility = View.GONE
        nextbtn.setOnClickListener {
            val fragment = MateriKaidah5Fragment()
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