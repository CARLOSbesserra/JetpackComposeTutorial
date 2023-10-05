package com.example.jetpackcompose

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.layout.aspectRatio
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.painter.Painter
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.tooling.preview.Preview
import com.example.jetpackcompose.ui.theme.JetpackComposeTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            JetpackComposeTheme {
                JetpackComposeTutorial()
                }
            }
        }
    }
}

@Preview(showSystemUi = true)
@Composable
fun JetpackComposeTutorial() {
    image(
    Painter= painterResource(id = R.drawable.fundoJetpack),
    contentDescripition= null,
        Modifier.aspectRatio(16f/9f)
    )
}