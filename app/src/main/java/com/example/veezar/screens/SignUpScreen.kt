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
import com.example.veezar.componentsimport.ButtonComponent
import com.example.veezar.componentsimport.HeadingTextComposable
import com.example.veezar.componentsimport.MyTextFieldComponent

@Composable
fun SignUpScreen() {
    
    Surface(color = Color.White,
        modifier = Modifier
            .fillMaxSize()
            .background(Color.White)
            .padding(28.dp)
    ) {
        Column (modifier=Modifier.fillMaxSize()){
            HeadingTextComposable(value = stringResource(id = R.string.new_account))
            MyTextFieldComponent(value = stringResource(id = R.string.full_name))
            MyTextFieldComponent(value = stringResource(id = R.string.mobile_nu))
            MyTextFieldComponent(value = stringResource(id = R.string.lbl_email))
            MyTextFieldComponent(value = stringResource(id = R.string.lbl_password))
            MyTextFieldComponent(value = stringResource(id = R.string.full_name))
            ButtonComponent(value = stringResource(id = R.string.sign_up))
        }
    }
}

@Preview
@Composable
fun DefaultPreviewOfSignUpScreen(){
    SignUpScreen()
}