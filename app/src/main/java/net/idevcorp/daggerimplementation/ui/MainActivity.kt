package net.idevcorp.daggerimplementation.ui

import android.databinding.DataBindingUtil
import android.os.Bundle
import dagger.android.support.DaggerAppCompatActivity
import net.idevcorp.daggerimplementation.R
import net.idevcorp.daggerimplementation.databinding.ActivityMainBinding
import net.idevcorp.daggerimplementation.extensions.app

class MainActivity : DaggerAppCompatActivity() {

    private val loginFragment by lazy {
        LoginFragment()
    }

    private val userDetailsFragment by lazy {
        UserDetailsFragment()
    }

    private val layoutBinding by lazy {
        DataBindingUtil.setContentView(this, R.layout.activity_main) as ActivityMainBinding
    }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        addLoginFragment()
    }

    private fun addLoginFragment() {
        loginFragment.setOnButtonClickListener { addUserDetailsFragment() }
        supportFragmentManager.beginTransaction().replace(layoutBinding.activityMainContainer.id, loginFragment)
            .commit()
    }

    private fun addUserDetailsFragment() {
        app().buildSessionSubCompoent()
        supportFragmentManager.beginTransaction().replace(layoutBinding.activityMainContainer.id, userDetailsFragment)
            .commit()
    }


}