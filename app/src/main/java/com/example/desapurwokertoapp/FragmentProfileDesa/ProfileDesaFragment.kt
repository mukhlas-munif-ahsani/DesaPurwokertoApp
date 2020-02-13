package com.example.desapurwokertoapp.FragmentProfileDesa

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import androidx.viewpager.widget.ViewPager
import butterknife.BindView
import butterknife.ButterKnife
import com.example.desapurwokertoapp.FragmentProfileDesa.Fragments.ProfilWilayahFragment
import com.example.desapurwokertoapp.FragmentProfileDesa.Fragments.SejarahFragment
import com.example.desapurwokertoapp.R
import com.ogaclejapan.smarttablayout.SmartTabLayout
import com.ogaclejapan.smarttablayout.utils.v4.FragmentPagerItemAdapter
import com.ogaclejapan.smarttablayout.utils.v4.FragmentPagerItems


class ProfileDesaFragment : Fragment() {

    @BindView(R.id.viewpager_profile_desa)
    lateinit var mViewPager: ViewPager

    @BindView(R.id.viewpagertab_profile_desa)
    lateinit var smartTabLayout: SmartTabLayout

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        val view: View = inflater.inflate(R.layout.fragment_profile_desa, container, false)

        ButterKnife.bind(this, view)

        val adapter = FragmentPagerItemAdapter(
            getChildFragmentManager(), FragmentPagerItems.with(context)
                .add(R.string.titleA, ProfilWilayahFragment::class.java)
                .add(R.string.titleB, SejarahFragment::class.java)
                .create()
        )

        val viewPager = mViewPager
        viewPager.adapter = adapter
        smartTabLayout.setViewPager(viewPager)


        return view
    }

}
