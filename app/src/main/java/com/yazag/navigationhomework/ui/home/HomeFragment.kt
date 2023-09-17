package com.yazag.navigationhomework.ui.home

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Toast
import androidx.navigation.fragment.findNavController
import androidx.viewbinding.ViewBinding
import com.yazag.navigationhomework.R
import com.yazag.navigationhomework.common.viewBinding
import com.yazag.navigationhomework.databinding.FragmentHomeBinding


class HomeFragment : Fragment(R.layout.fragment_home) {

    private val binding by viewBinding(FragmentHomeBinding::bind)

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        with (binding){
            btnStart.setOnClickListener {
                val name = etName.text.toString()
                val surname = etSurname.text.toString()
                val empty = (name.isNotEmpty() && surname.isNotEmpty())

                if (empty==false){
                    Toast.makeText(context, R.string.toast, Toast.LENGTH_SHORT).show()
                }

                if (empty==true) {
                    val action = HomeFragmentDirections.homeToPersonal(name, surname)
                    findNavController().navigate(action)
                }
            }

        }

    }

}