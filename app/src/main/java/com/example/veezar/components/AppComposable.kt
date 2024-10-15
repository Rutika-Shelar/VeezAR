package com.example.veezar.components

import androidx.annotation.DrawableRes
import androidx.annotation.StringRes
import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.ui.layout.ContentScale
import androidx.compose.foundation.layout.heightIn
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.sizeIn
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.foundation.text.KeyboardOptions
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.Search
import androidx.compose.material.icons.filled.Visibility
import androidx.compose.material.icons.filled.VisibilityOff
import androidx.compose.material3.BottomAppBar
import androidx.compose.material3.Button
import androidx.compose.material3.ButtonDefaults.buttonColors
import androidx.compose.material3.Card
import androidx.compose.material3.Icon
import androidx.compose.material3.IconButton
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
import androidx.compose.ui.res.colorResource
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.text.TextStyle
import androidx.compose.ui.text.font.Font
import androidx.compose.ui.text.font.FontFamily
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.input.KeyboardType
import androidx.compose.ui.text.input.PasswordVisualTransformation
import androidx.compose.ui.text.input.TextFieldValue
import androidx.compose.ui.text.input.VisualTransformation
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.example.veezar.R


@Composable
fun SmallTextComposable(value: String) {
    Box(
        modifier = Modifier.fillMaxWidth(),
        contentAlignment = Alignment.Center
    ) {
        Text(
            text = value,
            style = TextStyle(
                fontSize = 14.sp,
                lineHeight = 28.sp,
                fontFamily = FontFamily(Font(R.font.manrope)),
                fontWeight = FontWeight(700),
            ),
            modifier = Modifier
                .heightIn(min = 40.dp),
            color = colorResource(id = R.color.blue),
        )
    }
}

@Composable
fun CardDescription(value: String) {
    Box(
        modifier = Modifier.fillMaxWidth(),
        contentAlignment = Alignment.TopStart) {
        Text(
            text = value,
            style = TextStyle(
                fontSize = 14.sp,
                lineHeight = 28.sp,
                fontFamily = FontFamily(Font(R.font.manrope)),
                fontWeight = FontWeight(700),
            ),
            modifier = Modifier
                .heightIn(min = 40.dp),
            color = colorResource(id = R.color.blue),
        )
    }
}


@Composable
fun NormalTextComposable(value: String) {
    Box(
        modifier = Modifier.fillMaxWidth(),
        contentAlignment = Alignment.TopStart
    ) {
        Text(
            text = value,
            style = TextStyle(
                fontSize = 24.sp,
                lineHeight = 28.sp,
                fontFamily = FontFamily(Font(R.font.manrope)),
                fontWeight = FontWeight(700),
                color = Color(0xFF0D141C),
            ),
            modifier = Modifier
                .heightIn(min = 40.dp),
            color = colorResource(id = R.color.black),
        )
    }
}


@Composable
fun CardHeading(value: String) {
    Box(
        modifier = Modifier.fillMaxWidth(),
        contentAlignment = Alignment.TopStart
    ) {
        Text(
            text = value,
            style = TextStyle(
                fontSize = 24.sp,
                lineHeight = 28.sp,
                fontFamily = FontFamily(Font(R.font.manrope)),
                fontWeight = FontWeight(700),
                color = Color(0xFF0D141C),
            ),
            modifier = Modifier
                .heightIn(min = 40.dp),
            color = colorResource(id = R.color.black),
        )
    }
}

@Composable
fun HeadingTextComposable(value: String) {
    Box(
        modifier = Modifier.fillMaxWidth(),
        contentAlignment = Alignment.Center
    ) {
        Text(
            text = value,
            style = TextStyle(
                fontSize = 30.sp,
                lineHeight = 28.sp,
                fontFamily = FontFamily(Font(R.font.manrope)),
                fontWeight = FontWeight.Bold,
                color = Color(0xFF0D141C),
                textAlign = TextAlign.Center,
            ),
            modifier = Modifier
                .heightIn(min = 40.dp),
            color = colorResource(id = R.color.black),
            textAlign = TextAlign.Center
        )
    }
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
                Text(value, color = Color(0xFF4F7396))
            },
            colors = TextFieldDefaults.colors(
                focusedContainerColor = containerColor,
                unfocusedContainerColor = containerColor,
                disabledContainerColor = containerColor,
                focusedIndicatorColor = Color.Transparent,
                unfocusedIndicatorColor = Color.Transparent,
            ),
            modifier = Modifier
                .width(390.dp)
                .padding(12.dp)
                .align(Alignment.Center)
                .background(
                    Color(0xFFE8EDF2),
                    RoundedCornerShape(12.dp)
                )

        )
    }
}

