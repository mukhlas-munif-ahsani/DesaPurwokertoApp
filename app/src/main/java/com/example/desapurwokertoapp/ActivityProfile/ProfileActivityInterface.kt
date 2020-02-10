package com.example.desapurwokertoapp.ActivityProfile

import android.graphics.Bitmap

interface ProfileActivityInterface {
    fun setImage(image:Bitmap)
    fun setNamaImage(namaImage:String)
    fun setNama(nama:String)
    fun setNIK(nik:Int)
    fun setAktaKelahiran(aktaKelahiran:String)
    fun setDusun(dusun:String)
    fun setRTRW(RtRw:String)
    fun setJenisKelamin(jenisKelamin:String)
    fun setTTL(TTL:String)
    fun setAgama(agama:String)
    fun setPendidikanDalamKK(pendidikanDalamKk:String)
    fun setPendidikanSedangDitempuh(pendidikanSedangDitempuh:String)
    fun setPekerjaan(pekerjaan:String)
    fun setStatusPerkawinan(statusPerkawinan:String)
    fun setWargaNegara(wargaNegara:String)
    fun setDokumenPaspor(dokumenPaspor:String)
    fun setDokumenKitas(dokumenKitas:String)
    fun setAlamatSebelumnya(alamatSebelumnya:String)
    fun setAlamatSekarang(alamatSekarang:String)
    fun setAktaPerkawinan(aktaPerkawinan:String)
    fun setTanggalPerkawinan(tanggalPerkawinan:String)

    fun setNikAyah(nikAyah:Int)
    fun setNamaAyah(namaAyah:String)
    fun setNikIbu(nikIbu:String)
    fun setNamaIbu(namaIbu:String)
    fun setCacat(cacat:String)
    fun setStatus(status:String)

    fun showMessage(text:String)
}