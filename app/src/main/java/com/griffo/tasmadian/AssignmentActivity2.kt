package com.griffo.tasmadian

import android.content.Intent
import android.graphics.drawable.shapes.Shape
import android.os.Bundle
import android.provider.CalendarContract
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.BorderStroke
import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.AddCircle
import androidx.compose.material.icons.filled.Favorite
import androidx.compose.material.icons.filled.Home
import androidx.compose.material.icons.filled.LocationOn
import androidx.compose.material.icons.filled.Person
import androidx.compose.material.icons.filled.Place
import androidx.compose.material.icons.filled.Search
import androidx.compose.material.icons.filled.Send
import androidx.compose.material.icons.filled.Settings
import androidx.compose.material3.Button
import androidx.compose.material3.ButtonDefaults
import androidx.compose.material3.Icon
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.shadow
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.StrokeCap.Companion.Square
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.platform.LocalContext
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.griffo.tasmadian.ui.theme.TasmadianTheme

class AssignmentActivity2 : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
         
            Greeting()
            
        }
    }
}
@Preview(showBackground = true)
@Composable
fun Greeting5() {


    LazyColumn(
        modifier = Modifier
            .background(Color.Yellow)
            .fillMaxSize()
    ){
        item {
            Column(
                modifier = Modifier
                    .padding(10.dp)
                    .fillMaxSize(),
                horizontalAlignment = Alignment.CenterHorizontally
            ) {

                Row(
                    horizontalArrangement = Arrangement.SpaceEvenly,
                    modifier = Modifier
                        .fillMaxWidth(),
                ) {

                    Image(imageVector = Icons.Default.Home,
                        contentDescription ="",
                    )

                    Column(
                        horizontalAlignment = Alignment.CenterHorizontally
                    ) {
                        Text(text = "Location")

                        Row {
                            Image(
                                imageVector = Icons.Default.LocationOn,
                                contentDescription ="",
                                modifier = Modifier
                                    .size(15.dp)

                            )
                            Text(text = "Nairobi")
                        }

                        val qq = LocalContext.current
                        Button(onClick = {
                            qq.startActivity(Intent(qq,MainActivity::class.java))
                        },
                            colors =ButtonDefaults.buttonColors(Color.Red),
                            shape = RoundedCornerShape(13.dp),
                            border= BorderStroke(2.dp, Color.LightGray)

                        ) {
                            
                        }
                        
                    }

                    Image(imageVector = Icons.Default.Settings, contentDescription ="" )

                }
//
                Spacer(modifier = Modifier.height(15.dp))


                Row(
                    horizontalArrangement = Arrangement.Absolute.SpaceBetween
                ) {

                    Row(
                        modifier = Modifier
                            .padding(10.dp)
                            .background(Color.Green)
                            .padding(10.dp)
                            .shadow(elevation = 10.dp)


                    ) {
                        Image(imageVector = Icons.Default.Home,
                            contentDescription ="",
                        )
                        Text(text = "Hotels")

                    }

                    Spacer(modifier = Modifier.width(25.dp))
                    Row(
                        modifier = Modifier
                            .padding(10.dp)
                            .background(Color.Red)
                            .padding(10.dp)
                            .shadow(elevation = 15.dp)
                    ) {
                        Image(imageVector = Icons.Default.Favorite,
                            contentDescription ="",
                        )
                        Text(text = "Holiday")

                    }

                }



                Row(
                    horizontalArrangement = Arrangement.Absolute.SpaceBetween
                ) {

                    Row(
                        modifier = Modifier
                            .padding(10.dp)
                            .background(Color.White)
                            .padding(10.dp)
                            .shadow(elevation = 10.dp)


                    ) {
                        Image(imageVector = Icons.Default.Home,
                            contentDescription ="",
                        )
                        Text(text = "Hotels")

                    }

                    Spacer(modifier = Modifier.width(25.dp))
                    Row(
                        modifier = Modifier
                            .padding(10.dp)
                            .background(Color.White)
                            .padding(10.dp)
                            .shadow(elevation = 10.dp)
                    ) {
                        Image(imageVector = Icons.Default.Home,
                            contentDescription ="",
                        )
                        Text(text = "Holiday")

                    }

                }

                Spacer(modifier = Modifier.height(5.dp))

                Row(
                    horizontalArrangement = Arrangement.Absolute.SpaceBetween
                ) {

                    Row(
                        modifier = Modifier
                            .padding(10.dp)
                            .background(Color.White)
                            .padding(10.dp)
                            .shadow(elevation = 10.dp)


                    ) {
                        Image(imageVector = Icons.Default.Home,
                            contentDescription ="",
                        )
                        Text(text = "Hotels")

                    }

                    Spacer(modifier = Modifier.width(25.dp))
                    Row(
                        modifier = Modifier
                            .padding(10.dp)
                            .background(Color.White)
                            .padding(10.dp)
                            .shadow(elevation = 10.dp)
                    ) {
                        Image(imageVector = Icons.Default.Home,
                            contentDescription ="",
                        )
                        Text(text = "Holiday")

                    }

                }

                Row (
                ){

                    Text(text = "Popular")

                    Spacer(modifier = Modifier.width(60.dp))

                    Text(text = "View All")

                }



Row {
    Image(painter = painterResource(id = R.drawable.angel), contentDescription ="" )
    Column {
       Text(text = "ArcAngel") 
    }
    
    
    Image(painter = painterResource(id = R.drawable.bike), contentDescription ="" )
    Column {
        Text(text = "Am a biker")
    }

}

                Spacer(modifier = Modifier.width(20.dp))
                Spacer(modifier = Modifier.height(20.dp))

Row {
    Image(painter = painterResource(id = R.drawable.logo), contentDescription = "")
    Column {
        Text(text = "The logo")
    }
    
    Image(painter = painterResource(id = R.drawable.system), contentDescription ="" )
    Column {
        Text(text = "My system")
    }

}

                Spacer(modifier = Modifier.width(20.dp))
                Spacer(modifier = Modifier.height(20.dp))










            }


            val Main = LocalContext.current
            Button(onClick = {

                Main.startActivity(Intent(Main, MainActivity::class.java))

            }) {
                Text(text = "Main screen")

            }


            val About = LocalContext.current
            Button(onClick = {

                About.startActivity(Intent(About, AboutActivity2::class.java))

            }) {
                Text(text = "About screen")

            }

            val Settings = LocalContext.current
            Button(onClick = {

                Settings.startActivity(Intent(Settings, SettingsActivity2::class.java))

            }) {
                Text(text = "Settings screen")

            }


            val Input = LocalContext.current
            Button(onClick = {

                Input.startActivity(Intent(Input, InputActivity2::class.java))


            })  {
                Text(text = "Input screen")
            }

                val qq = LocalContext.current
                Button(onClick = {
                    qq.startActivity(Intent(qq,MainActivity::class.java))

                }) {
                    Text(text = "Assignment screen")
                }

            }
    }

}

