package net.idevcorp.daggerimplementation.app.di

import dagger.Subcomponent
import dagger.android.AndroidInjectionModule
import dagger.android.AndroidInjector
import dagger.android.support.AndroidSupportInjectionModule
import net.idevcorp.daggerimplementation.app.App
import net.idevcorp.daggerimplementation.app.di.scopes.SessionScope

@SessionScope
@Subcomponent(modules = [BindingModule.AuthorizedBindingModule::class, AndroidSupportInjectionModule::class])
interface SessionSubComponent : AndroidInjector<App> {

    @Subcomponent.Builder
    interface Builder {
        fun build(): SessionSubComponent
    }
}