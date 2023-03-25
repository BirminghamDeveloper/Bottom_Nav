package com.hashinology.bottom_nav

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.fragment.app.Fragment
import androidx.navigation.NavController
import androidx.navigation.Navigation
import androidx.navigation.ui.NavigationUI
import com.google.android.material.bottomnavigation.BottomNavigationView


class MainActivity : AppCompatActivity() {


    override fun onCreate(savedInstanceState: Bundle?) {
        var navController: NavController? = null
        var bottomNavigationView: BottomNavigationView? = null

        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        bottomNavigationView = findViewById(R.id.btnButton)
        navController = Navigation.findNavController(this, R.id.navHost)

        NavigationUI.setupWithNavController(bottomNavigationView, navController)


    }
}