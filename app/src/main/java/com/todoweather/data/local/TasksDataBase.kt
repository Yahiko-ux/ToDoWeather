package com.todoweather.data.local

import androidx.room.Database
import androidx.room.RoomDatabase
import androidx.room.TypeConverters
import com.todoweather.data.entities.TaskDateEntity
import com.todoweather.data.entities.TasksConverter

@Database(entities = [TaskDateEntity::class], version = 1, exportSchema = false)
@TypeConverters(TasksConverter::class)
abstract class TasksDataBase : RoomDatabase() {
    abstract fun taskDateDao(): TaskDateDao
}