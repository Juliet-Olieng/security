package com.julietolieng.hackathon1.ui

import android.os.Bundle
import android.view.View
import androidx.fragment.app.Fragment
import androidx.fragment.app.activityViewModels
import com.julietolieng.hackathon1.R
import com.julietolieng.hackathon1.databinding.FragmentLoginBinding
import com.julietolieng.hackathon1.ui.utils.openFragment

class LoginFragment : Fragment(R.layout.fragment_login) {
    private val viewModel by activityViewModels<AuthViewModel>()
    private lateinit var binding: FragmentLoginBinding

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        binding = FragmentLoginBinding.bind(view)
        binding.btnGoToRegister.setOnClickListener {
            requireActivity().supportFragmentManager.openFragment(RegisterFragment())
        }
    }
}