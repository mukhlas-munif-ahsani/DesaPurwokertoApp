package com.example.desapurwokertoapp.FragmentDataDesa.Fragment


import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup

import com.example.desapurwokertoapp.R

/**
 * A simple [Fragment] subclass.
 */
class DataJenisKelaminFragment : Fragment() {

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        return inflater.inflate(R.layout.fragment_data_jenis_kelamin, container, false)
    }


}
