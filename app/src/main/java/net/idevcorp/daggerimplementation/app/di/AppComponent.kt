package net.idevcorp.daggerimplementation.app.di

import dagger.BindsInstance
import dagger.Component
import dagger.android.AndroidInjectionModule
import dagger.android.AndroidInjector
import dagger.android.support.AndroidSupportInjectionModule
import net.idevcorp.daggerimplementation.app.App
import javax.inject.Singleton

@Singleton
@Component(modules = [BindingModule.UnauthorizedBindingModule::class, AndroidSupportInjectionModule::class])
interface AppComponent : AndroidInjector<App> {

    @Component.Builder
    interface Builder {
        @BindsInstance
        fun application(app: App): Builder

        fun build(): AppComponent
    }

    fun sessionSubComponentBuilder(): SessionSubComponent.Builder
}