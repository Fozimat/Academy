package com.fozimat.academy.ui.bookmark

import com.fozimat.academy.data.CourseEntity

interface BookmarkFragmentCallback {
    fun onShareClick(course: CourseEntity)
}
