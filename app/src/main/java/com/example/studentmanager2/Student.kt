package com.example.studentmanager2

data class Student(val fullName: String, val studentId: String) {
    override fun toString(): String = "$fullName \nID: $studentId"
}