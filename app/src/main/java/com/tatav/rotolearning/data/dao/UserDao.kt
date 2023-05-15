package com.tatav.rotolearning.data.dao

import androidx.room.Dao
import androidx.room.Query
import androidx.room.Upsert
import com.tatav.rotolearning.data.entity.User

@Dao
interface UserDao {
    @Upsert
    fun insertOrUpdateUser(user: User)

    @Query("SELECT * FROM User WHERE userId = :userId")
    fun getUser(userId: Long): User
}
