package com.example.desapurwokertoapp.ActivityLaporan

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.TextView
import androidx.appcompat.widget.Toolbar
import butterknife.BindView
import butterknife.ButterKnife
import com.example.desapurwokertoapp.R

class LaporActivity : AppCompatActivity() {

    @BindView(R.id.act_lapor_toolbar)
    lateinit var mToolbar: Toolbar
    @BindView(R.id.activity_lapor_name_txt)
    lateinit var mActLaporName:TextView
    @BindView(R.id.activity_lapor_nik_txt)
    lateinit var mActLaporNik:TextView
    @BindView(R.id.input_laporan_txt)
    lateinit var mInputLaporan:TextView

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
