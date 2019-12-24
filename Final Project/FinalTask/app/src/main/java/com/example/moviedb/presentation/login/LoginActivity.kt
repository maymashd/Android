package com.example.moviedb.presentation.login

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Toast
import androidx.lifecycle.Observer
import com.example.moviedb.R
import com.example.moviedb.presentation.MainActivity
import com.example.moviedb.utils.AppPreferences
import kotlinx.android.synthetic.main.activity_login.*
import org.koin.android.ext.android.inject

class LoginActivity : AppCompatActivity() {

    private val loginViewModel: LoginViewModel by inject()

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_login)
        editTextUsername.setText("maimash.dake")
        editTextPassword.setText("dastan99")
        buttonLogin.setOnClickListener{
            loginViewModel.login(
                username = editTextUsername.text.toString(),
                password = editTextPassword.text.toString()
            )
        }
        setData()
    }
    private fun setData() {
        loginViewModel.liveData.observe(this, Observer { state ->
            //State of Progress Bar
            when(state) {
                is LoginViewModel.State.ShowLoading -> {
                    progressBar.visibility = View.VISIBLE
                }
                is LoginViewModel.State.HideLoading -> {
                    progressBar.visibility = View.INVISIBLE
                }
                is LoginViewModel.State.ApiResult -> {
                    // Login Successully
                    if (state.success && !state.session_id.isNullOrEmpty()) {
                        val intent = Intent(this, MainActivity::class.java)
                        AppPreferences.setAccountId(this, state.account_id)
                        AppPreferences.setSessionId(this, state.session_id)
                        startActivity(intent)
                        finish()
                    }
                    // Login Failed
                    else {
                        Toast.makeText(this, "Invalid username, password credentials", Toast.LENGTH_SHORT).show()
                    }
                }
            }
        })
    }
}