package com.project.capstoneapp.ui.auth.register

import android.content.Intent
import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import com.project.capstoneapp.databinding.ActivityFirstRegisterBinding
import com.project.capstoneapp.ui.auth.login.LoginActivity

class FirstRegisterActivity : AppCompatActivity() {
    private lateinit var binding: ActivityFirstRegisterBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityFirstRegisterBinding.inflate(layoutInflater)
        setContentView(binding.root)

        setListeners()
    }

    private fun setListeners() {
        binding.apply {
            btnNext.setOnClickListener {
                val iSecondRegister =
                    Intent(this@FirstRegisterActivity, SecondRegisterActivity::class.java)
                startActivity(iSecondRegister)
            }

            btnLogin.setOnClickListener {
                val iLogin = Intent(this@FirstRegisterActivity, LoginActivity::class.java)
                startActivity(iLogin)
            }
        }
    }
}