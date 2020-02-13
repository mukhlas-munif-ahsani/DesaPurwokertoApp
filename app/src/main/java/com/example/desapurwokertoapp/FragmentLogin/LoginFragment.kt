package com.example.desapurwokertoapp.FragmentLogin


import android.content.Intent
import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Button
import butterknife.BindView
import butterknife.ButterKnife
import com.example.desapurwokertoapp.ActivityDokumenPenduduk.DokumenPendudukActivity
import com.example.desapurwokertoapp.MainActivity
import com.example.desapurwokertoapp.R

/**
 * A simple [Fragment] subclass.
 */
class LoginFragment : Fragment() {

    @BindView(R.id.button4)
    lateinit var mButton:Button


    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {

        val main = MainActivity()

        // Inflate the layout for this fragment
        val view: View = inflater.inflate(R.layout.fragment_login, container, false)
        ButterKnife.bind(this, view)

        mButton.setOnClickListener{
//            val intent = Intent(activity, MainActivity::class.java)
//            activity?.startActivity(intent)
        }

        return view
    }



}
