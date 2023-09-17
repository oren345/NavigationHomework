package com.yazag.navigationhomework.ui.PersonalInfo

import android.os.Bundle
import android.util.Patterns
import androidx.fragment.app.Fragment
import android.view.View
import android.widget.Toast
import androidx.navigation.fragment.findNavController
import androidx.navigation.fragment.navArgs
import com.google.android.material.snackbar.Snackbar
import com.yazag.navigationhomework.R
import com.yazag.navigationhomework.common.viewBinding
import com.yazag.navigationhomework.data.model.Personal
import com.yazag.navigationhomework.databinding.FragmentPersonalInfoBinding

class PersonalInfoFragment : Fragment(R.layout.fragment_personal_info) {

    private val binding by viewBinding (FragmentPersonalInfoBinding::bind)
    private val args by navArgs<PersonalInfoFragmentArgs>()

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        with (binding) {
            tvName.text = (args.name + " " + args.surname)//tvName.text = args.name.plus(" ${args.surname}")

            btnCustom.setOnClickListener {
                val name = tvName.text.toString()
                val mail = etMail.text.toString()
                val phone = etPhone.text.toString()
                val city = etCity.text.toString()
                val live = etLive.text.toString()
                val empty = (mail.isNotEmpty() && phone.isNotEmpty() && city.isNotEmpty() && live.isNotEmpty())
                //val match = (Patterns.EMAIL_ADDRESS.matcher("example@example.com").matches())

                /*if (match==false){
                    Toast.makeText(context, R.string.toast2, Toast.LENGTH_SHORT).show()
                }*/

                if (empty==false){
                    Toast.makeText(context, R.string.toast, Toast.LENGTH_SHORT).show()
                }

                if (empty==true){
                    val Person = Personal(name, mail, phone, city, live)
                    val action = PersonalInfoFragmentDirections.personalToCustom(Person)
                    findNavController().navigate(action)
                }
            }
        }
    }
}