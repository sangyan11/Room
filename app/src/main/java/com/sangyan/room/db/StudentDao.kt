package com.sangyan.room.db

import androidx.lifecycle.LiveData
import androidx.room.*

@Dao
interface StudentDao {
    @Insert
  suspend fun insertStudent(student : Student) : Long

   @Delete
   suspend fun deleteStudent(student : Student)

   @Update
   suspend fun updateStudent(student: Student)

   @Query("DELETE from student_table")
   suspend fun deleteAll()


   @Query("Select * from student_table")
   fun getAllStudents() : LiveData<List<Student>>

}