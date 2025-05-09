package com.example.loginreg.ui.theme.Screens.home

import androidx.compose.foundation.Image

import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.shape.CircleShape
import androidx.compose.material3.Button
import androidx.compose.material3.ButtonDefaults
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.Color.Companion.White
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.font.FontFamily
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import androidx.navigation.NavHostController
import androidx.navigation.compose.rememberNavController
import com.example.loginreg.Navigation.ROUTE_LOGIN
import com.example.loginreg.Navigation.ROUTE_REGISTER

@Composable
fun Home_Screen(navHostController: NavHostController ){
    Column(verticalArrangement = Arrangement.Center,
        horizontalAlignment = Alignment.CenterHorizontally,
        modifier = Modifier
            .fillMaxSize()
            .background(White)){

        Text("Arsenal",
            color = Color.Black,
            fontSize = 30.sp,
            fontFamily = FontFamily.Monospace
        )
        Spacer(modifier = Modifier.height(30.dp))
        Text("Welcome to Arsenal",
            color = Color.Magenta,
            fontSize = 30.sp,
            fontFamily = FontFamily.Cursive,
            fontWeight = FontWeight.ExtraBold
        )
        Button(onClick = {navHostController.navigate(ROUTE_LOGIN)},
            modifier=Modifier
                .width(300.dp),
            colors = ButtonDefaults
                .buttonColors(Color.Black)) {
            Text("login",
                color = Color.Red)
        }
        Button(onClick = {navHostController.navigate(ROUTE_REGISTER)},
            modifier=Modifier
                .width(300.dp),
            colors = ButtonDefaults
                .buttonColors(Color.Black)) {
            Text("Register",
                color = Color.Red)
        }
    }

    
}
@Preview
@Composable
private fun  Homescreen(){
    Home_Screen(rememberNavController())
}
