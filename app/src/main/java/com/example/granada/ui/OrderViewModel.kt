package com.example.granada.ui

import androidx.lifecycle.ViewModel
import com.example.granada.data.Options
import com.example.granada.data.Recommendations
import com.example.granada.data.provider.OptionItems
import com.example.granada.data.provider.RecommendationsItems
import kotlinx.coroutines.flow.MutableStateFlow
import kotlinx.coroutines.flow.StateFlow
import kotlinx.coroutines.flow.asStateFlow
import kotlinx.coroutines.flow.update

class OrderViewModel: ViewModel() {

    private val _uiState = MutableStateFlow(OrderUiState())
    val uiState: StateFlow<OrderUiState> = _uiState.asStateFlow()

    init {
        initializeUIState()
    }

    private fun initializeUIState() {
        val options: List<Options> = OptionItems.optionsGranada
        val recommendations: List<Recommendations> = RecommendationsItems.recommendationsGranadas
        _uiState.value =
            OrderUiState(
                options = options,
                recommendations = recommendations
            )
    }

    fun setRecommendations(option: Options) {
        _uiState.update { currentState ->
            currentState.copy(
                selectedOption = option,
                selectedRecommendations = _uiState.value.recommendations.filter
                { recommendations -> recommendations.optionNameResId == option.placeNameResId }
            )
        }
    }

    fun setDescription(recommendations: Recommendations) {
        _uiState.update { currentState ->
            currentState.copy(
                selectedDescription = recommendations
            )
        }
    }
}