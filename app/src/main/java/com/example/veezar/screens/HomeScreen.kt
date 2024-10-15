package com.example.veezar.screens

import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column

import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.height
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Surface
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.example.veezar.R
import com.example.veezar.components.BottomAppComposable
import com.example.veezar.components.HeadingTextComposable
import com.example.veezar.components.SearchBar
import com.example.veezar.components.TravelCards

@Composable
fun HomeScreen(){

        Surface(
            color = Color.White,
            modifier = Modifier
                .fillMaxSize()
                .background(Color.White)


        ) {

    Column (
         horizontalAlignment = Alignment.CenterHorizontally
    ){
        Spacer(modifier = Modifier.height(15.dp))
        HeadingTextComposable(value = stringResource(id = R.string.travel))
        Spacer(modifier = Modifier.height(5.dp))
        SearchBar(stringResource(id = R.string.where_to))
        TravelCards(drawable =R.drawable.tajmahal, head=R.string.taj_mahal , description =R.string.wonder )
        Box(modifier = Modifier.fillMaxSize()) {
            Box(modifier = Modifier.align(Alignment.BottomCenter)) {
                BottomAppComposable()
            }
        }
       
    }
    }
}



@Preview
@Composable
fun DefaultPreviewOfHomeScreen(){
    MaterialTheme {
        HomeScreen()
    }
}