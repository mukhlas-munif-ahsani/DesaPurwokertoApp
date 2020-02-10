package com.example.desapurwokertoapp.FragmentBeranda

import android.content.Intent
import android.graphics.Bitmap
import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import android.widget.Toast
import butterknife.BindView
import butterknife.ButterKnife
import com.example.desapurwokertoapp.ActivityProfile.ProfileActivity
import com.example.desapurwokertoapp.BantuanActivity
import com.example.desapurwokertoapp.LaporActivity
import com.example.desapurwokertoapp.R
import com.example.desapurwokertoapp.RiwayatLayananActivity
import com.google.android.material.floatingactionbutton.ExtendedFloatingActionButton
import com.google.android.material.floatingactionbutton.FloatingActionButton
import de.hdodenhof.circleimageview.CircleImageView


class BerandaFragment : Fragment(),
    BerandaFragmentInterface {

    @BindView(R.id.beranda_profile_image)
    lateinit var mBerandaProfilImage: CircleImageView
    @BindView(R.id.txt_beranda_nama)
    lateinit var mTxtBerandaNama: TextView
    @BindView(R.id.txt_beranda_nik)
    lateinit var mTxtBerandaNik: TextView
    @BindView(R.id.txt_beranda_nokk)
    lateinit var mTxtBerandaNokk: TextView
    @BindView(R.id.fab_cetak_button)
    lateinit var mFabCetakButton: ExtendedFloatingActionButton
    @BindView(R.id.profile_button)
    lateinit var mProfilButton: FloatingActionButton
    @BindView(R.id.riwayat_button)
    lateinit var mRiwayatButton: FloatingActionButton
    @BindView(R.id.lapor_button)
    lateinit var mLaporButton: FloatingActionButton
    @BindView(R.id.bantuan_button)
    lateinit var mBantuanButton: FloatingActionButton

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        val view: View = inflater.inflate(R.layout.fragment_beranda, container, false)
        ButterKnife.bind(this, view)

        mFabCetakButton.setOnClickListener{
            showMessage("cetak")
            setNama("Ahmad Faiz Mukhlas")
        }

        mProfilButton.setOnClickListener{
            showMessage("profi")
            navigateToProfile()

        }

        mRiwayatButton.setOnClickListener{
            showMessage("riwayat")
            navigateToRiwayat()
        }

        mLaporButton.setOnClickListener{
            showMessage("lapor")
            navigateToLapor()
        }

        mBantuanButton.setOnClickListener{
            showMessage("bantuan")
            navigateToBantuan()
        }
        return view
    }

    private fun navigateToBantuan() {
        val intent = Intent(activity, BantuanActivity::class.java)
        activity?.startActivity(intent)
    }

    private fun navigateToLapor() {
        val intent = Intent(activity, LaporActivity::class.java)
        activity?.startActivity(intent)
    }

    private fun navigateToRiwayat() {
        val intent = Intent(activity, RiwayatLayananActivity::class.java)
        activity?.startActivity(intent)
    }

    private fun navigateToProfile() {
        val intent = Intent(activity, ProfileActivity::class.java)
        activity?.startActivity(intent)
    }

    override fun setProfileImage(image: Bitmap) {
        mBerandaProfilImage.setImageBitmap(image)
    }

    override fun setNama(text: String) {
        mTxtBerandaNama.text = text
    }

    override fun setNIK(text: String) {
        mTxtBerandaNik.text = text
    }

    override fun setNoKk(text: String) {
        mTxtBerandaNokk.text = text
    }

    override fun showMessage(text: String) {
        val toast = Toast.makeText(activity, text, Toast.LENGTH_SHORT)
        toast.show()
    }
}
