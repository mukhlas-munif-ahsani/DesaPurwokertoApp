package com.example.desapurwokertoapp.FragmentPemerintahDesa.Fragment


import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup

import com.example.desapurwokertoapp.R

/**
 * A simple [Fragment] subclass.
 */
class DesaPemerintahFragment : Fragment() {

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        return inflater.inflate(R.layout.fragment_desa_pemerintah, container, false)
    }


}
