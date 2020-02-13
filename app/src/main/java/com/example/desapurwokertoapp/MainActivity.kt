package com.example.desapurwokertoapp

import android.content.Intent
import android.os.Bundle
import android.view.*
import android.widget.FrameLayout
import android.widget.Toast
import androidx.appcompat.app.ActionBarDrawerToggle
import androidx.appcompat.app.AppCompatActivity
import androidx.drawerlayout.widget.DrawerLayout
import butterknife.BindView
import butterknife.ButterKnife
import com.example.desapurwokertoapp.ActifityNotif.NotifActivity
import com.example.desapurwokertoapp.ActivityBantuan.BantuanActivity
import com.example.desapurwokertoapp.ActivityLaporan.LaporActivity
import com.example.desapurwokertoapp.ActivityProfile.ProfileActivity
import com.example.desapurwokertoapp.ActivityRiwayatLayanan.RiwayatLayananActivity
import com.example.desapurwokertoapp.FragmentBeranda.BerandaFragment
import com.example.desapurwokertoapp.FragmentDataDesa.DataDesaFragment
import com.example.desapurwokertoapp.FragmentLogin.LoginFragment
import com.example.desapurwokertoapp.FragmentPemerintahDesa.PemerintahDesaFragment
import com.example.desapurwokertoapp.FragmentProfileDesa.ProfileDesaFragment
import com.google.android.material.appbar.AppBarLayout
import com.google.android.material.bottomnavigation.BottomNavigationView
import com.google.android.material.navigation.NavigationView

open class MainActivity : AppCompatActivity(),MainActivityInterface, NavigationView.OnNavigationItemSelectedListener {

    @BindView(R.id.main_appbar)
    lateinit var mMainAppbar:AppBarLayout
    @BindView(R.id.main_toolbar)
    lateinit var mMainToolbar: androidx.appcompat.widget.Toolbar
    @BindView(R.id.drawer_layout)
    lateinit var mDrawerLayout: DrawerLayout
    @BindView(R.id.nav_view)
    lateinit var mNavView: NavigationView
    @BindView(R.id.bottomNavigation)
    lateinit var mBottomNavigationView: BottomNavigationView
    @BindView(R.id.fl_container)
    lateinit var mContainer: FrameLayout

    var isLogin:Boolean = false

    lateinit var menuItem:MenuItem

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        ButterKnife.bind(this)


        setSupportActionBar(mMainToolbar)
        supportActionBar?.setTitle("Beranda")

        if (isLogin){
            mDrawerLayout.setDrawerLockMode(DrawerLayout.LOCK_MODE_UNLOCKED)
            if (savedInstanceState == null) {
                val fragment = BerandaFragment()
                supportFragmentManager
                    .beginTransaction()
                    .replace(R.id.fl_container, fragment, fragment.javaClass.getSimpleName())
                    .commit()
            }
        }else{
            mDrawerLayout.setDrawerLockMode(DrawerLayout.LOCK_MODE_LOCKED_CLOSED)
            if (savedInstanceState == null) {
                val fragment = LoginFragment()
                supportFragmentManager
                    .beginTransaction()
                    .replace(R.id.fl_container, fragment, fragment.javaClass.getSimpleName())
                    .commit()
            }
        }

        val actionBarDrawerToggle = ActionBarDrawerToggle(
            this,
            mDrawerLayout,
            mMainToolbar,
            R.string.openNavDrawer,
            R.string.closeNavDrawer
        )

        mBottomNavigationView.setOnNavigationItemSelectedListener(mOnNavigationItemSelectedListener)



