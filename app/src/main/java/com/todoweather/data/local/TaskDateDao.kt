package com.todoweather.data.local

import androidx.room.Dao
import androidx.room.Insert
import androidx.room.OnConflictStrategy
import androidx.room.Query
import com.todoweather.data.entities.TaskDateEntity
import kotlinx.coroutines.flow.Flow

@Dao
interface TaskDateDao {

    @Query("SELECT * FROM taskDays")
    fun getAllTasks(): Flow<List<TaskDateEntity>>

    @Insert(onConflict = OnConflictStrategy.REPLACE)
    suspend fun insert(tasks: TaskDateEntity)
}