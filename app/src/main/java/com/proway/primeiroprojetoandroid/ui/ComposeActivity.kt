package com.proway.primeiroprojetoandroid.ui

import android.os.Bundle
import android.widget.LinearLayout
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.material.MaterialTheme
import androidx.compose.material.Surface
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.tooling.preview.Preview
import com.proway.primeiroprojetoandroid.ui.ui.theme.PrimeiroProjetoAndroidTheme

class ComposeActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            PrimeiroProjetoAndroidTheme {
                // A surface container using the 'background' color from the theme
                Surface(color = MaterialTheme.colors.primary) {

                    Greeting("Android asyduasydygsaduyagsdyugasuydgu")
                    
                    Text(text = "Teste")
                }
            }
        }
    }
}

@Composable
fun Greeting(name: String) {
    Text(text = "teste $name!")
}

@Preview(showBackground = true)
@Composable
fun DefaultPreview() {
    PrimeiroProjetoAndroidTheme {
        Greeting("Android")
    }
}