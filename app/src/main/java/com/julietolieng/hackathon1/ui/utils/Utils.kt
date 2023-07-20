package com.julietolieng.hackathon1.ui.utils

import androidx.fragment.app.Fragment
import androidx.fragment.app.FragmentManager
import com.julietolieng.hackathon1.R

fun FragmentManager.openFragment(fragment: Fragment) {
    beginTransaction()
        .replace(R.id.content, fragment)
        .commit()
}