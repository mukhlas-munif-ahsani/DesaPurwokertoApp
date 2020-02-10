package com.example.desapurwokertoapp

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.appcompat.widget.Toolbar
import butterknife.BindView
import butterknife.ButterKnife

class LaporActivity : AppCompatActivity() {

    @BindView(R.id.act_lapor_toolbar)
    lateinit var mToolbar: Toolbar

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_lapor)

        ButterKnife.bind(this)

        setSupportActionBar(mToolbar)
        supportActionBar?.setTitle("Form Laporan")

        supportActionBar?.setDisplayHomeAsUpEnabled(true)
        supportActionBar?.setDisplayShowHomeEnabled(true)

        mToolbar.setNavigationIcon(resources.getDrawable(R.drawable.ic_arrow_back))
        mToolbar.setNavigationOnClickListener {
            finish()
        }
    }
}
