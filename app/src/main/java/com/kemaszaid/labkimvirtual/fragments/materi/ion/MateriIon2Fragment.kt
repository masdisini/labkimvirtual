package com.kemaszaid.labkimvirtual.fragments.materi.ion

import android.os.Bundle
import android.view.View
import android.widget.Button
import android.widget.ImageView
import android.widget.TextView
import androidx.fragment.app.Fragment
import com.kemaszaid.labkimvirtual.R

class MateriIon2Fragment : Fragment (R.layout.fragment_materi) {

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
        materititle.text = "Contoh Ikatan Ion"
        val materidesc : TextView = view.findViewById(R.id.textmateridesc)
        materidesc.text = "Ikatan ion umumnya terjadi pada atom logam dan non logam. Atom logam seperti golongan IA dan IIA akan berperan sebagai kation sedangan atom-atom non logam seperti golongan VIIA dan VIA akan berperan sebagai anionnya. Contoh senyawa yang mengandung ikatan ion yaitu:\n" +
                "a. KF memiliki ikatan ionik, karena K termasuk logam (golongan IA) dan F termasuk non logam (golongan VIIA).\n" +
                "b. K2O memiliki ikatan ionik, karena K termasuk logam (golongan IA) dan O termasuk non logam (golongan VIA).\n" +
                "c. MgCl2 memiliki ikatan ionik, karena Mg termasuk logam (golongan IIA) dan Cl termasuk non logam (golongan VIIA)\n" +
                "d. BaCl2 memiliki ikatan ionik, karena Ba termasuk logam (golongan IIA) dan Cl termasuk non logam (golongan VIIA)\n" +
                "e. LiF memiliki ikatan ionik, karena Li termasuk logam (golongan IA) dan F termasuk non logam (golongan VIIA)\n"
        val prevbtn : Button = view.findViewById(R.id.btnprev)
        prevbtn.setOnClickListener {
            val fragment = MateriIon1Fragment()
            val transaction = fragmentManager?.beginTransaction()
            transaction?.replace(R.id.materiFragment, fragment)?.commit()
        }
        val nextbtn : Button = view.findViewById(R.id.btnnext)
        nextbtn.setOnClickListener {
            val fragment = MateriIon3Fragment()
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