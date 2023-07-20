package com.julietolieng.hackathon1.ui

import android.os.Bundle
import android.view.View
import androidx.fragment.app.Fragment
import com.julietolieng.hackathon1.R

class RegisterFragment : Fragment(R.layout.fragment_register) {
    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
    }

    companion object {
        @JvmStatic
        fun newInstance() = RegisterFragment().apply {
            arguments = Bundle().apply {}
        }
    }
}