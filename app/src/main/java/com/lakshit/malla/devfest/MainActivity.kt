package com.lakshit.malla.devfest

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxHeight
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.ButtonDefaults
import androidx.compose.material3.ElevatedButton
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.draw.shadow
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.modifier.modifierLocalConsumer
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import androidx.core.graphics.toColorInt
import com.lakshit.malla.devfest.ui.theme.DevFestTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        var year = "2022"
        setContent {
            DevFestTheme {
                // A surface container using the 'background' color from the theme
                Surface(
                    modifier = Modifier.fillMaxSize(),
                    color = MaterialTheme.colorScheme.background
                ) {
                    Row(
                        modifier = Modifier.fillMaxSize(),
                        horizontalArrangement = Arrangement.Center,
                        verticalAlignment = Alignment.CenterVertically
                    ) {
                        Text(
                            text = "Your DevFest " + year + " ID Card",
                            modifier = Modifier.padding(11.dp)
                        )
                        iDCard()
                    }

                }
            }
        }
    }
}

@Composable
fun iDCard() {
    val hashColorString = "#00AB18"
    var first_name = "Sundar"
    var last_name = "Pichai"
    val position = "CEO"
    val color = Color(hashColorString.removePrefix("#").toLong(16))
    val button_colour = ButtonDefaults.buttonColors(
        containerColor = Color("#d5e6ff".toColorInt()),
        contentColor = Color("#488af4".toColorInt())
    )
    Surface(
        modifier = Modifier
            .fillMaxSize()
            .padding(25.dp)
            .shadow(8.dp, RoundedCornerShape(25.dp))
    ) {

        Column(
            modifier = Modifier
                .fillMaxSize()
                .padding(20.dp)
        ) {
            


            Column(
                modifier = Modifier
                    .fillMaxWidth()
                    .padding(0.dp, 10.dp, 0.dp, 0.dp),
            ) {


                Row(
                    modifier = Modifier
                        .fillMaxWidth()
                ) {
                    Column() {
                        Text(text = "Google", fontWeight = FontWeight.Light)
                        ElevatedButton(onClick = { /*TODO*/ }, colors = button_colour) {
                            Text(text = "Attendee")
                        }
                    }

                    Row(
                        modifier = Modifier
                            .fillMaxWidth(),
                        horizontalArrangement = Arrangement.End,
                        verticalAlignment = Alignment.CenterVertically
                    ) {

                        Image(
                            painter = painterResource(id = R.drawable.gdg_icon),
                            contentDescription = ""
                        )

                    }

                }

                Spacer(modifier = Modifier.weight(0.5f))
                Row(Modifier.fillMaxWidth(), horizontalArrangement = Arrangement.Center) {
                    Image(painter = painterResource(id = R.drawable.dev_fest_2022_logo), contentDescription = "",)
                }
                Row(modifier = Modifier
                    .fillMaxWidth()
                    .fillMaxHeight(0.65f)) {


                    Column(modifier = Modifier.fillMaxHeight(), verticalArrangement = Arrangement.Bottom) {
                        Text(first_name, fontWeight = FontWeight.W400, fontSize = 30.sp)
                        Text(last_name, fontWeight = FontWeight.W400, fontSize = 30.sp)
                        Text(position, fontWeight = FontWeight.Light, )
                        Row (verticalAlignment = Alignment.Bottom){
                            Text("Reserved", fontWeight = FontWeight.Light, modifier = Modifier.padding(0.dp,0.dp,12.dp,0.dp) )
                            Text("3", fontWeight = FontWeight.W400, fontSize = 22.sp)
                        }
                    }


                    Row(modifier = Modifier
                        .fillMaxWidth()
                        .fillMaxHeight(), horizontalArrangement = Arrangement.End, verticalAlignment = Alignment.Bottom) {


                        Image(painter = painterResource(id = R.drawable.profile_pic), contentDescription = "", modifier = Modifier.clip(RoundedCornerShape(12.dp)))

                    }
                }


            }
        }

    }
}


@Composable
fun idCards(){
    var year = "2022"
    DevFestTheme {
        // A surface container using the 'background' color from the theme
        Surface(
            modifier = Modifier.fillMaxSize(),
            color = MaterialTheme.colorScheme.background
        ) {
            Column(
                modifier = Modifier.fillMaxSize(),
                verticalArrangement = Arrangement.Center,
                horizontalAlignment = Alignment.CenterHorizontally
            ) {
                Text(
                    text = "Your DevFest " + year + " ID Card",
                    modifier = Modifier.padding(0.dp, 25.dp, 0.dp, 0.dp),
                    fontWeight = FontWeight.W400
                )
                iDCard()
            }
        }
    }
}


@Preview(showBackground = true)
@Composable
fun DefaultPreview() {
    idCards()
}