package com.bramwel.firebase.navigation

import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.navigation.NavDestination
import androidx.navigation.NavHostController
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import androidx.navigation.compose.rememberNavController
import com.bramwel.firebase.ui.theme.screen.Home.HomeScreen
import com.bramwel.firebase.ui.theme.screen.Login.LoginScreen
import com.bramwel.firebase.ui.theme.screen.Product.AddProductsScreen
import com.bramwel.firebase.ui.theme.screen.Product.UpdateProductsScreen
import com.bramwel.firebase.ui.theme.screen.Product.ViewProductsScreen
import com.bramwel.firebase.ui.theme.screen.Product.ViewUploadsScreen
import com.bramwel.firebase.ui.theme.screen.RegisterScreen.RegisterScreen


@Composable
fun AppNavHost(modifier: Modifier=Modifier,navController:NavHostController= rememberNavController(),startDestination:String= ROUTE_LOGIN) {

    NavHost(navController = navController, modifier=modifier, startDestination = startDestination ){
        composable(ROUTE_LOGIN){
            LoginScreen(navController)
        }
        composable(ROUTE_REGISTER){
            RegisterScreen(navController)
        }

        composable(ROUTE_HOME){
            HomeScreen(navController)
        }
        composable(ROUTE_ADD_PRODUCT) {
            AddProductsScreen(navController)
        }
        composable(ROUTE_VIEW_PRODUCT){
            ViewProductsScreen(navController)
        }
        composable(ROUTE_UPDATE_PRODUCT+ "/{id}"){passedData ->
            UpdateProductsScreen(navController,passedData.arguments?.getString("id")!!)
        }
        composable(ROUTE_VIEW_UPLOAD){
            ViewUploadsScreen(navController)
        }
    }

}