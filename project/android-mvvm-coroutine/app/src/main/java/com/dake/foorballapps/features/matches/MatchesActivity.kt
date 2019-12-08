package com.dake.foorballapps.features.matches

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import androidx.lifecycle.ViewModelProvider
import com.dake.foorballapps.R
import com.dake.foorballapps.features.matches.adapter.MainPagerAdapter
import com.dake.foorballapps.util.obtainViewModel
import kotlinx.android.synthetic.main.activity_matches.*

class MatchesActivity : AppCompatActivity() {

    lateinit var viewModel: MatchesViewModel
    var viewModelFactory: ViewModelProvider.Factory? = null // for testing

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_matches)

        setSupportActionBar(tb_main)

        tb_main.setTitle(R.string.app_name)
        vpMain.adapter = MainPagerAdapter(supportFragmentManager)
        btmNavMain.setOnNavigationItemSelectedListener {
            when (it.itemId) {
                R.id.matches -> vpMain.setCurrentItem(0, false)
                R.id.teams -> vpMain.setCurrentItem(1, false)
                R.id.favorites -> vpMain.setCurrentItem(2, false)
            }
            true
        }

        viewModel = obtainViewModel()
    }

    fun obtainViewModel(): MatchesViewModel = obtainViewModel(MatchesViewModel::class.java, viewModelFactory)
}
