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
import androidx.compose.foundation.layout.fillMaxHeight
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.layout.width
import androidx.compose.material3.Button
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
        Divider(Modifier.size(480.dp, 4.dp))
        Spacer(modifier = Modifier.size(4.dp))
        Text(
            text = "경영자(ESTJ)는 전통과 질서를 중시하는 성격으로, 자신이 생각하는 옳고 그름과 사회적 기준에 따라 가족과 공동체가 화합할 수 있도록 노력합니다. \n" +
                    "이들은 정직과 헌신과 존엄성을 중시하며, 어려운 길을 기꺼이 앞장서고 다른 사람들에게 명확한 조언과 지도를 제공합니다. \n" +
                    "이들은 사람들이 화합하도록 하는 일에서 자부심을 느끼며, 모든 사람이 지역 축제를 즐길 수 있도록 노력하거나 가족과 공동체의 전통적인 가치관을 지키는 역할 등을 맡곤 합니다.",
            fontSize = 5.sp,
        )
        Divider(Modifier.size(480.dp, 4.dp))
        Spacer(modifier = Modifier.size(4.dp))
        Row(
            modifier = Modifier
                .fillMaxWidth()
                .padding(8.dp),
            horizontalArrangement = Arrangement.Start,
            verticalAlignment = Alignment.CenterVertically
        ) {
            Image(painter = painterResource(id = R.drawable.image_3), contentDescription = null)
            Column {
                Text(text = "모범을 보이는 지도자", Modifier.padding(8.dp))
                Text(text = "높은 책임감", Modifier.padding(8.dp))
            }
            Box(modifier = Modifier.fillMaxWidth()
                .height(100.dp)) {
                Button(
                    modifier = Modifier.align(Alignment.TopStart)
                        .size(88.dp, 40.dp),
                    onClick = { /*TODO*/ },
                ) {
                    Text(text = "꾹 괴롭히기", fontSize = 8.sp)
                }
                Button(
                    modifier = Modifier.align(Alignment.BottomEnd)
                        .size(88.dp, 40.dp),
                    onClick = { /*TODO*/ },
                ) {
                    Text(text = "꾹 괴롭히기", fontSize = 8.sp)
                }
            }
        }
        Text(
            text = "연인에게 책임감 있고 헌신적인 타입이며, 연인에게도 책임감을 요구한다. \n" +
                    "데이트를 할 때도 계획적으로 움직이며, 안정적인 연애를 선호한다. \n" +
                    "그래서 ESTJ와 사귀면 결혼까지 이어질 확률이 높으며, 안정적인 배우자가 될 가능성이 높다.\n" +
                    "다만 ESTJ와의 궁합이 잘 맞지 않는 사람들은 안정감 속에서도 지루함을 느낄 수 있다. \n" +
                    "ESTJ는 밀당이나 티키타카 없는 솔직 담백한 스타일이며, 가끔 상대방을 통제하려는 성향을 보이기도 한다. \n" +
                    "그래서 ENTJ유형이나 타 XSXJ 유형들을 제외하면 상성이 좋지 않다.",
            fontSize = 8.sp
        )
    }
}