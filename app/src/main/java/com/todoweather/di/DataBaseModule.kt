package com.todoweather.di

import android.content.Context
import androidx.room.Room
import com.todoweather.data.local.TaskDateDao
import com.todoweather.data.local.TasksDataBase
import dagger.Module
import dagger.Provides
import dagger.hilt.InstallIn
import dagger.hilt.android.qualifiers.ApplicationContext
import dagger.hilt.components.SingletonComponent
import javax.inject.Singleton

@InstallIn(SingletonComponent::class)
@Module
object DataBaseModule {

    @Provides
    @Singleton
    fun provideDataBase(@ApplicationContext appContext: Context): TasksDataBase {
        return Room.databaseBuilder(
            appContext,
            TasksDataBase::class.java,
            "tasks.db"
        ).build()
    }

    @Provides
    @Singleton
    fun provideTasksDao(dataBase: TasksDataBase): TaskDateDao = dataBase.taskDateDao()
}