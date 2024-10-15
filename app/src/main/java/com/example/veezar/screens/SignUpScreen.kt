package com.example.veezar.screens

import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.Surface
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.example.veezar.R
import com.example.veezar.components.ButtonComponent
import com.example.veezar.components.HeadingTextComposable
import com.example.veezar.components.MyTextFieldComponent
import com.example.veezar.components.PasswordTextFieldComponent


@Composable
fun SignUpScreen() {
    
    Surface(color = Color.White,
        modifier = Modifier
            .fillMaxSize()
            .background(Color.White)
            .padding(28.dp)
    ) {
        Column (modifier=Modifier.fillMaxSize()){
            Spacer(modifier  =Modifier.height(100.dp))
            HeadingTextComposable(value = stringResource(id = R.string.new_account))
            Spacer(modifier  =Modifier.height(50.dp))
            MyTextFieldComponent(value = stringResource(id = R.string.full_name))
            MyTextFieldComponent(value = stringResource(id = R.string.mobile_nu))
            MyTextFieldComponent(value = stringResource(id = R.string.lbl_email))
            PasswordTextFieldComponent(value = stringResource(id = R.string.lbl_password))
            ButtonComponent(value = stringResource(id = R.string.sign_up))
        }
    }
}

@Preview
@Composable
fun DefaultPreviewOfSignUpScreen(){
    SignUpScreen()
}