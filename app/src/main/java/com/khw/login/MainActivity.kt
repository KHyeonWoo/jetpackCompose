package com.khw.login

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.layout.width
import androidx.compose.material3.Divider
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.khw.login.ui.theme.LoginTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            LoginTheme {
                // A surface container using the 'background' color from the theme
                Surface(
                    modifier = Modifier.fillMaxSize(), color = MaterialTheme.colorScheme.background
                ) {
                    Greeting("Android")

                }
            }
        }
    }
}

@Composable
fun Greeting(name: String, modifier: Modifier = Modifier) {
    Column {
        Row {
            for (i in 1..10) {
                Text(text = i.toString())
                Divider(Modifier.size(3.dp, 20.dp))
            }
        }
        Column {
            for (i in 2..10) {
                Divider(modifier = Modifier.size(height = 3.dp, width = 17.dp))
                Spacer(
                    modifier = Modifier
                        .background(color = Color.Blue)
                        .size(10.dp)
                )
                Text(text = i.toString())
            }
        }
//        Image(painter = painterResource(id = R.drawable), contentDescription = null)
        Box(
            modifier =
            Modifier
                .background(Color.Yellow)
                .width(150.dp)
                .height(50.dp)
        ) {
            Text(text = "box", modifier = Modifier.align(Alignment.Center))
        }
    }
}

@Preview(showBackground = true)
@Composable
fun GreetingPreview() {
    LoginTheme {
        //    Greeting("Android")
        Mbtiself()
    }
}

@Composable
fun Mbtiself() {
    Column(
        verticalArrangement = Arrangement.Center,
        horizontalAlignment = Alignment.CenterHorizontally
    ) {
        Image(painter = painterResource(id = R.drawable.estj), contentDescription = null)
        Divider(Modifier.size(500.dp, 3.dp))
        Spacer(modifier = Modifier.size(5.dp))
        Row {
            Text(
                text = "경영자(ESTJ)는 전통과 질서를 중시하는 성격으로, 자신이 생각하는 옳고 그름과 사회적 기준에 따라 가족과 공동체가 화합할 수 있도록 노력합니다. 이들은 정직과 헌신과 존엄성을 중시하며, 어려운 길을 기꺼이 앞장서고 다른 사람들에게 명확한 조언과 지도를 제공합니다. 이들은 사람들이 화합하도록 하는 일에서 자부심을 느끼며, 모든 사람이 지역 축제를 즐길 수 있도록 노력하거나 가족과 공동체의 전통적인 가치관을 지키는 역할 등을 맡곤 합니다.",
                fontSize = 5.sp,
                )
        }

    }
}