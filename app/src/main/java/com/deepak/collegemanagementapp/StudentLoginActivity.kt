package com.deepak.collegemanagementsystem

import android.app.Activity
import android.content.Intent
import android.os.Bundle
import android.view.View
import android.widget.TextView
import com.deepak.collegemanagementapp.R

class StudentLoginActivity : Activity(), View.OnClickListener {

    lateinit var tvRegister : TextView

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.student_login)

        tvRegister = findViewById(R.id.tvRegister)
        tvRegister.setOnClickListener(this@StudentLoginActivity)
    }

    override fun onClick(v: View?) {

        when(v?.id) {

            R.id.tvRegister ->{
                startActivity(Intent(this@StudentLoginActivity,StudentRegisterActivity :: class.java))
            }
        }
    }
}