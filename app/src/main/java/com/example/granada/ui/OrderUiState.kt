package com.example.granada.ui

import com.example.granada.data.Options
import com.example.granada.data.Recommendations
import com.example.granada.data.provider.OptionItems
import com.example.granada.data.provider.RecommendationsItems

data class OrderUiState(
    val recommendations: List<Recommendations> = emptyList(),
    val options: List<Options> = emptyList(),
    val selectedOption: Options = OptionItems.optionsGranada.first(),
    val selectedRecommendations: List<Recommendations> = emptyList(),
    val selectedDescription: Recommendations = RecommendationsItems.recommendationsGranadas.first()
    )