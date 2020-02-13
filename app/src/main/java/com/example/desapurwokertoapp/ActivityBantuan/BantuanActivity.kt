package com.example.desapurwokertoapp.ActivityBantuan

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.appcompat.widget.Toolbar
import butterknife.BindView
import butterknife.ButterKnife
import com.example.desapurwokertoapp.R

class BantuanActivity : AppCompatActivity() {

    @BindView(R.id.act_bantuan_toolbar)
    lateinit var mToolbar: Toolbar

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_bantuan)

        ButterKnife.bind(this)

        setSupportActionBar(mToolbar)
        supportActionBar?.setTitle("Bantuan")

        supportActionBar?.setDisplayHomeAsUpEnabled(true)
        supportActionBar?.setDisplayShowHomeEnabled(true)

        mToolbar.setNavigationIcon(resources.getDrawable(R.drawable.ic_arrow_back))
        mToolbar.setNavigationOnClickListener {
            finish()
        }

    }
}
