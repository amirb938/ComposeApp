package ir.amir.composeapplication.ui

import androidx.compose.ui.graphics.Color
import ir.amir.composeapplication.ui.model.AdvertiseModel
import kotlin.random.Random

val fakeAdvertiseList = listOf(
    AdvertiseModel("Brand New Laptop", "$799.99"),
    AdvertiseModel("iPhone 13 Pro Max", "$1,199.00"),
    AdvertiseModel("Gaming PC Setup", "$1,899.99"),
    AdvertiseModel("Smart 4K TV", "$699.00"),
    AdvertiseModel("Designer Watch", "$299.50"),
    AdvertiseModel("Mountain Bike", "$599.00"),
    AdvertiseModel("Vintage Vinyl Records", "$49.99"),
    AdvertiseModel("Home Theater System", "$499.00"),
    AdvertiseModel("Digital Camera Bundle", "$399.99"),
    AdvertiseModel("Fitness Tracker", "$89.95"),
    AdvertiseModel("High-Quality Headphones", "$149.99"),
    AdvertiseModel("Wireless Mouse and Keyboard", "$59.95"),
    AdvertiseModel("Fashionable Sunglasses", "$119.00"),
    AdvertiseModel("Portable Bluetooth Speaker", "$79.99"),
    AdvertiseModel("Dining Table Set", "$499.00"),
    AdvertiseModel("Electric Scooter", "$299.00"),
    AdvertiseModel("Smart Home Security Camera", "$199.00"),
    AdvertiseModel("Elegant Evening Dress", "$249.00"),
    AdvertiseModel("Professional Camera Lens", "$799.00"),
    AdvertiseModel("Stylish Backpack", "$69.95"),
    AdvertiseModel("Wireless Charging Pad", "$29.99"),
    AdvertiseModel("Men's Leather Jacket", "$199.00"),
    AdvertiseModel("Cookware Set", "$159.99"),
    AdvertiseModel("Bluetooth Earbuds", "$89.00"),
    AdvertiseModel("Camping Tent", "$149.00"),
    AdvertiseModel("Fitness Dumbbell Set", "$119.99"),
    AdvertiseModel("Gourmet Coffee Beans", "$12.99"),
    AdvertiseModel("Laptop Cooling Pad", "$24.95"),
    AdvertiseModel("Home Office Chair", "$149.00"),
    AdvertiseModel("Outdoor Grill", "$299.00"),
    AdvertiseModel("Wireless Router", "$79.99"),
    AdvertiseModel("Artificial Indoor Plant", "$34.99"),
    AdvertiseModel("Handheld Vacuum Cleaner", "$69.00"),
    AdvertiseModel("Classic Board Games Bundle", "$39.99"),
    AdvertiseModel("Fashionable Backpack", "$59.00")
)

fun getRandomColor(): Color {
    val red = Random.nextInt(256)
    val green = Random.nextInt(256)
    val blue = Random.nextInt(256)

    return Color(red, green, blue)
}