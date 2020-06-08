package com.pengrl.mind.zip.service

import com.baomidou.mybatisplus.extension.plugins.pagination.Page
import com.expediagroup.graphql.spring.operations.Mutation
import com.expediagroup.graphql.spring.operations.Query
import com.pengrl.mind.zip.mapper.CourseMapper
import com.pengrl.mind.zip.mapper.pojo.Course
import com.pengrl.mind.zip.service.dto.CourseDTO
import org.springframework.stereotype.Component

/**
 * Created by pengrl on 2020/6/3 20:35.
 */
@Component
class CourseQuery(val courseMapper: CourseMapper) : Query {

    fun findAllCourse(first: Long, start: Long): List<CourseDTO> {
        var page = Page<Course>()
        page.current = start
        page.size  = first
        var result = courseMapper.selectPage(page, null)
        return result.records.map { course -> CourseDTO(course.id, course
                .name) }
    }

    fun findCourseById(id: Int): CourseDTO {
        var course = courseMapper.selectById(id)
        return CourseDTO(course.id, course.name)
    }
}

@Component
class CourseMutation(val courseMapper: CourseMapper) : Mutation {
    fun createCourse(course: CourseDTO) : Int {
        return courseMapper.insert(Course(name = course.name))
    }
}