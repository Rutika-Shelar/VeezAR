package com.example.veezar.componentsimport

import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth

import androidx.compose.foundation.layout.heightIn
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.sizeIn
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.Button
import androidx.compose.material3.ButtonDefaults
import androidx.compose.material3.ButtonDefaults.buttonColors
import androidx.compose.material3.ExperimentalMaterial3Api
import androidx.compose.material3.Text
import androidx.compose.material3.TextField
import androidx.compose.material3.TextFieldDefaults
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.setValue
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.layout.AlignmentLine
import androidx.compose.ui.res.colorResource
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.text.TextStyle
import androidx.compose.ui.text.font.Font
import androidx.compose.ui.text.font.FontFamily
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.input.TextFieldValue
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.example.veezar.R
import com.example.veezar.components.ComponentsShape
import com.example.veezar.screens.SignUpScreen

@Composable
fun NormalTextComposable(value:String){
    Text(text =value,
        style = TextStyle(
            fontSize = 24.sp,
            lineHeight = 28.sp,
            fontFamily = FontFamily(Font(R.font.manrope)),
            fontWeight = FontWeight(700),
            color = Color(0xFF0D141C),
            textAlign = TextAlign.Center,
        ),
        modifier = Modifier
            .fillMaxWidth()
            .heightIn(min = 40.dp)
        ,color= colorResource(id = R.color.black),
        textAlign = TextAlign.Center
    )
}

@Composable
fun SmallTextComposable(value:String){
    Text(text =value,
        style = TextStyle(
            fontSize = 14.sp,
            lineHeight = 28.sp,
            fontFamily = FontFamily(Font(R.font.manrope)),
            fontWeight = FontWeight(700),

            textAlign = TextAlign.Center,
        ),
        modifier = Modifier
            .fillMaxWidth()
            .heightIn(min = 40.dp)
        , color = Color(0xFF4F7396),
        textAlign = TextAlign.Center
    )
}

@Composable
fun HeadingTextComposable(value:String){
    Text(text =value,
        style = TextStyle(
            fontSize = 30.sp,
            lineHeight = 28.sp,
            fontFamily = FontFamily(Font(R.font.manrope)),
            fontWeight = FontWeight.Bold,
            color = Color(0xFF0D141C),
            textAlign = TextAlign.Center,
        ),
        modifier = Modifier
            .fillMaxWidth()
            .heightIn()
        ,color= colorResource(id = R.color.black),
        textAlign = TextAlign.Center
    )
}


@Composable
fun MyTextFieldComponent(value: String) {
    var text by remember { mutableStateOf(TextFieldValue("")) }

    Box {
        val containerColor = Color(0xFFE8EDF2) // Background color
        TextField(
            value = text,
            onValueChange = { text = it },
            placeholder = {
                Text(value, color = Color(0xFF4F7396)) // Placeholder color
            },
            colors = TextFieldDefaults.colors(
                focusedContainerColor = containerColor,
                unfocusedContainerColor = containerColor,
                disabledContainerColor = containerColor,
                cursorColor = Color.Black, // Cursor color (optional)
                focusedIndicatorColor = Color.Transparent, // Remove underline when focused
                unfocusedIndicatorColor = Color.Transparent, // Remove underline when unfocused
            ),
            modifier = Modifier
                .width(390.dp)
                .padding(12.dp)
                .align(Alignment.Center)
                .background(
                    Color(0xFFE8EDF2),
                    RoundedCornerShape(8.dp)
                )
        )
    }
}


@Composable
fun ButtonComponent(value: String) {
    Button(
        onClick = { },
        colors = buttonColors(
            colorResource(id = R.color.blue_600)  // Button background color
        ),
        modifier = Modifier
            .fillMaxWidth()
            .padding(12.dp) // Add padding around the button
            .clip(RoundedCornerShape(8.dp)) // Small rounded corners
            .sizeIn(minWidth = 150.dp) // Ensures the button doesn't get too small, change as needed
    ) {
        Text(
            text = value,
            color = Color.White, // Text color
            fontSize = 16.sp,
            fontWeight = FontWeight.Bold // Optional: bold text
        )
    }
}

@Preview
@Composable
fun DefaultPreviewOfSignUpScreen(){
    SmallTextComposable("By signing up, you agree to our Terms of Service and Privacy Policy.")
}