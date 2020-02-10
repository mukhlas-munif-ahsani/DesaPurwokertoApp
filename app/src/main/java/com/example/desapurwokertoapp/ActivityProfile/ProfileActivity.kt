package com.example.desapurwokertoapp.ActivityProfile

import android.content.Intent
import android.graphics.Bitmap
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.Menu
import android.view.MenuItem
import android.widget.TextView
import android.widget.Toast
import androidx.appcompat.widget.Toolbar
import androidx.cardview.widget.CardView
import butterknife.BindDimen
import butterknife.BindView
import butterknife.ButterKnife
import com.example.desapurwokertoapp.ActivityDokumenPenduduk.DokumenPendudukActivity
import com.example.desapurwokertoapp.ActivityKeanggotaanKelompok.KeanggotaanKelompokActivity
import com.example.desapurwokertoapp.R
import de.hdodenhof.circleimageview.CircleImageView

class ProfileActivity : AppCompatActivity(), ProfileActivityInterface {

    @BindView(R.id.activity_profile_image)
    lateinit var mActivityProfileImage: CircleImageView
    @BindView(R.id.image_nama_txt)
    lateinit var mImageNamaTxt: TextView
    @BindView(R.id.activity_prof_name_txt)
    lateinit var mName: TextView
    @BindView(R.id.activity_prof_nik_txt)
    lateinit var mNik: TextView
    @BindView(R.id.activity_prof_nokk_txt)
    lateinit var mNoKk: TextView
    @BindView(R.id.activity_prof_akta_kelahiran_txt)
    lateinit var mAktaKelahiran: TextView
    @BindView(R.id.activity_prof_dusun_txt)
    lateinit var mDusun: TextView
    @BindView(R.id.activity_prof_rtrw_txt)
    lateinit var mRtRw: TextView
    @BindView(R.id.activity_prof_kelamin_txt)
    lateinit var mKelamin: TextView
    @BindView(R.id.activity_prof_ttl_txt)
    lateinit var mTtl: TextView
    @BindView(R.id.activity_prof_agama_txt)
    lateinit var mAgama: TextView
    @BindView(R.id.activity_prof_pendidikan_dalam_kk_txt)
    lateinit var mPendidikanDalamKk: TextView
    @BindView(R.id.activity_prof_pendidikan_ditempuh_txt)
    lateinit var mPendidikanDitempuh: TextView
    @BindView(R.id.activity_prof_pekerjaan_txt)
    lateinit var mPekerjaan: TextView
    @BindView(R.id.activity_prof_perkawinan_txt)
    lateinit var mStatusPerkawinan: TextView
    @BindView(R.id.activity_prof_warga_negara_txt)
    lateinit var mWargaNegara: TextView
    @BindView(R.id.activity_prof_paspor_txt)
    lateinit var mPaspor: TextView
    @BindView(R.id.activity_prof_kitas_txt)
    lateinit var mKitas: TextView
    @BindView(R.id.activity_prof_alamat_sebelum_txt)
    lateinit var mAlamatSebelum: TextView
    @BindView(R.id.activity_prof_alamat_sekarang_txt)
    lateinit var mAlamatSEkarang: TextView
    @BindView(R.id.activity_prof_akta_perkawinan_txt)
    lateinit var mAktaPerkawinan: TextView
    @BindView(R.id.activity_prof_tgl_perkawinan_txt)
    lateinit var mTanggalPerkawinan: TextView

    @BindView(R.id.activity_prof_nik_ayah_txt)
    lateinit var mNikAyah: TextView
    @BindView(R.id.activity_prof_nama_ayah_txt)
    lateinit var mNamaAyah: TextView
    @BindView(R.id.activity_prof_nik_ibu_txt)
    lateinit var mNikIbu: TextView
    @BindView(R.id.activity_prof_nama_ibu_txt)
    lateinit var mNamaIbu: TextView
    @BindView(R.id.activity_prof_cacat_txt)
    lateinit var mCacat: TextView
    @BindView(R.id.activity_prof_status_txt)
    lateinit var mStatus: TextView

    @BindView(R.id.cardView3)
    lateinit var mCardView3: CardView
    @BindView(R.id.cardView4)
    lateinit var mCardView4: CardView

