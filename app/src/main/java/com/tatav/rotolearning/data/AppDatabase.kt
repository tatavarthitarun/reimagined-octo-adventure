package com.tatav.rotolearning.data

import androidx.room.Database
import androidx.room.RoomDatabase
import com.tatav.rotolearning.data.dao.UserDao
import com.tatav.rotolearning.data.entity.User

@Database(
    version = 1,
    entities = [User::class],
    exportSchema = true
)
abstract class AppDatabase : RoomDatabase() {
    abstract val userDao: UserDao
}
