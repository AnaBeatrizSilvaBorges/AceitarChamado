package com.example.telaaceitarcoleta

import android.content.Intent
import android.os.Bundle
import android.util.Log
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.foundation.text.KeyboardOptions
import androidx.compose.material.*
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.Email
import androidx.compose.material.icons.filled.Lock
import androidx.compose.runtime.*
import androidx.compose.ui.Alignment
import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.*
import androidx.compose.material.Card
import androidx.compose.material.MaterialTheme
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.unit.dp
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.platform.LocalContext
import androidx.compose.ui.res.colorResource
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.text.SpanStyle
import androidx.compose.ui.text.TextStyle
import androidx.compose.ui.text.buildAnnotatedString
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.input.ImeAction
import androidx.compose.ui.text.input.KeyboardType
import androidx.compose.ui.text.input.PasswordVisualTransformation
import androidx.compose.ui.text.input.VisualTransformation
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.text.style.TextDecoration
import androidx.compose.ui.text.withStyle
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.example.telaaceitarcoleta.ui.theme.TelaAceitarColetaTheme


class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            TelaAceitarColetaTheme() {
                // A surface container using the 'background' color from the theme
                Surface(modifier = Modifier.fillMaxSize(),
                    color = Color(31, 192, 5)) {
                    Greeting("Android")
                }
            }
        }
    }
}


@Composable
fun Greeting(name: String, modifier: Modifier = Modifier)
{

    Column(modifier = Modifier
        .fillMaxSize()
        .background(color = Color(255,255,255)) )
    {

        Box(modifier = Modifier.fillMaxSize(), contentAlignment = Alignment.Center)
        {

            Card(
                modifier = Modifier
                    .width(480.dp)
                    .height(680.dp)
                    .padding(start = 25.dp, end = 25.dp,),
                shape = RoundedCornerShape(20.dp),
                backgroundColor = Color(255, 255, 255)
            )
            {

                Image(
                    painter = painterResource(R.drawable.image_fundo),
                    contentDescription = null,
                    modifier = Modifier.fillMaxSize(),
                    contentScale = ContentScale.FillBounds
                )

                Column(horizontalAlignment = Alignment.CenterHorizontally)
                {
                    Text(
                        modifier = Modifier.padding(top =  25.dp),
                        text = "Aceitar o chamado de",
                        fontSize = 24.sp,
                        fontWeight = FontWeight.Bold,
                        color = Color.Black
                    )
                    Text(
                        modifier = Modifier.padding(),
                        textAlign = TextAlign.Center,
                        text = "Eduardo Perucci",
                        fontSize = 23.sp,
                        color = Color(31, 192, 5)
                    )

                    Image(
                        painter = painterResource(id = R.drawable.lixeira_reciclagem),
                        contentDescription = "",
                        modifier = Modifier
                            .size(130.dp)
                            .padding(top = 15.dp)
                    )

                    Text(
                        modifier = Modifier.padding(18.dp),
                        textAlign = TextAlign.Center,
                        text = "Distância",
                        fontSize = 21.sp,
                        color = Color.Black
                    )

                    Text(
                        modifier = Modifier.padding(start = 10.dp, end = 10.dp),
                        textAlign = TextAlign.Center,
                        text = "2km de distância do endereço principal",
                        fontSize = 20.sp,
                        color = Color(31, 192, 5)
                    )

                    Text(
                        modifier = Modifier.padding(10.dp),
                        textAlign = TextAlign.Center,
                        text = "Localização",
                        fontSize = 21.sp,
                        color = Color.Black
                    )

                    Text(
                        modifier = Modifier,
                        textAlign = TextAlign.Center,
                        text = "Barueri, Rua Mar Vermelho, SP",
                        fontSize = 20.sp,
                        color = Color(31, 192, 5)
                    )

                    Text(
                        modifier = Modifier.padding(10.dp),
                        textAlign = TextAlign.Center,
                        text = "Materias para coleta",
                        fontSize = 21.sp,
                        color = Color.Black
                    )

                    Text(
                        modifier = Modifier.padding(start = 10.dp, end = 10.dp),
                        textAlign = TextAlign.Center,
                        text = "Madeira e Ferro",
                        fontSize = 20.sp,
                        color = Color(31, 192, 5)
                    )






                    Column(modifier = Modifier
                        .padding(start = 132.dp, top = 20.dp, end = 2.dp, bottom = 8.dp)
                        .width(90.dp)
                        .height(90.dp),
                            horizontalAlignment = Alignment.End
                        ) {
                        Image(
                            painter = painterResource(id = R.drawable.arrow),
                            contentDescription = "",
                            modifier = Modifier
                                .fillMaxSize()
                                .padding()
                        )
                    }

                    Row {

                        Button(onClick = { /*TODO*/ }, modifier = Modifier.padding(top = 15.dp)
                            .width(120.dp).height(45.dp), shape = RoundedCornerShape(20.dp),
                            colors = ButtonDefaults.buttonColors(backgroundColor = Color(217, 32, 32))
                        )
                        {
                                Text(text = "Recusar",
                                    color = Color.White,
                                    fontWeight = FontWeight.SemiBold,  fontSize = 17.sp
                                )
                        }

                    Spacer(modifier = Modifier.width(7.dp))

                        Button(onClick = { /*TODO*/ }, modifier = Modifier.padding(top = 15.dp)
                            .width(200.dp).height(45.dp), shape = RoundedCornerShape(20.dp) ,
                                colors = ButtonDefaults.buttonColors(backgroundColor = Color(52, 171, 10))
                        )
                        {
                            Text(text = "Aceitar o chamado",
                                color = Color.White,
                                fontWeight = FontWeight.SemiBold, fontSize = 17.sp
                            )
                        }


                    }



                }



            }
        }
    }
}


@Preview(showBackground = true)
@Composable
fun GreetingPreview() {
    TelaAceitarColetaTheme() {
        Greeting("Android")
    }
}