package com.dev.lddm_merge_skills.models

import kotlinx.serialization.SerialName
import kotlinx.serialization.Serializable

@Serializable
data class Course(

    val id: Int,
    val title: String,
    val description: String? = null,    // Null Safety: permite valores nulos
    val icon: String? = null,
    val color: String? = null,
    @SerialName("total_lessons")        // Mapeamento automático camelCase → snake_case
    val totalLessons: Int? = null
)