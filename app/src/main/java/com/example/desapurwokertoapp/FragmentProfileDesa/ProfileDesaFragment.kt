package com.example.desapurwokertoapp.FragmentProfileDesa

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import butterknife.ButterKnife
import com.example.desapurwokertoapp.R


class ProfileDesaFragment : Fragment(), ProfileDesaFragmentInterface {


    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        val view: View = inflater.inflate(R.layout.fragment_profile_desa, container, false)

        ButterKnife.bind(this, view)

        return view
    }
}
