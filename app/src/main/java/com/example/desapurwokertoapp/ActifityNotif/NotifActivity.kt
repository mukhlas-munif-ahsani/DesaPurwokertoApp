package com.example.desapurwokertoapp.ActifityNotif

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.appcompat.widget.Toolbar
import butterknife.BindView
import butterknife.ButterKnife
import com.example.desapurwokertoapp.R

class NotifActivity : AppCompatActivity() {

    @BindView(R.id.act_notif_toolbar)
    lateinit var mToolbar:Toolbar

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_notif)

        ButterKnife.bind(this)

        setSupportActionBar(mToolbar)
        supportActionBar?.setTitle("Notofikasi")

        supportActionBar?.setDisplayHomeAsUpEnabled(true)
        supportActionBar?.setDisplayShowHomeEnabled(true)

        mToolbar.setNavigationIcon(resources.getDrawable(R.drawable.ic_arrow_back))
        mToolbar.setNavigationOnClickListener {
            finish()
        }
    }
}
