package com.julietolieng.hackathon1

import android.os.Bundle
import androidx.activity.viewModels
import androidx.appcompat.app.AppCompatActivity
import androidx.fragment.app.Fragment
import androidx.lifecycle.lifecycleScope
import com.julietolieng.hackathon1.ui.AuthViewModel
import com.julietolieng.hackathon1.ui.AuthViewModelFactory
import com.julietolieng.hackathon1.ui.HomeFragment
import com.julietolieng.hackathon1.ui.LoginFragment
import com.julietolieng.hackathon1.ui.SplashFragment
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.flow.collectLatest
import kotlinx.coroutines.launch

class MainActivity : AppCompatActivity(R.layout.activity_main) {
    private val viewModel by viewModels<AuthViewModel> { AuthViewModelFactory() }
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        viewModel.checkUserAuth()
        lifecycleScope.launch(Dispatchers.IO) {
            viewModel.isLoggedIn.collectLatest { isLoggedIn ->
                isLoggedIn?.let { loggedIn ->
                    showFirstFragment(loggedIn)
                } ?: run {
                    openFragment(SplashFragment())
                }
            }
        }
    }


    private fun showFirstFragment(isLoggedIn: Boolean) {
        if (isLoggedIn) {
            openFragment(HomeFragment())
        } else {
            openFragment(LoginFragment())
        }
    }

    private fun openFragment(fragment: Fragment) {
        supportFragmentManager.beginTransaction()
            .replace(R.id.content, fragment)
            .commit()
    }
}
