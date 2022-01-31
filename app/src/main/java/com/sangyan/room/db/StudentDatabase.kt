package com.sangyan.room.db

import android.content.Context
import androidx.room.Database
import androidx.room.Room
import androidx.room.RoomDatabase

@Database(entities = [Student::class],version =1)
abstract class StudentDatabase  : RoomDatabase() {
    abstract fun studentDao(): StudentDao

    companion object {
        private var instance: StudentDatabase? = null

        @Synchronized
        fun getInstance(ctx: Context): StudentDatabase {
            if (instance == null)
                instance = Room.databaseBuilder(
                    ctx.applicationContext, StudentDatabase::class.java,
                    "student_database"
                )
                    .fallbackToDestructiveMigration()
                    .build()

            return instance!!

        }

    }
}