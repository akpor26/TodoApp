package com.onovughe.todoapp

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.Toast

class MainActivity : AppCompatActivity() {
    val validuserName: String = "admin"
    val validpassWord: String = "admin"

    private lateinit var userNameInput: EditText
    private lateinit var PasswordInput: EditText
    private lateinit var Submit: Button



    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        //Finding Value By ID
        userNameInput = findViewById(R.id.userNameInput)
        PasswordInput = findViewById(R.id.PasswordInput)
        Submit = findViewById(R.id.Submit)

        //Submit Functionality
        Submit.setOnClickListener {
            val userName = userNameInput.text.toString()
            val passWord = PasswordInput.text.toString()

            login(userName, passWord)
        }
    }

    //HomeActivity Codes and Functionality Using Intent to login into the next class
    fun login(userName: String, passWord: String){
        if(isValidCredentials(userName, passWord)){
            val intent: Intent = Intent(this, HomeActivity2::class.java)
            intent.putExtra("username", userName)
            startActivity(intent)
        }else{
            Toast.makeText(applicationContext, "Invalid Username or Password", Toast.LENGTH_SHORT).show()
        }

    }

    private fun isValidCredentials(userName: String, passWord: String):Boolean{
        if ( passWord == validpassWord) return true
        return false

    }
}