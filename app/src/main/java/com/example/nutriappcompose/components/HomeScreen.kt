package com.example.nutriappcompose.components

import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.layout.wrapContentSize
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.Button
import androidx.compose.material3.Card
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.window.Dialog
import com.example.nutriappcompose.R

fun String.toColor() = Color(android.graphics.Color.parseColor(this))
val backgroundColor = "#C0ECFF".toColor()
val cardBgColor = "#2F323A".toColor()

@Composable
fun HomeScreen() {

    Scaffold(
        modifier = Modifier
            .fillMaxSize()
    ) { paddingValue ->
        Box(
            modifier = Modifier
                .padding(paddingValue)
                .fillMaxSize()
                .background(color = backgroundColor),
            contentAlignment = Alignment.Center
        ){
            Column(
                modifier = Modifier.fillMaxSize(),
                verticalArrangement = Arrangement.SpaceAround,
                horizontalAlignment = Alignment.CenterHorizontally
            ) {

                val openDialog = remember { mutableStateOf(false)  }

                Button(
                    onClick = { openDialog.value = true }
                ) {
                    Text(
                        text = "Desenvolvedores",
                    )
                }

                if (openDialog.value) {
                    Dialog(onDismissRequest = { openDialog.value = false }) {
                        Card(
                            modifier = Modifier
                                .fillMaxWidth()
                                .height(250.dp)
                                .padding(16.dp),
                            shape = RoundedCornerShape(25.dp),
                        ) {

                            Text(
                                text = "Desenvolvido com ❤ por: \n\n Aisha Maria \n\n Gabriel Victor \n\n Kauê Henrick",
                                modifier = Modifier
                                    .fillMaxSize()
                                    .wrapContentSize(Alignment.Center),
                                textAlign = TextAlign.Center
                            )
                        }
                    }
                }

                Image(
                    modifier = Modifier
                        .size(250.dp),
                    painter = painterResource(id = R.drawable.nutriapplogo),
                    contentDescription = "logo NutriApp"
                )

                Button(onClick = {  }) {
                    Text(text = "Entrar")
                }
            }
        }
    }

}

@Preview (showSystemUi = true, showBackground = true)
@Composable
fun HomeScreenPreview() {
    HomeScreen()
}