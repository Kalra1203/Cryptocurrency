package com.example.cryptocurrency.presentation

sealed class Screen(val route: String) {
    object CoinListScreen : Screen("coin_list_screen")
    object CoinDetailedScreen : Screen("coin_detail_screen")

}
