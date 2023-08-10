package ir.amir.composeapplication.ui.custom

import androidx.compose.foundation.background
import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.fillMaxHeight
import androidx.compose.foundation.layout.width
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.unit.dp
import androidx.navigation.NavHostController
import ir.amir.composeapplication.ui.getRandomColor

@Composable
fun BottomSheetItem(
    title: String,
    route: String,
    widthSize: Float,
    navController: NavHostController
) {
    Text(
        modifier = Modifier
            .fillMaxHeight()
            .width(widthSize.dp)
            .background(color = getRandomColor())
            .clickable {
                navController.navigate(route)
            },
        text = title,
        textAlign = TextAlign.Center
    )
}