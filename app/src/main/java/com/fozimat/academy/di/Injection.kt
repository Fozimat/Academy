package com.fozimat.academy.di

import android.content.Context
import com.fozimat.academy.data.AcademyRepository
import com.fozimat.academy.data.source.local.LocalDataSource
import com.fozimat.academy.data.source.local.room.AcademyDatabase
import com.fozimat.academy.data.source.remote.RemoteDataSource
import com.fozimat.academy.utils.AppExecutors
import com.fozimat.academy.utils.JsonHelper

object Injection {
    fun provideRepository(context: Context): AcademyRepository {

        val database = AcademyDatabase.getInstance(context)

        val remoteDataSource = RemoteDataSource.getInstance(JsonHelper(context))
        val localDataSource = LocalDataSource.getInstance(database.academyDao())
        val appExecutors = AppExecutors()

        return AcademyRepository.getInstance(remoteDataSource, localDataSource, appExecutors)
    }
}