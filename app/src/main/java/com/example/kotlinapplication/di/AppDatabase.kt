package com.example.kotlinapplication.di

import androidx.room.Database
import androidx.room.RoomDatabase
import androidx.room.TypeConverter
import androidx.room.TypeConverters
import com.example.kotlinapplication.di.dao.TodoDao
import com.example.kotlinapplication.di.entity.SyncStatus
import com.example.kotlinapplication.di.entity.TodoEntity

class AppConverter {
    @TypeConverter
    fun fromSyncStatus(value: SyncStatus): String {
        return value.name
    }

    @TypeConverter
    fun toSyncStatus(value: String): SyncStatus {
        return SyncStatus.valueOf(value)
    }
}

@Database(entities = [TodoEntity::class], version = 1)
@TypeConverters(AppConverter::class)
abstract class AppDatabase : RoomDatabase() {

    abstract fun todoDao(): TodoDao
}