package net.gadev.bottomnavigation

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.pandora.bottomnavigator.BottomNavigator

class MainActivity : AppCompatActivity() {

    private lateinit var navigator: BottomNavigator

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        navigator = BottomNavigator.onCreate(
            fragmentContainer = R.id.fragment_container,
            bottomNavigationView = findViewById(R.id.nav_view),
            rootFragmentsFactory = mapOf(
                R.id.navigation_monster to { MonsterFragment() },
                R.id.navigation_slug to { SlugFragment() }
            ),
            defaultTab = R.id.navigation_monster,
            activity = this
        )
    }

    override fun onBackPressed() {
        if (!navigator.pop()) {
            super.onBackPressed()
        }
    }

}