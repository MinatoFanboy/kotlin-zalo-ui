package com.example.kotlinapplication.di.entity

import androidx.room.Entity
import androidx.room.PrimaryKey

enum class SyncStatus {
    CREATED,
    UPDATED,
    DELETED,
    SYNCED
}

@Entity(tableName = "todos")
data class TodoEntity(
    @PrimaryKey
    val id: Int,
    val title: String,
    val body: String,
    val userId: Int,
    val localImagePath: String? = null,
    val syncStatus: SyncStatus = SyncStatus.SYNCED,
    val updatedAt: Long = System.currentTimeMillis()
)