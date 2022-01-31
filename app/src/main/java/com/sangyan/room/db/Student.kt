package com.sangyan.room.db

import androidx.room.ColumnInfo
import androidx.room.Entity
import androidx.room.PrimaryKey

@Entity(tableName = "student_table")
data class Student (
    @PrimaryKey(autoGenerate = true)
    @ColumnInfo(name = "student_rollno")
    val rollno : Int,

    @ColumnInfo(name = "student_name")
    val name : String,

    @ColumnInfo(name = "student_email")
    val email : String
        )