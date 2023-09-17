package com.yazag.navigationhomework.ui.results

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.View
import android.widget.Toast
import androidx.navigation.fragment.findNavController
import androidx.navigation.fragment.navArgs
import com.google.android.material.snackbar.Snackbar
import com.yazag.navigationhomework.R
import com.yazag.navigationhomework.common.viewBinding
import com.yazag.navigationhomework.databinding.FragmentResultsBinding


class ResultsFragment : Fragment(R.layout.fragment_results) {

    private val binding by viewBinding(FragmentResultsBinding::bind)
    private val args by navArgs<ResultsFragmentArgs>()

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        with (binding){
            tvDataName.text = args.results.person.name
            tvDataMail.text = args.results.person.mail
            tvDataPhone.text = args.results.person.phone
            tvDataCity.text = args.results.person.city
            tvDataLive.text = args.results.person.live
            tvDataFootball.text = args.results.football
            tvDataFeelling.text = args.results.feeling
            tvDataSocial.text = args.results.social

            btnBack.setOnClickListener {
                findNavController().popBackStack(R.id.homeFragment, false)
            }
            btnKayit.setOnClickListener {
                Snackbar.make(it, R.string.snack, Snackbar.LENGTH_SHORT).show()
            }
        }
    }
}