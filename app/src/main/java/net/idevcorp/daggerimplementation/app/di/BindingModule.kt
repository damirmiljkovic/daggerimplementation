package net.idevcorp.daggerimplementation.app.di

import dagger.Module
import dagger.android.ContributesAndroidInjector
import net.idevcorp.daggerimplementation.ui.LoginFragment
import net.idevcorp.daggerimplementation.ui.MainActivity;
import net.idevcorp.daggerimplementation.ui.UserDetailsFragment

abstract class BindingModule {

    @Module(subcomponents = [SessionSubComponent::class])
    abstract class UnauthorizedBindingModule {

        @ContributesAndroidInjector
        abstract fun bindMainActivity(): MainActivity

        @ContributesAndroidInjector
        abstract fun bindLoginFragment(): LoginFragment
    }

    @Module
    abstract class AuthorizedBindingModule {

        @ContributesAndroidInjector
        abstract fun bindUserDetailsFragment(): UserDetailsFragment
    }
}