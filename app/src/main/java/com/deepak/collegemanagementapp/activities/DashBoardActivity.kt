package com.deepak.collegemanagementapp.activities

import android.app.Activity
import android.content.Intent
import android.os.Bundle
import android.view.View
import android.widget.TextView
import com.deepak.collegemanagementapp.R

class DashBoardActivity : Activity(), View.OnClickListener {

    // Declaration Of View Components
    lateinit var tvAdmin : TextView
    lateinit var tvStudent : TextView

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_dashboard)

        tvAdmin = findViewById(R.id.tvAdmin)
        tvStudent = findViewById(R.id.tvStudent)

        tvAdmin.setOnClickListener(this@DashBoardActivity)
        tvStudent.setOnClickListener(this@DashBoardActivity)
    }

    override fun onClick(v: View?) {

        when(v?.id){
            R.id.tvAdmin -> {

                startActivity(Intent(this@DashBoardActivity, AdminLoginActivity :: class.java))

            }
            R.id.tvStudent -> {

                startActivity(Intent(this@DashBoardActivity, StudentLoginActivity :: class.java))

            }
        }
    }
}