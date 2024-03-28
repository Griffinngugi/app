package com.griffo.tasmadian

import android.content.Intent
import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.BorderStroke
import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.shape.CutCornerShape
import androidx.compose.foundation.text.ClickableText
import androidx.compose.material3.Button
import androidx.compose.material3.ButtonDefaults
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.RectangleShape
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.platform.LocalContext
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.AnnotatedString
import androidx.compose.ui.text.SpanStyle
import androidx.compose.ui.text.font.FontFamily
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.griffo.tasmadian.ui.theme.TasmadianTheme

class SettingsActivity2 : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
Greeting3()
        }
    }
}
@Preview(showBackground = true)
@Composable
fun Greeting3() {
    Box {
        Image(
            painter = painterResource(id = R.drawable.manchester), contentDescription = "null",

            modifier = Modifier
                .fillMaxSize(),
            contentScale = ContentScale.Crop
        )

        Column(

            modifier = Modifier
//            .background(Color.Green)
//            .fillMaxHeight()
//            .fillMaxWidth()f
                .fillMaxSize()

        )


        {


            Row(

                verticalAlignment = Alignment.CenterVertically


            )


            {


                Text(text = "Home")

                Spacer(modifier = Modifier.width(10.dp))

                Text(text = "About")

                Spacer(modifier = Modifier.width(10.dp))

                Text(text = "Settings")

                Spacer(modifier = Modifier.width(10.dp))

                Text(text = "Settings")

            }
            Text(
                text = "This is the Setting screen where the user details are entailed",
                color = Color.Cyan,
                fontFamily = FontFamily.SansSerif
            )



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

            }) {
                Text(text = "Input screen")


            }

            val qq = LocalContext.current
            Button(onClick = {
                qq.startActivity(Intent(qq,MainActivity::class.java))

            }) {
                Text(text = "Assignment screen")
            }

            Spacer(modifier = Modifier.height(40.dp))


            val ter = AnnotatedString(
                "click here to go home",
                spanStyle = SpanStyle(Color.Cyan)

            )
            val tef = LocalContext.current

            ClickableText(text = ter, onClick = {
                tef.startActivity(Intent(tef, MainActivity::class.java))
            })

            val tod = LocalContext.current
            Text(text = "click me",
                modifier = Modifier.clickable {

                    tod.startActivity(Intent(tod, MainActivity::class.java))
                })

        }
    }

}