    @BindView(R.id.act_prof_toolbar)
    lateinit var mToolbar: Toolbar


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_profile)

        ButterKnife.bind(this)

        setSupportActionBar(mToolbar)
        supportActionBar?.setTitle("Profil")

        supportActionBar?.setDisplayHomeAsUpEnabled(true)
        supportActionBar?.setDisplayShowHomeEnabled(true)

        mToolbar.setNavigationIcon(resources.getDrawable(R.drawable.ic_arrow_back))
        mToolbar.setNavigationOnClickListener {
            finish()
        }

        mCardView3.setOnClickListener {
            showMessage("card 1")
            navigateToKeanggotaanKelompok()
        }

        mCardView4.setOnClickListener {
            showMessage("card 2")
            navigateToDokumenPenduduk()
        }
    }

    override fun onCreateOptionsMenu(menu: Menu): Boolean {
        // Inflate the menu to use in the action bar
        val inflater = menuInflater
        inflater.inflate(R.menu.profil_toolbar_menu, menu)
        return super.onCreateOptionsMenu(menu)
    }

    override fun onOptionsItemSelected(item: MenuItem): Boolean {
        // Handle action bar item clicks here.
        val id = item.getItemId()
        if (id == R.id.action_notif) {
            navigateToPrint()
            return true
        }
        return super.onOptionsItemSelected(item)
    }

    private fun navigateToPrint() {
        showMessage("print")
    }

    private fun navigateToDokumenPenduduk() {
        val intent = Intent(this, DokumenPendudukActivity::class.java)
        startActivity(intent)
    }

    private fun navigateToKeanggotaanKelompok() {
        val intent = Intent(this, KeanggotaanKelompokActivity::class.java)
        startActivity(intent)
    }

    override fun setImage(image: Bitmap) {
        mActivityProfileImage.setImageBitmap(image)
    }

    override fun setNamaImage(namaImage: String) {
        mImageNamaTxt.setText(namaImage)
    }

    override fun setNama(nama: String) {
        mName.setText(nama)
    }

    override fun setNIK(nik: Int) {
        mNik.setText(nik)
    }

    override fun setAktaKelahiran(aktaKelahiran: String) {
        mAktaKelahiran.setText(aktaKelahiran)
    }

    override fun setDusun(dusun: String) {
        mDusun.setText(dusun)
    }

    override fun setRTRW(RtRw: String) {
        mRtRw.setText(RtRw)
    }

    override fun setJenisKelamin(jenisKelamin: String) {
        mKelamin.setText(jenisKelamin)
    }

    override fun setTTL(TTL: String) {
        mTtl.setText(TTL)
    }

    override fun setAgama(agama: String) {
        mAgama.setText(agama)
    }

    override fun setPendidikanDalamKK(pendidikanDalamKk: String) {
        mPendidikanDalamKk.setText(pendidikanDalamKk)
    }

    override fun setPendidikanSedangDitempuh(pendidikanSedangDitempuh: String) {
        mPendidikanDitempuh.setText(pendidikanSedangDitempuh)
    }

    override fun setPekerjaan(pekerjaan: String) {
        mPekerjaan.setText(pekerjaan)
    }

    override fun setStatusPerkawinan(statusPerkawinan: String) {
        mStatusPerkawinan.setText(statusPerkawinan)
    }

    override fun setWargaNegara(wargaNegara: String) {
        mWargaNegara.setText(wargaNegara)
    }

    override fun setDokumenPaspor(dokumenPaspor: String) {
        mPaspor.setText(dokumenPaspor)
    }

    override fun setDokumenKitas(dokumenKitas: String) {
        mKitas.setText(dokumenKitas)
    }

    override fun setAlamatSebelumnya(alamatSebelumnya: String) {
        mAlamatSebelum.setText(alamatSebelumnya)
    }

    override fun setAlamatSekarang(alamatSekarang: String) {
        mAlamatSEkarang.setText(alamatSekarang)
    }

    override fun setAktaPerkawinan(aktaPerkawinan: String) {
        mAktaPerkawinan.setText(aktaPerkawinan)
    }

    override fun setTanggalPerkawinan(tanggalPerkawinan: String) {
        mTanggalPerkawinan.setText(tanggalPerkawinan)
    }

    override fun setNikAyah(nikAyah: Int) {
        mNikAyah.setText(nikAyah)
    }

    override fun setNamaAyah(namaAyah: String) {
        mNamaAyah.setText(namaAyah)
    }

    override fun setNikIbu(nikIbu: String) {
        mNikIbu.setText(nikIbu)
    }

    override fun setNamaIbu(namaIbu: String) {
        mNamaIbu.setText(namaIbu)
    }

    override fun setCacat(cacat: String) {
        mCacat.setText(cacat)
    }

    override fun setStatus(status: String) {
        mStatus.setText(status)
    }

    override fun showMessage(text: String) {
        val toast = Toast.makeText(applicationContext, text, Toast.LENGTH_SHORT)
        toast.show()
    }

}
