package com.example.desapurwokertoapp.FragmentPemerintahDesa

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import androidx.viewpager.widget.ViewPager
import butterknife.BindView
import butterknife.ButterKnife
import com.example.desapurwokertoapp.FragmentPemerintahDesa.Fragment.DesaPemerintahFragment
import com.example.desapurwokertoapp.FragmentPemerintahDesa.Fragment.VisiMisiFragment
import com.example.desapurwokertoapp.R
import com.ogaclejapan.smarttablayout.SmartTabLayout
import com.ogaclejapan.smarttablayout.utils.v4.FragmentPagerItemAdapter
import com.ogaclejapan.smarttablayout.utils.v4.FragmentPagerItems

class PemerintahDesaFragment : Fragment() {

    @BindView(R.id.viewpager)
    lateinit var mViewPager: ViewPager

    @BindView(R.id.viewpagertab)
    lateinit var smartTabLayout: SmartTabLayout

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        val view: View = inflater.inflate(R.layout.fragment_pemerintah_desa, container, false)

        ButterKnife.bind(this, view)

        val adapter = FragmentPagerItemAdapter(
            getChildFragmentManager(), FragmentPagerItems.with(context)
                .add(R.string.pemerintahDesa, DesaPemerintahFragment::class.java)
                .add(R.string.VisiMisi, VisiMisiFragment::class.java)
                .create()
        )

        val viewPager = mViewPager
        viewPager.adapter = adapter
        smartTabLayout.setViewPager(viewPager)


        return view
    }
}
