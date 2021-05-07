package com.fozimat.academy.ui.bookmark

import androidx.lifecycle.LiveData
import androidx.lifecycle.ViewModel
import androidx.paging.PagedList
import com.fozimat.academy.data.source.local.entity.CourseEntity
import com.fozimat.academy.data.AcademyRepository

class BookmarkViewModel(private val academyRepository: AcademyRepository) : ViewModel() {

    fun getBookmarks(): LiveData<PagedList<CourseEntity>> = academyRepository.getBookmarkedCourses()

    fun setBookmark(courseEntity: CourseEntity) {
        val newState = !courseEntity.bookmarked
        academyRepository.setCourseBookmark(courseEntity, newState)
    }
}