@Composable
fun PasswordTextFieldComponent(value: String) {
    var password by remember { mutableStateOf("") }
    var passwordVisible by remember { mutableStateOf(false) }

    Box {
        val containerColor = Color(0xFFE8EDF2)
        TextField(
            value = password,
            onValueChange = { password = it },
            placeholder = {
                Text(value, color = Color(0xFF4F7396))
            },
            keyboardOptions = KeyboardOptions(keyboardType = if (passwordVisible) KeyboardType.Text else KeyboardType.Password),
            visualTransformation = if (passwordVisible) VisualTransformation.None else PasswordVisualTransformation(),
            trailingIcon = {
                val image = if (passwordVisible) Icons.Default.Visibility else Icons.Default.VisibilityOff
                IconButton(onClick = { passwordVisible = !passwordVisible }) {
                    Icon(imageVector = image, contentDescription = null, tint = colorResource(id = R.color.blue))
                }
            },
            colors = TextFieldDefaults.colors(
                focusedContainerColor = containerColor,
                unfocusedContainerColor = containerColor,
                disabledContainerColor = containerColor,
                focusedIndicatorColor = Color.Transparent,
                unfocusedIndicatorColor = Color.Transparent,
            ),
            modifier = Modifier
                .width(390.dp)
                .padding(12.dp)
                .align(Alignment.Center)
                .background(
                    Color(0xFFE8EDF2),
                    RoundedCornerShape(12.dp)
                ),
        )
    }
}

@Composable
fun ButtonComponent(value: String) {
    Button(
        onClick = { },
        colors = buttonColors(
            colorResource(id = R.color.blue_600)
        ),
        modifier = Modifier
            .fillMaxWidth()
            .padding(12.dp)
            .clip(RoundedCornerShape(8.dp))
            .sizeIn(minWidth = 150.dp)
    ) {
        Text(
            text = value,
            color = Color.White,
            fontSize = 16.sp,
            fontWeight = FontWeight.Bold
        )
    }
}
@Composable
fun SearchBar(value: String){
    var text by remember { mutableStateOf(TextFieldValue("")) }

    Box(
        modifier = Modifier
            .width(366.dp)
            .clip(RoundedCornerShape(12.dp))
            .background(
                Color(0xFFE8EDF2)

            )
    ){
        val containerColor = Color(0xFFE8EDF2)
        TextField(
            value = text,
            onValueChange = { text = it },
            placeholder = {
                Text(value, color = Color(0xFF4F7396))
            },
            leadingIcon = {
                Icon(
                    imageVector = Icons.Default.Search,
                    contentDescription = null,
                    tint = Color(0xFF4F7396)
                )

            },
            colors = TextFieldDefaults.colors(
                focusedContainerColor = containerColor,
                unfocusedContainerColor = containerColor,
                disabledContainerColor = containerColor,
                focusedIndicatorColor = Color.Transparent,
                unfocusedIndicatorColor = Color.Transparent,
            ),


        )
    }

}

@Composable
fun TravelCards(
    @DrawableRes drawable: Int,
    @StringRes head: Int,
    @StringRes description: Int,
    modifier: Modifier = Modifier
) {
    Card(onClick = { /*TODO*/ }
           , modifier = modifier
            .background(Color.White)
            .padding(12.dp)

    ) {
        Column(
            modifier = modifier.background(Color.White)

            ) {
            Image(
                painter = painterResource(drawable),

                contentDescription = null,
                contentScale = ContentScale.Crop,
                modifier = Modifier
                    .clip(ComponentsShape.medium)
            )
            CardHeading(stringResource(head))
            CardDescription(stringResource(description))


        }
    }
}

@Composable
fun BottomAppComposable(


) {

    BottomAppBar(
        containerColor = Color(0xFFE8EDF2),
        modifier = Modifier.background(Color.White),
        contentColor = Color.Black,
    ) {
        Row(
            horizontalArrangement = Arrangement.SpaceEvenly,
            modifier = Modifier.fillMaxWidth()
        ) {
            IconButton(onClick = { /*TODO*/ }) {
                Icon(
                    painter = painterResource(id = R.drawable.explore),
                    contentDescription = null,
                    tint = Color(0xFF4F7396)
                )
            }
            IconButton(onClick = { /*TODO*/ }) {
                Icon(
                    painter = painterResource(id = R.drawable.whishlist),
                    contentDescription = null,
                    tint = Color(0xFF4F7396)
                )
            }
            IconButton(onClick = { /*TODO*/ }) {
                Icon(
                    painter = painterResource(id = R.drawable.trips),
                    contentDescription = null,
                    tint = Color(0xFF4F7396)
                )
            }
            IconButton(onClick = { /*TODO*/ }) {
                Icon(
                    painter = painterResource(id = R.drawable.inbox),
                    contentDescription = null,
                    tint = Color(0xFF4F7396)
                )
            }
            IconButton(onClick = { /*TODO*/ }) {
                Icon(
                    painter = painterResource(id = R.drawable.profile),
                    contentDescription = null,
                    tint = Color(0xFF4F7396)
                )
            }
        }
    }

}


@Preview
@Composable
fun DefaultPreviewOfAppComposable(){
    BottomAppComposable()

}
