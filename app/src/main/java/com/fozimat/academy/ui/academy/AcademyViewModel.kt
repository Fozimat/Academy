package com.fozimat.academy.ui.academy

import androidx.lifecycle.LiveData
import androidx.lifecycle.ViewModel
import com.fozimat.academy.data.CourseEntity
import com.fozimat.academy.data.source.AcademyRepository
import com.fozimat.academy.utils.DataDummy

class AcademyViewModel(private val academyRepository: AcademyRepository) : ViewModel() {

    fun getCourses(): LiveData<List<CourseEntity>> = academyRepository.getAllCourses()

}