package belajar.percobaan

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.fragment.app.Fragment
import com.google.android.material.bottomnavigation.BottomNavigationMenuView
import com.google.android.material.bottomnavigation.BottomNavigationView
import kotlinx.android.synthetic.main.activity_home_page.bottom_navigation_view

class HomePage : AppCompatActivity() {
        override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_home_page)

    val fragment = SearchFragment.newInstance(param1 = "test1", param2 = "test2")
           bottom_navigation_view.setOnNavigationItemSelectedListener (menuItemSelected)
            addFragment(fragment)
    }
    private val menuItemSelected = BottomNavigationView.OnNavigationItemSelectedListener { item ->
        when (item.itemId){
            R.id.itemSearch -> {
                val fragment = SearchFragment.newInstance(param1 = "test1", param2 = "test2")
                addFragment(fragment)
                return@OnNavigationItemSelectedListener true
            }
            R.id.itemKos -> {
                val fragment = KosFragment.newInstance(param1 = "test1", param2 = "test2")
                addFragment(fragment)
                return@OnNavigationItemSelectedListener true
            }
            R.id.itemTransport -> {
                val fragment = TransportFragment.newInstance(param1 = "test1", param2 = "test2")
                addFragment(fragment)
                return@OnNavigationItemSelectedListener true
            }
            R.id.itemProfile -> {
                val fragment = ProfileFragment.newInstance(param1 = "test1", param2 = "test2")
                addFragment(fragment)
                return@OnNavigationItemSelectedListener true
            }
            else -> false
        }
    }


    private fun addFragment(fragment:Fragment){
        supportFragmentManager
            .beginTransaction()
            .setCustomAnimations(com.google.android.material.R.anim.design_bottom_sheet_slide_in, com.google.android.material.R.anim.design_bottom_sheet_slide_out)
            .replace(R.id.content, fragment, fragment.javaClass.getSimpleName())
            .commit()
    }

}
