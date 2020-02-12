package com.example.desapurwokertoapp.FragmentProfileDesa.Fragments


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
class ProfilWilayahFragment : Fragment() {

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        val view: View = inflater.inflate(R.layout.fragment_profile_desa, container, false)

        ButterKnife.bind(this, view)

        return view
    }


}
