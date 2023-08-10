package ir.amir.composeapplication.ui.custom

import androidx.compose.foundation.background
import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.text.TextStyle
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.unit.dp
import androidx.navigation.NavHostController
import ir.amir.composeapplication.ui.fakeAdvertiseList

@Composable
fun AdvertiseItem(
    title: String = fakeAdvertiseList.first().title,
    price: String = fakeAdvertiseList.first().price, navController: NavHostController
) {
    Column(
        modifier = Modifier
            .fillMaxSize()
            .padding(horizontal = 8.dp, vertical = 4.dp)
            .background(color = Color.Gray)
            .clickable {
                navController.navigate(route = "detail/$title/$price")
            }
    ) {
        Text(text = title, style = TextStyle(color = Color.Blue), fontWeight = FontWeight.Bold)
        Text(modifier = Modifier.fillMaxSize(), text = price, textAlign = TextAlign.Center)
    }
}