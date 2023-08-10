package ir.amir.composeapplication.ui.custom

import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.text.TextStyle
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.unit.sp
import ir.amir.composeapplication.ui.fakeAdvertiseList

@Composable
fun DetailAdvertiseItem(
    title: String = fakeAdvertiseList.first().title,
    price: String = fakeAdvertiseList.first().price
) {
    Column(
        modifier = Modifier
            .fillMaxSize()
            .background(color = Color.Green),
        horizontalAlignment = Alignment.CenterHorizontally,
        verticalArrangement = Arrangement.Center
    ) {
        Text(
            text = title,
            style = TextStyle(color = Color.Blue, fontSize = 24.sp),
            fontWeight = FontWeight.Bold
        )
        Text(
            modifier = Modifier.fillMaxSize(),
            style = TextStyle(color = Color.Red, fontSize = 36.sp),
            text = price,
            textAlign = TextAlign.Center
        )
    }
}