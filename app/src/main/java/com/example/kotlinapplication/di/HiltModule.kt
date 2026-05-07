package com.example.kotlinapplication.di

import android.content.Context
import androidx.room.Room
import com.example.kotlinapplication.di.dao.TodoDao
import com.example.kotlinapplication.di.repo.TodoRepo
import com.example.kotlinapplication.di.repository.TodoRepoImpl
import com.example.kotlinapplication.di.service.TodoService
import dagger.Module
import dagger.Provides
import dagger.hilt.InstallIn
import dagger.hilt.android.qualifiers.ApplicationContext
import dagger.hilt.components.SingletonComponent
import retrofit2.Retrofit
import retrofit2.converter.gson.GsonConverterFactory
import javax.inject.Singleton

@Module
@InstallIn(SingletonComponent::class)
object HiltModule {
    @Provides
    @Singleton
    fun provideRetrofit(): Retrofit =
        Retrofit.Builder()
            .baseUrl("https://jsonplaceholder.typicode.com/")
            .addConverterFactory(GsonConverterFactory.create())
            .build()

    @Provides
    @Singleton
    fun provideApi(retrofit: Retrofit): TodoService = retrofit.create(TodoService::class.java)

    @Provides
    @Singleton
    fun provideTodoRepo(api: TodoService): TodoRepo = TodoRepoImpl(api)

    @Provides
    @Singleton
    fun provideDatabase(@ApplicationContext context: Context): AppDatabase {
        return Room.databaseBuilder(context, AppDatabase::class.java, "za_db").build()
    }

    @Provides
    fun provideProductDao(db: AppDatabase): TodoDao {
        return db.todoDao()
    }
}