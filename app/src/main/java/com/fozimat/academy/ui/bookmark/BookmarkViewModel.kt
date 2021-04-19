package com.fozimat.academy.ui.bookmark

import androidx.lifecycle.ViewModel
import com.fozimat.academy.data.CourseEntity
import com.fozimat.academy.utils.DataDummy

class BookmarkViewModel: ViewModel() {

    fun getBookmarks(): List<CourseEntity> = DataDummy.generateDummyCourses()
}