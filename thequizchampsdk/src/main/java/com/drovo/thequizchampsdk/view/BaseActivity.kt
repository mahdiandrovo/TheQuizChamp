package com.drovo.thequizchampsdk.view

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.TextView
import androidx.cardview.widget.CardView
import androidx.fragment.app.Fragment
import androidx.navigation.NavController
import androidx.navigation.NavDestination
import androidx.navigation.findNavController
import com.drovo.thequizchampsdk.R
import com.drovo.thequizchampsdk.view.ui.ProfileFragment

class BaseActivity : AppCompatActivity() {

    private lateinit var cardViwHome: CardView
    private lateinit var cardViwLeaderboard: CardView
    private lateinit var cardViwProfile: CardView
    private lateinit var navController: NavController

    private lateinit var cardViwToolbar: CardView
    private lateinit var cardViwMenuBar: CardView

    private lateinit var txtViwName: TextView

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_base)

        navController = findNavController(R.id.navigation_host_fragment)

        cardViwToolbar = findViewById(R.id.cardviw_toolbar)
        cardViwMenuBar = findViewById(R.id.cardviw_menubar)

        txtViwName = findViewById(R.id.txtviw_name)

        //replaceFragment(HomeFragment())

        cardViwHome = findViewById(R.id.cardviw_home)
        cardViwLeaderboard = findViewById(R.id.cardviw_leaderboard)
        cardViwProfile = findViewById(R.id.cardviw_profile)

        cardViwHome.setOnClickListener {
            navController.navigate(R.id.action_global_homeFragment)
        }

        cardViwLeaderboard.setOnClickListener {
            navController.navigate(R.id.action_global_leaderboardFragment)
        }

        cardViwProfile.setOnClickListener {
            navController.navigate(R.id.action_global_profileFragment)
        }

        trackCurrentFragment()
    }

    private fun trackCurrentFragment(){
        navController.addOnDestinationChangedListener{ _, navigationDestination: NavDestination, _ ->
            if (navigationDestination.id == R.id.profile2Fragment) {
                cardViwToolbar.visibility = View.GONE
                cardViwMenuBar.visibility = View.GONE
            } else{
                cardViwToolbar.visibility = View.VISIBLE
                cardViwMenuBar.visibility = View.VISIBLE
            }

            if (navigationDestination.id == R.id.homeFragment){
                txtViwName.setText("Home Fragment")
            }
            if (navigationDestination.id == R.id.leaderboardFragment2){
                txtViwName.setText("Leaders Fragment")
            }
            if (navigationDestination.id == R.id.profileFragment){
                txtViwName.setText("Profile Fragment")
            }
        }
    }
}