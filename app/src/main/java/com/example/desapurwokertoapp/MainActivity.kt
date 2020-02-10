package com.example.desapurwokertoapp

import android.os.Bundle
import android.view.Menu
import android.view.MenuItem
import android.widget.Toast
import androidx.appcompat.app.ActionBarDrawerToggle
import androidx.appcompat.app.AppCompatActivity
import androidx.drawerlayout.widget.DrawerLayout
import butterknife.BindView
import butterknife.ButterKnife
import com.example.desapurwokertoapp.FragmentBeranda.BerandaFragment
import com.example.desapurwokertoapp.FragmentDataDesa.DataDesaFragment
import com.example.desapurwokertoapp.FragmentPemerintahDesa.PemerintahDesaFragment
import com.example.desapurwokertoapp.FragmentProfileDesa.ProfileDesaFragment
import com.google.android.material.bottomnavigation.BottomNavigationView
import com.google.android.material.navigation.NavigationView

class MainActivity : AppCompatActivity(), NavigationView.OnNavigationItemSelectedListener {

    @BindView(R.id.main_toolbar)
    lateinit var mMainToolbar: androidx.appcompat.widget.Toolbar
    @BindView(R.id.drawer_layout)
    lateinit var mDrawerLayout: DrawerLayout
    @BindView(R.id.nav_view)
    lateinit var mNavView: NavigationView
    @BindView(R.id.bottomNavigation)
    lateinit var mBottomNavigationView: BottomNavigationView

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        ButterKnife.bind(this)

        setSupportActionBar(mMainToolbar)
        supportActionBar?.setTitle("Beranda")

        val actionBarDrawerToggle = ActionBarDrawerToggle(
            this,
            mDrawerLayout,
            mMainToolbar,
            R.string.openNavDrawer,
            R.string.closeNavDrawer
        )

        mBottomNavigationView.setOnNavigationItemSelectedListener(mOnNavigationItemSelectedListener)

        if (savedInstanceState == null) {
            val fragment = BerandaFragment()
            supportFragmentManager
                .beginTransaction()
                .replace(R.id.fl_container, fragment, fragment.javaClass.getSimpleName())
                .commit()
        }

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
            navigateToNotif()
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
            R.id.action_notif -> {
                navigateToNotif()
                return true
            }
        }
        return super.onOptionsItemSelected(item)
    }

    private fun navigateToNotif() {
        showMessage("kamu ada di NOTIF")
    }

    private fun showLogoutDialog() {
        showMessage("kamu ada di DIALOG")
    }

    private fun navigateToBantuan() {
        showMessage("kamu ada di BANTUAN")
    }

    private fun navigateToLapor() {
        showMessage("kamu ada di LAPOR")
    }

    private fun navigateToRiwayat() {
        showMessage("kamu ada di RIWAYAT")
    }

    private fun navigateToProfile() {
        showMessage("kamu ada di profile")
    }

    private fun navigateToPrint() {
        showMessage("kamu ada di print")
    }

    private fun showMessage(message: String) {
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
}
