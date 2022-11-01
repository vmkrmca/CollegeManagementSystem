package com.deepak.collegemanagementapp.activities

import android.app.Activity
import android.os.Bundle
import android.widget.ListView
import com.deepak.collegemanagementapp.R
import com.deepak.collegemanagementapp.adapter.StudentAdapter
import com.deepak.collegemanagementapp.database.CollegeDBHelper
import com.deepak.collegemanagementapp.listeners.OnStudentClickListener
import com.deepak.collegemanagementapp.models.Student

class AdminDashBoardActivity : Activity(),OnStudentClickListener {

    lateinit var lvStudentsData : ListView
    lateinit var studentList : ArrayList<Student>
    lateinit var collegeDBHelper: CollegeDBHelper
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.admin_dashboard)

        collegeDBHelper = CollegeDBHelper(this@AdminDashBoardActivity)
        lvStudentsData = findViewById(R.id.lvStudentsData)
        studentList = ArrayList<Student>()



        adapterCalling()



    }

    private fun adapterCalling() {

        studentList.clear()
        studentList = collegeDBHelper.readDataFromStudTBL()
        var studentAdapter = StudentAdapter(this@AdminDashBoardActivity,studentList,this)
        lvStudentsData.adapter = studentAdapter
        (lvStudentsData.adapter as StudentAdapter).notifyDataSetChanged()

    }

    override fun onStudentClick(student: Student) {
        var statusValue = student.studStatus
        if (statusValue == 0){
            statusValue = 1
            collegeDBHelper.updateStudentStatus(student.studMobileNumber,statusValue)
            adapterCalling()
        }

    }

}
