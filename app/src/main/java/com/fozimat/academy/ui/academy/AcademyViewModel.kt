package com.fozimat.academy.ui.academy

import androidx.lifecycle.LiveData
import androidx.lifecycle.ViewModel
import com.fozimat.academy.data.AcademyRepository
import com.fozimat.academy.data.source.local.entity.CourseEntity
import com.fozimat.academy.vo.Resource

class AcademyViewModel(private val academyRepository: AcademyRepository) : ViewModel() {

    fun getCourses(): LiveData<Resource<List<CourseEntity>>> = academyRepository.getAllCourses()
}