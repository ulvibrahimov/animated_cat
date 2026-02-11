package com.example.myapplication56

import android.annotation.SuppressLint
import android.content.Intent
import android.content.SharedPreferences
import android.os.Bundle
import android.widget.Button
import android.widget.TextView
import android.widget.Toast
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat
import com.google.android.material.textfield.TextInputEditText
import kotlin.jvm.java

class LOGINACTIVITY : AppCompatActivity() {
    @SuppressLint("SuspiciousIndentation")
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_loginactivity)



            val loginBtn: Button = findViewById(R.id.btnLogin)
            val editTxtEmail: TextInputEditText = findViewById(R.id.editTxtEmail)
            val editTxtPassword: TextInputEditText = findViewById(R.id.editTxtPassword)

            val txtLoginToRegister: TextView = findViewById(R.id.txtLoginToRegister)



        val sharedPreferences = getSharedPreferences("user_info", MODE_PRIVATE)
            loginBtn.setOnClickListener {
                val savedmail = sharedPreferences.getString("email", "")
                val savedPassword = sharedPreferences.getString("password", "")
                val email: String = editTxtEmail.text.toString()
                val password: String = editTxtPassword.text.toString()

                /* if (email.isEmpty()) {
                     showMessage("email is empty")
                 } else if (password == "123" && email == "test@") {
                     showMessage("Success")
                 } else {
                     showMessage("ERROR - invalid user name or password", Toast.LENGTH_SHORT)
                 }*/

                when {
                    email.isEmpty() -> showMessage("Email boş ola bilməz")
                    email == savedmail && password == savedPassword -> showMessage("Uğurlu giriş!")
                    else -> showMessage("Xəta: İstifadəçi adı və ya şifrə yanlışdır", Toast.LENGTH_SHORT)
                }
            }

            txtLoginToRegister.setOnClickListener {
                /**
                 * Intent: Ekranlar arası "Bilet"
                 * 'this' (haradayıq) -> 'RegisterScreen::class.java' (haraya gedirik)
                 */
                val intent = Intent(this, REGISTER::class.java)
                startActivity(intent)
            }

        }

        fun showMessage(message: String, duration: Int = Toast.LENGTH_LONG) {
            Toast.makeText(this, message, duration).show()
        }
    }



