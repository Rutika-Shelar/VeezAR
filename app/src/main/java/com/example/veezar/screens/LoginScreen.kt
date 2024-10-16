package com.example.veezar.screens

import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.Surface
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.example.veezar.R
import com.example.veezar.components.ButtonComponent
import com.example.veezar.components.MyTextFieldComponent
import com.example.veezar.components.NormalTextComposable
import com.example.veezar.components.SmallTextComposable

@Composable
fun LoginScreen(){
    Surface(color = Color.White,
        modifier = Modifier
            .fillMaxSize()
            .background(Color.White)
            .padding(0.dp)

    ) {
        Column(
            modifier = Modifier
                .fillMaxSize(),
            horizontalAlignment = Alignment.CenterHorizontally
        ) {
            Image(
                painter = painterResource(id = R.drawable.wallpaper),
                contentDescription = "Your Image",
                modifier = Modifier
                    .fillMaxWidth()
                    .height(320.dp),
                contentScale = ContentScale.Crop
            )

            Spacer(modifier = Modifier.height(10.dp))
            NormalTextComposable(value = stringResource(id = R.string.Travel_any_where))
            MyTextFieldComponent(value = stringResource(id = R.string.lbl_email))
            Spacer(modifier = Modifier.height(16.dp))
            MyTextFieldComponent(value= stringResource(id = R.string.lbl_password))
            ButtonComponent(value = stringResource(id = R.string.msg_continue_with_email))
            SmallTextComposable(value = stringResource(id = R.string.msg_already_have_an))
            Spacer(modifier = Modifier.height(50.dp))
            SmallTextComposable(value = stringResource(id = R.string.msg_or_connect_with))
            Image(
                painter = painterResource(id = R.drawable.google),
                contentDescription = "Your Image",
                modifier = Modifier
                    .height(50.dp),
                contentScale = ContentScale.Crop
            )

        }
    }
}

@Preview
@Composable
fun DefaultPreviewOfLoginScreen(){
    LoginScreen()
}