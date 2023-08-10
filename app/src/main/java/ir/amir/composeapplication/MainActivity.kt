package ir.amir.composeapplication

import android.os.Bundle
import android.widget.Toast
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.material.BottomAppBar
import androidx.compose.material.DrawerValue
import androidx.compose.material.FabPosition
import androidx.compose.material.FloatingActionButton
import androidx.compose.material.Scaffold
import androidx.compose.material.TopAppBar
import androidx.compose.material.rememberDrawerState
import androidx.compose.material.rememberScaffoldState
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.platform.LocalContext
import androidx.compose.ui.text.TextStyle
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.unit.sp
import androidx.navigation.NavHostController
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import androidx.navigation.compose.rememberNavController
import androidx.navigation.navArgument
import ir.amir.composeapplication.ui.custom.AdvertiseList
import ir.amir.composeapplication.ui.custom.BottomSheetItem
import ir.amir.composeapplication.ui.custom.DetailAdvertiseItem
import ir.amir.composeapplication.ui.theme.ComposeApplicationTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            ComposeApplicationTheme {
                Surface(
                    modifier = Modifier.fillMaxSize(),
                    color = MaterialTheme.colorScheme.background
                ) {
                    MainScreen()
                }
            }
        }
    }


}

@Composable
private fun MainScreen() {
    FullView()
}

@Composable
fun FullView() {
    val scaffoldState = rememberScaffoldState(rememberDrawerState(initialValue = DrawerValue.Open))
    val navController = rememberNavController()
    val context = LocalContext.current
    val resources = context.resources
    val displayMetrics = resources.displayMetrics
    val screenWidth = displayMetrics.widthPixels / displayMetrics.density
    Scaffold(
        scaffoldState = scaffoldState,
        topBar = {
            TopAppBar(title = { Text(text = "Title TopAppBar") })
        },
        floatingActionButtonPosition = FabPosition.End,
        floatingActionButton = {
            FloatingActionButton(onClick = {
                Toast.makeText(context, "This is a toast message!", Toast.LENGTH_SHORT).show()
            }) {
                Text(
                    text = "+", textAlign = TextAlign.Center,
                    style = TextStyle(fontSize = 24.sp),
                )
            }
        },
        content = {
            Box(modifier = Modifier.padding(it)) {
                ContentScreenWithNavigation(navController)
            }
        },

        bottomBar = {
            BottomAppBar(backgroundColor = Color.Red) {
                Row(
                    modifier = Modifier.fillMaxSize(),
                    horizontalArrangement = Arrangement.SpaceAround,
                    verticalAlignment = Alignment.CenterVertically
                ) {
                    val titles = listOf("Home", "Profile", "Shop")
                    val routes = listOf("home", "profile", "shop")
                    val widthSize = screenWidth / titles.size
                    titles.forEachIndexed { index, title ->
                        BottomSheetItem(title, routes[index], widthSize, navController)
                    }
                }
            }
        })
}

@Composable
fun HomePage(navController: NavHostController) {
    AdvertiseList(navController = navController)
}

@Composable
fun ShopPage() {
    Text(text = "Shop")
}

@Composable
fun ProfilePage() {
    Text(text = "This is Profile")
}


@Composable
fun ContentScreenWithNavigation(navController: NavHostController) {
    NavHost(navController = navController, startDestination = "home") {
        composable(route = "home") {
            HomePage(navController)
        }
        composable(route = "profile") {
            ProfilePage()
        }
        composable(route = "shop") {
            ShopPage()
        }
        composable(route = "detail/{title}/{price}",
            arguments = listOf(
                navArgument("title") { defaultValue = "not set title" },
                navArgument("price") { defaultValue = "not set price" }
            )) { backStackEntry ->
            val title = backStackEntry.arguments?.getString("title") ?: ""
            val price = backStackEntry.arguments?.getString("price") ?: ""
            DetailAdvertiseItem(title = title, price = price)
        }
    }
}