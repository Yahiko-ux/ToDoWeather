package com.todoweather.data.entities

import androidx.room.Entity
import androidx.room.PrimaryKey
import androidx.room.TypeConverter
import androidx.room.TypeConverters
import com.google.gson.Gson
import com.google.gson.reflect.TypeToken
import org.json.JSONObject
import java.util.stream.Collectors

@Entity(tableName = "taskDays")
data class TaskDateEntity(
    @PrimaryKey
    var date: String,
    var tasks: List<TaskEntity>
)

data class TaskEntity(
    var isCompleted: Boolean,
    var text: String
)

class TasksConverter {

    @TypeConverter
    fun fromTasksEntity(tasks: List<TaskEntity>): String = Gson().toJson(tasks)

    @TypeConverter
    fun stringToTasksEntity(value: String): List<TaskEntity> = Gson().fromJson(value, Array<TaskEntity>::class.java).toList()

}