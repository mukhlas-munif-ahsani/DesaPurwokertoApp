package com.example.desapurwokertoapp.FragmentPemerintahDesa.Fragment


import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import butterknife.ButterKnife

import com.example.desapurwokertoapp.R

/**
 * A simple [Fragment] subclass.
 */
class VisiMisiFragment : Fragment() {

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        val view: View = inflater.inflate(R.layout.fragment_visi_misi, container, false)

        ButterKnife.bind(this, view)

        return view
    }


}
