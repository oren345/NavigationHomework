package com.yazag.navigationhomework.ui.custom

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Toast
import androidx.navigation.fragment.findNavController
import androidx.navigation.fragment.navArgs
import com.yazag.navigationhomework.R
import com.yazag.navigationhomework.common.viewBinding
import com.yazag.navigationhomework.data.model.Personal
import com.yazag.navigationhomework.data.model.Results
import com.yazag.navigationhomework.databinding.FragmentCustomBinding

class CustomFragment : Fragment(R.layout.fragment_custom) {

    private val binding by viewBinding (FragmentCustomBinding::bind)
    private val args by navArgs<CustomFragmentArgs>()

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        with (binding){
            tvName2.text = (args.personal.name)

            btnResults.setOnClickListener {
                val football = etFootball.text.toString()
                val feeling = etFeelling.text.toString()
                val social = etSocial.text.toString()
                val empty = (football.isNotEmpty() && feeling.isNotEmpty() && social.isNotEmpty())

                if (empty==false){
                    Toast.makeText(context, R.string.toast, Toast.LENGTH_SHORT).show()
                }

                if (empty==true){
                    val res = Results(args.personal, football, feeling, social)
                    val action = CustomFragmentDirections.customToResults(res)
                    findNavController().navigate(action)

                }



            }

        }

    }

}