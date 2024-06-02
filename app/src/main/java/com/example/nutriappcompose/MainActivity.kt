package com.example.nutriappcompose

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Surface
import com.example.nutriappcompose.components.Navigator
import com.example.nutriappcompose.ui.theme.NutriAppComposeTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            NutriAppComposeTheme {
                Surface(
                    color = MaterialTheme.colorScheme.background
                ) {
                    Navigator()
                }
            }
        }
    }
}