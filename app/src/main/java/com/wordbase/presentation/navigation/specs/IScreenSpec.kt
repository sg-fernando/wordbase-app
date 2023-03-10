package com.wordbase.presentation.navigation.specs

import android.content.Context
import androidx.compose.runtime.Composable
import androidx.navigation.NavHostController
import com.wordbase.presentation.viewmodel.WordbaseViewModel

sealed interface IScreenSpec {
    companion object {
        val allScreens = IScreenSpec::class.sealedSubclasses.map { it.objectInstance }
        val root = "wordbase"
        val startDestination = HomeSpec.route
    }
    val route: String

    @Composable
    fun Content(
        wordbaseViewModel: WordbaseViewModel,
        navController: NavHostController,
        context: Context
    )
}