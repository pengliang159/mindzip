package com.pengrl.mind.zip.mapper.pojo

/**
 * Created by pengrl on 2020/6/3 17:59.
 */
data class Knowledge(var id: Int? = null,
                     var courseId: Int? = null,
                     var courseName: String? = null,
                     var question: String? = null,
                     var answer: String? = null,
                     var hint: String? = null)