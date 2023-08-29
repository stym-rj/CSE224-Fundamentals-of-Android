package com.example.basicuiwithcompose

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.sp
import com.example.basicuiwithcompose.ui.theme.BasicUIWithComposeTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            BasicUIWithComposeTheme  {
                // A surface container using the 'background' color from the theme
                Surface(
                    modifier = Modifier.fillMaxSize(),
                    color = MaterialTheme.colorScheme.background
                ) {
                    RestaurantName(
                        name = stringResource(id = R.string.title),
                        size = 32
                    )
                }
            }
        }
    }
}


@Composable
fun RestaurantName(name: String, size: Int) {
    Text(
        text = name,
        fontSize = size.sp
    )
}

@Preview(showBackground = true)
@Composable
fun RestaurantNamePreview() {
    RestaurantName(
        name = stringResource(id = R.string.title),
        size = 32
    )
}

@Composable
fun Greeting(name: String) {
    Text(text = "Hello $name!")
}

@Preview(showBackground = true)
@Composable
fun DefaultPreview() {
    BasicUIWithComposeTheme {
        Greeting("Android")
    }
}