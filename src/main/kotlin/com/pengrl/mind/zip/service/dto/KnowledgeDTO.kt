package com.pengrl.mind.zip.service.dto

/**
 * Created by pengrl on 2020/6/3 20:39.
 */
data class KnowledgeDTO(var id: Int? = null, var courseId: Int? = null, var courseName: String? = null,
                        var question: String? = null,
                        var answer: String? = null, var hint: String? = null)