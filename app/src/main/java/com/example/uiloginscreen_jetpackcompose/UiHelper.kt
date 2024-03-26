package com.example.uiloginscreen_jetpackcompose

import androidx.compose.runtime.Composable
import androidx.compose.runtime.CompositionLocalProvider
import androidx.compose.runtime.MovableContent
import androidx.compose.runtime.compositionLocalOf
import androidx.compose.runtime.remember
import androidx.compose.ui.platform.LocalConfiguration

@Composable
fun isSmallScreenHeight() : Boolean{
    val config = LocalConfiguration.current
    return config.screenHeightDp <= 786
}

