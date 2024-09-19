package com.example.studentmanagement.ui.theme.screens

import android.window.SplashScreen
import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.tooling.preview.Preview
import com.example.studentmanagement.R

@Composable
fun SplashScreen(){
        Image(painter = painterResource(id = R.drawable.student), contentDescription = "logo", modifier = Modifier.fillMaxSize())
}
@Composable
@Preview
fun SplashScreenPreview(){
    SplashScreen()
}