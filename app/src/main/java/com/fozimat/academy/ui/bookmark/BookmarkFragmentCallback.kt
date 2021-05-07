package com.fozimat.academy.ui.bookmark

import com.fozimat.academy.data.source.local.entity.CourseEntity

interface BookmarkFragmentCallback {
    fun onShareClick(course: CourseEntity)
}
