package com.deepak.collegemanagementapp.models

data class Student(
    var studMobileNumber: String,
    var studName: String,
    var studPassword: String,
    val studGender: String,
    val studCourse: String,
    val studDOB: String,
    val studAge : Int
)
