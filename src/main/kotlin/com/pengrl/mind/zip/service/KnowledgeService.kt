package com.pengrl.mind.zip.service

import com.expediagroup.graphql.spring.operations.Mutation
import com.expediagroup.graphql.spring.operations.Query
import com.pengrl.mind.zip.mapper.KnowledgeMapper
import com.pengrl.mind.zip.mapper.pojo.Knowledge
import com.pengrl.mind.zip.service.dto.CourseDTO
import com.pengrl.mind.zip.service.dto.KnowledgeDTO
import org.springframework.stereotype.Component

/**
 * Created by pengrl on 2020/6/3 20:40.
 */
@Component
class KnowledgeServiceQuery(val knowledgeMapper: KnowledgeMapper) : Query {

    fun findKnowledgeByCourseId(courseId: Int): List<KnowledgeDTO>? {
        var knowledges = knowledgeMapper.selectByMap(mapOf("course_id" to courseId))
        var knowledgeDTOs = mutableListOf<KnowledgeDTO>()
        for (k in knowledges) {
            var knowledgeDTO = KnowledgeDTO(k.id, k.courseId, k.courseName, k.question, k.answer, k.hint)
            knowledgeDTOs.add(knowledgeDTO)
        }
        return knowledgeDTOs
    }
}

@Component
class KnowledgeServiceMutation(val knowledgeMapper: KnowledgeMapper) : Mutation {
    fun updateKnowledge(knowledge: KnowledgeDTO): KnowledgeDTO {
        knowledgeMapper.updateById(Knowledge(knowledge.id, knowledge.courseId, knowledge
                .courseName, knowledge.question, knowledge.answer, knowledge.hint));
        return knowledge;
    }
}