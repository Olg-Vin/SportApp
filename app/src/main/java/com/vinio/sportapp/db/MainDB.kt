package com.vinio.sportapp.db

import android.content.Context
import androidx.room.Database
import androidx.room.Room
import androidx.room.RoomDatabase
import com.vinio.sportapp.db.dao.ActionDao
import com.vinio.sportapp.db.entity.ActionEntity

@Database (entities = [ActionEntity::class], version = 2)
abstract class MainDB : RoomDatabase() {
    abstract fun getActionDao() : ActionDao

    companion object {
//        context передаём из activity
        fun getDB(context: Context) : MainDB {
            return Room.databaseBuilder(
                context.applicationContext,
                MainDB::class.java,
                "test.db"
            ).build()
        }


    }
}