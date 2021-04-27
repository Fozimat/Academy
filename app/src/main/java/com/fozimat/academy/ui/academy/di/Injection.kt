package com.fozimat.academy.ui.academy.di

import android.content.Context
import com.fozimat.academy.data.source.AcademyRepository
import com.fozimat.academy.data.source.remote.RemoteDataSource
import com.fozimat.academy.utils.JsonHelper

object Injection {
    fun provideRepository(context: Context): AcademyRepository {

        val remoteDataSource = RemoteDataSource.getInstance(JsonHelper(context))

        return AcademyRepository.getInstance(remoteDataSource)
    }
}