        mDrawerLayout.addDrawerListener(actionBarDrawerToggle)
        actionBarDrawerToggle.syncState()
        mNavView.setNavigationItemSelectedListener(this)
    }

    override fun onCreateOptionsMenu(menu: Menu): Boolean {
        // Inflate the menu to use in the action bar
        val inflater = menuInflater
        inflater.inflate(R.menu.main_toolbar_menu, menu)
        return super.onCreateOptionsMenu(menu)
    }

    override fun onOptionsItemSelected(item: MenuItem): Boolean {
        // Handle action bar item clicks here.
        val id = item.getItemId()
        if (id == R.id.action_notif) {
            if (isLogin){
                navigateToNotif()
            }else{
                showMessage("Anda harus login dahulu")
            }
            return true
        }
        return super.onOptionsItemSelected(item)
    }

    override fun onNavigationItemSelected(item: MenuItem): Boolean {
        when (item.itemId) {
            R.id.nav_draw_print -> {
                navigateToPrint()
                return true
            }
            R.id.nav_draw_profile -> {
                navigateToProfile()
                return true
            }
            R.id.nav_draw_riwayat -> {
                navigateToRiwayat()
                return true
            }
            R.id.nav_draw_lapor -> {
                navigateToLapor()
                return true
            }
            R.id.nav_draw_bantuan -> {
                navigateToBantuan()
                return true
            }
            R.id.nav_draw_logout -> {
                showLogoutDialog()
                return true
            }
        }
        return super.onOptionsItemSelected(item)
    }

    private fun navigateToNotif() {
        val intent = Intent(this, NotifActivity::class.java)
        startActivity(intent)
    }

    private fun showLogoutDialog() {
        val fragment = LoginFragment()
        supportActionBar?.setTitle("Beranda")
        supportFragmentManager.beginTransaction()
            .replace(R.id.fl_container, fragment, fragment.javaClass.getSimpleName())
            .commit()
        //------------------logout--------------------------
        mDrawerLayout.setDrawerLockMode(DrawerLayout.LOCK_MODE_LOCKED_CLOSED)
        isLogin = false
        //------------------------------------------------------
    }

    private fun navigateToBantuan() {
        val intent = Intent(this, BantuanActivity::class.java)
        startActivity(intent)
        //showMessage("kamu ada di BANTUAN")
    }

    private fun navigateToLapor() {
        val intent = Intent(this, LaporActivity::class.java)
        startActivity(intent)
//        showMessage("kamu ada di LAPOR")
    }

    private fun navigateToRiwayat() {
        val intent = Intent(this, RiwayatLayananActivity::class.java)
        startActivity(intent)
//        showMessage("kamu ada di RIWAYAT")
    }

    private fun navigateToProfile() {
        val intent = Intent(this, ProfileActivity::class.java)
        startActivity(intent)
//        showMessage("kamu ada di profile")
    }

    private fun navigateToPrint() {
        showMessage("kamu ada di print")
    }

    override fun showMessage(message: String) {
        val toast = Toast.makeText(applicationContext, message, Toast.LENGTH_SHORT)
        toast.show()
    }

    private val mOnNavigationItemSelectedListener =
        BottomNavigationView.OnNavigationItemSelectedListener { menuItem ->
            when (menuItem.itemId) {
                R.id.navigation_beranda -> {
                    val fragment = BerandaFragment()
                    supportActionBar?.setTitle("Beranda")
                    supportFragmentManager.beginTransaction()
                        .replace(R.id.fl_container, fragment, fragment.javaClass.getSimpleName())
                        .commit()
                    //------------semisal ini tombol login ^^---------------------------
                    isLogin = true
                    mDrawerLayout.setDrawerLockMode(DrawerLayout.LOCK_MODE_UNLOCKED)
                    //----------------------------------------------------------
                    return@OnNavigationItemSelectedListener true
                }
                R.id.navigation_profile_desa -> {
                    val fragment =
                        ProfileDesaFragment()
                    supportActionBar?.setTitle("Profile Desa")
                    supportFragmentManager.beginTransaction()
                        .replace(R.id.fl_container, fragment, fragment.javaClass.getSimpleName())
                        .commit()
                    return@OnNavigationItemSelectedListener true
                }
                R.id.navigation_pemerintaha_desa -> {
                    val fragment =
                        PemerintahDesaFragment()
                    supportActionBar?.setTitle("Pemerintah Desa")
                    supportFragmentManager.beginTransaction()
                        .replace(R.id.fl_container, fragment, fragment.javaClass.getSimpleName())
                        .commit()
                    return@OnNavigationItemSelectedListener true
                }
                R.id.navigation_data_desa -> {
                    val fragment = DataDesaFragment()
                    supportActionBar?.setTitle("Data Desa")
                    supportFragmentManager.beginTransaction()
                        .replace(R.id.fl_container, fragment, fragment.javaClass.getSimpleName())
                        .commit()
                    return@OnNavigationItemSelectedListener true
                }
            }
            false
        }

    override fun setToolbarGone() {
        mMainAppbar.visibility = View.GONE
        mContainer.setMarginTop(0)
    }

    override fun setToolbarVisible() {
        mMainAppbar.visibility = View.VISIBLE
        mContainer.setMarginTop(56)
    }

    fun View.setMarginTop(topMargin: Int) {
        val params = layoutParams as ViewGroup.MarginLayoutParams
        params.setMargins(params.leftMargin,topMargin, params.rightMargin, params.bottomMargin)
        layoutParams = params
    }
}
