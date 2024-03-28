@file:OptIn(ExperimentalMaterial3Api::class)

package com.griffo.tasmadian

import android.content.Intent
import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.text.ClickableText
import androidx.compose.foundation.text.KeyboardOptions
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.AccountCircle
import androidx.compose.material.icons.filled.Email
import androidx.compose.material.icons.filled.Person
import androidx.compose.material.icons.filled.Phone
import androidx.compose.material3.Button
import androidx.compose.material3.ExperimentalMaterial3Api
import androidx.compose.material3.Icon
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.OutlinedTextField
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.material3.TextField
import androidx.compose.material3.TextFieldDefaults
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.setValue
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.platform.LocalContext
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.AnnotatedString
import androidx.compose.ui.text.SpanStyle
import androidx.compose.ui.text.font.FontFamily
import androidx.compose.ui.text.input.KeyboardType
import androidx.compose.ui.text.input.TextFieldValue

import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.griffo.tasmadian.ui.theme.TasmadianTheme

class InputActivity2 : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {

         Greeting4()

        }
    }
}
@Preview(showBackground = true)
@Composable
fun Greeting4() {
    Box {
        Image(
            painter = painterResource(id =R.drawable.angel), contentDescription = "null",

           modifier = Modifier
              .fillMaxSize(),
        contentScale = ContentScale.Crop
        )


        LazyColumn (){
            item {
                Column(

                    modifier = Modifier
                        .fillMaxSize()
//            .background(Color.LightGray)
                        .padding(15.dp),


                    horizontalAlignment = Alignment.CenterHorizontally




                ) {

                }
            }
        }

    Column(
        modifier = Modifier
            .fillMaxSize()
//            .background(Color.LightGray)
            .padding(15.dp),


        horizontalAlignment = Alignment.CenterHorizontally


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


        Text(text = "Welcome", fontFamily = FontFamily.Serif, color = Color.Blue)

        Spacer(modifier = Modifier.width(10.dp))

        Text(
            text = "Your are required to put your input detailss ",
            color = Color.Cyan,
            fontFamily = FontFamily.Cursive
        )

        Spacer(modifier = Modifier.width(10.dp))

        Text(
            text = "This will enable you to effiently use app without keeping to log in",
            color = Color.DarkGray
        )

        Spacer(modifier = Modifier.width(10.dp))

        Text(
            text = "incase of any issue dont fail to reach us on our hotline number",
            fontFamily = FontFamily.SansSerif,
            color = Color.LightGray
        )



var name by remember {

    mutableStateOf(TextFieldValue(""))
}
      OutlinedTextField(
            value = name,
            onValueChange = {name = it},
            label ={Text(text = "EnterName")},
            leadingIcon = {Icon(imageVector = Icons.Default.Person, contentDescription ="" )},
            colors = TextFieldDefaults.outlinedTextFieldColors(

              focusedBorderColor = Color.Red,
              unfocusedBorderColor = Color.Blue,
              focusedLabelColor = Color.Red,
              unfocusedLabelColor = Color.Blue,
              cursorColor = Color.Green

          )



        )

Spacer(modifier = Modifier

    .height(10.dp)
)



        var phonenumber by remember {

            mutableStateOf(TextFieldValue(""))
        }
        OutlinedTextField(
        value = phonenumber,
            onValueChange = {phonenumber = it},
            label = { Text(text = "Enter phonenumber")},
            keyboardOptions = KeyboardOptions(keyboardType = KeyboardType.Phone),
            leadingIcon = { Icon(imageVector = Icons.Default.Phone, contentDescription = "")},

            colors = TextFieldDefaults.outlinedTextFieldColors(

                focusedBorderColor = Color.Red,
                unfocusedBorderColor = Color.Blue,
                focusedLabelColor = Color.Red,
                unfocusedLabelColor = Color.Blue,
                cursorColor = Color.Green

            )



            )

                Spacer(
                    modifier = Modifier

                        .height(10.dp)
                )

                var email by remember {

                    mutableStateOf(TextFieldValue(""))
                }
                OutlinedTextField(
                value = email,
                    onValueChange = {email = it},
                    label = { Text(text = "enter email")},
                    keyboardOptions = KeyboardOptions(keyboardType = KeyboardType.Email),
                    leadingIcon = { Icon(imageVector =Icons.Default.Email , contentDescription ="" )},
                    colors = TextFieldDefaults.outlinedTextFieldColors(

                        focusedBorderColor = Color.Red,
                        unfocusedBorderColor = Color.Blue,
                        focusedLabelColor = Color.Red,
                        unfocusedLabelColor = Color.Blue,
                        cursorColor = Color.Green

                    )







        )

        var id by remember{




            mutableStateOf(TextFieldValue(""))
        }
        OutlinedTextField(
            value = id,
            onValueChange = {id = it},
            label = { Text(text = "enter user id")},
            keyboardOptions = KeyboardOptions(keyboardType = KeyboardType.Number),
            leadingIcon = { Icon(imageVector =Icons.Default.AccountCircle , contentDescription ="" )},
            colors = TextFieldDefaults.outlinedTextFieldColors(

                focusedBorderColor = Color.Red,
                unfocusedBorderColor = Color.Blue,
                focusedLabelColor = Color.Red,
                unfocusedLabelColor = Color.Blue,
                cursorColor = Color.Green

            ))






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
            }


        )


    }












    }
                        Spacer(
                            modifier = Modifier

                                .height(10.dp)
                        )


    }








