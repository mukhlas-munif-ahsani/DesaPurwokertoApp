package com.example.desapurwokertoapp.FragmentProfileDesa.Fragments


import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import butterknife.BindView
import butterknife.ButterKnife
import com.example.desapurwokertoapp.R

/**
 * A simple [Fragment] subclass.
 */
class SejarahFragment : Fragment(),SejarahFragmentInterface {


    @BindView(R.id.judul_txt)
    lateinit var mJudul:TextView
    @BindView(R.id.date_txt)
    lateinit var mTanggal:TextView
    @BindView(R.id.isi_sejarah_txt)
    lateinit var mSejarah:TextView

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        val view: View = inflater.inflate(R.layout.fragment_sejarah, container, false)

        ButterKnife.bind(this, view)

        return view
    }
    override fun setJudul(judul: String) {
        mJudul.setText(judul)
    }

    override fun setTanggal(tanggal: String) {
        mTanggal.setText(tanggal)
    }

    override fun setSejarah(sejarah: String) {
        mSejarah.setText(sejarah)
    }

}
