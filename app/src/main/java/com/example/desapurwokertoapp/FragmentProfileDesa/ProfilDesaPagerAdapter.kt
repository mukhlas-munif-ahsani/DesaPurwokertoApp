package com.example.desapurwokertoapp.FragmentProfileDesa

import androidx.fragment.app.Fragment
import androidx.fragment.app.FragmentManager
import androidx.fragment.app.FragmentPagerAdapter
import com.example.desapurwokertoapp.FragmentProfileDesa.Fragments.ProfilWilayahFragment
import com.example.desapurwokertoapp.FragmentProfileDesa.Fragments.SejarahFragment


class ProfilDesaPagerAdapter(fm: FragmentManager): FragmentPagerAdapter(fm){

    private val pages = listOf(
        ProfilWilayahFragment(),
        SejarahFragment()
    )
    override fun getItem(position: Int): Fragment {
        return pages[position]
    }

    override fun getCount(): Int {
        return pages.size
    }

    override fun getPageTitle(position: Int): CharSequence? {
        return when(position){
            0 -> "Profile Wilayah Desa"
            else -> "Sejarah Desa"
        }
    }

}