package com.example.veezar.app

import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.material3.Surface
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import com.example.veezar.screens.SignUpScreen

@Composable
fun VeezARApp(){
    Surface(modifier= Modifier.fillMaxSize(),
        color= Color.White
    ){
    SignUpScreen()
    }
}


