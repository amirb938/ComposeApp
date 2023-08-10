package ir.amir.composeapplication.ui.custom

import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.lazy.items
import androidx.compose.runtime.Composable
import androidx.navigation.NavHostController
import ir.amir.composeapplication.ui.fakeAdvertiseList
import ir.amir.composeapplication.ui.model.AdvertiseModel

@Composable
fun AdvertiseList(
    advertiseList: List<AdvertiseModel> = fakeAdvertiseList,
    navController: NavHostController
) {
    LazyColumn {
        items(advertiseList) { advertise ->
            AdvertiseItem(title = advertise.title, price = advertise.price, navController)
        }
    }
}