package com.example.veezar.screens

import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.Surface
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.example.veezar.R
import com.example.veezar.componentsimport.HeadingTextComposable
import com.example.veezar.componentsimport.MyTextFieldComponent
import com.example.veezar.componentsimport.NormalTextComposable

@Composable
fun SignUpScreen() {
    
    Surface(color = Color.White,
        modifier = Modifier
            .fillMaxSize()
            .background(Color.White)
            .padding(28.dp)
    ) {
        Column (modifier=Modifier.fillMaxSize()){
            NormalTextComposable(value = stringResource(id = R.string.Travel))
            HeadingTextComposable(value = stringResource(id = R.string.creat))
            MyTextFieldComponent("Password")
        }
    }
}

@Preview
@Composable
fun DefaultPreviewOfSignUpScreen(){
    SignUpScreen()
}