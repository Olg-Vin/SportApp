package com.vinio.sportapp.db.dao

import androidx.room.Dao
import androidx.room.Insert
import androidx.room.Query
import com.vinio.sportapp.db.entity.ActionEntity
import kotlinx.coroutines.flow.Flow

@Dao
interface ActionDao {
    @Insert
    fun insertAction(user: ActionEntity)
    @Query("SELECT * FROM actions")
    fun getAllActions(): Flow<List<ActionEntity>>
}