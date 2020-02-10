package com.example.desapurwokertoapp.FragmentBeranda

import android.graphics.Bitmap

interface BerandaFragmentInterface {
    fun setNama(text: String)
    fun setNIK(text: String)
    fun setNoKk(text: String)
    fun setProfileImage(image: Bitmap)
    fun showMessage(text: String)
}