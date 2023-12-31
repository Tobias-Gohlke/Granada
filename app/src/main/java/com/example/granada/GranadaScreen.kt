package com.example.granada

import android.util.Log
import androidx.annotation.StringRes
import androidx.compose.foundation.layout.padding
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.ArrowBack
import androidx.compose.material3.ExperimentalMaterial3Api
import androidx.compose.material3.Icon
import androidx.compose.material3.IconButton
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Text
import androidx.compose.material3.TopAppBar
import androidx.compose.material3.TopAppBarDefaults
import androidx.compose.runtime.Composable
import androidx.compose.runtime.collectAsState
import androidx.compose.runtime.getValue
import androidx.compose.ui.Modifier
import androidx.compose.ui.res.stringResource
import androidx.lifecycle.viewmodel.compose.viewModel
import androidx.navigation.NavHostController
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import androidx.navigation.compose.currentBackStackEntryAsState
import androidx.navigation.compose.rememberNavController
import com.example.granada.data.Recommendations
import com.example.granada.ui.DescriptionScreen
import com.example.granada.ui.OptionsScreen
import com.example.granada.ui.OrderViewModel
import com.example.granada.ui.RecommendationsScreen
import com.example.granada.ui.StartScreen

enum class GranadaScreen(@StringRes val title: Int) {
    Start(title = R.string.app_name),
    Options(title = R.string.option_Page),
    Recommendations(title = R.string.recommendations_Page),
    Description(title = R.string.description_Page),
}

@OptIn(ExperimentalMaterial3Api::class)
@Composable
fun GranadaApp() {

    val viewModel: OrderViewModel = viewModel()
    val  navController: NavHostController = rememberNavController()

    // Get current back stack entry
    val backStackEntry by navController.currentBackStackEntryAsState()
    // Get the name of the current screen
    val currentScreen = GranadaScreen.valueOf(
        backStackEntry?.destination?.route ?: GranadaScreen.Start.name
    )
    val logTag = "GranadaScreen"

    Scaffold(
        topBar = {
            GranadaAppBar(
                currentScreen = currentScreen,
                canNavigateBack = navController.previousBackStackEntry != null,
                navigateUp = { navController.navigateUp() }
            )
        }
    ) { innerPadding ->
        val uiState by viewModel.uiState.collectAsState()
        NavHost(
            navController = navController,
            startDestination = GranadaScreen.Start.name,
            modifier = Modifier.padding(innerPadding)
        ) {
            composable(route = GranadaScreen.Start.name) {
                StartScreen(
                    onStartOrderButtonClicked = { navController.navigate(GranadaScreen.Options.name) }
                )
            }
            composable(route = GranadaScreen.Options.name) {
                Log.d(logTag, "composable Places")
                OptionsScreen(
                    options = uiState.options,
                    onCardScreenPressed = {
                        viewModel.setRecommendations(it)
                        navController.navigate(GranadaScreen.Recommendations.name)
                        },
                    modifier = Modifier
                )
            }
            composable(route = GranadaScreen.Recommendations.name) {
                Log.d(logTag, "composable Places")
                RecommendationsScreen(
                    recommendations = uiState.selectedRecommendations,
                    onCardClick = {
                        viewModel.setDescription(it)
                        navController.navigate(GranadaScreen.Description.name)
                        },
                    modifier = Modifier
                )
            }
            composable(route = GranadaScreen.Description.name) {
                DescriptionScreen(
                    recommendations = uiState.selectedDescription,
                    onCardClick = { navController.navigate(GranadaScreen.Start.name) }
                )
            }
        }
    }
}


@OptIn(ExperimentalMaterial3Api::class)
@Composable
fun GranadaAppBar(
    currentScreen: GranadaScreen,
    canNavigateBack: Boolean,
    navigateUp: () -> Unit,
    modifier: Modifier = Modifier
) {
    TopAppBar(
        title = { Text(stringResource(currentScreen.title)) },
        colors = TopAppBarDefaults.mediumTopAppBarColors(
            containerColor = MaterialTheme.colorScheme.primaryContainer
        ),
        modifier = modifier,
        navigationIcon = {
            if (canNavigateBack) {
                IconButton(onClick = navigateUp) {
                    Icon(
                        imageVector = Icons.Filled.ArrowBack,
                        contentDescription = stringResource(R.string.app_name)
                    )
                }
            }
        }
    )
}